package com.denis.recipebook.logic;

import com.denis.recipebook.beans.LoggedInUser;
import com.denis.recipebook.beans.User;
import com.denis.recipebook.database.UserDB;
import com.denis.recipebook.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public record LoginLogic(UserDB userDB) {

    @Autowired
    public LoginLogic {
    }


    public Response<LoggedInUser> makeLogin(String loginName, String password) {

        try {
            User user = userDB.makeLogin(loginName, password);
            return new Response<>(new LoggedInUser((long) user.getUserId(), user.getName() + " " + user.getLastName()), "Login Successful");

        } catch (Exception e) {
            return new Response<>(e.getMessage());
        }

    }

    public Response<User> createUser(User user) throws Exception {

        if (userDB.isUserExist(user.getLoginName())) {
            return new Response<>("User With This Login IS already Exist");
        } else {
            return new Response<>(userDB.saveUser(user), "User Created");
        }
    }

    public Response<Boolean> isUserExist(String loginName) {
        if (userDB.isUserExist(loginName))
            return new Response<>(Boolean.TRUE, "User with This Login Name is Already Exist");
        else return new Response<>(false, "You can use this LogIn name");
    }
}
