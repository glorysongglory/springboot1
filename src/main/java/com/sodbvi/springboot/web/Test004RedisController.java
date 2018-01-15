package com.sodbvi.springboot.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test004")
public class Test004RedisController {

    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping(value = {"/set"}, method = RequestMethod.GET)
    public String set(@Param("value") String value) {
        redisTemplate.opsForValue().set("sodbvi", value);
        return "success";
    }

    @RequestMapping(value = {"/get"}, method = RequestMethod.GET)
    public String get() {
        return redisTemplate.opsForValue().get("sodbvi").toString();
    }
}
