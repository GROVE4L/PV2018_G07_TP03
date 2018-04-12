package Punto11.test;

import Punto11.modelo.Calzado;
import Punto11.utils.GestorDeCalzados;
import java.util.Scanner;

/**
 *
 * @author Rojas, Guido G.
 */
public class Test {
    public static void main (String [] args)   {
        GestorDeCalzados listaZapatillas = new GestorDeCalzados();
        Calzado objCalzado;
        Scanner sca = new Scanner(System.in);
        char rta='v';        
        while(rta != 'f' && rta != 'F') {
            System.out.print("Ingrese marca de zapatilla: ");
            String marca = sca.next();
            System.out.print("¿Es original o copia? (Marque O para original y C para copia): ");
            rta = sca.next().charAt(0);
            rta = Character.toUpperCase(rta); //Convertir Char a mayusculas
            
            while(rta != 'O' && rta != 'C') {
                System.out.print("ERROR: Opcion invalida.\nMarque O para original y C para copia: ");
                rta = sca.next().charAt(0);
                rta = Character.toUpperCase(rta); //Convertir Char a mayusculas               
            }
            if(rta == 'O')
                objCalzado = new Calzado(marca, true);
            else
                objCalzado = new Calzado(marca, false);
            
            listaZapatillas.addCalzado(objCalzado);            
            System.out.println("¿Quiere ingresar otro Calzado? (V/F)");
            rta = sca.next().charAt(0);
        }
        //Mostrando la lista.
        System.out.println("Zapatillas cargadas: "+listaZapatillas.cantidad());
        for(Calzado calzado: listaZapatillas.getListaCalzado()) {
            if(calzado.isOriginal())
                System.out.println("Marca de Zapatilla: "+calzado.getMarca()+" - Tipo: ORIGINAL");
            else
                System.out.println("Marca de Zapatilla: "+calzado.getMarca()+" - Tipo: COPIA");            
        }        
    }
}
