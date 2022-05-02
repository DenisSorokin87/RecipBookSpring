package com.denis.recipebook.api;

import com.denis.recipebook.beans.LoggedInUser;
import com.denis.recipebook.beans.User;
import com.denis.recipebook.logic.LoginLogic;
import com.denis.recipebook.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public record LoginAPI(LoginLogic loginLogic) {

    @Autowired
    public LoginAPI {
    }

    @GetMapping("/SignIn")
    public Response<LoggedInUser> makeLogin(@RequestParam String loginName, @RequestParam String password) {
        return loginLogic.makeLogin(loginName, password);
    }

    @PostMapping("/SignUp")
    public Response<User> registerUser(@RequestBody User user) throws Exception {
        return loginLogic.createUser(user);
    }

    @GetMapping("/isLoginExist")
    public Response<Boolean> isLoginExist(@RequestParam String loginName) {
        return loginLogic.isUserExist(loginName);
    }

}
