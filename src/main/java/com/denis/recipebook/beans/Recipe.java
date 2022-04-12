package com.denis.recipebook.beans;

import com.denis.recipebook.converters.CookingProcessConverter;
import com.denis.recipebook.converters.IngredientConverter;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int recipeId;
    private String type;
    private String description;
    private String dishName;
    @Convert(converter = IngredientConverter.class)
    private List<Ingredient> productsList;
    @Convert(converter = CookingProcessConverter.class)
    private List<CookingProcess> cookingProcessList;
    private String dishPhotoUrl;

    public Recipe(int recipeId, String type, String description, String dishName, List<Ingredient> productsList, List<CookingProcess> cookingProcessList, String dishPhotoUrl) {
        this.recipeId = recipeId;
        this.type = type;
        this.description = description;
        this.dishName = dishName;
        this.productsList = productsList;
        this.cookingProcessList = cookingProcessList;
        this.dishPhotoUrl = dishPhotoUrl;
    }

    public int getRecipeId() {
        return recipeId;
    }

}
