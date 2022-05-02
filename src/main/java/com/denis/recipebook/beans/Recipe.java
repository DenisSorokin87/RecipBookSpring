package com.denis.recipebook.beans;

import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@DynamicUpdate
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

}
