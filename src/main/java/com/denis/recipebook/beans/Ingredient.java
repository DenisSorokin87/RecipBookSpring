package com.denis.recipebook.beans;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Ingredient {

    private int ingredientId;
    private String  ingredient;
    private int ingredientAmount;
    private String ingredientAmountUnit;

    public Ingredient(int ingredientId, String ingredient, int ingredientAmount, String ingredientAmountUnit) {
        this.ingredientId = ingredientId;
        this.ingredient = ingredient;
        this.ingredientAmount = ingredientAmount;
        this.ingredientAmountUnit = ingredientAmountUnit;
    }

}
