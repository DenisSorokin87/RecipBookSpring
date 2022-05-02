package com.denis.recipebook.beans;

import com.denis.recipebook.converters.RecipesIDsConverter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.ArrayList;


@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Entity
@DynamicUpdate
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
