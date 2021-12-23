package com.igrek.treydit.controller;

import com.igrek.treydit.domain.City;
import com.igrek.treydit.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/city")
public class CityController {

    @Autowired
    private CityService cityService;

    @PostMapping("/add")
    public String add(@RequestBody City city){
        cityService.saveCity(city);
        return "New City is added";
    }
}
