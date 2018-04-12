package Punto07.test;

import Punto07.modelo.Carro;
import Punto07.utils.GestorDeAutos;
import java.util.Scanner;

/**
 *
 * @author Rojas, Guido G.
 */
public class Test1 {
    public static void main (String [] args)   {
        GestorDeAutos listaAutos = new GestorDeAutos();
        
        Carro objAuto = new Carro("AB 324 OJ", "FORD", "2009", "GRIS", "DIESEL");
        listaAutos.agregarCarro(objAuto);
        objAuto = new Carro("LN 749 PA", "BMW", "2018", "ROJO", "SUPER");
        listaAutos.agregarCarro(objAuto);
        objAuto = new Carro("BD 307 ZR", "TOYOTA", "2017", "BLANCO", "SUPER");
        listaAutos.agregarCarro(objAuto);
        objAuto = new Carro("AA 174 DF", "LEXUS", "2018", "VERDE OSCURO", "SUPER");
        listaAutos.agregarCarro(objAuto);
        
        
        System.out.println("Autos Cargados en la Lista: ");
        for(int i=0; i<listaAutos.getIndice(); i++) {
            objAuto=listaAutos.verCarro(i);
            objAuto.mostrarCarro();
        }
        
        Scanner sca = new Scanner(System.in);
        System.out.print("\n¿Que patente desea modificar? (Para salir escriba 'no'): ");
        String buscado = sca.nextLine();
        buscado = buscado.toUpperCase();
        if(buscado.compareTo("NO") != 0) {
            int posicion = listaAutos.buscarPatente(buscado);
            if(posicion != -1) { //Si existe...
                System.out.println("Auto encontrado en la lista");
                listaAutos.verCarro(posicion);
                System.out.println("Ingrese los nuevos datos del auto: ");
                System.out.print("Ingrese Patente: ");
                String patente = sca.nextLine();  
                patente = patente.toUpperCase();
                System.out.print("Ingrese Marca: ");
                String marca = sca.nextLine();
                marca = marca.toUpperCase();
                System.out.print("Ingrese Modelo: ");
                String modelo = sca.nextLine();                
                System.out.print("Ingrese Color: ");
                String color = sca.nextLine();
                color = color.toUpperCase();
                System.out.print("Ingrese el Tipo de Combustible: ");
                String tipoCombustible = sca.nextLine();
                tipoCombustible = tipoCombustible.toUpperCase();
                
                objAuto = new Carro(patente, marca, modelo, color, tipoCombustible);
                listaAutos.insertarCarro(objAuto, posicion);
                System.out.println("[=] Auto Actualizado [=]");
                
                System.out.println("Autos Cargados en la Lista ACTUALIZADA: ");
                for(int i=0; i<listaAutos.getIndice(); i++) {
                    objAuto=listaAutos.verCarro(i);
                    objAuto.mostrarCarro();
                }
            }
            else
                System.out.println("Patente no Encontrada!");
        }
        else
            System.out.println("Saliendo de la Aplicacion.");
    }
}
