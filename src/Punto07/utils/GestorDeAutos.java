package Punto07.utils;

import Punto07.modelo.Carro;

/**
 *
 * @author Rojas, Guido G.
 */
public class GestorDeAutos {
    private int indice;
    private int maximoAutos=5;
    private Carro listaCarros[] = new Carro[this.maximoAutos];
    
    public GestorDeAutos() {
        this.indice=0;
    }
    
    public Carro[] getListaCarros() {
        return listaCarros;
    }

    public void setListaCarros(Carro[] listaCarros) {
        this.listaCarros = listaCarros;
    }

    public int getIndice() { //Devuelve cuantos elementos tiene el arreglo
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public int getMaximoAutos() {
        return maximoAutos;
    }

    public void setMaximoAutos(int maximoAutos) {
        this.maximoAutos = maximoAutos;
    }  
    
    public boolean isFull(){ //Array esta lleno?
        return (this.indice == this.maximoAutos);
    }
    public void agregarCarro(Carro objCarro) {
        if(this.indice != maximoAutos) {
            this.listaCarros[this.indice] = objCarro;
            this.indice ++;            
        }
    }    
    public void insertarCarro(Carro objCarro, int posicion) {
        this.listaCarros[posicion] = objCarro;        
    }
    public Carro verCarro(int posicion) {
        return this.listaCarros[posicion];
    }
    public int buscarPatente(String patenteBuscada) { //Busca una patente, si la encuentra devuelve la posicion en la que se encuenta dentro del arreglo, caso contrario devuelve -1
        Carro objAux;
        int i=0;
        boolean bandera=false;
        while(i<this.indice && !bandera) {
            objAux = this.verCarro(i);
            if(objAux.getPatente().compareTo(patenteBuscada) == 0)
                bandera = true;
            i++;
        }        
        return (bandera) ? (i-1) : -1; //i-1 ya que sale del bucle con un valor aumentado.
    }
}
