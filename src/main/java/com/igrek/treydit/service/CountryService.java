package com.igrek.treydit.service;

import com.igrek.treydit.domain.Country;

import java.util.List;

public interface CountryService {

    public Country saveCountry(Country country);
    public List<Country> getCountry();
    public Country getCountryById(Long Id);
}
