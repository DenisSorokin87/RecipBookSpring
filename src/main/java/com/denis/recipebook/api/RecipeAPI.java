package com.denis.recipebook.api;


import com.denis.recipebook.beans.Recipe;
import com.denis.recipebook.logic.RecipeLogic;
import com.denis.recipebook.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recipe")
public record RecipeAPI(RecipeLogic recipeLogic) {

    @Autowired
    public RecipeAPI {
    }

    @GetMapping("/getAll")
    public Response<List<Recipe>> getAllRecipes() {
        return recipeLogic.getAllRecipes();
    }

    @PostMapping("/addNew")
    public Response<Recipe> addNewRecipe(@RequestBody Recipe recipe) {
        return recipeLogic.addRecipe(recipe);
    }

    @PostMapping("/addAll")
    public Response<List<Recipe>> addAllRecipes(@RequestBody List<Recipe> recipeList) {
        return recipeLogic.addAllRecipes(recipeList);
    }


}
