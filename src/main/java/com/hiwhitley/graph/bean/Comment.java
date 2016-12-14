package com.hiwhitley.graph.bean;

import java.util.List;

/**
 * Created by hiwhitley on 16-12-1.
 */
public class Comment {


    /**
     * _id : {"$oid":"584f9386581f523d67e3dcb4"}
     * comment_environment_rank : 4
     * comment_author_link : http://www.dianping.com/member/18913036
     * comment_serve_rank : 4
     * shop_name : 界首有机鱼馆
     * comment_support_count : 0
     * comment_time : 12-11
     * comment_id : 322470603
     * comment_author_name : 赵天卓！
     * comment_rank : 5
     * comment_reply_count : 0
     * pick_time : 2016-12-13 14:21:58
     * comment_content_text : 很满意，菜都蛮好吃的，下次会再来的
     * comment_taste_rank : 4
     * comment_content_imgs : ["http://www.dianping.com/photos/657214191/member","http://www.dianping.com/photos/657214192/member","http://www.dianping.com/photos/657214194/member","http://www.dianping.com/photos/657214195/member"]
     * shop_url : http://www.dianping.com/shop/9640750/
     */

    private Id _id;
    private String comment_environment_rank;
    private String comment_author_link;
    private String comment_serve_rank;
    private String shop_name;
    private int comment_support_count;
    private String comment_time;
    private String comment_id;
    private String comment_author_name;
    private String comment_rank;
    private int comment_reply_count;
    private String pick_time;
    private String comment_content_text;
    private String comment_taste_rank;
    private String shop_url;
    //private List<String> comment_content_imgs;

    public Id get_id() {
        return _id;
    }

    public void set_id(Id _id) {
        this._id = _id;
    }

    public String getComment_environment_rank() {
        return comment_environment_rank;
    }

    public void setComment_environment_rank(String comment_environment_rank) {
        this.comment_environment_rank = comment_environment_rank;
    }

    public String getComment_author_link() {
        return comment_author_link;
    }

    public void setComment_author_link(String comment_author_link) {
        this.comment_author_link = comment_author_link;
    }

    public String getComment_serve_rank() {
        return comment_serve_rank;
    }

    public void setComment_serve_rank(String comment_serve_rank) {
        this.comment_serve_rank = comment_serve_rank;
    }

    public String getShop_name() {
        return shop_name;
    }

    public void setShop_name(String shop_name) {
        this.shop_name = shop_name;
    }

    public int getComment_support_count() {
        return comment_support_count;
    }

    public void setComment_support_count(int comment_support_count) {
        this.comment_support_count = comment_support_count;
    }

    public String getComment_time() {
        return comment_time;
    }

    public void setComment_time(String comment_time) {
        this.comment_time = comment_time;
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

    public String getComment_rank() {
        return comment_rank;
    }

    public void setComment_rank(String comment_rank) {
        this.comment_rank = comment_rank;
    }

    public int getComment_reply_count() {
        return comment_reply_count;
    }

    public void setComment_reply_count(int comment_reply_count) {
        this.comment_reply_count = comment_reply_count;
    }

    public String getPick_time() {
        return pick_time;
    }

    public void setPick_time(String pick_time) {
        this.pick_time = pick_time;
    }

    public String getComment_content_text() {
        return comment_content_text;
    }

    public void setComment_content_text(String comment_content_text) {
        this.comment_content_text = comment_content_text;
    }

    public String getComment_taste_rank() {
        return comment_taste_rank;
    }

    public void setComment_taste_rank(String comment_taste_rank) {
        this.comment_taste_rank = comment_taste_rank;
    }

    public String getShop_url() {
        return shop_url;
    }

    public void setShop_url(String shop_url) {
        this.shop_url = shop_url;
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
         * $oid : 584f9386581f523d67e3dcb4
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
