package com.denis.recipebook.beans;


import lombok.*;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;


@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@DynamicUpdate
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
