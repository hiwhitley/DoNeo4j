package com.hiwhitley.graph.bean;

/**
 * Created by hiwhitley on 16-11-25.
 */
public class Shop {

    /**
     * _id : {"$oid":"584b59ebd023c7297f01d484"}
     * service : 9.2
     * cuisines : 杭帮菜
     * shop_name : 全乐鱼馆
     * tel : 13867141251
     * shop_url : http://m.dianping.com/shop/19003197
     * taste : 9.3
     * pick_time : 2016-12-10 09:27:07
     * environment : 8.4
     * avePerPerson : 72
     * address : 千岛湖镇阳光路8—22号
     * recommend : 鱼头浓汤,千岛湖有机鱼一鱼二吃,鱼尾红烧,螺丝,野娇娇薯粉煲,千岛深水螺丝,椒盐小溪鱼,杂鱼锅仔,剁椒鱼头,白切鸡,油爆虾
     */

    private Id _id;
    private String service;
    private String cuisines;
    private String shop_name;
    private String tel;
    private String shop_url;
    private String taste;
    private String pick_time;
    private String environment;
    private String avePerPerson;
    private String address;
    private String recommend;

    public Id get_id() {
        return _id;
    }

    public void set_id(Id _id) {
        this._id = _id;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getCuisines() {
        return cuisines;
    }

    public void setCuisines(String cuisines) {
        this.cuisines = cuisines;
    }

    public String getShop_name() {
        return shop_name;
    }

    public void setShop_name(String shop_name) {
        this.shop_name = shop_name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getShop_url() {
        return shop_url;
    }

    public void setShop_url(String shop_url) {
        this.shop_url = shop_url;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getPick_time() {
        return pick_time;
    }

    public void setPick_time(String pick_time) {
        this.pick_time = pick_time;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getAvePerPerson() {
        return avePerPerson;
    }

    public void setAvePerPerson(String avePerPerson) {
        this.avePerPerson = avePerPerson;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }

    public static class Id {
        /**
         * $oid : 584b59ebd023c7297f01d484
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
