package Punto12.test;

import Punto12.modelo.Libro;
import Punto12.utils.GestorLibros;
import java.util.Scanner;

/**
 *
 * @author Rojas, Guido G.
 */
public class Test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Precargando listas de categorias y lista de libros
        GestorLibros listadoLibro = new GestorLibros();
        listadoLibro.agregarCategoria("TERROR");
        listadoLibro.agregarCategoria("HUMOR");
        listadoLibro.agregarCategoria("SUSPENSO");
        listadoLibro.agregarCategoria("CIENCIA FICCION");
        Libro objLibro = new Libro("IT","Stephen King","TERROR");
        listadoLibro.agregarLibro(objLibro);
        objLibro = new Libro("HISTORIAS DE TERROR IV", "John Cántaro","TERROR");
        listadoLibro.agregarLibro(objLibro);
        objLibro = new Libro("LUNA DE PLUTON", "DrossRotzank" ,"CIENCIA FICCION");
        listadoLibro.agregarLibro(objLibro);
        objLibro = new Libro("HARRY POTTER","JK Rowling","CIENCIA FICCION");
        listadoLibro.agregarLibro(objLibro);
        objLibro = new Libro("HARRY POTTER III","JK Rowling","CIENCIA FICCION");
        listadoLibro.agregarLibro(objLibro);
        objLibro = new Libro("CHISTES VOL.2", "Mark Laught", "HUMOR");
        listadoLibro.agregarLibro(objLibro);
        
        System.out.println("[=========================]");
        System.out.println("Listado de Categorias: ");
        for(String categoria: listadoLibro.getListaCategorias()) {
            System.out.println("Categoria: "+categoria);
        }
        System.out.println("[=========================]");
        System.out.println("Listado de Libros con categoria: ");
        for(Libro l: listadoLibro.getListaLibros()) {
            System.out.println("    -------");
            System.out.println("    Nombre Libro: "+l.getTitulo()+" - Autor: "+l.getAutor()+"\n    Categoria: "+l.getCategoriaLibro());
        }
        System.out.println("[=========================]\n");
       Scanner sca = new Scanner(System.in);
        int rta;
        System.out.println("Criterio de busqueda: ");
        System.out.println("1) Categoria y Titulos");
        System.out.println("2) Autor");      
        System.out.print("Ingrese una opcion: ");
        rta = sca.nextInt();
        while(rta != 1 && rta != 2) {
            System.out.println("OPCION INCORRECTA!!!");
            System.out.println("Criterio de busqueda: ");
            System.out.println("1) Categoria y Titulos");
            System.out.println("2) Autor");
            System.out.print("Ingrese una opcion: ");
            rta = sca.nextInt();
        }
        if(rta == 1) {//Busqueda por categoria y titulos          
            System.out.println("[=========================]");
            System.out.println("Listado de Categorias disponibles: ");
            for(String categoria: listadoLibro.getListaCategorias()) {
                System.out.println("Categoria: "+categoria);
            }
            System.out.println("[=========================]");
            System.out.print("Ingrese la categoria que buscara: ");
            sca = new Scanner(System.in);
            String categoria = sca.nextLine();
            System.out.print("Ingrese el titulo que quiere buscar: ");
            String titulo = sca.nextLine();
            if(listadoLibro.buscarLibroConCategoriaYTitulo(categoria, titulo))
                System.out.println("El libro fue Encontrado!");            
            else
                System.out.println("El libro NO fue encontrado.");
        }
        else {//Busqueda solo por autor
            System.out.print("Ingrese la/el autor a buscar: ");
            sca = new Scanner(System.in);
            String autor = sca.nextLine();
            listadoLibro.mostrarLibrosDeAutor(autor);
            
        }
    }    
}
