package com.denis.recipebook.api;

import com.denis.recipebook.beans.CookingProcess;
import com.denis.recipebook.beans.Ingredient;
import com.denis.recipebook.beans.IngredientAmountUnit;
import com.denis.recipebook.beans.Recipe;
import com.denis.recipebook.repositoresies.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/check")
public class Check {

    @Autowired
    private RecipeRepository recipeRepository;


    @GetMapping
    @ResponseBody
    public ResponseEntity<List<Recipe>> makeLogin() {
//        Recipe recipe = new Recipe(0L, "Bakery", "Very tasty Meat Cake", "Meat Cake", new ArrayList<>(), new ArrayList<>(), "photo url");
//        Recipe recipe1 = new Recipe(0L, "Soup", "Chicken soup", "Chicken Soup", new ArrayList<Ingredient>(), new ArrayList<CookingProcess>(), "photo url");
//        CookingProcess cookingProcess = new CookingProcess(0L, 1, "Take meat and cut it ");
//        Ingredient ingredient = new Ingredient(0L, "wheat", 300, IngredientAmountUnit.GRAM.name());
//        recipe.getCookingProcessList().add(cookingProcess);
//        recipe.getProductsList().add(ingredient);
//        recipeRepository.save(recipe);

        return new ResponseEntity<>((List<Recipe>) recipeRepository.findAll(), HttpStatus.OK);

    }


}
