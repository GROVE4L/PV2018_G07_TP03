package Punto12.modelo;

/**
 *
 * @author Rojas, Guido G.
 */
public class Libro {
    private String titulo;
    private String categoriaLibro;
    private String autor;

    public Libro(){        
    }
    public Libro(String titulo, String autor, String categoriaLibro) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoriaLibro = categoriaLibro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoriaLibro() {
        return categoriaLibro;
    }

    public void setCategoriaLibro(String categoriaLibro) {
        this.categoriaLibro = categoriaLibro;
    }      
}
