package com.igrek.treydit.controller;

import com.igrek.treydit.domain.City;
import com.igrek.treydit.domain.Country;
import com.igrek.treydit.service.CityService;
import com.igrek.treydit.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/country")
public class CountryController {
    @Autowired
    private CountryService countryService;
    @Autowired
    private CityService cityService;

    //adds new Country
    @PostMapping("/add")
    public String add(@RequestBody Country country){
        countryService.saveCountry(country);
        return "New Country is added";
    }

    // lists every existing Country
    @GetMapping("/countries")
    public List<Country> getCountry(){
        return countryService.getCountry();
    }

    // existing City will be added to new Country
    @PostMapping("/city/{city_id}")
    public String addCountryWithCity(@RequestBody Country country, @PathVariable Long city_id){
        country.getCity().add(cityService.getCityById(city_id));
        cityService.getCityById(city_id).setCountry(country);
        countryService.saveCountry(country);
        return "New City is added to Country";
            }

}
