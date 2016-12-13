package com.hiwhitley.graph;

import com.hiwhitley.graph.bean.Comment;
import com.hiwhitley.graph.bean.Shop;
import com.hiwhitley.graph.util.FileUtils;
import org.neo4j.driver.v1.Session;
import org.neo4j.driver.v1.StatementResult;
import org.neo4j.driver.v1.Transaction;

import java.util.List;

import static org.neo4j.driver.v1.Values.parameters;

/**
 * Created by hiwhitley on 16-11-26.
 */
public class Operator {
    public static void generateShopNodes(Session session, String fileName) {
        try (Transaction tx = session.beginTransaction()) {
            List<Shop> shops = FileUtils.fromJsonList(
                    FileUtils.parseJsonStrFromFile("/home/hiwhitley/文档/rdf/" + fileName + ".json"), Shop.class);
            for (Shop shop : shops) {
                tx.run("MERGE (food{shop_name: {shop_name}," +
                                "avePerPerson: {avePerPerson}, " +
                                "recommend:{recommend}," +
                                "taste:{taste}," +
                                "tel:{tel}," +
                                "environment:{environment}," +
                                "service:{service}," +
                                "shop_url:{shop_url}})" +
                                "SET food:" + shop.getCuisines().replace("/",":"),
                        parameters("shop_name", shop.getShop_name(),
                                "avePerPerson", shop.getAvePerPerson(),
                                "recommend", shop.getRecommend(),
                                "taste", shop.getTaste(),
                                "tel", shop.getTel(),
                                "environment", shop.getEnvironment(),
                                "service", shop.getService(),
                                "shop_url", shop.getShop_url()
                        )

                );
            }
            tx.success();
            tx.close();
        }
    }

    public static void generateUserCommentOnShop(Session session, Comment comment) {
        try (Transaction tx = session.beginTransaction()) {
            StatementResult run = tx.run("match (shop {shop_name:{shop_name}}) return shop"
                    , parameters("shop_name", comment.getShop_name()));
            System.out.println(run.list());
            if (run.list().size() == 0) {
                tx.run("merge (shop{shop_name:{shop_name},shop_url:{shop_url}})",
                        parameters("shop_name", comment.getShop_name()
                                ,"shop_url",comment.getShop_url()));
            }
            tx.run("merge (user:USER {user_name:{user_name}, user_link:{user_link}})"
                    , parameters("user_name", comment.getComment_author_name(), "user_link", comment.getComment_author_link()));
            tx.run("match (shop {shop_name:{shop_name}})" +
                            "match (user:USER {user_name:{user_name}})" +
                            "merge (user)-[:hasVisited {comment_content_text:{comment_content_text},comment_rank:{comment_rank},comment_serve_rank:{comment_serve_rank},comment_taste_rank:{comment_taste_rank},comment_environment_rank:{comment_environment_rank},comment_time:{comment_time}}]->(shop)",
                    parameters("shop_name", comment.getShop_name(),
                            "user_name", comment.getComment_author_name(),
                            "comment_content_text", comment.getComment_content_text(),
                            "comment_rank", comment.getComment_rank(), "comment_serve_rank", comment.getComment_serve_rank(),
                            "comment_taste_rank", comment.getComment_taste_rank(),
                            "comment_environment_rank", comment.getComment_environment_rank(),
                            "comment_time", comment.getComment_time()
                    ));

            tx.success();
            tx.close();
        }
    }
}

