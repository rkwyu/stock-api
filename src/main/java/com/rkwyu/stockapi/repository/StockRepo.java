package com.rkwyu.stockapi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rkwyu.stockapi.model.Stock;

@Repository
public interface StockRepo extends JpaRepository<Stock, Long> {
    
    Optional<Stock> findBySymbol(String symbol);

    Optional<Stock> findByName(String name);

}
