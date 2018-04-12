package Punto05.test;

import Punto05.modelo.Circulo;
import Punto05.utils.GestorCirculos;
import java.util.Scanner;
/**
 *
 * @author Rojas, Guido G.
 **/
public class Main {
    public static void main (String [] args)   {   
        GestorCirculos listaCirculos = new GestorCirculos();
        Circulo objCirculo;
        char rta='V';
        while(rta!='F' && rta != 'f') {
            Scanner sca = new Scanner(System.in);            
            System.out.print("Ingrese radio del circulo que quiera ingresar: ");
            double radio=sca.nextDouble();
            
            objCirculo = new Circulo(radio);            
            listaCirculos.addCirculo(objCirculo);
            
            System.out.println("Circulo Añadido!\nSuperficie del circulo añadido: "+objCirculo.getSuperficie());
            System.out.println("¿Quiere ingresar otro Circulo? (V/F)");
            rta = sca.next().charAt(0);
        }
        System.out.println("Se cargaron "+listaCirculos.cantidad()+" elementos en la lista.");
        
        for (Circulo circulo: listaCirculos.getListaCirculos()) //Para recorrer la lista
            System.out.println("Circulo cargado con radio: "+circulo.getRadio()+" cuya superficie es: "+circulo.getSuperficie());
        
        /*
        Iterator<Circulo> iterador = listaCirculos.getListaCirculos().iterator(); //Iterador para recorrer la lista
        while(iterador.hasNext()) {
            objCirculo = iterador.next();
            System.out.println("Circulo cargado con radio: "+objCirculo.getRadio()+" cuya superficie es: "+objCirculo.getSuperficie());
        } */       
    }
}