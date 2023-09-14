package com.corejsf;

import javax.enterprise.context.ApplicationScoped;

import java.io.Serializable;
import java.util.ArrayList;


@ApplicationScoped
public class AllLoggedIn implements Serializable {

    private ArrayList<User> usuarios = new ArrayList<>();

    public ArrayList<User> getUsuarios() {
        return usuarios;
    }
}

