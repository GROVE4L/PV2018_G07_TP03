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
import javafx.scene.effect.Glow;

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

        Libro titulo1 = new Libro("100 años de Soledad","Drama");
        Libro titulo2 = new Libro("Los tres chanchitos","Infantil");
        Libro titulo3 = new Libro ("Rojas","Suspenso");
        
        GestorLibro gestorlib = new GestorLibro();
        gestorlib.agregarLibro(titulo1);
        gestorlib.agregarLibro(titulo2);
        gestorlib.agregarLibro(titulo3);
        
        System.out.println("Podremos realizar una busqueda por Categoria y Titulo o por Titulo unicamente\nPresione(a) para la primera opcion\nPresione(b) para la segunda opcion");
        Scanner sca = new Scanner(System.in);
        System.out.println("Ingrese una opcion:");
        char opc = sca.next().charAt(0);
        switch (opc){
            case 'a':case 'A':
                /*Scanner scambos = new Scanner(System.in);
                System.out.println("Ingrese la Categoria que busca: ");
                String cat = scambos.nextLine();*/
                for(Libro libro: gestorlib.getLibro()){
                    if(libro.getCatlibro()=="Drama"){
                        System.out.println("El libro -" + libro.getTitulo() + "- es de " + libro.getCatlibro());
                    }
                };
                break;
            case 'b':case 'B':
                for(Libro libro: gestorlib.getLibro()){
                    if(libro.getTitulo()=="Rojas"){
                        System.out.println("El titulo del libro -" + libro.getTitulo() + "- existe en la categoria " + libro.getCatlibro());
                    }
                }
                ;
                break;
        }
    }
}