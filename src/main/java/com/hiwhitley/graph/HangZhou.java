package com.hiwhitley.graph;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.hiwhitley.graph.bean.Shop;
import com.hiwhitley.graph.util.FileUtils;
import org.neo4j.driver.v1.*;

import java.io.File;
import java.util.List;

/**
 * Created by hiwhitley on 16-11-25.
 */
public class HangZhou {

    public static void main(String[] args) {

        Driver driver = GraphDatabase.driver( "bolt://localhost", AuthTokens.basic("neo4j", "123"), Config.build()
                .withEncryptionLevel( Config.EncryptionLevel.REQUIRED )
                .withTrustStrategy( Config.TrustStrategy.trustCustomCertificateSignedBy(new File( "/home/hiwhitley/ NEO4J_HOME/certificates/neo4j.cert") ) )
                .toConfig() );
        HangZhou hangZhou = new HangZhou();

        Session session = driver.session();
        try(Transaction transaction = session.beginTransaction()) {
//            Node shop =
//            transaction.success();
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
