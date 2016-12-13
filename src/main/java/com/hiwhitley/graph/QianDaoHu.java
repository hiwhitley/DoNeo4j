package com.hiwhitley.graph;

import org.neo4j.driver.v1.*;

import java.io.File;

/**
 * Created by hiwhitley on 16-12-10.
 */
public class QianDaoHu {
    public static void main(String[] args) {

        Driver driver = GraphDatabase.driver("bolt://localhost", AuthTokens.basic("neo4j", "123"), Config.build()
                .withEncryptionLevel(Config.EncryptionLevel.REQUIRED)
                .withTrustStrategy(Config.TrustStrategy.trustCustomCertificateSignedBy(new File("/home/hiwhitley/ NEO4J_HOME/certificates/neo4j.cert")))
                .toConfig());

        Session session = driver.session();
        Operator.generateShopNodes(session, "qiandaohuFoodShop");
        session.close();
        driver.close();
    }
}
