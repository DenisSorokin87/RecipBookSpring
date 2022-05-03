package com.denis.recipebook.logic;

import com.denis.recipebook.beans.Recipe;
import com.denis.recipebook.database.RecipeDb;
import com.denis.recipebook.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public record RecipeLogic(RecipeDb recipeDb) implements RecipeLogicInterface {


    @Autowired
    public RecipeLogic {
    }

    @Override
    public Response<List<Recipe>> getAllRecipes() {
        try {
            return new Response<>(recipeDb.getAllRecipes(), "Request successful");
        } catch (Exception e) {
            return new Response<>(e.getMessage());
        }
    }

    @Override
    public Response<Recipe> addRecipe(Recipe recipe) {
        try {
            return new Response<>(recipeDb.addNewRecipe(recipe), "Recipes Added");
        } catch (Exception e) {
            return new Response<>(e.getMessage());
        }
    }

    @Override
    public Response<List<Recipe>> addAllRecipes(List<Recipe> recipeList) {
        try {
            return new Response<>((List<Recipe>) recipeDb.addAll(recipeList), "All Recipes Added to DB");
        } catch (Exception e) {
            return new Response<>(e.getMessage());
        }

    }

}
