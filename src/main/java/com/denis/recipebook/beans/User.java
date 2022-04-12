package com.denis.recipebook.beans;

import com.denis.recipebook.converters.RecipesIDsConverter;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;


@Entity
@Getter
@Setter
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
    private String name;
    private String lastName;
    private String loginName;
    private String password;
    @Convert(converter = RecipesIDsConverter.class)
    private ArrayList<Integer> recipesIDs;

    public User(String name, String lastName, String loginName, String password) {
        this.name = name;
        this.lastName = lastName;
        this.loginName = loginName;
        this.password = password;
    }

    public User(int userId, String name, String lastName, String loginName, String password, ArrayList<Integer> recipeList) {
        this.userId = userId;
        this.name = name;
        this.lastName = lastName;
        this.loginName = loginName;
        this.password = password;
        this.recipesIDs = recipeList;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", loginName='" + loginName + '\'' +
                ", password='" + password + '\'' +
                ", recipesIDs=" + recipesIDs +
                '}';
    }
}
