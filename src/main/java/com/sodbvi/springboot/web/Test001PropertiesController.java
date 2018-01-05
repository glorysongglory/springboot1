package com.sodbvi.springboot.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test001")
public class Test001PropertiesController {

    @Value("${com.sodbvi.name}")
    private String name;

    @Value("${com.sodbvi.msg}")
    private String msg;

    @Value("${com.sodbvi.message}")
    private String message;

    @Value("${sodbvi.secret}")
    private String secret;

    @Value("${sodbvi.bignumber}")
    private long bignumber;

    @Value("${sodbvi.uuid}")
    private String uuid;

    @Value("${sodbvi.number.less.than.ten}")
    private int lt;

    @Value("${sodbvi.number.in.range}")
    private int rg;


    @RequestMapping(value = {"/index"}, method = RequestMethod.GET)
    public String index() {
        return name + "---" + msg + "---" + message;
    }

    @RequestMapping(value = {"/index1"}, method = RequestMethod.GET)
    public String index1() {
        return message;
    }

    @RequestMapping(value = {"/index2"}, method = RequestMethod.GET)
    public String index2() {
        return secret + "---" +
                bignumber + "---" +
                uuid + "---" +
                lt + "---" +
                rg
                ;
    }


}
