package com.denis.recipebook.logic;

import com.denis.recipebook.beans.LoggedInUser;
import com.denis.recipebook.beans.User;
import com.denis.recipebook.database.UserDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class LoginLogic {

    @Autowired
    private UserDB userDB;

    public ResponseEntity<LoggedInUser> makeLogin(String loginName, String password) {
        User user = userDB.makeLogin(loginName, password);
        return new ResponseEntity<>(new LoggedInUser((long) user.getUserId(), user.getName() + " " + user.getLastName()), HttpStatus.OK);
    }

    public ResponseEntity<Boolean> createUser(User user) {
        if (userDB.isUserExist(user.getLoginName())) return new ResponseEntity<>(true, HttpStatus.NOT_FOUND);
        else {
            userDB.saveUser(user);
            return new ResponseEntity<>(false, HttpStatus.OK);
        }
    }

    public Boolean isUserExist(String loginName){
        return userDB.isUserExist(loginName);
    }
}
