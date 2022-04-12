package com.denis.recipebook.converters;


import com.denis.recipebook.beans.CookingProcess;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

@Converter
public class CookingProcessConverter implements AttributeConverter<List<CookingProcess>, String> {
    @Override
    public String convertToDatabaseColumn(List<CookingProcess> cookingProcesses) {
        return new Gson().toJson(cookingProcesses);
    }

    @Override
    public List<CookingProcess> convertToEntityAttribute(String s) {
        Type cookingProcessType = new TypeToken<ArrayList<CookingProcess>>() {
        }.getType();
        return new Gson().fromJson(s, cookingProcessType);
    }
}
