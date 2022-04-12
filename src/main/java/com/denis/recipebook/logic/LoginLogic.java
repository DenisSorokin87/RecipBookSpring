package com.denis.recipebook.logic;

import com.denis.recipebook.beans.LoggedInUser;
import com.denis.recipebook.beans.User;
import com.denis.recipebook.database.UserDB;
import org.springframework.beans.factory.annotation.Autowired;

public class LoginLogic {

    @Autowired
    private UserDB userDB;

    public LoggedInUser makeLogin(String loginName, String password){
        User user = userDB.makeLogin(loginName, password);
        LoggedInUser loggedInUser = new LoggedInUser((long) user.getUserId(), user.getName() + " " + user.getLastName());
        return loggedInUser;
    }
}
