package com.denis.recipebook;

import com.denis.recipebook.beans.*;

import java.util.ArrayList;

public class Creator {
    private static Creator creator = null;
    public static ArrayList<User> usersList = new ArrayList<>();
    public static ArrayList<Recipe> recipesList = new ArrayList<>();


    public static Creator getInstance() {
        if (creator == null) {

            return creator = new Creator();

        }

        return creator;
    }

    private Creator() {
        //Creating Users
        usersList.add(new User(0, "Denis", "Sorokin", "DeniSorokin", "12345", new ArrayList<Integer>()));
        usersList.add(new User(usersList.size(), "Yulia", "Sorokin", "YuliaSorokin", "54321", new ArrayList<Integer>()));
        //Creating Users

        //Creating Recipes
        recipesList.add(new Recipe(0, "Bakery", "Very tasty Meat Cake", "Meat Cake", new ArrayList<Ingredient>(), new ArrayList<CookingProcess>(), "photo url"));
        recipesList.add(new Recipe(recipesList.size(), "Soup", "Chicken soup", "Chicken Soup", new ArrayList<Ingredient>(), new ArrayList<CookingProcess>(), "photo url"));
        recipesList.add(new Recipe(recipesList.size(), "Fast",
                "Cheese and Ham Toast", "SuperFastAndTastyToast", new ArrayList<Ingredient>(), new ArrayList<CookingProcess>(), "photo url"));
        recipesList.add(new Recipe(recipesList.size(), "Soup", "Шашлык по моему",
                "Шашлык", new ArrayList<Ingredient>(), new ArrayList<CookingProcess>(), "photo url"));
        //Creating Recipes

        //Creating Cooking Processes List
        recipesList.get(0).getCookingProcessList().add(new CookingProcess(0, 1, "Take meat and cut it "));
        recipesList.get(0).getCookingProcessList().add(new CookingProcess(recipesList.get(0).getCookingProcessList().size(), 2, "Mix wheat with water, salt and pepper"));
        recipesList.get(0).getCookingProcessList().add(new CookingProcess(recipesList.get(0).getCookingProcessList().size(), 3, "Put the meat in to the dough, and bake it for 1 hour"));

        recipesList.get(1).getCookingProcessList().add(new CookingProcess(0, 1, "Cut the chicken for some pieces, and put in to a full water pot"));
        recipesList.get(1).getCookingProcessList().add(new CookingProcess(recipesList.get(1).getCookingProcessList().size(), 2, "cut a carrot, onion and a potatos, and add it to the chicken"));
        recipesList.get(1).getCookingProcessList().add(new CookingProcess(recipesList.get(1).getCookingProcessList().size(), 3, "cook it for one hour, ad some salt and pepper"));

        recipesList.get(2).getCookingProcessList().add(new CookingProcess(0, 1, "Take two piece of brad"));
        recipesList.get(2).getCookingProcessList().add(new CookingProcess(recipesList.get(1).getCookingProcessList().size(), 2, "Put on the bread ches and ham, add dome souse"));
        recipesList.get(2).getCookingProcessList().add(new CookingProcess(recipesList.get(1).getCookingProcessList().size(), 3, "Put in into the toast, and wait for 5 minutes"));

        recipesList.get(3).getCookingProcessList().add(new CookingProcess(0, 1, "Cut the meat to  a medium pieces, cut the onion to a s trips, add it to each other with salt and pepper, and leave it for one night at the fridge"));
        recipesList.get(3).getCookingProcessList().add(new CookingProcess(recipesList.get(1).getCookingProcessList().size(), 2, "Put the meat ot the shampur"));
        recipesList.get(3).getCookingProcessList().add(new CookingProcess(recipesList.get(1).getCookingProcessList().size(), 3, "Grill it for a 15 minutes. Enjoy"));
        //Creating Cooking Processes List


        //Creating Products Lists for recipes and adding them to the Recipes
        recipesList.get(0).getProductsList().add(new Ingredient(0, "wheat", 300, IngredientAmountUnit.GRAM.name()));
        recipesList.get(0).getProductsList().add(new Ingredient(recipesList.get(0).getProductsList().size(), "meat", 500, IngredientAmountUnit.GRAM.name()));
        recipesList.get(0).getProductsList().add(new Ingredient(recipesList.get(0).getProductsList().size(), "water", 100, IngredientAmountUnit.MILLILITER.name()));

        recipesList.get(1).getProductsList().add(new Ingredient(0, "Chicken", 1, IngredientAmountUnit.KG.name()));
        recipesList.get(1).getProductsList().add(new Ingredient(recipesList.get(1).getProductsList().size(), "Onion", 100, IngredientAmountUnit.GRAM.name()));
        recipesList.get(1).getProductsList().add(new Ingredient(recipesList.get(1).getProductsList().size(), "Carrot", 100, IngredientAmountUnit.GRAM.name()));
        recipesList.get(1).getProductsList().add(new Ingredient(recipesList.get(1).getProductsList().size(), "Carrot", 100, IngredientAmountUnit.GRAM.name()));

        recipesList.get(2).getProductsList().add(new Ingredient(0, "Bread", 2, IngredientAmountUnit.PIECE.name()));
        recipesList.get(2).getProductsList().add(new Ingredient(recipesList.get(2).getProductsList().size(), "Cheese", 2, IngredientAmountUnit.PIECE.name()));
        recipesList.get(2).getProductsList().add(new Ingredient(recipesList.get(2).getProductsList().size(), "Ham", 1, IngredientAmountUnit.PIECE.name()));

        recipesList.get(3).getProductsList().add(new Ingredient(0, "Meat", 1, IngredientAmountUnit.KG.name()));
        recipesList.get(3).getProductsList().add(new Ingredient(recipesList.get(3).getProductsList().size(), "Onion", 500, IngredientAmountUnit.GRAM.name()));
        recipesList.get(3).getProductsList().add(new Ingredient(recipesList.get(3).getProductsList().size(), "Soy Souse", 10, IngredientAmountUnit.MILLILITER.name()));
        recipesList.get(3).getProductsList().add(new Ingredient(recipesList.get(3).getProductsList().size(), "Chili souse", 10, IngredientAmountUnit.MILLILITER.name()));
        //Creating Products Lists for recipes and adding them to the Recipes

        //Adding the created recipes id's to the users
        usersList.get(0).getRecipesIDs().add(recipesList.get(0).getRecipeId());
        usersList.get(0).getRecipesIDs().add(recipesList.get(1).getRecipeId());
        usersList.get(1).getRecipesIDs().add(recipesList.get(2).getRecipeId());
        usersList.get(1).getRecipesIDs().add(recipesList.get(3).getRecipeId());
        //Adding the created recipes id's to the users

    }
//
//    public GenericResponse<User> getUsersList() {
//        return new GenericResponse<User>(Status.SUCCESS.name(), "user list", usersList);
//    }

    public void setUsersList(ArrayList<User> usersList) {
        Creator.usersList = usersList;
    }

    public static ArrayList<Recipe> getRecipesList() {
        return recipesList;
    }

    public static void setRecipesList(ArrayList<Recipe> recipesList) {
        Creator.recipesList = recipesList;
    }
}
