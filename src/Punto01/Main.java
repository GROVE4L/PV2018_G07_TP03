package Punto01;

/**
 *
 * @author Rojas, Guido G.
 */
public class Main {
    public static void main(String[] args) {
        Punto p1 = new Punto();
        Punto p2 = new Punto();
        p1.setX(6.5);
        p2.setX(1.3);
        System.out.println("La distancia entre ambos puntos es de:  "+p1.calcularDistancia(p2.getX()));
    }
}
