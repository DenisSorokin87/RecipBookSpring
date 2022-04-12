package com.denis.recipebook.database;

import com.denis.recipebook.beans.Recipe;
import com.denis.recipebook.repositoresies.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class RecipeDb {

    @Autowired
    private RecipeRepository recipeRepository;

    public List<Recipe> getAllRecipes(){
        List<Recipe> recipesList = new ArrayList<>();
        recipeRepository.findAll().forEach(recipesList::add);
        return recipesList;
    }

    public Boolean addNewRecipe(Recipe recipe){
        recipeRepository.save(recipe);
        return true;
    }

    public String addAll(List<Recipe>  recipeList){
        recipeRepository.saveAll(recipeList);
        return "Saved";
    }
}
