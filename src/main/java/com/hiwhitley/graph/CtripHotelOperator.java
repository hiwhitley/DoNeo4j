package com.hiwhitley.graph;

import com.hiwhitley.graph.bean.CtripHotel;
import com.hiwhitley.graph.util.FileUtils;
import org.neo4j.driver.v1.Session;
import org.neo4j.driver.v1.StatementResult;
import org.neo4j.driver.v1.Transaction;

import java.util.HashMap;
import java.util.List;

/**
 * Created by hiwhitley on 17-1-4.
 */
public class CtripHotelOperator extends Operator {
    public static void generateCTripHotels(Session session, String fileName) {
        try (Transaction tx = session.beginTransaction()) {
            String strFromFile = FileUtils.parseJsonStrFromFile("/home/hiwhitley/文档/rdf/" + fileName + ".json");
            List<CtripHotel> hotelList = FileUtils.fromJsonList(strFromFile, CtripHotel.class);
            for (CtripHotel hotel : hotelList) {
                HashMap<String, Object> map = new HashMap<>();
                map.put("hotel_recommend_num", hotel.getHotel_recommend_num());
                map.put("hotel_address", hotel.getHotel_address());
                map.put("hotel_service", hotel.getHotel_service());
                map.put("hotel_stars", hotel.getHotel_stars());
                map.put("hotel_diamond", hotel.getHotel_diamond());
                map.put("hotel_rate", hotel.getHotel_rate());
                map.put("hotel_name", hotel.getHotel_name());
                map.put("hotel_url", hotel.getHotel_url());
                map.put("hotel_collect_num", hotel.getHotel_collect_num());
                map.put("hotel_rate", hotel.getHotel_rate());
                map.put("special_label", checkIsNull(hotel.getHotel_info().getSpecial_info()));
                System.out.println(hotel.getHotel_info().getSpecial_info());
                map.put("special_info", checkIsNull(hotel.getHotel_info().getSpecial_info()));
                map.put("hotel_facility_and_service", checkIsNull(hotel.getHotel_info().getHotel_facility_and_service()));
                map.put("all_room_num", checkIsNull(hotel.getHotel_info().getAll_room_num()));
                map.put("hotel_contact", checkIsNull(hotel.getHotel_info().getHotel_contact()));
                map.put("hotel_brief_introduction", checkIsNull(hotel.getHotel_info().getHotel_brief_introduction()));
                map.put("hotel_policy", checkIsNull(hotel.getHotel_policy()));
                map.put("pick_time", checkIsNull(hotel.getPick_time()));
                map.put("info_from", hotel.getInfo_from());

                tx.run("Merge (hotel:HOTEL {" +
                        "hotel_recommend_num:{hotel_recommend_num}," +
                        "hotel_address:{hotel_address}," +
                        "hotel_service:{hotel_service}," +
                        "hotel_stars:{hotel_stars}," +
                        "hotel_diamond:{hotel_diamond}," +
                        "hotel_rate:{hotel_rate}," +
                        "hotel_name:{hotel_name}," +
                        "hotel_url:{hotel_url}," +
                        "hotel_collect_num:{hotel_collect_num}," +
                        "hotel_rate:{hotel_rate}," +
                        "special_label:{special_label}," +
                        "special_info:{special_info}," +
                        "hotel_facility_and_service:{hotel_facility_and_service}," +
                        "all_room_num:{all_room_num}," +
                        "hotel_contact:{hotel_contact}," +
                        "hotel_brief_introduction:{hotel_brief_introduction}," +
                        "hotel_policy:{hotel_policy}," +
                        "pick_time:{pick_time}," +
                        "info_from:{info_from}" +
                        "})", map);
            }
            tx.success();
            tx.close();
        }
    }

    public static void generateIsSameAsRelation(Session session, String fileName) {
        try (Transaction tx = session.beginTransaction()) {
            String strFromFile = FileUtils.parseJsonStrFromFile("/home/hiwhitley/文档/rdf/" + fileName + ".json");
            List<CtripHotel> hotelList = FileUtils.fromJsonList(strFromFile, CtripHotel.class);
            for (CtripHotel hotel : hotelList) {
                HashMap<String, Object> map = new HashMap<>();
                map.put("info_from", "携程");
                map.put("info_from2", "艺龙");
                map.put("hotel_name", hotel.getHotel_name());
                map.put("hotel_name", hotel.getHotel_name());
                StatementResult run = tx.run("Match (hotel1:HOTEL {hotel_name:{hotel_name},info_from:{info_from}}), " +
                        "(hotel2:HOTEL {hotel_name:{hotel_name},info_from:{info_from2}})" +
                        "Merge (hotel1)-[:isSameHotel ]-(hotel2)", map);
                System.out.println(run.list());
            }
            tx.success();
            tx.close();
        }
    }

    public static void generateHotelPolicyRelation(Session session, String fileName) {
        try (Transaction tx = session.beginTransaction()) {
            String strFromFile = FileUtils.parseJsonStrFromFile("/home/hiwhitley/文档/rdf/" + fileName + ".json");
            List<CtripHotel> hotelList = FileUtils.fromJsonList(strFromFile, CtripHotel.class);
            for (CtripHotel hotel : hotelList) {
                HashMap<String, Object> map = new HashMap<>();
                map.put("hotel_url", hotel.getHotel_url());
                System.out.println(hotel.getHotel_url());
                map.put("pet_policy", hotel.getHotel_policy().getPet_policy());
                map.put("children_policy", hotel.getHotel_policy().getChildren_policy());
                map.put("in_out_time", hotel.getHotel_policy().getIn_out_time());
                map.put("acceptable_credit_card", checkIsNull(hotel.getHotel_policy().getAcceptable_credit_card()));
                StatementResult run = tx.run("Match (hotel:HOTEL {hotel_url:{hotel_url}}) " +
                        "Create (policy:HOTEL_POLICY {pet_policy:{pet_policy}," +
                        "children_policy:{children_policy}," +
                        "acceptable_credit_card:{acceptable_credit_card}," +
                        "in_out_time:{in_out_time}})" +
                        "Merge (hotel)-[:hasHotelPolicy ]->(policy)", map);
                System.out.println(run.list());
            }

            tx.success();
            tx.close();
        }
    }


}
