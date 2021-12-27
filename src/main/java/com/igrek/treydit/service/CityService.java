package com.igrek.treydit.service;

import com.igrek.treydit.domain.City;

import java.util.List;

public interface CityService {

    public City saveCity(City city);
    public List<City> getCity();
    public City getCityById(Long id);
}
