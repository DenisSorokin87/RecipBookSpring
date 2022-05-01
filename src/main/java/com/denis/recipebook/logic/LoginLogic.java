package com.denis.recipebook.logic;

import com.denis.recipebook.beans.LoggedInUser;
import com.denis.recipebook.beans.User;
import com.denis.recipebook.database.UserDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public record LoginLogic(UserDB userDB) {

    @Autowired
    public LoginLogic {
    }


    public ResponseEntity<LoggedInUser> makeLogin(String loginName, String password) {

        try {
            User user = userDB.makeLogin(loginName, password);
            return new ResponseEntity<>(new LoggedInUser((long) user.getUserId(), user.getName() + " " + user.getLastName()), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

    }

    public ResponseEntity<User> createUser(User user) throws Exception {

//        try {
            if (userDB.isUserExist(user.getLoginName())) {
                return new ResponseEntity<>(HttpStatus.IM_USED);
            } else {
                return new ResponseEntity<>(userDB.saveUser(user), HttpStatus.OK);
            }
//        }
//        catch (Exception e) {
//            return new ResponseEntity<>( HttpStatus.METHOD_NOT_ALLOWED);
//        }
    }

    public Boolean isUserExist(String loginName) {
        return userDB.isUserExist(loginName);
    }
}
