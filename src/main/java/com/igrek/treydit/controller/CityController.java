package com.igrek.treydit.controller;

import com.igrek.treydit.domain.City;
import com.igrek.treydit.service.CityService;
import com.igrek.treydit.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/city")
public class CityController {

    @Autowired
    private CityService cityService;
    @Autowired
    private CountryService countryService;

    //adds new City
    @PostMapping("/add")
    public String add(@RequestBody City city){
        cityService.saveCity(city);
        return "New City is added";
    }

    // adds new City to existing Country
    @PostMapping("/country/{country_id}")
    public String addNewCityToCountry(@RequestBody City city, @PathVariable Long country_id){
        city.setCountry(countryService.getCountryById(country_id));
        countryService.getCountryById(country_id).getCity().add(city);
        cityService.saveCity(city);
        return "New City is added to Country";
    }

    @GetMapping("/cities")
    public List<City> getCities(){
        return cityService.getCity();
    }
    @GetMapping("/{city_id}")
    public City getCityById(@PathVariable Long city_id){
       return cityService.getCityById(city_id);
    }
}
