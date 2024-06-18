package com.rkwyu.stockapi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rkwyu.stockapi.model.Country;

@Repository
public interface CountryRepo extends JpaRepository<Country, Long> {

    Optional<Country> findByName(String name);

}
