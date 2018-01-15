package com.sodbvi.springboot;

import com.sodbvi.springboot.common.ConfigBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableConfigurationProperties({ConfigBean.class})
@EnableScheduling
public class Springboot1Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Springboot1Application.class, args);
    }
}
