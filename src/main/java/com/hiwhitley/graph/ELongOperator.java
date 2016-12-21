package com.hiwhitley.graph;

import com.hiwhitley.graph.bean.Hotel;
import com.hiwhitley.graph.util.FileUtils;
import org.neo4j.driver.v1.Session;
import org.neo4j.driver.v1.StatementResult;
import org.neo4j.driver.v1.Transaction;

import java.util.HashMap;
import java.util.List;

import static org.neo4j.driver.v1.Values.parameters;

/**
 * Created by hiwhitley on 16-12-20.
 */
public class ELongOperator extends Operator {
    public static void generateELongHotels(Session session, String fileName) {
        try (Transaction tx = session.beginTransaction()) {
            String strFromFile = FileUtils.parseJsonStrFromFile("/home/hiwhitley/文档/rdf/" + fileName + ".json");
            List<Hotel> hotelList = FileUtils.fromJsonList(strFromFile, Hotel.class);
            for (Hotel hotel : hotelList) {
                HashMap<String, Object> map = new HashMap<>();
                map.put("hotel_recommend_num", hotel.getHotel_recommend_num());
                map.put("hotel_address", hotel.getHotel_address());
                map.put("hotel_service", hotel.getHotel_service());
                map.put("hotel_stars", hotel.getHotel_stars());
                map.put("hotel_name", hotel.getHotel_name());
                map.put("hotel_url", hotel.getHotel_url());
                map.put("hotel_collect_num", hotel.getHotel_collect_num());
                map.put("hotel_rate", hotel.getHotel_rate());
                map.put("停车场", checkIsNull(hotel.getHotel_info().getParkingLot()));
                map.put("酒店简介", checkIsNull(hotel.getHotel_info().getIntroduction()));
                map.put("硬件设施", checkIsNull(hotel.getHotel_info().getHardwareFacility()));
                map.put("酒店电话", checkIsNull(hotel.getHotel_info().getTel()));
                map.put("开业时间", checkIsNull(hotel.getHotel_info().getOpeningTime()));
                map.put("酒店服务", checkIsNull(hotel.getHotel_info().getService()));
                map.put("可接受的信用卡", checkIsNull(hotel.getHotel_info().getAdaptedCreditCard()));
                map.put("酒店设施", checkIsNull(hotel.getHotel_info().getHotelFacility()));
                map.put("info_from", hotel.getInfo_from());

                tx.run("Merge (hotel:HOTEL {" +
                        "hotel_recommend_num:{hotel_recommend_num}," +
                        "hotel_address:{hotel_address}," +
                        "hotel_service:{hotel_service}," +
                        "hotel_stars:{hotel_stars}," +
                        "hotel_name:{hotel_name}," +
                        "hotel_url:{hotel_url}," +
                        "hotel_collect_num:{hotel_collect_num}," +
                        "hotel_rate:{hotel_rate}," +
                        "parking_lot:{停车场}," +
                        "introduction:{酒店简介}," +
                        "Hardware_facility:{硬件设施}," +
                        "tel:{酒店电话}," +
                        "opening_time:{开业时间}," +
                        "service:{酒店服务}," +
                        "adapted_credit_card:{可接受的信用卡}," +
                        "hotel_facility:{酒店设施}," +
                        "info_from:{info_from}" +
                        "})", map);
            }
            tx.success();
            tx.close();
        }
    }

    public static void generateRoomTypes(Session session, String fileName) {
        try (Transaction tx = session.beginTransaction()) {
            String strFromFile = FileUtils.parseJsonStrFromFile("/home/hiwhitley/文档/rdf/" + fileName + ".json");
            List<Hotel> hotelList = FileUtils.fromJsonList(strFromFile, Hotel.class);
            for (Hotel hotel : hotelList) {
                for (Hotel.RoomTypes roomTypes : hotel.getRoom_types()) {
                    tx.run("Merge (room:ROOM {room_type:{room_type}})",
                            parameters("room_type", roomTypes.getRoomType()));
                }
            }
            tx.success();
            tx.close();
        }
    }

    /**
     * 房型
     *
     * @param session
     * @param fileName
     */
    public static void generateRoomRelation(Session session, String fileName) {
        try (Transaction tx = session.beginTransaction()) {
            String strFromFile = FileUtils.parseJsonStrFromFile("/home/hiwhitley/文档/rdf/" + fileName + ".json");
            List<Hotel> hotelList = FileUtils.fromJsonList(strFromFile, Hotel.class);

            for (Hotel hotel : hotelList) {
                for (Hotel.RoomTypes roomTypes : hotel.getRoom_types()) {
                    HashMap<String, Object> map = new HashMap<>();
                    map.put("hotel_url", hotel.getHotel_url());
                    map.put("room_type", roomTypes.getRoomType());
                    map.put("room_type", roomTypes.getRoomType());
                    map.put("床型", roomTypes.getBedType());
                    map.put("是否包含WiFi", roomTypes.getHasWifi());
                    map.put("房型", roomTypes.getRoomType());
                    map.put("人数", roomTypes.getPeopleNum());
                    map.put("面积", roomTypes.getArea());
                    map.put("楼层", roomTypes.getFloor());
                    tx.run("Match (hotel:HOTEL {hotel_url:{hotel_url}})" +
                            ",(room:ROOM {room_type:{room_type}})" +
                            "merge (hotel)-" +
                            "[:hasRoomType {room_type:{room_type}," +
                            "bed_type:{床型}," +
                            "has_wifi:{是否包含WiFi}," +
                            "room_type:{房型}," +
                            "people_num:{人数}," +
                            "area:{面积}," +
                            "floor:{楼层}}]" +
                            "->(room)", map);
                }
            }
            tx.success();
            tx.close();
        }
    }

    public static void generateNearEntertainment(Session session, String fileName) {
        try (Transaction tx = session.beginTransaction()) {
            String strFromFile = FileUtils.parseJsonStrFromFile("/home/hiwhitley/文档/rdf/" + fileName + ".json");
            List<Hotel> hotelList = FileUtils.fromJsonList(strFromFile, Hotel.class);
            for (Hotel hotel : hotelList) {
                for (Hotel.NearEntertainment nearEntertainment : hotel.getNear_entertainment()) {
                    StatementResult run = tx.run("Merge (near {shop_name:{店名}, avePerson:{avePerson}}) set near:ENTERTAINMENT",
                            parameters(
                                    "店名", nearEntertainment.getShopName(),
                                    "avePerson", nearEntertainment.getAvePerson()
                            ));
                    System.out.println(run.list());
                }
            }

            tx.success();
            tx.close();
        }
    }

    public static void generateNearEntertainmentRelation(Session session, String fileName) {
        try (Transaction tx = session.beginTransaction()) {
            String strFromFile = FileUtils.parseJsonStrFromFile("/home/hiwhitley/文档/rdf/" + fileName + ".json");
            List<Hotel> hotelList = FileUtils.fromJsonList(strFromFile, Hotel.class);
            for (Hotel hotel : hotelList) {
                for (Hotel.NearEntertainment nearEntertainment : hotel.getNear_entertainment()) {
                    HashMap<String, Object> map = new HashMap<>();
                    map.put("hotel_url", hotel.getHotel_url());
                    map.put("shop_name", nearEntertainment.getShopName());
                    map.put("distance", nearEntertainment.getDistance());
                    map.put("avePerson", nearEntertainment.getAvePerson());
                    StatementResult run = tx.run("Match (hotel:HOTEL {hotel_url:{hotel_url}}), " +
                            "(entertainment:ENTERTAINMENT {shop_name:{shop_name}})" +
                            "Merge (hotel)-[:hotelNearEntertainment {distance:{distance}, avePerson:{avePerson}}]->(entertainment)" +
                            "Merge (entertainment)-[:entertainmentNearHotel {distance:{distance}}]->(hotel)", map);
                    System.out.println(run.list());
                }
            }

            tx.success();
            tx.close();
        }
    }


    public static void generateNearFood(Session session, String fileName) {
        try (Transaction tx = session.beginTransaction()) {
            String strFromFile = FileUtils.parseJsonStrFromFile("/home/hiwhitley/文档/rdf/" + fileName + ".json");
            List<Hotel> hotelList = FileUtils.fromJsonList(strFromFile, Hotel.class);
            for (Hotel hotel : hotelList) {
                for (Hotel.NearFood nearFood : hotel.getNear_food()) {
                    StatementResult run = tx.run("Merge (near {shop_name:{店名}, avePerson:{avePerson}}) set near:SHOP",
                            parameters(
                                    "店名", nearFood.getFoodName(),
                                    "avePerson", nearFood.getAvePerson()
                            ));
                    System.out.println(run.list());
                }
            }

            tx.success();
            tx.close();
        }
    }

    public static void generateNearFoodRelation(Session session, String fileName) {
        try (Transaction tx = session.beginTransaction()) {
            String strFromFile = FileUtils.parseJsonStrFromFile("/home/hiwhitley/文档/rdf/" + fileName + ".json");
            List<Hotel> hotelList = FileUtils.fromJsonList(strFromFile, Hotel.class);
            for (Hotel hotel : hotelList) {
                for (Hotel.NearFood nearFood : hotel.getNear_food()) {
                    HashMap<String, Object> map = new HashMap<>();
                    map.put("hotel_url", hotel.getHotel_url());
                    map.put("shop_name", nearFood.getFoodName());
                    map.put("distance", nearFood.getDistance());
                    map.put("avePerson", nearFood.getAvePerson());
                    StatementResult run = tx.run("Match (hotel:HOTEL {hotel_url:{hotel_url}}), " +
                            "(food:SHOP {shop_name:{shop_name}})" +
                            "Merge (hotel)-[:hotelNearFood {distance:{distance}, avePerson:{avePerson}}]->(food)" +
                            "Merge (food)-[:foodNearHotel {distance:{distance}}]->(hotel)", map);
                    System.out.println(run.list());
                }
            }

            tx.success();
            tx.close();
        }
    }

    public static void generateNearHotel(Session session, String fileName) {
        try (Transaction tx = session.beginTransaction()) {
            String strFromFile = FileUtils.parseJsonStrFromFile("/home/hiwhitley/文档/rdf/" + fileName + ".json");
            List<Hotel> hotelList = FileUtils.fromJsonList(strFromFile, Hotel.class);
            int i = 0;
            for (Hotel hotel : hotelList) {
                if (hotel.getNearHotel() == null)
                    continue;
                for (Hotel.NearHotel nearHotel : hotel.getNearHotel()) {
                    StatementResult run = tx.run("Merge (near {hotel_name:{hotel_name}, hotel_url:{hotel_url}}) set near:HOTEL",
                            parameters(
                                    "hotel_name", nearHotel.getHotelName(),
                                    "hotel_url", nearHotel.getHotelUrl()
                            ));
                    System.out.println("====>" + i++);
                }
            }

            tx.success();
            tx.close();
        }
    }

    public static void generateNearHotelRelation(Session session, String fileName) {
        try (Transaction tx = session.beginTransaction()) {
            String strFromFile = FileUtils.parseJsonStrFromFile("/home/hiwhitley/文档/rdf/" + fileName + ".json");
            List<Hotel> hotelList = FileUtils.fromJsonList(strFromFile, Hotel.class);
            for (Hotel hotel : hotelList) {
                for (Hotel.NearHotel nearHotel : hotel.getNearHotel()) {
                    HashMap<String, Object> map = new HashMap<>();
                    map.put("hotel_url", hotel.getHotel_url());
                    map.put("hotel_url2", nearHotel.getHotelUrl());
                    map.put("distance", nearHotel.getDistance());
                    StatementResult run = tx.run("Match (hotel:HOTEL {hotel_url:{hotel_url}}), " +
                            "(near:HOTEL {hotel_url:{hotel_url2}})" +
                            "Merge (hotel)-[:hotelNearHotel {distance:{distance}}]-(near)" , map);
                    System.out.println(run.list());
                }
            }

            tx.success();
            tx.close();
        }
    }

}
