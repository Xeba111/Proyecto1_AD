package com.corejsf;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;


@Named
@SessionScoped
public class Login implements Serializable{

    private String nombre = "";
    private String contra = "";
    private final com.corejsf.AllLoggedIn AllLoggedIn;
    private User usuario = new User();

    @Inject
    public Login(AllLoggedIn AllLoggedIn) {
        this.AllLoggedIn = AllLoggedIn;
    }

//    public User createUser(String nombre, String contrasena){
//          usuario.setName(nombre);
//          usuario.setPassword(contrasena);
//          return usuario;
//    }

    public String getNombre() {return nombre;}
    public String getContra() {return contra;}

    public void setNombre(String newNombre) {nombre = newNombre;}

    public void setContra(String newContra) {contra = newContra;}

    public String addToArray(){
        usuario.setName(nombre);
        usuario.setPassword(contra);
        AllLoggedIn.getUsuarios().add(usuario);
        return "click";
    }

}
