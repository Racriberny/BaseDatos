package com.cristobalbernal.basedatos.Models;

import com.cristobalbernal.basedatos.utils.HashGenerator;

import java.security.NoSuchAlgorithmException;

public class User {
    private final int id;
    private final String userName;
    private String password;

    public User(int id, String userName, String password) throws NoSuchAlgorithmException {
        this.id = id;
        this.userName = userName;
        setPassword(password);
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws NoSuchAlgorithmException {
        HashGenerator.getSHA(password);
        this.password = password;
    }
}
