package com.xqk.learn.mall.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 熊乾坤
 * @date 2020-04-27
 */
@SpringBootApplication(scanBasePackages = {"com.xqk.learn.mall"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
