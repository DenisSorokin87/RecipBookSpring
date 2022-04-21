package com.denis.recipebook.beans;


import lombok.*;

import javax.persistence.*;


@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CookingProcess {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long processId;
    private int processNumber;
    private String description;



//    public CookingProcess(int processNumber, String description, Recipe recipe) {
//        this.processNumber = processNumber;
//        this.description = description;
//    }
}
