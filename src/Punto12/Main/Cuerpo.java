/*
Punto 12: Plantee y desarrolle una búsqueda de libros por categorías y/o título. Las categorías
la elige de otra lista que almacena las categorias. Indique si se realizará la búsqueda por ambos
campos o solo por autor.
 */
package Punto12.Main;

import Punto12.Model.Libro;
import Punto12.Utils.GestorCategoria;
import Punto12.Utils.GestorLibro;

/**
 *
 * @author Ignacio
 */
public class Cuerpo {
    public static void main(String[] args) {
               
        Libro cat1 = new Libro("Marquez");
        Libro csficcion = new Libro("Sabato");
        Libro comedia = new Libro ("Rojas");
        
        GestorCategoria gestorcat = new GestorCategoria();
        
        gestorcat.agregarCategoria(csficcion);

        GestorLibro gestorlib = new GestorLibro();
        gestorlib.agregarLibro(cat1);
        
        
    }    
}
