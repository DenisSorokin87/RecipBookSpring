package com.denis.recipebook.logic;

import com.denis.recipebook.beans.Recipe;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface RecipeLogicInterface {

    ResponseEntity<List<Recipe>> getAllRecipes();

    ResponseEntity<HttpStatus> addAllRecipes(List<Recipe> recipeList);

}
