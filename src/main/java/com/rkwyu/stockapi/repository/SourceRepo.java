package com.rkwyu.stockapi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rkwyu.stockapi.model.Source;

@Repository
public interface SourceRepo extends JpaRepository<Source, Long> {

    Optional<Source> findByName(String name);
    
}
