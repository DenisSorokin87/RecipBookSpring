package com.denis.recipebook.database;

import com.denis.recipebook.beans.User;
import com.denis.recipebook.repositoresies.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Optional;

@Component
public record UserDB(UserRepository userRepository) {

    @Autowired
    public UserDB {
    }

    public Optional<User> getUser(long id) {
        return userRepository.findById((long) id);
    }


    public User saveUser(User user) throws Exception {
       return userRepository.save(user);

    }

    public User makeLogin(String loginName, String password) throws Exception {
        return userRepository.makeLogin(loginName, password);
    }

    public Boolean isUserExist(String loginName) {
        User user = userRepository.isUserExist(loginName);
        return user != null;
    }

    public void saveAll(ArrayList<User> usersList) {
        userRepository.saveAll(usersList);
    }
}
