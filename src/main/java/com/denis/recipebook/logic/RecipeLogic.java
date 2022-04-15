package com.denis.recipebook.logic;

import com.denis.recipebook.beans.Recipe;
import com.denis.recipebook.database.RecipeDb;
import com.denis.recipebook.database.RecipeDbInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Collections;
import java.util.List;

public class RecipeLogic implements RecipeLogicInterface {

//    @Autowired
    private RecipeDb recipeDb = new RecipeDb();

    @Override
    public ResponseEntity<List<Recipe>> getAllRecipes() {
        List<Recipe> recipeList = recipeDb.getAllRecipes();
        if (recipeList.isEmpty()) return new ResponseEntity(recipeList, HttpStatus.OK);
        else return new ResponseEntity<>(Collections.emptyList(), HttpStatus.NOT_FOUND);
    }

    @Override
    public ResponseEntity<HttpStatus> addAllRecipes(List<Recipe> recipeList) {
        if (recipeDb.addAll(recipeList)) return new ResponseEntity<>(HttpStatus.OK);
        else return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
