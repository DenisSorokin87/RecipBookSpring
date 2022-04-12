package com.denis.recipebook.repositoresies;

import com.denis.recipebook.beans.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Integer> {
}
