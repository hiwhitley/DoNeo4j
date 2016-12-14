package com.hiwhitley.graph.bean;

/**
 * Created by hiwhitley on 16-11-25.
 */
public class Shop {


    /**
     * _id : {"$oid":"584e95f5581f527ca56d1ae4"}
     * shop_url : http://m.dianping.com/shop/5761574
     * avePerPerson : 102
     * recommend : 千岛湖鱼头,石锅花猪肉,自制农家豆腐,万记私房虾,千岛之吻,风味鲜笋煲,梅干菜肉饼,特色豆腐煲,口水鸡,淳牌甲鱼锅,三角戏
     * shop_rank : 45
     * classfy : 农家菜
     * info_from : 大众点评
     * rank1 : 9.0
     * rank2 : 8.8
     * rank3 : 8.9
     * pick_time : 2016-12-12 20:20:05
     * shop_name : 万记 淳菜府(千岛湖新安东路万记店)
     * shop_address : 千岛湖新安东路236号(交通银行)
     * shop_tel : 057164886488
     * business_time : 9:00-22:00
     */

    private Id _id;
    private String shop_url;
    private String avePerPerson;
    private String recommend;
    private String shop_rank;
    private String classfy;
    private String info_from;
    private String rank1;
    private String rank2;
    private String rank3;
    private String pick_time;
    private String shop_name;
    private String shop_address;
    private String shop_tel;
    private String business_time;

    public Id get_id() {
        return _id;
    }

    public void set_id(Id _id) {
        this._id = _id;
    }

    public String getShop_url() {
        return shop_url;
    }

    public void setShop_url(String shop_url) {
        this.shop_url = shop_url;
    }

    public String getAvePerPerson() {
        return avePerPerson;
    }

    public void setAvePerPerson(String avePerPerson) {
        this.avePerPerson = avePerPerson;
    }

    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }

    public String getShop_rank() {
        return shop_rank;
    }

    public void setShop_rank(String shop_rank) {
        this.shop_rank = shop_rank;
    }

    public String getClassfy() {
        return classfy;
    }

    public void setClassfy(String classfy) {
        this.classfy = classfy;
    }

    public String getInfo_from() {
        return info_from;
    }

    public void setInfo_from(String info_from) {
        this.info_from = info_from;
    }

    public String getRank1() {
        return rank1;
    }

    public void setRank1(String rank1) {
        this.rank1 = rank1;
    }

    public String getRank2() {
        return rank2;
    }

    public void setRank2(String rank2) {
        this.rank2 = rank2;
    }

    public String getRank3() {
        return rank3;
    }

    public void setRank3(String rank3) {
        this.rank3 = rank3;
    }

    public String getPick_time() {
        return pick_time;
    }

    public void setPick_time(String pick_time) {
        this.pick_time = pick_time;
    }

    public String getShop_name() {
        return shop_name;
    }

    public void setShop_name(String shop_name) {
        this.shop_name = shop_name;
    }

    public String getShop_address() {
        return shop_address;
    }

    public void setShop_address(String shop_address) {
        this.shop_address = shop_address;
    }

    public String getShop_tel() {
        return shop_tel;
    }

    public void setShop_tel(String shop_tel) {
        this.shop_tel = shop_tel;
    }

    public String getBusiness_time() {
        return business_time;
    }

    public void setBusiness_time(String business_time) {
        this.business_time = business_time;
    }

    public static class Id {
        /**
         * $oid : 584e95f5581f527ca56d1ae4
         */

        private String $oid;

        public String get$oid() {
            return $oid;
        }

        public void set$oid(String $oid) {
            this.$oid = $oid;
        }
    }
}
