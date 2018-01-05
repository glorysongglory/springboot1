package com.sodbvi.springboot.web;

import com.sodbvi.springboot.domain.UserDb;
import com.sodbvi.springboot.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by glory on 2017/5/26.
 */
@RestController
@RequestMapping(value = "/usersDb")
public class UsersDbController {

    @Resource
    private UserService userService;

    @RequestMapping(value = {"/list"}, method = RequestMethod.GET)
    public List<UserDb> getUserList() {
        List<UserDb> r = userService.list();
        return r;
    }


}
