package com.denis.recipebook.api;

import com.denis.recipebook.Creator;
import com.denis.recipebook.beans.Recipe;
import com.denis.recipebook.repositoresies.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/check")
public class Check {

    @Autowired
    private RecipeRepository recipeRepository;


    @GetMapping
    public Iterable<Recipe> makeLogin(){
        Creator.getInstance();
        recipeRepository.saveAll(Creator.recipesList);
        return recipeRepository.findAll();
    }


}
