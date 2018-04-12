/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto06Nacho;

import Punto05.modelo.Circulo;
import java.lang.reflect.Array;
import java.time.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Ignacio
 */
public class Cuerpo {
    public static void main (String [] args)   {   
        
        ArrayList<Rectangulo> listarectangulo = new ArrayList<Rectangulo>();
        Rectangulo objRectangulo = new Rectangulo();
        
        objRectangulo = new Rectangulo();
        objRectangulo.setBase(6);
        objRectangulo.setAltura(3);
        objRectangulo.setPx(3);
        objRectangulo.setPy(8);
        listarectangulo.add(0, objRectangulo);     
        
        objRectangulo = new Rectangulo();
        objRectangulo.setBase(7.6);
        objRectangulo.setAltura(5);
        objRectangulo.setPx(2.1);
        objRectangulo.setPy(1);
        listarectangulo.add(1, objRectangulo);

        objRectangulo = new Rectangulo();
        objRectangulo.setBase(2.5);
        objRectangulo.setAltura(3.3);
        objRectangulo.setPx(6);
        objRectangulo.setPy(7);
        listarectangulo.add(2, objRectangulo);
        
        System.out.println("Existe "+listarectangulo.size()+" objeto en la lista");
        
        Iterator<Rectangulo> verlista = listarectangulo.iterator();
        while(verlista.hasNext()){
            objRectangulo = verlista.next();
            System.out.print("\nLa altura es: " + objRectangulo.getAltura() +
                    "\nLa base es: " + objRectangulo.getBase() +
                    "\nEl punto P(x,y) es: P(" + objRectangulo.getPx() + "," + objRectangulo.getPy() + ")" +
                    "\n===============================\n");
        }    
        char rta='V';
        int opc;
        while (rta !='F' && rta !='f'){
            System.out.println("Desea Eliminar un elemento de la lista? (V/F): ");
            Scanner sca = new Scanner(System.in);
            rta = sca.next().charAt(0);
            
            if (rta =='f' || rta == 'F'){
                rta='V';
                break;
            }
                
            System.out.println("Ingrese la posicion de la lista que desea eliminar: ");
            opc = sca.nextInt();
            
                if (opc > listarectangulo.size()){
                    System.out.println("Ingreso un valor incorrecto");
                }
                else{
                    listarectangulo.remove(opc);
                    System.out.println("Lista pos: " + opc + " se elimino correctamente");

                    Iterator<Rectangulo> verlistafinal = listarectangulo.iterator();
                    while(verlistafinal.hasNext()){
                        objRectangulo = verlistafinal.next();
                        System.out.print("\nLa altura es: " + objRectangulo.getAltura() +
                        "\nLa base es: " + objRectangulo.getBase() +
                        "\nEl punto P(x,y) es: P(" + objRectangulo.getPx() + "," + objRectangulo.getPy() + ")" +
                        "\n===============================\n");
                    }
                }        
            }
        System.out.println("FIN DEL PROGRAMA");
        }
}
