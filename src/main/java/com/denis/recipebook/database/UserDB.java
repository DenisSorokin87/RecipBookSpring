package com.denis.recipebook.database;

import com.denis.recipebook.beans.User;
import com.denis.recipebook.repositoresies.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Optional;

public record UserDB(UserRepository userRepository) {

    @Autowired
    public UserDB {
    }

    public Optional<User> getUser(long id) {
        return userRepository.findById((long) id);
    }


    public Boolean saveUser(User user) {
        userRepository.save(user);
        return true;
    }

    public User makeLogin(String loginName, String password) {
        return userRepository.makeLogin(loginName, password);
    }

    public Boolean isUserExist(String loginName) {
        return userRepository.isUserExist(loginName) != null;
    }

    public void saveAll(ArrayList<User> usersList) {
        userRepository.saveAll(usersList);
    }
}
