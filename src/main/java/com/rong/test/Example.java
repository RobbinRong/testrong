package com.rong.test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 荣佳斌 on 2017/4/21.
 */

@RestController
public class Example {
    protected static Logger logger= LoggerFactory.getLogger(Example.class);

    @RequestMapping("/")
    String home() {
        logger.debug("home");
        return "Hello World!";
    }
    @RequestMapping("/hello/{myname}")
    String hello(@PathVariable String myname) {
        logger.debug("访问hello");
        return "hello "+myname;
    }

}