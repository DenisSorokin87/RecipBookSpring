package com.denis.recipebook.beans;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CookingProcess {

    private int processId;
    private int processNumber;
    private String description;


    public CookingProcess(int processId, int processNumber, String description) {
        this.processId = processId;
        this.processNumber = processNumber;
        this.description = description;
    }

}
