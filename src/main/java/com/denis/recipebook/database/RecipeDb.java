package com.denis.recipebook.database;

import com.denis.recipebook.Creator;
import com.denis.recipebook.beans.Recipe;
import com.denis.recipebook.repositoresies.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public record RecipeDb(RecipeRepository recipeRepository) {

    @Autowired
    public RecipeDb {
    }

    public List<Recipe> getAllRecipes() {
        List<Recipe> recipesList = new ArrayList<>();
        recipeRepository.findAll().forEach(recipesList::add);
        return Creator.recipesList;
    }


    public Recipe addNewRecipe(Recipe recipe) throws Exception {
        return recipeRepository.save(recipe);
    }


    public Iterable<Recipe> addAll(List<Recipe> recipeList) {
        return recipeRepository.saveAll(recipeList);

    }


}
