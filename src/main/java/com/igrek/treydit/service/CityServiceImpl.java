package com.igrek.treydit.service;

import com.igrek.treydit.domain.City;
import com.igrek.treydit.persistence.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService{

    @Autowired
    private CityRepository cityRepository;

    @Override
    public City saveCity(City city) {
        return cityRepository.save(city);
    }

    @Override
    public List<City> getCity() {
        return cityRepository.findAll();
    }
    @Override
    public City getCityById(Long id) {
        return cityRepository.findCityById(id);
    }
}
