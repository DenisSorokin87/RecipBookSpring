package com.denis.recipebook.api;

import com.denis.recipebook.api.response.Response;
import com.denis.recipebook.beans.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserAPI {

    @GetMapping("/getUserRecipes")
    public Response getUserRecipes(@RequestParam Long userId){
        return null;
    }

    @PostMapping("/updateUser")
    public Boolean updateUser(@RequestBody User user){
        return false;
    }
}
