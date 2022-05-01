package com.denis.recipebook.api;

import com.denis.recipebook.beans.LoggedInUser;
import com.denis.recipebook.beans.User;
import com.denis.recipebook.logic.LoginLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;

@RestController
@RequestMapping("/login")
public record LoginAPI(LoginLogic loginLogic) {

    @Autowired
    public LoginAPI {
    }

    @GetMapping("/SignIn")
    public ResponseEntity<LoggedInUser> makeLogin(@RequestParam String loginName, @RequestParam String password) {
        return loginLogic.makeLogin(loginName, password);
    }

    @PostMapping("/SignUp")
    public ResponseEntity<User> registerUser(@RequestBody User user) throws Exception {
        return loginLogic.createUser(user);
    }

    @GetMapping("/isLoginExist")
    public Boolean isLoginExist(@RequestParam String loginName) {
        return false;
    }

}
