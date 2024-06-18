package com.rkwyu.stockapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rkwyu.stockapi.model.Analyst;
import com.rkwyu.stockapi.model.Stock;

@Repository
public interface AnalystRepo extends JpaRepository<Analyst, Long> {

    List<Analyst> findByStock(Stock stock);

}
