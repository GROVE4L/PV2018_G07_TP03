package Punto05.utils;

import Punto05.modelo.Circulo;
import java.util.ArrayList;

/**
 *
 * @author Rojas, Guido G.
 */
public class GestorCirculos {
    private ArrayList<Circulo> listaCirculos=new ArrayList<Circulo>(); //Agregar el new por el NullPointException

    public ArrayList<Circulo> getListaCirculos() {
        return listaCirculos;
    }

    public void setListaCirculos(ArrayList<Circulo> listaCirculos) {
        this.listaCirculos = listaCirculos;
    }
    
    public void addCirculo(Circulo circulo) {
        this.listaCirculos.add(circulo);
    }
    public int cantidad(){
        return this.listaCirculos.size();
    }
}
