package com.rkwyu.stockapi.service.crud;

import java.util.List;

import com.rkwyu.stockapi.model.User;

public interface UserService {

    public User createUser(User user);

    public List<User> getAllUsers();

    public User getUserById(Long id);

    public User getUserByName(String name);

    public User updateUser(User user);

    public void deleteUserById(Long id);

}
