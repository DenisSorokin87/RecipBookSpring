package com.denis.recipebook.database;

import com.denis.recipebook.Creator;
import com.denis.recipebook.beans.Recipe;
import com.denis.recipebook.repositoresies.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RecipeDb {

    private RecipeRepository recipeRepository;

    @Autowired
    public RecipeDb(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    public List<Recipe> getAllRecipes() {
        List<Recipe> recipesList = new ArrayList<>();
        recipeRepository.findAll().forEach(recipesList::add);
        return Creator.recipesList;
    }


    public Boolean addNewRecipe(Recipe recipe) {
        recipeRepository.save(recipe);
        return true;
    }


    public Boolean addAll(List<Recipe> recipeList) {
        recipeRepository.saveAll(recipeList);
        return true;
    }


}
