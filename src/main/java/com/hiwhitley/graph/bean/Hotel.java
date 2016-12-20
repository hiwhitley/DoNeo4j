package com.hiwhitley.graph.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by hiwhitley on 16-12-20.
 */
public class Hotel {

    /**
     * _id : {"$oid":"58577d96581f520fd4b2302d"}
     * near_entertainment : [{"店名":"千岛湖秀水广场","距离":"直线约642m","人均":"无"},{"店名":"千岛湖广场","距离":"直线约2km","人均":"无"},{"店名":"网鱼网咖","距离":"直线约658m","人均":"无"},{"店名":"千岛湖喜来登度假酒店","距离":"直线约763m","人均":"299.5"},{"店名":"阳光水岸度假村","距离":"直线约983m","人均":"480.0"},{"店名":"千岛湖水之灵","距离":"直线约1.8km","人均":"85"},{"店名":"千岛湖金字塔国际影城","距离":"直线约993m","人均":"60"},{"店名":"锦尚足浴","距离":"直线约389m","人均":"无"},{"店名":"秀水咖啡","距离":"直线约357m","人均":"56.0"},{"店名":"千岛湖鼎红国际ktv","距离":"直线约855m","人均":"无"}]
     * room_types : [{"床型":"大床","楼层":"楼层：1层-2层","是否包含WiFi":"包含WIFI","房型":"园景大床房","人数":2,"面积":"房间30㎡"},{"床型":"双床","楼层":"楼层：1层-2层","是否包含WiFi":"包含WIFI","房型":"园景双床房","人数":2,"面积":"房间30㎡"},{"床型":"大床","楼层":"楼层：1层-2层","是否包含WiFi":"包含WIFI","房型":"景观湖景大床房","人数":2,"面积":"房间30㎡"},{"床型":"双床","楼层":"楼层：1层-2层","是否包含WiFi":"包含WIFI","房型":"景观湖景双床房","人数":2,"面积":"房间30㎡"},{"床型":"大床","楼层":"楼层：2层-5层","是否包含WiFi":"包含WIFI","房型":"豪华湖景大床房","人数":2,"面积":"房间30㎡"},{"床型":"双床","楼层":"楼层：2层-5层","是否包含WiFi":"包含WIFI","房型":"豪华湖景双床房","人数":2,"面积":"房间30㎡"},{"床型":"大床","楼层":"楼层：5层-6层","是否包含WiFi":"包含WIFI","房型":"中心湖景大床房","人数":2,"面积":"房间30㎡"},{"床型":"双床","楼层":"楼层：5层-6层","是否包含WiFi":"包含WIFI","房型":"中心湖景双床房","人数":2,"面积":"房间30㎡"},{"床型":"大床","楼层":"无此信息","是否包含WiFi":"包含WIFI","房型":"房车","人数":"3","面积":"房间50㎡"},{"床型":"大床","楼层":"楼层：2层-4层","是否包含WiFi":"包含WIFI","房型":"豪华景观套房","人数":2,"面积":"房间70㎡"},{"床型":"大床","楼层":"楼层：3层-4层","是否包含WiFi":"包含WIFI","房型":"豪华湖景套房1","人数":2,"面积":"房间60㎡"},{"床型":"三床","楼层":"楼层：1层-2层","是否包含WiFi":"包含WIFI","房型":"家庭套房","人数":"4","面积":"房间68㎡"},{"床型":"大/双床","楼层":"楼层：1层","是否包含WiFi":"包含WIFI","房型":"园景房","人数":2,"面积":"房间30㎡"}]
     * hotel_recommend_num : 3868
     * hotel_address : [景区]淳安县千岛湖镇麒麟半岛(近阳光路,千岛湖主湖区)
     * near_food : [{"店名":"千岛湖几荷餐厅","距离":"直线约374m","人均":"82.0"},{"店名":"全乐鱼馆","距离":"直线约741m","人均":"69.0"},{"店名":"千岛湖土家味酒楼","距离":"直线约753m","人均":"61.0"},{"店名":"映山红土菜馆","距离":"直线约756m","人均":"44.0"},{"店名":"渔老大","距离":"直线约513m","人均":"89.0"},{"店名":"琦记野生鱼馆","距离":"直线约445m","人均":"85.0"},{"店名":"鱼头旺","距离":"直线约756m","人均":"48.0"},{"店名":"咱家鱼馆","距离":"直线约755m","人均":"56.0"},{"店名":"界首有机鱼馆","距离":"直线约749m","人均":"72.0"},{"店名":"淳味1号海派餐厅","距离":"直线约932m","人均":"44.0"}]
     * hotel_service : 4.8
     * hotel_stars : 5
     * hotel_name : 千岛湖开元度假村
     * hotel_url : http://hotel.elong.com/qiandaohu_hangzhou/51233002/
     * hotel_collect_num : 1463
     * hotel_rate : 0.99
     * hotel_info : {"停车场":"酒店提供停车位","酒店简介":"◆名师设计与建造 临水依山而建 尽享千岛湖秀美风情 千岛湖开元度假村位于国家5A级风景名胜区千岛湖，是由\u201c中国饭店业集团20强\u201d之一的开元旅业集团开发管理的五星级豪华度假村，内有一家五星级度假酒店和88幢独立别墅。本着\u201c打造华东第一度假村\u201d的美好愿望，度假村从筹建伊始就诚邀美国WATG、HBA和香港BELT COLLINS等国际顶尖设计公司分别担任度假村的建筑规划设计、室内装修设计与室外景观设计。 度假村临水依山而建，占地300余亩，珍藏天然半岛的层峦叠翠，独享三面环绕的盈盈碧水。酒店拥有227间豪华舒适、完全融入自然风光的绿色客房，每一间都拥有独立阳台；拥有完备的餐饮设施，在幽雅的餐厅与宴会厅体验美味之余更可尽享千岛湖秀美风情，更有完备高档的休闲娱乐设施兼有800平方米室外临湖游泳池、临湖SPA、价值千万的豪华游艇等个性化尊容配套。 ◆度假村生态的环境 完善的设施 成熟的管理 地道的餐饮和优质的服务 赢得了\u201c东方夏威夷\u201d之美称 自2004年4月30日开业以来，酒店以生态的环境、完善的设施、成熟的管理、地道的餐饮和优质的服务深受中外商务、度假客人的青睐，并以绝美景致和浓郁夏威夷假日风情赢得了\u201c东方夏威夷\u201d之美称；千岛湖开元度假村于2005年9月荣膺五星级旅游饭店称号之后，亦先后荣获《时尚旅游》中国最佳度假酒店、《时尚旅游》中国首选度假酒店、中国酒店星光奖\u201c中国十大最具魅力酒店\u201d、中国餐饮名店、\u201c中国酒店金枕头奖十大最受欢迎度假酒店\u201d、《私家地理》\u201c中国百佳酒店\u201d以及中国饭店业的最高荣誉\u2014\u2014金星奖。 秉承开元尊贵典雅的品牌意涵、温存体贴的服务文化，在水景、音乐、美酒、香风熏染中，千岛湖开元度假村期待您的尊荣之旅。 度假村开业时间2004年4月30日，楼高6层，客房总数227间（套）。","硬件设施":"免费wifi 免费有线 免费停车 中餐厅 室内游泳池 健身中心 会议设施 商务中心","酒店电话":"0571-65018888 艺龙电话预订：4009-333-333","开业时间":"酒店开业时间 2004年 新近装修时间 2011 年","酒店服务":"卡拉OK厅、棋牌室、桌球室、乒乓球室、室内游泳池、网球场、健身室、按摩室、桑拿浴室、游艇俱乐部\\n","可接受的信用卡":["VISA","UnionPay","MasterCard","AmericaExpress","DinersClub","JCB"],"酒店设施":"免费Wifi、免费停车、游泳池、健身房、商务中心、会议室、中餐厅、西餐厅、医疗支援、婴儿或儿童看护、叫醒服务、洗衣服务、送餐服务、旅游服务、租车服务、专职行李员、擦鞋服务、外币兑换服务、有电梯、前台保险柜、大堂吧、公共区域闭路电视监控系统、酒吧、行政酒廊、24小时热水、宴会厅、棋牌室、桑拿浴室、卡拉OK厅、台球室、乒乓球室、按摩保健、网球场"}
     * near_scenery : [{"景点名":"千岛湖国家森林公园","距离":"直线约4.1km"},{"景点名":"千岛湖东南湖区","距离":"直线约5km"},{"景点名":"湖滨公园","距离":"直线约751m"},{"景点名":"千岛湖中心湖区","距离":"直线约4.4km"},{"景点名":"千岛湖森林氧吧","距离":"直线约17.7km"},{"景点名":"梦姑塘文化公园","距离":"直线约2.6km"},{"景点名":"红叶湾景点","距离":"直线约7.3km"},{"景点名":"千岛湖钓鱼岛","距离":"直线约5.7km"},{"景点名":"黄山尖","距离":"直线约8.5km"},{"景点名":"梅峰","距离":"直线约9.3km"}]
     * pick_time : 2016-12-20 10:19:55
     * near_shop : [{"店名":"千岛湖商厦","距离":"直线约1.4km"},{"店名":"千岛湖农贸市场","距离":"直线约989m"},{"店名":"世纪联华(淳安店)","距离":"直线约1.4km"},{"店名":"四季春服饰","距离":"直线约1.4km"},{"店名":"联华超市(新安北路店)","距离":"直线约1km"},{"店名":"新华书店(淳安店)","距离":"直线约1.2km"},{"店名":"鑫馀烟酒行","距离":"直线约393m"},{"店名":"野娇娇品牌特产店(新安北路)","距离":"直线约831m"},{"店名":"塘边菜市场","距离":"直线约1.6km"},{"店名":"威卡姆(千岛湖卖场)","距离":"直线约1.5km"}]
     * near_traffic : [{"站点名":"阳光客运码头","距离":"直线405m"},{"站点名":"淳安汽车站","距离":"直线1.9km"}]
     * info_from : 艺龙
     */

    private Id _id;
    private long hotel_recommend_num;
    private String hotel_address;
    private double hotel_service;
    private double hotel_stars;
    private String hotel_name;
    private String hotel_url;
    private long hotel_collect_num;
    private double hotel_rate;
    private HotelInfo hotel_info;
    private String pick_time;
    private String info_from;
    private List<NearEntertainment> near_entertainment;
    private List<RoomTypes> room_types;
    private List<NearFood> near_food;
    private List<NearScenery> near_scenery;
    private List<NearShop> near_shop;
    private List<NearTraffic> near_traffic;

    public Id get_id() {
        return _id;
    }

    public void set_id(Id _id) {
        this._id = _id;
    }

    public long getHotel_recommend_num() {
        return hotel_recommend_num;
    }

    public void setHotel_recommend_num(long hotel_recommend_num) {
        this.hotel_recommend_num = hotel_recommend_num;
    }

    public String getHotel_address() {
        return hotel_address;
    }

    public void setHotel_address(String hotel_address) {
        this.hotel_address = hotel_address;
    }

    public double getHotel_service() {
        return hotel_service;
    }

    public void setHotel_service(double hotel_service) {
        this.hotel_service = hotel_service;
    }

    public double getHotel_stars() {
        return hotel_stars;
    }

    public void setHotel_stars(double hotel_stars) {
        this.hotel_stars = hotel_stars;
    }

    public String getHotel_name() {
        return hotel_name;
    }

    public void setHotel_name(String hotel_name) {
        this.hotel_name = hotel_name;
    }

    public String getHotel_url() {
        return hotel_url;
    }

    public void setHotel_url(String hotel_url) {
        this.hotel_url = hotel_url;
    }

    public long getHotel_collect_num() {
        return hotel_collect_num;
    }

    public void setHotel_collect_num(long hotel_collect_num) {
        this.hotel_collect_num = hotel_collect_num;
    }

    public double getHotel_rate() {
        return hotel_rate;
    }

    public void setHotel_rate(double hotel_rate) {
        this.hotel_rate = hotel_rate;
    }

    public HotelInfo getHotel_info() {
        return hotel_info;
    }

    public void setHotel_info(HotelInfo hotel_info) {
        this.hotel_info = hotel_info;
    }

    public String getPick_time() {
        return pick_time;
    }

    public void setPick_time(String pick_time) {
        this.pick_time = pick_time;
    }

    public String getInfo_from() {
        return info_from;
    }

    public void setInfo_from(String info_from) {
        this.info_from = info_from;
    }

    public List<NearEntertainment> getNear_entertainment() {
        return near_entertainment;
    }

    public void setNear_entertainment(List<NearEntertainment> near_entertainment) {
        this.near_entertainment = near_entertainment;
    }

    public List<RoomTypes> getRoom_types() {
        return room_types;
    }

    public void setRoom_types(List<RoomTypes> room_types) {
        this.room_types = room_types;
    }

    public List<NearFood> getNear_food() {
        return near_food;
    }

    public void setNear_food(List<NearFood> near_food) {
        this.near_food = near_food;
    }

    public List<NearScenery> getNear_scenery() {
        return near_scenery;
    }

    public void setNear_scenery(List<NearScenery> near_scenery) {
        this.near_scenery = near_scenery;
    }

    public List<NearShop> getNear_shop() {
        return near_shop;
    }

    public void setNear_shop(List<NearShop> near_shop) {
        this.near_shop = near_shop;
    }

    public List<NearTraffic> getNear_traffic() {
        return near_traffic;
    }

    public void setNear_traffic(List<NearTraffic> near_traffic) {
        this.near_traffic = near_traffic;
    }

    public static class Id {
        /**
         * $oid : 58577d96581f520fd4b2302d
         */

        private String $oid;

        public String get$oid() {
            return $oid;
        }

        public void set$oid(String $oid) {
            this.$oid = $oid;
        }
    }

    public static class HotelInfo {
        /**
         * 停车场 : 酒店提供停车位
         * 酒店简介 : ◆名师设计与建造 临水依山而建 尽享千岛湖秀美风情 千岛湖开元度假村位于国家5A级风景名胜区千岛湖，是由“中国饭店业集团20强”之一的开元旅业集团开发管理的五星级豪华度假村，内有一家五星级度假酒店和88幢独立别墅。本着“打造华东第一度假村”的美好愿望，度假村从筹建伊始就诚邀美国WATG、HBA和香港BELT COLLINS等国际顶尖设计公司分别担任度假村的建筑规划设计、室内装修设计与室外景观设计。 度假村临水依山而建，占地300余亩，珍藏天然半岛的层峦叠翠，独享三面环绕的盈盈碧水。酒店拥有227间豪华舒适、完全融入自然风光的绿色客房，每一间都拥有独立阳台；拥有完备的餐饮设施，在幽雅的餐厅与宴会厅体验美味之余更可尽享千岛湖秀美风情，更有完备高档的休闲娱乐设施兼有800平方米室外临湖游泳池、临湖SPA、价值千万的豪华游艇等个性化尊容配套。 ◆度假村生态的环境 完善的设施 成熟的管理 地道的餐饮和优质的服务 赢得了“东方夏威夷”之美称 自2004年4月30日开业以来，酒店以生态的环境、完善的设施、成熟的管理、地道的餐饮和优质的服务深受中外商务、度假客人的青睐，并以绝美景致和浓郁夏威夷假日风情赢得了“东方夏威夷”之美称；千岛湖开元度假村于2005年9月荣膺五星级旅游饭店称号之后，亦先后荣获《时尚旅游》中国最佳度假酒店、《时尚旅游》中国首选度假酒店、中国酒店星光奖“中国十大最具魅力酒店”、中国餐饮名店、“中国酒店金枕头奖十大最受欢迎度假酒店”、《私家地理》“中国百佳酒店”以及中国饭店业的最高荣誉——金星奖。 秉承开元尊贵典雅的品牌意涵、温存体贴的服务文化，在水景、音乐、美酒、香风熏染中，千岛湖开元度假村期待您的尊荣之旅。 度假村开业时间2004年4月30日，楼高6层，客房总数227间（套）。
         * 硬件设施 : 免费wifi 免费有线 免费停车 中餐厅 室内游泳池 健身中心 会议设施 商务中心
         * 酒店电话 : 0571-65018888 艺龙电话预订：4009-333-333
         * 开业时间 : 酒店开业时间 2004年 新近装修时间 2011 年
         * 酒店服务 : 卡拉OK厅、棋牌室、桌球室、乒乓球室、室内游泳池、网球场、健身室、按摩室、桑拿浴室、游艇俱乐部\n
         * 可接受的信用卡 : ["VISA","UnionPay","MasterCard","AmericaExpress","DinersClub","JCB"]
         * 酒店设施 : 免费Wifi、免费停车、游泳池、健身房、商务中心、会议室、中餐厅、西餐厅、医疗支援、婴儿或儿童看护、叫醒服务、洗衣服务、送餐服务、旅游服务、租车服务、专职行李员、擦鞋服务、外币兑换服务、有电梯、前台保险柜、大堂吧、公共区域闭路电视监控系统、酒吧、行政酒廊、24小时热水、宴会厅、棋牌室、桑拿浴室、卡拉OK厅、台球室、乒乓球室、按摩保健、网球场
         */

        @SerializedName("停车场")
        private String parkingLot;
        @SerializedName("酒店简介")
        private String introduction;
        @SerializedName("硬件设施")
        private String HardwareFacility;
        @SerializedName("酒店电话")
        private String tel;
        @SerializedName("开业时间")
        private String openingTime;
        @SerializedName("酒店服务")
        private String service;
        @SerializedName("酒店设施")
        private String hotelFacility;
        @SerializedName("可接受的信用卡")
        private List<String> adaptedCreditCard;

        public String getParkingLot() {
            return parkingLot;
        }

        public void setParkingLot(String parkingLot) {
            this.parkingLot = parkingLot;
        }

        public String getIntroduction() {
            return introduction;
        }

        public void setIntroduction(String introduction) {
            this.introduction = introduction;
        }

        public String getHardwareFacility() {
            return HardwareFacility;
        }

        public void setHardwareFacility(String HardwareFacility) {
            this.HardwareFacility = HardwareFacility;
        }

        public String getTel() {
            return tel;
        }

        public void setTel(String tel) {
            this.tel = tel;
        }

        public String getOpeningTime() {
            return openingTime;
        }

        public void setOpeningTime(String openingTime) {
            this.openingTime = openingTime;
        }

        public String getService() {
            return service;
        }

        public void setService(String service) {
            this.service = service;
        }

        public String getHotelFacility() {
            return hotelFacility;
        }

        public void setHotelFacility(String hotelFacilities) {
            this.hotelFacility = hotelFacilities;
        }

        public List<String> getAdaptedCreditCard() {
            return adaptedCreditCard;
        }

        public void setAdaptedCreditCard(List<String> adaptedCreditCard) {
            this.adaptedCreditCard = adaptedCreditCard;
        }
    }

    public static class NearEntertainment {
        /**
         * 店名 : 千岛湖秀水广场
         * 距离 : 直线约642m
         * 人均 : 无
         */

        @SerializedName("店名")
        private String shopName;
        @SerializedName("距离")
        private String distance;
        @SerializedName("人均")
        private String avePerson;

        public String getShopName() {
            return shopName;
        }

        public void setShopName(String shopName) {
            this.shopName = shopName;
        }

        public String getDistance() {
            return distance;
        }

        public void setDistance(String distance) {
            this.distance = distance;
        }

        public String getAvePerson() {
            return avePerson;
        }

        public void setAvePerson(String avePerson) {
            this.avePerson = avePerson;
        }
    }

    public static class RoomTypes {
        /**
         * 床型 : 大床
         * 楼层 : 楼层：1层-2层
         * 是否包含WiFi : 包含WIFI
         * 房型 : 园景大床房
         * 人数 : 2
         * 面积 : 房间30㎡
         */

        @SerializedName("床型")
        private String bedType;
        @SerializedName("楼层")
        private String floor;
        @SerializedName("是否包含WiFi")
        private String hasWifi;
        @SerializedName("房型")
        private String roomType;
        @SerializedName("人数")
        private String peopleNum;
        @SerializedName("面积")
        private String area;

        public String getBedType() {
            return bedType;
        }

        public void setBedType(String bedType) {
            this.bedType = bedType;
        }

        public String getFloor() {
            return floor;
        }

        public void setFloor(String floor) {
            this.floor = floor;
        }

        public String getHasWifi() {
            return hasWifi;
        }

        public void setHasWifi(String hasWifi) {
            this.hasWifi = hasWifi;
        }

        public String getRoomType() {
            return roomType;
        }

        public void setRoomType(String roomType) {
            this.roomType = roomType;
        }

        public String getPeopleNum() {
            return peopleNum;
        }

        public void setPeopleNum(String peopleNum) {
            this.peopleNum = peopleNum;
        }

        public String getArea() {
            return area;
        }

        public void setArea(String area) {
            this.area = area;
        }
    }

    public static class NearFood {
        /**
         * 店名 : 千岛湖几荷餐厅
         * 距离 : 直线约374m
         * 人均 : 82.0
         */

        @SerializedName("店名")
        private String foodName;
        @SerializedName("距离")
        private String distance;
        @SerializedName("人均")
        private double avePerson;

        public String getFoodName() {
            return foodName;
        }

        public void setFoodName(String foodName) {
            this.foodName = foodName;
        }

        public String getDistance() {
            return distance;
        }

        public void setDistance(String distance) {
            this.distance = distance;
        }

        public double getAvePerson() {
            return avePerson;
        }

        public void setAvePerson(double avePerson) {
            this.avePerson = avePerson;
        }
    }

    public static class NearScenery {
        /**
         * 景点名 : 千岛湖国家森林公园
         * 距离 : 直线约4.1km
         */

        @SerializedName("景点名")
        private String sceneryName;
        @SerializedName("距离")
        private String distance;

        public String getSceneryName() {
            return sceneryName;
        }

        public void setSceneryName(String sceneryName) {
            this.sceneryName = sceneryName;
        }

        public String getDistance() {
            return distance;
        }

        public void setDistance(String distance) {
            this.distance = distance;
        }
    }

    public static class NearShop {
        /**
         * 店名 : 千岛湖商厦
         * 距离 : 直线约1.4km
         */

        @SerializedName("店名")
        private String shopName;
        @SerializedName("距离")
        private String distance;

        public String getShopName() {
            return shopName;
        }

        public void setShopName(String shopName) {
            this.shopName = shopName;
        }

        public String getDistance() {
            return distance;
        }

        public void setDistance(String distance) {
            this.distance = distance;
        }
    }

    public static class NearTraffic {
        /**
         * 站点名 : 阳光客运码头
         * 距离 : 直线405m
         */

        @SerializedName("站点名")
        private String trafficName;
        @SerializedName("距离")
        private String distance;

        public String getTrafficName() {
            return trafficName;
        }

        public void setTrafficName(String trafficName) {
            this.trafficName = trafficName;
        }

        public String getDistance() {
            return distance;
        }

        public void setDistance(String distance) {
            this.distance = distance;
        }
    }
}
