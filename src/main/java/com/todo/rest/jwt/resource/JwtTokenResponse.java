package com.todo.rest.jwt.resource;

import java.io.Serializable;

/**
 * Created by George Fouche on 7/6/19.
 */
public class JwtTokenResponse implements Serializable {


    private static final long serialVersionUID = 8317676219297719109L;

    private final String token;

    public JwtTokenResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return this.token;
    }
}
