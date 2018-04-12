/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto08.Main;

import Punto08.Model.Manual;
import Punto08.Utils.GestorManual;
import Punto12.Model.Libro;
import Punto12.Utils.GestorCategoria;
import java.util.Scanner;

/**
 *
 * @author Ignacio
 */
public class Cuerpo {
    public static void main(String[] args) {
        
        GestorManual gestor = new GestorManual();
        /*
        Manual m1 = new Manual(658931265, "Mi propio Tatto", "Guido Rojas", 12.35);
        Manual m2 = new Manual(785426532, "Mi cuerpo", "Ana Cabrera", 15.33);
        Manual m3 = new Manual(451265234, "Tutorial de no faltar", "Martin Raffa", 39.15);
        
        gestor.agregarManual(m1);
        gestor.agregarManual(m2);
        gestor.agregarManual(m3);
        */
        char opc = 'v';
        
        while (opc !='f' && opc !='F'){
            
            Scanner scaisbn = new Scanner(System.in);
            Scanner scanombrelibro = new Scanner(System.in);
            Scanner scaautor = new Scanner(System.in);
            Scanner scaprecio = new Scanner(System.in);
            Scanner scaopc = new Scanner(System.in);
            
            System.out.println("Ingrese el ISBN (9 digitos): ");
            long isbn = scaisbn.nextLong();
            
            System.out.println("Ingrese el Nombre: ");
            String nombrelibro = scanombrelibro.nextLine();
            
            System.out.println("Ingrese el Autor: ");
            String autor = scaautor.nextLine();
            
            System.out.println("Ingrese el Precio: ");
            double precio = scaprecio.nextDouble();
            
            Manual man = new Manual(isbn, nombrelibro, autor, precio);
            gestor.agregarManual(man);
            
            System.out.println("Desea Ingresar un nuevo valor? (V/F): ");
            opc= scaopc.next().charAt(0);
            
            System.out.println("El tamaño de la lista es: " + gestor.devolverTamano(man) + "\n");
        
            for (Manual manual: gestor.getManual()){
                gestor.mostrarManual(manual);
            }
        }
    }
}
