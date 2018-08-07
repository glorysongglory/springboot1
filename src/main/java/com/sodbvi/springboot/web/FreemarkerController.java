package com.sodbvi.springboot.web;

import com.sodbvi.springboot.service.CityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * User: sodbvi
 * Date: 2018-08-01 -14:26
 */
@Controller
public class FreemarkerController {

    @Resource
    private CityService cityService;

    @RequestMapping(value = "/api/freemarker/city/{id}", method = RequestMethod.GET)
    public String findOneCity(@PathVariable("id") Long id, Model model) {
        model.addAttribute("city", cityService.findCityById(id));
        return "city";
    }

    @RequestMapping(value = "/api/freemarker/city", method = RequestMethod.GET)
    public String findAllCity(Model model) {
        model.addAttribute("cityList", cityService.findAllCity());
        return "cityList";
    }


}
