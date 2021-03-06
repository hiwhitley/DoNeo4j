package com.hiwhitley.graph;

import com.hiwhitley.graph.bean.Constant;
import com.hiwhitley.graph.bean.Shop;
import com.hiwhitley.graph.util.FileUtils;
import org.neo4j.driver.v1.*;

import java.io.File;
import java.util.List;

import static org.neo4j.driver.v1.Values.parameters;

/**
 * Created by hiwhitley on 16-11-25.
 */
public class HangZhou {

    public static void main(String[] args) {
        Driver driver = GraphDatabase.driver("bolt://localhost", AuthTokens.basic("neo4j", "123"), Config.build()
                .withEncryptionLevel(Config.EncryptionLevel.REQUIRED)
                .withTrustStrategy(Config.TrustStrategy.trustCustomCertificateSignedBy(new File("/home/hiwhitley/ NEO4J_HOME/certificates/neo4j.cert")))
                .toConfig());

        HangZhou hangZhou = new HangZhou();
        Session session = driver.session();
        for (String category : Constant.categoryList) {
            hangZhou.generateShopNodes(session, category);
        }
        session.close();
        driver.close();
    }

    private void generateShopNodes(Session session, String category) {
        try (Transaction tx = session.beginTransaction()) {
            List<Shop> shops = FileUtils.fromJsonList(
                    FileUtils.parseJsonStrFromFile("/home/hiwhitley/文档/rdf/" + category + ".json"), Shop.class);
            for (Shop shop : shops) {
                if (shop.getShop_name().equals( "名家口味堂") || shop.getShop_name().equals("弄口里主题餐厅"))
                    continue;
                tx.run("MERGE (food{shop_name: {shop_name}," +
                                "avePerPerson: {avePerPerson}, " +
                                "recommend:{recommend}," +
                                "taste:{taste}," +
                                "tel:{tel}})" +
                                "SET food:" + category,
                        parameters("shop_name", shop.getShop_name(),
                                "avePerPerson", shop.getAvePerPerson(),
                                "recommend", shop.getRecommend(),
                                "taste", shop.getRank1(),
                                "tel", shop.getShop_tel()));
            }
            tx.success();
            tx.close();
        }
    }

}
