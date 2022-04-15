package com.denis.recipebook.logic;


import com.denis.recipebook.beans.User;
import com.denis.recipebook.database.UserDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.Optional;

public class UserLogic {

    @Autowired
    private UserDB userDB;

    public ResponseEntity<User> getUser(long id){
        Optional<User> user = userDB.getUser(id);
        return user.map(value -> new ResponseEntity<>(value, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    public ResponseEntity<HttpStatus> updateUser(User user){
        if(userDB.saveUser(user)) return new ResponseEntity<>(HttpStatus.OK);
        else return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    public void addAll(ArrayList<User> usersList) {
        userDB.saveAll(usersList);
    }
}
