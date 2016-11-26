package com.hiwhitley.graph;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
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
        hangZhou.generateShopNodes(session);
        session.close();
        driver.close();
    }

    private void generateShopNodes(Session session) {
        try (Transaction tx = session.beginTransaction()) {
            List<Shop> shops = parseInputResource("/home/hiwhitley/文档/rdf/自助餐.json");
            for (Shop shop : shops) {
                tx.run("MERGE (food:自助餐 {name: {name}," +
                                "consumptionPerPerson: {consumption}, " +
                                "recommend:{recommend}," +
                                "taste:{taste}," +
                                "tel:{tel}})",
                        parameters("name", shop.getShop_name(),
                                "consumption", shop.getAvePerPerson(),
                                "recommend", shop.getRecommend(),
                                "taste", shop.getTaste(),
                                "tel", shop.getTel()));
            }
            tx.success();
            tx.close();
        }
    }

    public List<Shop> parseInputResource(String filePath) {
        String input = FileUtils.parseJsonFromFile(filePath);
        Gson gson = new Gson();
        List<Shop> shopIndividualList = gson.fromJson(input, new TypeToken<List<Shop>>() {
        }.getType());
        return shopIndividualList;
    }

}
