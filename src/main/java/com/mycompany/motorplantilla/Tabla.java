/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.motorplantilla;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Labing 201
 */
public class Tabla {
    private String nombre;
    private int oid;
    private List<Columna> atributos;

    public Tabla(String nombre, int oid) {
        this.nombre = nombre;
        this.oid = oid;
        this.atributos = new ArrayList<>();
    }

    public List<Columna> getAtributos() {
        return atributos;
    }

    public void setAtributos(List<Columna> atributos) {
        this.atributos = atributos;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }
    
    public boolean addColumna(String nombre){
      Columna c = new Columna(nombre);
      return this.atributos.add(c);
    }
    
    
}
