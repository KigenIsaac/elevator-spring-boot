package com.elevator.system.service;

import com.elevator.system.domain.User;
import com.elevator.system.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public List<User> getAllUsers(){
        List<User> data = new ArrayList<>();
        userRepository.findAll().forEach(data :: add);
        return data;
    }
    public User getUser(String id){
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users.stream().filter(user -> user.getUserId().equals(id)).findFirst().get();
    }
    public User getUserByName(String name){
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users.stream().filter(user -> user.getUsername().equals(name)).findFirst().get();
    }
    public User registerNewUserAccount(String id, String name, String role, String password, String region){
        User user = new User(id,name, role, password, region);
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users.stream().filter(me -> me.getUsername().equals(name)).findFirst().get();
    }
}