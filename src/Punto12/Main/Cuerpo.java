/*
Punto 12: Plantee y desarrolle una búsqueda de libros por categorías y/o título. Las categorías
la elige de otra lista que almacena las categorias. Indique si se realizará la búsqueda por ambos
campos o solo por autor.
 */
package Punto12.Main;

import Punto12.Model.Categoria;
import Punto12.Model.Libro;
import Punto12.Utils.GestorCategoria;
import Punto12.Utils.GestorLibro;
import java.time.temporal.TemporalAdjusters;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Ignacio
 */
public class Cuerpo {
    public static void main(String[] args) {
               
        Categoria comedia = new Categoria("Comedia");
        Categoria drama = new Categoria("Drama");
        Categoria terror = new Categoria("Terror");
        Categoria csficcion = new Categoria("Cs Ficcion");
        
        GestorCategoria gestorcat = new GestorCategoria();
        gestorcat.agregarCategoria(comedia);
        gestorcat.agregarCategoria(drama);
        gestorcat.agregarCategoria(terror);
        gestorcat.agregarCategoria(csficcion);

        Libro titulo1 = new Libro("Soledad",comedia);
        Libro titulo2 = new Libro("Wolf",comedia);
        Libro titulo3 = new Libro ("Rojas",drama);
        
        GestorLibro gestorlib = new GestorLibro();
        gestorlib.agregarLibro(titulo1);
        gestorlib.agregarLibro(titulo2);
        gestorlib.agregarLibro(titulo3);
        
        System.out.println("Podremos realizar una busqueda por Categoria y Titulo o por Titulo unicamente\nPresione(a) para la primera opcion\nPresione(b) para la segunda opcion");
        Scanner sca = new Scanner(System.in);
        System.out.println("Ingrese una opcion:");
        char opc = sca.next().charAt(0);
        switch (opc){
            case 'a':
                for(Libro libro: gestorlib.getLibro()){
                    if(libro.getCatlibro()==comedia){
                        System.out.println("El libro -" + libro.getTitulo() + "- existe en la categoria");
                    }
                    else
                    {
                        System.out.println("La categoria o el titulo no existe");
                    }
                }
            case 'b':
                for(Libro libro: gestorlib.getLibro()){
                    if(libro.getTitulo()=="Wolf"){
                        System.out.println("El titulo del libro -" + libro.getTitulo() + "- existe");
                    }
                    else
                    {
                        System.out.println("El titulo no existe");
                    }
                }
        }
    }
}