package com.denis.recipebook.database;

import com.denis.recipebook.beans.User;
import com.denis.recipebook.repositoresies.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class UserDB {

    @Autowired
    private UserRepository userRepository;

    public Optional<User> getUser(int id){
        return userRepository.findById(id);
    }

    public String updateUser(User user){
        return "Updated";
    }

    public String createUser(User user){
        userRepository.save(user);
        return "Saved";
    }

//    public User makeLogin(String loginName, String password){
//       return userRepository.makeLogin(loginName, password);
//    }
//
//    public Boolean isUserExist(String loginName){
//        return userRepository.isUserExist(loginName) != null;
//    }
}
