/*
Punto 12: Plantee y desarrolle una búsqueda de libros por categorías y/o título. Las categorías
la elige de otra lista que almacena las categorias. Indique si se realizará la búsqueda por ambos
campos o solo por autor.
 */ 
package Punto12.Utils;

import java.util.ArrayList;
import Punto12.Model.Categoria;

/**
 *
 * @author Ignacio
 */
public class GestorCategoria {
    
    private ArrayList<Categoria> categoria = new ArrayList();

    /**
     * @return the categoria
     */
    public ArrayList<Categoria> getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(ArrayList<Categoria> categoria) {
        this.categoria = categoria;
    }
    
    public void agregarCategoria(Categoria categoria){
        this.categoria.add(categoria);    
    }
    
}
