package com.hiwhitley.graph;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.hiwhitley.graph.bean.Shop;
import com.hiwhitley.graph.util.FileUtils;
import org.neo4j.driver.v1.*;

import java.io.File;
import java.nio.file.AccessMode;
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

        Session session = driver.session();
        StatementResult result;
        try (Transaction tx = session.beginTransaction()) {
            result = tx.run("MERGE (food:杭帮菜 {name: {name}, consumptionPerPerson: {consumption}})",
                    parameters("name", "知味观", "consumption", 64));
            tx.success();
            tx.close();
        }
        session.close();
        driver.close();
    }

    public List<Shop> parseInputResource(String filePath) {
        String input = FileUtils.parseJsonFromFile(filePath);
        Gson gson = new Gson();
        List<Shop> shopIndividualList = gson.fromJson(input, new TypeToken<List<Shop>>() {
        }.getType());
        return shopIndividualList;
    }

}
