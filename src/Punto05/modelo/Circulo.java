package Punto05.modelo;

/**
 *
 * @author Rojas, Guido G.
 **/
public class Circulo {
    private double radio;
    
    public Circulo() {        
    }
    public Circulo(double radio) {
        this.radio = radio;
    }
    
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double getSuperficie() {
        return Math.PI*Math.pow(this.getRadio(),2);
    }    
}
