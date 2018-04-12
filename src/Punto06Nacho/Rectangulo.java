/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto06Nacho;

/**
 *
 * @author Ignacio
 */
public class Rectangulo {
    private double altura;
    private double base;
    private double px;
    private double py;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getPx() {
        return px;
    }

    public void setPx(double px) {
        this.px = px;
    }

    public double getPy() {
        return py;
    }

    public void setPy(double py) {
        this.py = py;
    }
    
    public double getperimetro(){
        return getAltura()*2+getBase()*2;
    }
    
    public double getarea(){
        return getAltura()*getBase();
    }
}