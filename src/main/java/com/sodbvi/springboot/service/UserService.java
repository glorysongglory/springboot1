package com.sodbvi.springboot.service;

import com.sodbvi.springboot.domain.UserDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by glory on 2017/5/26.
 */
@Service
public class UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void create(String name, Integer age) {
        jdbcTemplate.update("insert into TMP_USER(NAME, AGE) values(?, ?)", name, age);
    }

    public void deleteByName(String name) {
        jdbcTemplate.update("delete from TMP_USER where NAME = ?", name);
    }

    public Integer getAllUsers() {
        return jdbcTemplate.queryForObject("select count(1) from TMP_USER", Integer.class);
    }

    public void deleteAllUsers() {
        jdbcTemplate.update("delete from TMP_USER");
    }

    public List<UserDb> list() {
        return jdbcTemplate.query("select name,age from tmp_user",new BeanPropertyRowMapper(UserDb .class));
    }
}
