package com.hiwhitley.graph.bean;

import java.util.List;

/**
 * Created by hiwhitley on 16-12-1.
 */
public class Comment {


    /**
     * _id : {"$oid":"583ebf9f581f52188128b188"}
     * shop_url : http://www.dianping.com/shop/4498412
     * shop_name : 西子湖四季酒店金沙厅
     * comment_author_link : http://www.dianping.com/member/409965
     * comment_support_count : 0
     * comment_rank : 4
     * comment_time : 11-29
     * comment_serve_rank : 3
     * pick_time : 2016-11-30 20:01:35
     * comment_reply_count : 0
     * comment_content_imgs : ["http://www.dianping.com/photos/642995835/member","http://www.dianping.com/photos/642995836/member","http://www.dianping.com/photos/642995837/member","http://www.dianping.com/photos/642995838/member","http://www.dianping.com/photos/642995839/member","http://www.dianping.com/shop/4498412/photos/album/409965"]
     * comment_taste_rank : 4
     * comment_id : 320093736
     * comment_author_name : kidyueer
     * comment_content_text : 第三次来了，仍然很满意！这次为了避免等位，特意提前一周就定了位。一家四大二小，点了鸭掌、糖藕、两道点心、牛肋排、乾隆鱼头和一个蔬菜。其他几道菜不点评也罢了，最好吃的莫过于这道乾隆鱼头，虽然等了半个小时，但是鱼头处理的很干净、也很入味，加上白饭真是绝配。牛肋排稍微有点韧，但是不会感觉塞牙或者无法嚼动，原汁原味的牛肉，也很好吃。虽然价格不宜，但是食物的质量加上服务的水准，想必下次应该也不会太遥远吧！
     * comment_environment_rank : 3
     */

    private Id _id;
    private String shop_url;
    private String shop_name;
    private String comment_author_link;
    private int comment_support_count;
    private String comment_rank;
    private String comment_time;
    private String comment_serve_rank;
    private String pick_time;
    private int comment_reply_count;
    private String comment_taste_rank;
    private String comment_id;
    private String comment_author_name;
    private String comment_content_text;
    private String comment_environment_rank;
    //private List<String> comment_content_imgs;

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

    public String getShop_name() {
        return shop_name;
    }

    public void setShop_name(String shop_name) {
        this.shop_name = shop_name;
    }

    public String getComment_author_link() {
        return comment_author_link;
    }

    public void setComment_author_link(String comment_author_link) {
        this.comment_author_link = comment_author_link;
    }

    public int getComment_support_count() {
        return comment_support_count;
    }

    public void setComment_support_count(int comment_support_count) {
        this.comment_support_count = comment_support_count;
    }

    public String getComment_rank() {
        return comment_rank;
    }

    public void setComment_rank(String comment_rank) {
        this.comment_rank = comment_rank;
    }

    public String getComment_time() {
        return comment_time;
    }

    public void setComment_time(String comment_time) {
        this.comment_time = comment_time;
    }

    public String getComment_serve_rank() {
        return comment_serve_rank;
    }

    public void setComment_serve_rank(String comment_serve_rank) {
        this.comment_serve_rank = comment_serve_rank;
    }

    public String getPick_time() {
        return pick_time;
    }

    public void setPick_time(String pick_time) {
        this.pick_time = pick_time;
    }

    public int getComment_reply_count() {
        return comment_reply_count;
    }

    public void setComment_reply_count(int comment_reply_count) {
        this.comment_reply_count = comment_reply_count;
    }

    public String getComment_taste_rank() {
        return comment_taste_rank;
    }

    public void setComment_taste_rank(String comment_taste_rank) {
        this.comment_taste_rank = comment_taste_rank;
    }

    public String getComment_id() {
        return comment_id;
    }

    public void setComment_id(String comment_id) {
        this.comment_id = comment_id;
    }

    public String getComment_author_name() {
        return comment_author_name;
    }

    public void setComment_author_name(String comment_author_name) {
        this.comment_author_name = comment_author_name;
    }

    public String getComment_content_text() {
        return comment_content_text;
    }

    public void setComment_content_text(String comment_content_text) {
        this.comment_content_text = comment_content_text;
    }

    public String getComment_environment_rank() {
        return comment_environment_rank;
    }

    public void setComment_environment_rank(String comment_environment_rank) {
        this.comment_environment_rank = comment_environment_rank;
    }

//    public List<String> getComment_content_imgs() {
//        return comment_content_imgs;
//    }
//
//    public void setComment_content_imgs(List<String> comment_content_imgs) {
//        this.comment_content_imgs = comment_content_imgs;
//    }

    public static class Id {
        /**
         * $oid : 583ebf9f581f52188128b188
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
