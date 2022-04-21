package com.denis.recipebook.logic;

import com.denis.recipebook.beans.Recipe;
import com.denis.recipebook.database.RecipeDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public record RecipeLogic(RecipeDb recipeDb) implements RecipeLogicInterface {


    @Autowired
    public RecipeLogic {
    }

    @Override
    public ResponseEntity<List<Recipe>> getAllRecipes() {
        try {
            return new ResponseEntity<>(recipeDb.getAllRecipes(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public ResponseEntity<Recipe> addRecipe(Recipe recipe) {
        try {
            return new ResponseEntity<>(recipeDb.addNewRecipe(recipe), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public ResponseEntity<List<Recipe>> addAllRecipes(List<Recipe> recipeList) {
        try{
            return new ResponseEntity<>((List<Recipe>) recipeDb.addAll(recipeList), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

}
