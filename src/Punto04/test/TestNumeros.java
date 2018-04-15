package Punto04.test;

import Punto04.utils.GestorDeNumeros;
import java.util.Scanner;

/**
 *
 * @author Rojas, Guido G.
 */
public class TestNumeros {
    public static void main(String[] args) {
        GestorDeNumeros listaNumeros = new GestorDeNumeros();
        Scanner sca = new Scanner(System.in);
        int aux;
        for(int i=0; i<10; i++){
            System.out.print("Ingrese un numero ("+(i+1)+"/10): ");
            aux=sca.nextInt();
            listaNumeros.agregarNumero(aux);
        }
        System.out.println("[===============]");
        System.out.println("Lista cargada: ");
        listaNumeros.mostrarNumeros();
        System.out.println("El MAYOR de los numeros: "+listaNumeros.mayorNumero());
        System.out.println("El MENOR de los numeros: "+listaNumeros.menorNumero());
        System.out.println("El PROMEDIO de los numeros: "+listaNumeros.promedioNumero());
    }
}
