package com.rkwyu.stockapi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rkwyu.stockapi.model.Currency;

@Repository
public interface CurrencyRepo extends JpaRepository<Currency, Long> {

    Optional<Currency> findByName(String name);

}
