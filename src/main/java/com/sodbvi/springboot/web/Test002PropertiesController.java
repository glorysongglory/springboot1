package com.sodbvi.springboot.web;

import com.sodbvi.springboot.common.ConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test002")
public class Test002PropertiesController {

    @Autowired
    private ConfigBean configBean;

    @RequestMapping(value = {"/index"}, method = RequestMethod.GET)
    public String index() {
        return configBean.getName() + "---" + configBean.getMsg();
    }

}
