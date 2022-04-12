package com.denis.recipebook.database;

import com.denis.recipebook.beans.User;
import com.denis.recipebook.repositoresies.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class UserDB {

    @Autowired
    private UserRepository userRepository;

    public String addAllRecipes(List<User> userList) {

        userRepository.saveAll(userList);
        return "Saved";
    }

    public List<User> getAllRecipes() {

        Iterable<User> iterable = userRepository.findAll();
        ArrayList<User> userList = new ArrayList<>();
        iterable.forEach(userList::add);
        return userList;

    }
}
