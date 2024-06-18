package com.rkwyu.stockapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rkwyu.stockapi.model.Earning;
import com.rkwyu.stockapi.model.Stock;

@Repository
public interface EarningRepo extends JpaRepository<Earning, Long> {

    List<Earning> findByStock(Stock stock);
    
}
