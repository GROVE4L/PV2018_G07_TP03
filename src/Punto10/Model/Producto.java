/*
Desarrolle una aplicación en la que se elige la cantidad de cuotas a pagar por un
producto. El producto debe tener su código, nombre y precio unitario. Muestre entonces como
resultado los datos del producto ingresado y una tabla con tantos registros como cuotas
elegidas. Tenga en cuenta que cada cuota aumenta a la anterior un 1,5% el valor de la cuota
anterior. Al final muestre la suma total a pagar.
 */
package Punto10.Model;

/**
 *
 * @author Ignacio
 */
public class Producto {
    private long codigo;
    private String Nombre;
    private double punit;

    public Producto() { /*Constructor*/
    }
    
    public Producto(long codigo, String Nombre, double punit) { /*Constructor final*/
        this.codigo = codigo;
        this.Nombre = Nombre;
        this.punit = punit;
    }

    /**
     * @return the codigo
     */
    public long getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the punit
     */
    public double getPunit() {
        return punit;
    }

    /**
     * @param punit the punit to set
     */
    public void setPunit(double punit) {
        this.punit = punit;
    }

    public void calcularCuota(int cantcuota, Producto prod){
        double cuota1;
        cuota1 = prod.punit/cantcuota;
        
        for (int i=1; i<=cantcuota;i++){
            
            System.out.println("La cuota nro " + i + " debe abonar: $" + cuota1);
            cuota1 += cuota1*0.015;
        }
    }
}
