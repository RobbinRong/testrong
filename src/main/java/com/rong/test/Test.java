package com.rong.test;

import com.google.gson.JsonObject;

/**
 * Created by rongjiabin on 2017/6/8.
 */
public class Test {
    public static void main(String[] args) {
        JsonObject jsonObject= new JsonObject();
        jsonObject.addProperty("key","value");
        jsonObject.addProperty("key2","value2");
        System.out.println(jsonObject.toString());
    }
}
