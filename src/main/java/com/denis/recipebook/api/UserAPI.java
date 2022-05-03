package com.denis.recipebook.api;

import com.denis.recipebook.beans.Recipe;
import com.denis.recipebook.beans.User;
import com.denis.recipebook.logic.UserLogic;
import com.denis.recipebook.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public record UserAPI(UserLogic userLogic) {

    @Autowired
    public UserAPI{
    }


    @GetMapping("/getUserRecipes")
    public Response<List<Recipe>> getUserRecipes(@RequestParam Long userId) {
        return null;
    }

    @PostMapping("/updateUser")
    public Response<User> updateUser(@RequestBody User user) {
        return userLogic.updateUser(user);
    }

    @PostMapping("/updateUserRecipes")
    public Response<User> updateUserRecipes(@RequestParam List<Integer> recipesIdList) {
        return null;
    }
}
