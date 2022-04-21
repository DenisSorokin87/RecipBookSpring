package com.denis.recipebook;

import com.denis.recipebook.beans.Recipe;
import com.denis.recipebook.logic.RecipeLogic;
import com.denis.recipebook.logic.UserLogic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RecipeBookApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecipeBookApplication.class, args);
		
		Creator.getInstance();
		Creator.getRecipesList();
		for (Recipe recipe : Creator.recipesList) {
			System.out.println(recipe.toString());
		}


	}

}
