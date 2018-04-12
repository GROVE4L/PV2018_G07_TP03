/*
Punto 10: Desarrolle una aplicación en la que se elige la cantidad de cuotas a pagar por un
producto. El producto debe tener su código, nombre y precio unitario. Muestre entonces como
resultado los datos del producto ingresado y una tabla con tantos registros como cuotas
elegidas. Tenga en cuenta que cada cuota aumenta a la anterior un 1,5% el valor de la cuota
anterior. Al final muestre la suma total a pagar.
 */
package Punto10.Main;

import java.util.Scanner;
import Punto10.Model.Producto;
import Punto10.Utils.GestorProducto;

/**
 *
 *
 * @author Ignacio
 */
public class Cuerpo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Producto pan = new Producto(123, "Pan", 12);
        Producto harina = new Producto(456, "Harina", 8.99);
        Producto gaseosa = new Producto(789, "Gaseosa", 73.50);
      
        GestorProducto gestor = new GestorProducto();
        gestor.agregarProductos(pan);
        gestor.agregarProductos(harina);
        gestor.agregarProductos(gaseosa);
        
        System.out.println("Ingrese la cantidad de cuotas que desea pagar: ");
        Scanner sca = new Scanner(System.in);
        int cantcuota = sca.nextInt();
        
        Producto calcularcuotas = new Producto();
        calcularcuotas.calcularCuota(cantcuota, gaseosa);

    }
}

