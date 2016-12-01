package com.hiwhitley.graph.util;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.hiwhitley.graph.bean.Shop;

import java.io.*;
import java.util.List;

/**
 * Created by hiwhitley on 16-11-25.
 */
public class FileUtils {

    public static String parseJsonStrFromFile(String fileName) {
        String encoding = "UTF-8";
        File file = new File(fileName);
        Long fileLength = file.length();
        byte[] fileContent = new byte[fileLength.intValue()];
        try {
            FileInputStream in = new FileInputStream(file);
            in.read(fileContent);
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            return new String(fileContent, encoding);
        } catch (UnsupportedEncodingException e) {
            System.err.println("The OS does not support " + encoding);
            e.printStackTrace();
            return null;
        }

    }



    public static <T> List<T> parseInputResource(String filePath) {
        String input = parseJsonStrFromFile(filePath);
        Gson gson = new Gson();
        List<T> list = gson.fromJson(input, new TypeToken<List<T>>() {
        }.getType());
        return list;
    }


}
