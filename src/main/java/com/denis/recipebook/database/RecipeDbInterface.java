package com.denis.recipebook.database;

import com.denis.recipebook.beans.Recipe;

import java.util.ArrayList;
import java.util.List;

public interface RecipeDbInterface {

    List<Recipe> getAllRecipes();


    Boolean addNewRecipe(Recipe recipe);


    Boolean addAll(List<Recipe> recipeList);

}
