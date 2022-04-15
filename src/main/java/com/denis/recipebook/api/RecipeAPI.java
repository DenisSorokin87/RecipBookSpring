package com.denis.recipebook.api;


import com.denis.recipebook.Creator;
import com.denis.recipebook.beans.Recipe;
import com.denis.recipebook.logic.RecipeLogic;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recipe")
public class RecipeAPI {

    private RecipeLogic recipeLogic;
    @Autowired
    public RecipeAPI(RecipeLogic recipeLogic) {
        this.recipeLogic = recipeLogic;
    }


    @GetMapping("/getAll")
    public List<Recipe> getAllRecipes(){
        return Creator.recipesList;
    }

    @PostMapping("addNew")
    public Boolean addNewRecipe(@RequestBody Recipe recipe){
        return true;
    }


}
