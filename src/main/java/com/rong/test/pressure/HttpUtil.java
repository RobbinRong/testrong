package com.rong.test.pressure;

import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

import java.io.IOException;

/**
 * Created by rongjiabin on 2017/6/2.
 */
public class HttpUtil {
    public static final String REQUEST_TIME_OUT="request_time_out";
    private static  final OkHttpClient client = new OkHttpClient();
    public static String doPost(String service,String method,String param) throws IOException {
        MediaType MEDIA_TYPE_TEXT = MediaType.parse("text/plain");
        com.squareup.okhttp.Request request = new com.squareup.okhttp.Request.Builder()
                .url("http://10.20.50.179:8580/titan/service/"+service+"/"+method)
                .post(RequestBody.create(MEDIA_TYPE_TEXT, param))
                .build();
        Response response = client.newCall(request).execute();
        if (!response.isSuccessful()) {
            System.out.println("fail");
        }
        return response.body().string();
    }


}
