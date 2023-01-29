package com.openclassrooms.magicgithub.repository;

import com.openclassrooms.magicgithub.api.ApiService;
import com.openclassrooms.magicgithub.model.User;

import java.util.List;

public class UserRepository {

    private final ApiService apiService;

    public UserRepository(ApiService apiService) {//can accept any class that implements an ApiService
        this.apiService = apiService;
    }

    public List<User> getUsers() {
        return apiService.getUsers(); //Needed to call the function from an ApiService implemented class and return it
    }

    public void generateRandomUser() {
        apiService.generateRandomUser();
    }

    public void deleteUser(User user) {
        apiService.deleteUser(user);
    }
}
