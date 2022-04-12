package com.denis.recipebook.converters;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.ArrayList;
import java.util.List;

@Converter
public class RecipesIDsConverter implements AttributeConverter<List<Integer>, String> {
    @Override
    public String convertToDatabaseColumn(List<Integer> integers) {
        StringBuilder str = new StringBuilder();
        for(int i: integers){
            str.append(i).append(",");
        }
        return str.toString();
    }

    @Override
    public List<Integer> convertToEntityAttribute(String s) {
        List<Integer> integerList = new ArrayList<>();
       for(String el: s.split(",")){
           integerList.add(Integer.parseInt(el));
       }
       return integerList;
    }
}
