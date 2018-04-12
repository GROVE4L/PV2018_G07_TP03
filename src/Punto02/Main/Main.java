package Punto02.Main;

import Punto02.Model.Rectangulo;
import Punto02.Utils.GestorRectangulo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ignacio
 */

public class Main {
    public static void main(String[] args) {
        ArrayList<Rectangulo> listaArrayList = new ArrayList();
        GestorRectangulo gestor = new GestorRectangulo();
        
        Rectangulo rectangulo = new Rectangulo(5, 12, 2.5, 3.5);
        gestor.agregarRectangulo(rectangulo);
        rectangulo.mostrarpuntos(rectangulo);
        
        
    }   
}
