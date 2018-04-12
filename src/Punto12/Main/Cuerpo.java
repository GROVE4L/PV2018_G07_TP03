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

        Libro autor1 = new Libro("Soledad",comedia);
        Libro autor2 = new Libro("Wolf",csficcion);
        Libro autor3 = new Libro ("Rojas",drama);
        
        GestorLibro gestorlib = new GestorLibro();
        gestorlib.agregarLibro(autor1);
        gestorlib.agregarLibro(autor2);
        gestorlib.agregarLibro(autor3);
        
        /*char opc='v';
        while ( opc != 'f' && opc != 'F'){
            System.out.println("Desea realizar una busqueda? (V/F): ");
            
            Scanner sca = new Scanner(System.in);
            opc = sca.next().charAt(0);
            if (opc == 'f' && opc =='F'){
                System.out.println("No se realizo ninguna Busqueda");
                break;
            }
            else
            {
        */
                System.out.println("Podremos realizar una busqueda por Categoria y Titulo o por Titulo unicamente\nPresione(a) para la primera opcion\nPresione(b) para la segunda opcion");
                Scanner sca = new Scanner(System.in);
                char opc = sca.next().charAt(0);
                switch (opc){
                    case 'a':                    
                    
                    case 'b': ;
                    default: System.out.println("Error de Opcion");
                    }
            }
        }
    }
}

                    /*System.out.println("Las categorias son: " + gestorcat.tamañoCategoria());                
                    System.out.println("Ingrese la Categoria que desea buscar");
                    
                    Scanner scacat = new Scanner(System.in); 
                    String cat = scacat.nextLine();
                    
                    for(Categoria categoria: gestorcat.getCategoria()){
                    System.out.println("La Categoria " + cat + " : " + gestorcat.existecategoria(cat));
                    }
                    System.out.println("La Titulos Totales de la categoria son: " + gestorlib.getLibro());
                    System.out.println("Ingrese el Titulo que desea buscar");
                    String tit = sca.nextLine();;
*/