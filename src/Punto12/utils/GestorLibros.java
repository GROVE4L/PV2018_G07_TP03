package Punto12.utils;

import Punto12.modelo.Libro;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Rojas, Guido G.
 */
public class GestorLibros {
    private ArrayList<String> listaCategorias = new ArrayList<String>();
    private ArrayList<Libro> listaLibros = new ArrayList<Libro>();

    public ArrayList<String> getListaCategorias() {
        return listaCategorias;
    }

    public void setListaCategorias(ArrayList<String> listaCategorias) {
        this.listaCategorias = listaCategorias;
    }

    public ArrayList<Libro> getListaLibros() {
        return listaLibros;
    }

    public void setListaLibros(ArrayList<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }
    
    public void agregarCategoria(String nombreCategoria) {
        if(!this.buscarCategoria(nombreCategoria))
            this.listaCategorias.add(nombreCategoria);
    }
    
    public void agregarLibro(Libro objLibro) { //Si al agregar un libro la categoria no existe, se creara la categoria y se agregara el libro
        if(this.buscarCategoria(objLibro.getCategoriaLibro())) {
            this.listaLibros.add(objLibro);
        }
        else {
            this.agregarCategoria(objLibro.getCategoriaLibro());
            this.listaLibros.add(objLibro);
        }
    }
    public boolean buscarLibroConCategoriaYTitulo(String catBuscada, String tituloBuscado) {
        if(this.buscarCategoria(catBuscada) && this.buscarTitulo(tituloBuscado))
            return true;
        else 
            return false;
    }
    
    public void mostrarLibrosDeAutor(String autorBuscado) {
        if(this.buscarAutor(autorBuscado)) {
            System.out.println("[=] Libros del Autor [=]");
            for(Libro l: this.listaLibros) {
                if(l.getAutor().compareToIgnoreCase(autorBuscado) == 0) {
                    System.out.println("Nombre: "+l.getTitulo()+" - Categoria: "+l.getCategoriaLibro());
                }
            }
            System.out.println("-------");
        }
        else
            System.out.println("El autor no Existe.");
    }
    
    public boolean buscarAutor(String autorBuscado) {
        Iterator<Libro> iteradorLibros = this.listaLibros.iterator();
        boolean bandera=false;
        while(iteradorLibros.hasNext() && !bandera) {
            if(iteradorLibros.next().getAutor().compareToIgnoreCase(autorBuscado) == 0)
                bandera = true;
        }
        return bandera;
    }
    
    public boolean buscarTitulo(String tituloBuscado) {
        Iterator<Libro> iteradorLibros = this.listaLibros.iterator();
        boolean bandera=false;
        while(iteradorLibros.hasNext() && !bandera) {
            if(iteradorLibros.next().getTitulo().compareToIgnoreCase(tituloBuscado) == 0)
                bandera = true;
        }
        return bandera;
    }
    
    public boolean buscarCategoria(String categoriaBuscada) {
        Iterator<String> iteradorCategorias = this.listaCategorias.iterator();
        boolean bandera=false;
        while(iteradorCategorias.hasNext() && !bandera) {
            if(iteradorCategorias.next().compareToIgnoreCase(categoriaBuscada) == 0)
                bandera = true;
        }
        return bandera;
    }
}
