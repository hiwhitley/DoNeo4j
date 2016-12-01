package com.hiwhitley.graph;

import com.hiwhitley.graph.bean.Comment;
import com.hiwhitley.graph.util.FileUtils;

import java.util.List;

/**
 * Created by hiwhitley on 16-12-1.
 */
public class HangZhouComment {
    public static void main(String[] args) {
        List<Comment> commentList = FileUtils.parseInputResource("/home/hiwhitley/桌面/hangBangCaiComment.json");
        System.out.println(commentList.size());
    }
}
