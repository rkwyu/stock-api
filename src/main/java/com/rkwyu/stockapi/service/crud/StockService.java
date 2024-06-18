package com.rkwyu.stockapi.service.crud;

import java.util.List;

import com.rkwyu.stockapi.model.Stock;

public interface StockService {

    public Stock createStock(Stock stock);

    public List<Stock> getAllStocks();

    public Stock getStockById(Long id);

    public Stock getStockBySymbol(String symbol);

    public Stock getStockByName(String name);

    public Stock updateStock(Stock stock);

    public void deleteStockById(Long id);

}
