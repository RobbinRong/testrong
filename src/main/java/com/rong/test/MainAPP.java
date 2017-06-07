package com.rong.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by 荣佳斌 on 2017/4/21.
 */
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.rong.test"})
public class MainAPP {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(MainAPP.class, args);
    }
}
