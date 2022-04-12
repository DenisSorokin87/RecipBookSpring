package com.denis.recipebook.api;


import com.denis.recipebook.api.response.Response;
import com.denis.recipebook.beans.Recipe;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/recipe")
public class RecipeAPI {

    @GetMapping("/getAll")
    public Response getAllRecipes(){
        return new Response();
    }

    @PostMapping("addNew")
    public Boolean addNewRecipe(@RequestBody Recipe recipe){
        return true;
    }


}
