package com.denis.recipebook.beans;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long recipeId;
    private String type;
    private String description;
    private String dishName;
    @OneToMany(targetEntity = Ingredient.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "ri_fk", referencedColumnName = "recipeId")
    @ToString.Exclude
    private List<Ingredient> productsList;
    @OneToMany(targetEntity = CookingProcess.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "rc_fk", referencedColumnName = "recipeId")
    @ToString.Exclude
    private List<CookingProcess> cookingProcessList;
    private String dishPhotoUrl;

//    public Recipe(String type, String description, String dishName, List<Ingredient> productsList, List<CookingProcess> cookingProcessList, String dishPhotoUrl) {
//        this.type = type;
//        this.description = description;
//        this.dishName = dishName;
//        this.productsList = productsList;
//        this.cookingProcessList = cookingProcessList;
//        this.dishPhotoUrl = dishPhotoUrl;
//    }
}
