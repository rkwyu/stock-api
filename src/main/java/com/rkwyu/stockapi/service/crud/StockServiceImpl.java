package com.rkwyu.stockapi.service.crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rkwyu.stockapi.exception.ResourceNotFoundException;
import com.rkwyu.stockapi.model.Stock;
import com.rkwyu.stockapi.repository.StockRepo;

@Service
public class StockServiceImpl implements StockService {
    @Autowired
    StockRepo stockRepo;

    @Override
    public Stock createStock(Stock stock) {
        return stockRepo.save(stock);
    }

    @Override
    public List<Stock> getAllStocks() {
        return stockRepo.findAll();
    }

    @Override
    public Stock getStockById(Long id) {
        return stockRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Stock not found with id: " + id));
    }

    @Override
    public Stock getStockBySymbol(String symbol) {
        return stockRepo.findBySymbol(symbol)
                .orElseThrow(() -> new ResourceNotFoundException("Stock not found with symbol: " + symbol));
    }

    @Override
    public Stock getStockByName(String name) {
        return stockRepo.findByName(name)
                .orElseThrow(() -> new ResourceNotFoundException("Stock not found with name: " + name));
    }

    @Override
    public Stock updateStock(Stock stock) {
        if (!stockRepo.findById(stock.getId()).isPresent()) {
            throw new ResourceNotFoundException("Stock not found with id: " + stock.getId());
        }
        return stockRepo.save(stock);
    }

    @Override
    public void deleteStockById(Long id) {
        if (!stockRepo.findById(id).isPresent()) {
            throw new ResourceNotFoundException("Stock not found with id: " + id);
        }
        stockRepo.deleteById(id);
    }
    

}
