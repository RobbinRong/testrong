package com.rong.test.pressure;

import com.google.gson.JsonObject;

import java.io.IOException;

/**
 * Created by rongjiabin on 2017/6/8.
 */
public class Test {
    public static void main(String[] args) {
        JsonObject jsonObject=new JsonObject();
        jsonObject.addProperty("serviceType","xuexinwang");
        jsonObject.addProperty("customerId","29da763dda1e40615715ad06a8f974f0");
        try {
            String s = HttpUtil.doPost("datacenter", "selectCustomerAuthorizationRelationBySC", jsonObject.toString());
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
