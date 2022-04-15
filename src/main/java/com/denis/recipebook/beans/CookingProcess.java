package com.denis.recipebook.beans;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class CookingProcess {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int processId;
    private int processNumber;
    private String description;
    @ManyToOne
    @JoinColumn(name = "recipe_recipe_id")
    private Recipe recipe;

    public CookingProcess(int processId, int processNumber, String description, Recipe recipe) {
        this.processId = processId;
        this.processNumber = processNumber;
        this.description = description;
        this.recipe = recipe;
    }

    //    public CookingProcess(int processId, int processNumber, String description) {
//        this.processId = processId;
//        this.processNumber = processNumber;
//        this.description = description;
//    }

}
