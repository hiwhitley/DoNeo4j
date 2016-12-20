package com.hiwhitley.graph;

import org.neo4j.driver.v1.*;

import java.io.File;

/**
 * Created by hiwhitley on 16-12-20.
 */
public class ELongHotel {

    public static void main(String[] args) {
        Driver driver = GraphDatabase.driver("bolt://localhost", AuthTokens.basic("neo4j", "123"), Config.build()
                .withEncryptionLevel(Config.EncryptionLevel.REQUIRED)
                .withTrustStrategy(Config.TrustStrategy.trustCustomCertificateSignedBy(new File("/home/hiwhitley/ NEO4J_HOME/certificates/neo4j.cert")))
                .toConfig());
        Session session = driver.session();
        session.run("Create constraint on (hotel:HOTEL) ASSERT hotel.hotel_url is UNIQUE");
        session.run("Create constraint on (room:ROOM) ASSERT room.room_type is UNIQUE");
//        Operator.generateELongHotels(session, "elongHotel");
//        Operator.generateRoomTypes(session, "elongHotel");
        ELongOperator.generateRoomRelation(session, "elongHotel");
        session.close();
        driver.close();
    }

}
