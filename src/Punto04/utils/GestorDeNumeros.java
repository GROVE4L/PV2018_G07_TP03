package Punto04.utils;
/**
 *
 * @author Rojas, Guido G.
 */
public class GestorDeNumeros {
    private int maximo=10;
    private int indice=0;
    private int[] listaNumeros = new int[maximo];
    public GestorDeNumeros(){        
    }
    public GestorDeNumeros(int n0, int n1, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        this.listaNumeros[0] = n0;
        this.listaNumeros[1] = n1;
        this.listaNumeros[2] = n2;
        this.listaNumeros[3] = n3;
        this.listaNumeros[4] = n4;
        this.listaNumeros[5] = n5;
        this.listaNumeros[6] = n6;
        this.listaNumeros[7] = n7;
        this.listaNumeros[8] = n8;
        this.listaNumeros[9] = n9;
    }
    
    public int[] getListaNumeros() {
        return listaNumeros;
    }

    public void setListaNumeros(int[] listaNumeros) {
        this.listaNumeros = listaNumeros;
    }
    public void agregarNumero(int numero) {
        if(this.indice == 10)
            System.out.println("ERROR: Arreglo Lleno");
        else {
            this.listaNumeros[this.indice] = numero;
            this.indice ++;
        }
    }
    public void mostrarNumeros() {
        for(int i=0; i<this.indice; i++) {
            System.out.println("Numero en posicion "+i+": "+this.listaNumeros[i]);
        }
    }
    public int mayorNumero() {
        int mayor=0;
        boolean bandera=false;
        for(int i=0; i<this.indice; i++) {
            if(!bandera) {
                bandera=true;
                mayor=this.listaNumeros[i];
            }
            else {
                if(this.listaNumeros[i]>mayor) {
                    mayor=this.listaNumeros[i];
                }
            }
        }
        return mayor;
    }
    public int menorNumero() {
        int menor=0;
        boolean bandera=false;
        for(int i=0; i<this.indice; i++) {
            if(!bandera) {
                bandera=true;
                menor=this.listaNumeros[i];
            }
            else {
                if(this.listaNumeros[i]<menor) {
                    menor=this.listaNumeros[i];
                }
            }
        }
        return menor;
    }
    public double promedioNumero() {
        int acumulador=0;        
        for(int i=0; i<this.indice; i++) {
            acumulador+=this.listaNumeros[i];            
        }
        double promedio = acumulador/(this.indice+1); //+1 fix por empezar en 0 el arreglo
        return promedio;
    }
}
