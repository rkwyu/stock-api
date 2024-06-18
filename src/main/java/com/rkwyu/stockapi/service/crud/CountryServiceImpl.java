package com.rkwyu.stockapi.service.crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rkwyu.stockapi.exception.ResourceNotFoundException;
import com.rkwyu.stockapi.model.Country;
import com.rkwyu.stockapi.repository.CountryRepo;

@Service
public class CountryServiceImpl implements CountryService {
    @Autowired
    CountryRepo countryRepo;

    @Override
    public Country createCountry(Country country) {
        return countryRepo.save(country);
    }

    @Override
    public List<Country> getAllCountries() {
        return countryRepo.findAll();
    }

    @Override
    public Country getCountryById(Long id) {
        return countryRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Country not found with id: " + id));
    }

    @Override
    public Country getCountryByName(String name) {
        return countryRepo.findByName(name)
                .orElseThrow(() -> new ResourceNotFoundException("Country not found with name: " + name));
    }

    @Override
    public Country updateCountry(Country country) {
        if (!countryRepo.findById(country.getId()).isPresent()) {
            throw new ResourceNotFoundException("Country not found with id: " + country.getId());
        }
        return countryRepo.save(country);
    }

    @Override
    public void deleteCountryById(Long id) {
        if (!countryRepo.findById(id).isPresent()) {
            throw new ResourceNotFoundException("Country not found with id: " + id);
        }
        countryRepo.deleteById(id);
    }

}
