package main.java;

/**
 * Clase Libro
 * 
 * <p>Simula datos de libros en una biblioteca</p>
 * 
 * @author Carlos Fu
 * @version 1.0
 */
public class Libro {
	/**
	 * Valor String que representa "titulo del libro".
	 */
    private String titulo;
    
    /**
     * Valor String que representa "autor del libro".
     */
    private String autor;
    
    /**
     * Valor int que representa "año de publicación del libro".
     */
    private int anioPublicacion;

    
    /**
     * Constructor de la clase Libro
     * 
     * <p>Instancia objetos libro mediante el uso del constructor.</p>
     * 
     * @param titulo Titulo del libro, valor String.
     * @param autor Autor del libro, valor String.
     * @param anioPublicacion Año de publicación, valor int o entero.
     */
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Getter de la clase Libro. Retorna el autor de valor String.
     * 
     * @return Autor del libro, de tipo String.
     */
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Getter de la clase libro. Retorna el año de publicación de tipo int.
     * 
     * @return Retorna anioPublicacion, siendo un número entero. 
     */
    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
}
