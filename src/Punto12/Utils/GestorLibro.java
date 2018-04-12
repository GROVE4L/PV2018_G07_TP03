/*
Punto 12: Plantee y desarrolle una búsqueda de libros por categorías y/o título. Las categorías
la elige de otra lista que almacena las categorias. Indique si se realizará la búsqueda por ambos
campos o solo por autor.
 */
package Punto12.Utils;

import Punto12.Model.Categoria;
import java.util.ArrayList;
import Punto12.Model.Libro;

/**
 *
 * @author Ignacio
 */
public class GestorLibro {
    private ArrayList<Libro> libro = new ArrayList();

    /**
     * @return the libro
     */
    public ArrayList<Libro> getLibro() {
        return libro;
    }

    /**
     * @param libro the libro to set
     */
    public void setLibro(ArrayList<Libro> libro) {
        this.libro = libro;
    }
    
    public void agregarLibro(Libro libro){
        this.libro.add(libro);
    }
    
    public boolean cantidadtitulos(String categoria){
        return this.libro.contains(categoria);
    }
    
    public void devolvercat(Libro libro){
        libro.getCatlibro();
    }
    public boolean existetitulo(Libro titulo){
        return this.libro.contains(titulo);
    }
    
}
