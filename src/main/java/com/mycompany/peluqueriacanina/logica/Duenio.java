/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.peluqueriacanina.logica;

/**
 *
 * @author JEFFERSON ALQUINGA
 */
public class Duenio {
    
    private int idDuenio;
    private String nombre;
    private String celDuenio;

    public Duenio() {
    }

    public Duenio(int idDuenio, String nombre, String celDuenio) {
        this.idDuenio = idDuenio;
        this.nombre = nombre;
        this.celDuenio = celDuenio;
    }

    public int getIdDuenio() {
        return idDuenio;
    }

    public void setIdDuenio(int idDuenio) {
        this.idDuenio = idDuenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelDuenio() {
        return celDuenio;
    }

    public void setCelDuenio(String celDuenio) {
        this.celDuenio = celDuenio;
    }
    
    
    
    
}
