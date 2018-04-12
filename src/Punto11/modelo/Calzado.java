package Punto11.modelo;

/**
 *
 * @author Rojas, Guido G.
 */
public class Calzado {
    private String marca;
    private boolean original; //true: original | false: copia

    //Constructores
    public Calzado(){        
    }

    public Calzado(String marca, boolean original) {
        this.marca = marca;
        this.original = original;
    }    
    
    //Fin Constructores
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public boolean isOriginal() {
        return original;
    }
    public void setOriginal(boolean original) {
        this.original = original;
    }
}
