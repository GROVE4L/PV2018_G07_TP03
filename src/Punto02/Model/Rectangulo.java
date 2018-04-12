package Punto02.Model;

import java.util.Scanner;

/**
 *
 * @author Ignacio
 */
public class Rectangulo {
        
    private double base;
    private double altura;
    private double px;
    private double py;

    /*Constructor Inicial*/
    public Rectangulo() {
    }

    public Rectangulo(double base, double altura, double px, double py) {
        this.base = base;
        this.altura = altura;
        this.px = px;
        this.py = py;
    }
    
    /**
     * @return the base
     */
    public double getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * @return the px
     */
    public double getPx() {
        return px;
    }

    /**
     * @param px the px to set
     */
    public void setPx(double px) {
        this.px = px;
    }

    /**
     * @return the py
     */
    public double getPy() {
        return py;
    }

    /**
     * @param py the py to set
     */
    public void setPy(double py) {
        this.py = py;
    }
    

    public void mostrarpuntos(Rectangulo objRectangulo){
        System.out.println("Base: " + base + "\nAltura: " + altura + "\nP1(x,y): P(" + px + "," + py + ")");
        System.out.println("P2(x,y): P(" + (this.px+this.base) + "," + this.py + ")");
        System.out.println("P3(x,y): P(" + (this.px+this.base) + "," + (this.py+this.altura) + ")");
        System.out.println("P4(x,y): P(" + this.px + "," + (this.py+this.altura) + ")");
    }
    
    public double obtSuperficie(Rectangulo objRectangulo){
        double sup=0;
        return sup=(this.base*2+this.altura*2);
    }
    
    public double obtArea(Rectangulo objRectangulo){
        double area=0;
        return area=(this.base*this.altura);
    }
    
}
