package com.denis.recipebook.api;

import com.denis.recipebook.beans.Recipe;
import com.denis.recipebook.beans.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserAPI {

    @GetMapping("/getUserRecipes")
    public ResponseEntity<List<Recipe>> getUserRecipes(@RequestParam Long userId) {
        return null;
    }

    @PostMapping("/updateUser")
    public Boolean updateUser(@RequestBody User user) {
        return false;
    }
}
