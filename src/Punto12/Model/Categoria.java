/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto12.Model;

/**
 *
 * @author Ignacio
 */
public class Categoria {
    private String nombrecat;

    public Categoria() {
    }

    public Categoria(String nombrecat) {
        this.nombrecat = nombrecat;
    }
    /**
     * @return the nombrecat
     */
    public String getNombrecat() {
        return nombrecat;
    }

    /**
     * @param nombrecat the nombrecat to set
     */
    public void setNombrecat(String nombrecat) {
        this.nombrecat = nombrecat;
    }
    
}
