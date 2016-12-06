package com.hiwhitley.graph;

import com.hiwhitley.graph.bean.Comment;
import com.hiwhitley.graph.util.FileUtils;
import org.neo4j.driver.v1.*;

import java.io.File;
import java.util.List;

import static org.neo4j.driver.v1.Values.parameters;

/**
 * Created by hiwhitley on 16-12-1.
 */
public class HangZhouComment {
    public static void main(String[] args) {
        Driver driver = GraphDatabase.driver("bolt://localhost", AuthTokens.basic("neo4j", "123"), Config.build()
                .withEncryptionLevel(Config.EncryptionLevel.REQUIRED)
                .withTrustStrategy(Config.TrustStrategy.trustCustomCertificateSignedBy(new File("/home/hiwhitley/ NEO4J_HOME/certificates/neo4j.cert")))
                .toConfig());

        Session session = driver.session();
        String s = FileUtils.parseJsonStrFromFile("/home/hiwhitley/桌面/hangBangCaiComment.json");
        List<Comment> commentList = FileUtils.fromJsonList(s, Comment.class);
        HangZhouComment hangZhouComment = new HangZhouComment();
        for (Comment comment : commentList) {
            hangZhouComment.generateUserCommentOnShop(session, comment);
        }
        session.close();
        driver.close();
    }

    private void generateUserCommentOnShop(Session session, Comment comment) {
        try (Transaction tx = session.beginTransaction()) {
            StatementResult run = tx.run("match (shop:杭帮菜 {shop_name:{shop_name}}) return shop"
                    , parameters("shop_name", comment.getShop_name()));
            System.out.println(run.list());
            if (run.list().size() == 0) {
                tx.run("merge (shop:杭帮菜 {shop_name:{shop_name}})",
                        parameters("shop_name", comment.getShop_name()));
            }
            tx.run("merge (user:USER {user_name:{user_name}, user_link:{user_link}})"
                    , parameters("user_name", comment.getComment_author_name(), "user_link", comment.getComment_author_link()));
            tx.run("match (shop:杭帮菜 {shop_name:{shop_name}})" +
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
