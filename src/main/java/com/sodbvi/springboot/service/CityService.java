package com.sodbvi.springboot.service;

import com.sodbvi.springboot.domain.City;
import com.sodbvi.springboot.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: sodbvi
 * Date: 2018-08-01 -16:16
 */
@Service
public class CityService {

    @Autowired
    private CityMapper cityMapper;

    public List<City> findAllCity() {
        return cityMapper.findAllCity();
    }

    public City findCityById(Long id) {
        return cityMapper.findById(id);
    }

    public Long saveCity(City city) {
        return cityMapper.saveCity(city);
    }

    public Long updateCity(City city) {
        return cityMapper.updateCity(city);
    }

    public Long deleteCity(Long id) {
        return cityMapper.deleteCity(id);
    }
}
