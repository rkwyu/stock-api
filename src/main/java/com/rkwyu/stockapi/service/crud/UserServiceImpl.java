package com.rkwyu.stockapi.service.crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rkwyu.stockapi.exception.ResourceNotFoundException;
import com.rkwyu.stockapi.model.User;
import com.rkwyu.stockapi.repository.UserRepo;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepo userRepo;

    @Override
    public User createUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return userRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id: " + id));
    }

    @Override
    public User getUserByName(String name) {
        return userRepo.findByName(name)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with name: " + name));
    }

    @Override
    public User updateUser(User user) {
        if (!userRepo.findById(user.getId()).isPresent()) {
            throw new ResourceNotFoundException("Stock not found with id: " + user.getId());
        }
        return userRepo.save(user);
    }

    @Override
    public void deleteUserById(Long id) {
        if (!userRepo.findById(id).isPresent()) {
            throw new ResourceNotFoundException("Stock not found with id: " + id);
        }
        userRepo.deleteById(id);
    }

}
