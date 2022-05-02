package com.denis.recipebook.logic;

import com.denis.recipebook.beans.Recipe;
import com.denis.recipebook.response.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface RecipeLogicInterface {

    Response<List<Recipe>> getAllRecipes();

    Response<Recipe> addRecipe(Recipe recipe);

    Response<List<Recipe>> addAllRecipes(List<Recipe> recipeList);



}
