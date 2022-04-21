package com.denis.recipebook.api;

import com.denis.recipebook.beans.LoggedInUser;
import com.denis.recipebook.beans.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginAPI {



    @GetMapping("/SignIn")
    public LoggedInUser makeLogin(@RequestParam String loginName, @RequestParam String password){
        return new LoggedInUser();
    }

    @PostMapping("/SignUp")
    public LoggedInUser registerUser(@RequestBody User user){
        return new LoggedInUser();
    }

    @GetMapping("/isLoginExist")
    public Boolean isLoginExist(@RequestParam String loginName){
        return false;
    }

}
