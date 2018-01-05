package com.sodbvi.springboot.web;

import com.sodbvi.springboot.common.CsConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test003")
public class Test003PropertiesController {

    @Autowired
    private CsConfigBean csConfigBean;

    @RequestMapping(value = {"/index"}, method = RequestMethod.GET)
    public String index() {
        return csConfigBean.getName() + "---" + csConfigBean.getMsg();
    }

}
