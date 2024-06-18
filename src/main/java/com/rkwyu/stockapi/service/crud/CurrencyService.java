package com.rkwyu.stockapi.service.crud;

import java.util.List;

import com.rkwyu.stockapi.model.Currency;

public interface CurrencyService {

    public Currency createCurrency(Currency currency);

    public List<Currency> getAllCurrencies();

    public Currency getCurrencyById(Long id);

    public Currency getCurrencyByName(String name);

    public Currency updateCurrency(Currency currency);

    public void deleteCurrencyById(Long id);

}
