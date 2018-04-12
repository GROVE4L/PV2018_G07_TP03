/*
Desarrolle una aplicación en la que se elige la cantidad de cuotas a pagar por un
producto. El producto debe tener su código, nombre y precio unitario. Muestre entonces como
resultado los datos del producto ingresado y una tabla con tantos registros como cuotas
elegidas. Tenga en cuenta que cada cuota aumenta a la anterior un 1,5% el valor de la cuota
anterior. Al final muestre la suma total a pagar.
 */
package Punto10.Utils;

import java.util.ArrayList;
import Punto10.Model.Producto;

/**
 *
 * @author Ignacio
 */
public class GestorProducto {
    
    private ArrayList<Producto> producto = new ArrayList();

    /**
     * @return the obProducto
     */
    public ArrayList<Producto> getProducto() {
        return producto;
    }

    /**
     * @param producto the objProducto to set
     */
    public void setProducto(ArrayList<Producto> producto) {
        this.producto = producto;
    }
    
    public void agregarProductos(Producto producto){
        this.producto.add(producto);
    }
}
