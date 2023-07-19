/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.codejava.entity;

/**
 *
 * @author jose.jimenez07
 */
public class Formulario {

    private String nombre;
    private String password;
    private String nombrecompleto;
    private String edad;
    private String sexo;
    private String estatura;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getnombrecompleto() {
        return nombrecompleto;
    }

    public void setnombrecompleto(String nombrecompleto) {
        this.nombrecompleto = nombrecompleto;
    }
    
    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
    
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
     public String getEstatura() {
        return estatura;
    }

    public void setEstatura(String estatura) {
        this.estatura = estatura;
    }
    
}
