/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto08.Utils;

import Punto08.Model.Manual;
import java.util.ArrayList;

/**
 *
 * @author Ignacio
 */
public class GestorManual {
    
    private ArrayList<Manual> manual = new ArrayList();

    /**
     * @return the manual
     */
    public ArrayList<Manual> getManual() {
        return manual;
    }

    /**
     * @param manual the manual to set
     */
    public void setManual(ArrayList<Manual> manual) {
        this.manual = manual;
    }

    public void agregarManual(Manual manual){
        this.manual.add(manual);
    }
    
    public int devolverTamano(Manual manual){
        return this.manual.size();
    }
}
