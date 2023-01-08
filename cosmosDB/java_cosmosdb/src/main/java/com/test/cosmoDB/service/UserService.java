package com.test.cosmoDB.service;

import com.azure.cosmos.models.PartitionKey;
import com.test.cosmoDB.domain.User;
import com.test.cosmoDB.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User findUserById(String id) {
        var user = userRepository.findById(id, new PartitionKey(id));

        if(user.isPresent()){
            System.out.println(user.get());
            return user.get();
        }

        return null;
    }

    public List<User> getAllUsers() {
        var users = userRepository.findAll();
        var listOfUsers = new ArrayList<User>();
        users.forEach(listOfUsers::add);
        return listOfUsers;
    }

    public User findByName(String name) {
        var user = userRepository.findByName(name);

        if(user.isPresent()) {
            System.out.println(user);
            return user.get();
        }

        return null;
    }
}
