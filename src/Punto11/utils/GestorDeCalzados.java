package Punto11.utils;

import Punto11.modelo.Calzado;
import java.util.ArrayList;

/**
 *
 * @author Rojas, Guido G.
 */
public class GestorDeCalzados {
    private ArrayList<Calzado> listaCalzado = new ArrayList<Calzado>();
    
    public ArrayList<Calzado> getListaCalzado() {
        return listaCalzado;
    }

    public void setListaCalzado(ArrayList<Calzado> listaCalzado) {
        this.listaCalzado = listaCalzado;
    }
    
    public void addCalzado(Calzado calz) {
        this.listaCalzado.add(calz);
    }
    public int cantidad(){ //Retorna cantidad de calzados que tenga la lista
        return this.listaCalzado.size();
    }
}
