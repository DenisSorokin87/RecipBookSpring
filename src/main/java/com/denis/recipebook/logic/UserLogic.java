package com.denis.recipebook.logic;


import com.denis.recipebook.beans.User;
import com.denis.recipebook.database.UserDB;
import com.denis.recipebook.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Optional;

@Component
public record UserLogic(UserDB userDB) {

    @Autowired
    public UserLogic {
    }

    public Response<User> getUser(long id) {
        Optional<User> user = userDB.getUser(id);
        if (user.isEmpty()) return new Response<>("User Not Found");
        else return new Response<>(user.get(), "User Found");
    }

    public Response<User> updateUser(User user) {
        try {

            return new Response<>(userDB.saveUser(user), "User Updated");
        } catch (Exception e) {
            return new Response<>(e.getMessage());
        }
    }

    public void addAll(ArrayList<User> usersList) {
        userDB.saveAll(usersList);
    }

}
