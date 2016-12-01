package com.hiwhitley.graph;

import com.hiwhitley.graph.bean.Comment;
import com.hiwhitley.graph.util.FileUtils;
import org.neo4j.driver.v1.*;

import java.io.File;
import java.util.List;

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
        List<Comment> commentList = FileUtils.parseInputResource("/home/hiwhitley/桌面/hangBangCaiComment.json");
        System.out.println(commentList.size());

        session.close();
        driver.close();
    }

    private void generateUserCommentOnShop(Session session) {
        try (Transaction tx = session.beginTransaction()) {
            tx.run("MERGE");
            tx.success();
            tx.close();
        }
    }
}
