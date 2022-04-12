package com.denis.recipebook.converters;


import com.denis.recipebook.beans.Ingredient;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

@Converter
public class IngredientConverter implements AttributeConverter<List<Ingredient>, String> {
    @Override
    public String convertToDatabaseColumn(List<Ingredient> ingredients) {
        return new Gson().toJson(ingredients);
    }

    @Override
    public List<Ingredient> convertToEntityAttribute(String s) {
        Type ingredientsType = new TypeToken<ArrayList<Ingredient>>() {
        }.getType();
        return new Gson().fromJson(s, ingredientsType);
    }
}
