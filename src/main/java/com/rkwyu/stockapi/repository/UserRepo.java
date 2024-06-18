package com.rkwyu.stockapi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rkwyu.stockapi.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    
    Optional<User> findByName(String name);

}
