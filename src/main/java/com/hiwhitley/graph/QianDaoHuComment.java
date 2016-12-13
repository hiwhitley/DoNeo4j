package com.hiwhitley.graph;

import com.hiwhitley.graph.bean.Comment;
import com.hiwhitley.graph.util.FileUtils;
import org.neo4j.driver.v1.*;

import java.io.File;
import java.util.List;

/**
 * Created by hiwhitley on 16-12-13.
 */
public class QianDaoHuComment {

    public static void main(String[] args) {
        Driver driver = GraphDatabase.driver("bolt://localhost", AuthTokens.basic("neo4j", "123"), Config.build()
                .withEncryptionLevel(Config.EncryptionLevel.REQUIRED)
                .withTrustStrategy(Config.TrustStrategy.trustCustomCertificateSignedBy(new File("/home/hiwhitley/ NEO4J_HOME/certificates/neo4j.cert")))
                .toConfig());

        Session session = driver.session();
        String s = FileUtils.parseJsonStrFromFile("/home/hiwhitley/文档/rdf/qianDaoHuComment.json");
        List<Comment> commentList = FileUtils.fromJsonList(s, Comment.class);
        for (Comment comment : commentList) {
            Operator.generateUserCommentOnShop(session, comment);
        }
        session.close();
        driver.close();
    }
}
