package Punto12.Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ignacio
 */
public class Libro {
    private String titulo;
    private Categoria catlibro;
    
    public Libro() {
    }

    public Libro(String titulo, Categoria catlibro) {
        this.titulo = titulo;
        this.catlibro = catlibro;
    }
    
    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the catlibro
     */
    public Categoria getCatlibro() {
        return catlibro;
    }

    /**
     * @param catlibro the catlibro to set
     */
    public void setCatlibro(Categoria catlibro) {
        this.catlibro = catlibro;
    }
    
}
