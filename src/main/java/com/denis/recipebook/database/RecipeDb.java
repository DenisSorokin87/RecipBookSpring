package com.denis.recipebook.database;

import com.denis.recipebook.beans.Recipe;
import com.denis.recipebook.repositoresies.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public record RecipeDb(RecipeRepository recipeRepository) {

    @Autowired
    public RecipeDb {
    }

    public List<Recipe> getAllRecipes(){
        return (List<Recipe>) recipeRepository.findAll();
    }


    public Recipe addNewRecipe(Recipe recipe) throws Exception {
        return recipeRepository.save(recipe);
    }


    public Iterable<Recipe> addAll(List<Recipe> recipeList) {
        return recipeRepository.saveAll(recipeList);

    }


}
