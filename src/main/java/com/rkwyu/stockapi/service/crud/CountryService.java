package com.rkwyu.stockapi.service.crud;

import java.util.List;

import com.rkwyu.stockapi.model.Country;

public interface CountryService {

    public Country createCountry(Country country);

    public List<Country> getAllCountries();

    public Country getCountryById(Long id);

    public Country getCountryByName(String name);

    public Country updateCountry(Country country);

    public void deleteCountryById(Long id);
}
