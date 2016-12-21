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
//        ELongOperator.generateELongHotels(session, "elongHotel");
//        ELongOperator.generateRoomTypes(session, "elongHotel");
//        ELongOperator.generateRoomRelation(session, "elongHotel");
//        ELongOperator.generateNearEntertainment(session, "elongHotel");
//        ELongOperator.generateNearEntertainmentRelation(session, "elongHotel");
//        ELongOperator.generateNearFood(session, "elongHotel");
//        ELongOperator.generateNearFoodRelation(session, "elongHotel");
//        ELongOperator.generateNearHotel(session, "elongHotel");
//        ELongOperator.generateNearHotelRelation(session, "elongHotel");
//        ELongOperator.generateNearScenery(session, "elongHotel");
//        ELongOperator.generateNearSceneryRelation(session, "elongHotel");
//        ELongOperator.generateNearTraffic(session, "elongHotel");
//        ELongOperator.generateNearTrafficRelation(session, "elongHotel");
//        ELongOperator.generateNearShopping(session, "elongHotel");
        ELongOperator.generateNearShoppingRelation(session, "elongHotel");
        session.close();
        driver.close();
    }

}
