package com.rong.test;

import com.aliyun.openservices.oss.OSSClient;
import com.aliyun.openservices.oss.model.ObjectMetadata;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;

/**
 * Created by rongjiabin on 2017/5/8.
 */
public class TestOOS {
    private static final String accessKeyId = "xZr6cqrBC1zHdizb";
    private static final String accessKeySecret ="QoLgSyjrK1eV3faQ9Fpv6Ga0gv2smP";
    private static final String bucket = "operators-crawler-prod";
    private static final String url = "http://oss-cn-qingdao.aliyuncs.com";

    private static OSSClient client = new OSSClient(url, accessKeyId, accessKeySecret);

    public static void main(String[] args) {
            String content = "rongjiabin";
            byte[] data = content.getBytes(Charset.forName("utf-8"));
            ObjectMetadata meta = new ObjectMetadata();
            meta.setContentLength(data.length);
            InputStream in = new ByteArrayInputStream(data);
            client.putObject(bucket, "rjb_test", in, meta);
    }
}
