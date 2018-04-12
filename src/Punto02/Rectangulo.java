package Punto02;

import java.util.Scanner;

/**
 *
 * @author Ignacio
 */
public class Rectangulo {
        
        public void perimetroyarea(){
        
        Scanner sca = new Scanner(System.in);
        
        System.out.println("Ingrese X: ");
        int x = sca.nextInt();
        
        System.out.println("Ingrese Y: ");
        int y = sca.nextInt();
        
        System.out.println("Ingrese la Altura del Rectangulo: ");
        int h = sca.nextInt();
        
        System.out.println("Ingrese la Base del Rectangulo: ");
        int b = sca.nextInt();
     
        int perimetro = 1;
        int area = 1;
        
        perimetro = (h*2)+(b*2);
        area = b*h;
        
        int vector[]={x,y,h,b};
        
        System.out.println("El punto1 (x, y) es : P(" + vector[0] + "," + vector[1] + ")");
        System.out.println("El punto2 (x+b, y) es : P(" + (vector[0]+vector[3]) + "," + vector[1] + ")");
        System.out.println("El punto3 (x+b, y+h) es : P(" + (vector[0]+vector[3]) + "," + (vector[1]+vector[2]) + ")");
        System.out.println("El punto4 (x, y+h) es : P(" + vector[0] + "," + (vector[1]+vector[2]) + ")");
        System.out.println("El perimetro del rectangulo es: " + perimetro + " y el Area es: " + (vector[2]*vector[3]));/*Resuelto de dos formas distintas*/
        }
}
