package com.denis.recipebook.beans;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class LoggedInUser {

    private Long id;
    private String userName;

}
