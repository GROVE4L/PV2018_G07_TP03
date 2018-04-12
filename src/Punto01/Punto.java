package Punto01;
/**
 *
 * @autor Rojas, Guido G.
 */
public class Punto {
    private double x;
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }    
    public double calcularDistancia(double y) {
        if(this.x>y) return this.x-y;
        else return y-this.x;
    }
}
