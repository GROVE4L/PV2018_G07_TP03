package Punto09;

/**
 *
 * @author Rojas, Guido G.
 */
public class Libro {    
    //Atributos
    private String titulo;
    private String autor;
    
    //Definicion de Constructores. // Sobrecarga de metodos(Mismo nombre de metodos con distintos parametros) \\
    public Libro(){        
    }    
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    
    //Definicion de Metodos.
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }    
    
}
