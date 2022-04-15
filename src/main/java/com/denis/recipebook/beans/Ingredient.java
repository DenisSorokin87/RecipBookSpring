package com.denis.recipebook.beans;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ingredientId;
    private String  ingredient;
    private int ingredientAmount;
    private String ingredientAmountUnit;
    @ManyToOne
    @JoinColumn(name = "recipe_recipe_id")
    private Recipe recipe;

//    public Ingredient(int ingredientId, String ingredient, int ingredientAmount, String ingredientAmountUnit) {
//        this.ingredientId = ingredientId;
//        this.ingredient = ingredient;
//        this.ingredientAmount = ingredientAmount;
//        this.ingredientAmountUnit = ingredientAmountUnit;
//    }

    public Ingredient(int ingredientId, String ingredient, int ingredientAmount, String ingredientAmountUnit, Recipe recipe) {
        this.ingredientId = ingredientId;
        this.ingredient = ingredient;
        this.ingredientAmount = ingredientAmount;
        this.ingredientAmountUnit = ingredientAmountUnit;
        this.recipe = recipe;
    }
}
