package com.rkwyu.stockapi.service.crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rkwyu.stockapi.exception.ResourceNotFoundException;
import com.rkwyu.stockapi.model.Currency;
import com.rkwyu.stockapi.repository.CurrencyRepo;

@Service
public class CurrencyServiceImpl implements CurrencyService {
    @Autowired
    CurrencyRepo currencyRepo;

    @Override
    public Currency createCurrency(Currency currency) {
        return currencyRepo.save(currency);
    }

    @Override
    public List<Currency> getAllCurrencies() {
        return currencyRepo.findAll();
    }

    @Override
    public Currency getCurrencyById(Long id) {
        return currencyRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Currency not found with id: " + id));
    }

    @Override
    public Currency getCurrencyByName(String name) {
        return currencyRepo.findByName(name)
                .orElseThrow(() -> new ResourceNotFoundException("Currency not found with name: " + name));
    }

    @Override
    public Currency updateCurrency(Currency currency) {
        if (!currencyRepo.findById(currency.getId()).isPresent()) {
            throw new ResourceNotFoundException("Stock not found with id: " + currency.getId());
        }
        return currencyRepo.save(currency);
    }

    @Override
    public void deleteCurrencyById(Long id) {
        if (!currencyRepo.findById(id).isPresent()) {
            throw new ResourceNotFoundException("Stock not found with id: " + id);
        }
        currencyRepo.deleteById(id);
    }

}
