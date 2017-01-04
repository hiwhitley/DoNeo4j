package com.hiwhitley.graph;

import org.neo4j.driver.v1.*;

import java.io.File;

/**
 * Created by hiwhitley on 17-1-3.
 */
public class MergeCtripHotel {

    public static void main(String[] args) {
        Driver driver = GraphDatabase.driver("bolt://localhost", AuthTokens.basic("neo4j", "123"), Config.build()
                .withEncryptionLevel(Config.EncryptionLevel.REQUIRED)
                .withTrustStrategy(Config.TrustStrategy.trustCustomCertificateSignedBy(new File("/home/hiwhitley/ NEO4J_HOME/certificates/neo4j.cert")))
                .toConfig());
        Session session = driver.session();

        session.run("Create constraint on (hotel:HOTEL) ASSERT hotel.hotel_url is UNIQUE");
        session.run("Create constraint on (room:ROOM) ASSERT room.room_type is UNIQUE");
        //CtripHotelOperator.generateCTripHotels(session, "ctripHotel");
        //CtripHotelOperator.generateIsSameAsRelation(session, "ctripHotel");
        CtripHotelOperator.generateHotelPolicyRelation(session, "ctripHotel");
        session.close();
        driver.close();
    }
}
