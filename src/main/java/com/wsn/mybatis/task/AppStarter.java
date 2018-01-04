package com.wsn.mybatis.task;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author sharing
 * @version 1.0.0
 **/
@SpringBootApplication(scanBasePackages = "com.wsn.mybatis.task")
@MapperScan("com.wsn.mybatis.task.mapper")
public class AppStarter {
    public static void main(String[] args) {
        new SpringApplication(AppStarter.class).run(args);
    }
}
