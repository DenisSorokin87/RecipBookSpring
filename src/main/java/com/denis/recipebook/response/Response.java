package com.denis.recipebook.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Response<T> {

    private T data;
    private String msg;

    public Response(String msg) {
        this.msg = msg;
    }
}
