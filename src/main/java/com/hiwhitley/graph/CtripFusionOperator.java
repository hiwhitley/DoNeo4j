package com.hiwhitley.graph;

import com.hiwhitley.graph.bean.CtripHotel;
import com.hiwhitley.graph.util.FileUtils;
import org.neo4j.driver.v1.Session;
import org.neo4j.driver.v1.Transaction;

import java.util.HashMap;
import java.util.List;

/**
 * Created by hiwhitley on 17-1-12.
 */
public class CtripFusionOperator extends Operator {

    public static void fusionRoomRelation(Session session, String fileName) {
        try (Transaction tx = session.beginTransaction()) {
            String strFromFile = FileUtils.parseJsonStrFromFile("/home/hiwhitley/文档/rdf/" + fileName + ".json");
            List<CtripHotel> hotelList = FileUtils.fromJsonList(strFromFile, CtripHotel.class);
            for (CtripHotel hotel : hotelList) {
                for (CtripHotel.RoomTypes roomTypes : hotel.getRoom_types()) {
                    HashMap<String, Object> map = new HashMap<>();
                    map.put("hotel_name", hotel.getHotel_name());
                    map.put("room_type", roomTypes.getRoom_type());
//                    map.put("room_type", roomTypes.getRoom_type());
                    System.out.println(roomTypes.getRoom_type());
                    map.put("enable_add_bed", checkIsNull(roomTypes.getEnable_add_bed()));
                    map.put("smoking_room", checkIsNull(roomTypes.getSmokingroom()));
                    map.put("bathroom", checkIsNull(roomTypes.getBathroom()));
                    map.put("extras_media", checkIsNull(roomTypes.getExtras_media()));
                    map.put("extras_facility", checkIsNull(roomTypes.getExtras_facility()));
                    map.put("food_drinking", checkIsNull(roomTypes.getFood_drinking()));
                    map.put("scenery", checkIsNull(roomTypes.getScenery()));
                    tx.run("Match (hotel:HOTEL {hotel_name:{hotel_name}})" +
                            "-[r:hasRoomType]" +
                            "->(room:ROOM {room_type:{room_type}}) " +
                            "set " +
                            "r.enable_add_bed = {enable_add_bed}," +
                            "r.smoking_room = {smoking_room}," +
                            "r.bathroom = {bathroom}," +
                            "r.extras_media = {extras_media}," +
                            "r.extras_facility = {extras_facility}," +
                            "r.food_drinking = {food_drinking}," +
                            "r.scenery = {scenery}", map);
                }
            }
            tx.success();
            tx.close();
        }
    }

    public static void fusionHotel(Session session, String fileName) {
        try (Transaction tx = session.beginTransaction()) {
            String strFromFile = FileUtils.parseJsonStrFromFile("/home/hiwhitley/文档/rdf/" + fileName + ".json");
            List<CtripHotel> hotelList = FileUtils.fromJsonList(strFromFile, CtripHotel.class);
            for (CtripHotel hotel : hotelList) {
                HashMap<String, Object> map = new HashMap<>();

                map.put("hotel_name", hotel.getHotel_name());
                map.put("special_label", checkIsNull(hotel.getHotel_info().getSpecial_label()));
                System.out.println(hotel.getHotel_info().getSpecial_info());
                map.put("special_info", checkIsNull(hotel.getHotel_info().getSpecial_info()));
                map.put("hotel_facility_and_service", checkIsNull(hotel.getHotel_info().getHotel_facility_and_service()));
                map.put("all_room_num", checkIsNull(hotel.getHotel_info().getAll_room_num()));

                tx.run("Match (hotel:HOTEL {hotel_name:{hotel_name}})" +
                        "set " +
                        "hotel.special_label = {special_label}," +
                        "hotel.special_info = {special_info}," +
                        "hotel.hotel_facility_and_service = {hotel_facility_and_service}," +
                        "hotel.all_room_num = {all_room_num}", map);
            }
            tx.success();
            tx.close();
        }
    }


}
