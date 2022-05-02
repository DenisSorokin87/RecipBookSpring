package com.denis.recipebook.response;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Response<T> {

    private T data;
    private String msg;
    private Exception e;


    public Response(T data, String msg) {
        this.data = data;
        this.msg = msg;
    }

    public Response(String msg, Exception e) {
        this.msg = msg;
        this.e = e;
    }
}
