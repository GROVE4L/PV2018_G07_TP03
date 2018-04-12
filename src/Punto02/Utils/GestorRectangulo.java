/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto02.Utils;

import Punto02.Model.Rectangulo;
import java.util.ArrayList;

/**
 *
 * @author Ignacio
 */
public class GestorRectangulo {
    
    private ArrayList<Rectangulo> listaRectangulo = new ArrayList();

    /**
     * @return the listaRectangulo
     */
    public ArrayList<Rectangulo> getObjRectangulo() {
        return listaRectangulo;
    }

    /**
     * @param listaRectangulo the listaRectangulo to set
     */
    public void setObjRectangulo(ArrayList<Rectangulo> listRectangulo) {
        this.listaRectangulo = listRectangulo;
    }
    
    public void agregarRectangulo(Rectangulo objRectangulo){
        this.listaRectangulo.add(objRectangulo);
    }
    
}
