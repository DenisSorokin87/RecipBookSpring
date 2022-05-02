package com.denis.recipebook.beans;

import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@DynamicUpdate
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ingredientId;
    private String  ingredient;
    private int ingredientAmount;
    private String ingredientAmountUnit;


//    public Ingredient(String ingredient, int ingredientAmount, String ingredientAmountUnit, Recipe recipe) {
//        this.ingredient = ingredient;
//        this.ingredientAmount = ingredientAmount;
//        this.ingredientAmountUnit = ingredientAmountUnit;
//    }
}
