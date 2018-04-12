package Punto09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Rojas, Guido G.
 */
public class Main {
    public static void main (String [] args)   {    
        ArrayList<Libro> listaLibros = new ArrayList<Libro>();
        //Cargando Lista de Libros
        Libro objLibro = new Libro("Titulo uno","Autor Uno");
        listaLibros.add(objLibro);
        objLibro = new Libro("Titulo dos","Autor Dos");
        listaLibros.add(objLibro);
        objLibro = new Libro("Titulo tres","Autor Tres");
        listaLibros.add(objLibro);
        objLibro = new Libro("Titulo dos","Autor Tres");
        listaLibros.add(objLibro);
                
        Scanner sca = new Scanner(System.in);
        System.out.print("Ingrese titulo que quiere buscar: ");
        String buscado = sca.nextLine();
        
        Iterator<Libro> iterador = listaLibros.iterator();
        while(iterador.hasNext()) {
            objLibro = iterador.next();
            if(objLibro.getTitulo().compareToIgnoreCase(buscado) == 0) {
                System.out.println("Libro encontrado");
                System.out.println("Autor del Libro: "+objLibro.getAutor());
            }
        }        
    }
}
