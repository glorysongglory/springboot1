package com.sodbvi.springboot;

import com.sodbvi.springboot.common.ConfigBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.session.data.redis.RedisFlushMode;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@SpringBootApplication
@EnableConfigurationProperties({ConfigBean.class})
@EnableScheduling
// mapper 接口类扫描包配置
@MapperScan("com.sodbvi.springboot.mapper")
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 1800,redisNamespace = "fuck",redisFlushMode = RedisFlushMode.ON_SAVE)
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
