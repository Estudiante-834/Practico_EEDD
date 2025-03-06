package main.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase Biblioteca
 * 
 * <p>Simula datos de una biblioteca.</p>
 * 
 * @author Carlos Fu
 * @version 1.0
 */
public class Biblioteca {
	/**
	 * Atributo privado que representa una lista de libros en una biblioteca.
	 * 
	 * <p>La lista contiene objetos de la clase {@link Libro}.
	 */
    private final List<Libro> libros;


    /**
     * Constructor de la clase {@link Biblioteca}.
     * 
     * <p>Instancia un objeto Biblioteca que contiene una {@link #ArrayList} vacía como atributo de objetos @{link Libro}.</p>
     */
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    /**
     * Constructor de la clase {@link Biblioteca}.
     * 
     * <p>Instancia un objeto Biblioteca aceptando una {@link #ArrayList} con objetos {@link Libro} como argumento.</p>
     */
    public Biblioteca(List<Libro> libros) {
        this.libros = libros;
    }

    // TODO: Testear este metodo.
    //  Test: Comprobar si se ha agregado
    public boolean agregarLibro(Libro libro) {
        return libros.add(libro);
    }

    // TODO: Testear este metodo.
    //  Test: comprobar si se ha eliminado
    public boolean eliminarLibro(Libro libro) {
        return libros.remove(libro);
    }

    /**
     * Getter de la clase Biblioteca.
     * 
     * <p>Retorna la lista de objetos {@link Libro} que tiene como atributo.</p>
     * 
     * @return Libros, lista con objetos {@link Libro}.
     */
    public List<Libro> getLibros() {
        return libros;
    }

    // TODO: Documentar este método.
    //  Test 01: buscar libro existente y comprobar que lo localiza.
    //  Test 02: buscar libro NO existente y comprobar que no lo localiza.
    public Libro encuentraLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    /**
     * @deprecated Método obsoleto.
     * 
     * @param autor Autor del libro tipo String.
     * @return Retorna objeto {@link Libro} por autor.
     */
    public Libro encuentaLibroPorAutor(String autor) {
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                return libro;
            }
        }
        return null;
    }

    // TODO: Testear este metodo.
    //  Test: Comprobar la lista de libros que devuelve para un autor existentes.
    //  Test: Comprobar la lista de libros que devuelve para un autor No existente
    /**
     * Método busca libros de un autor específico.
     * 
     * <p>Método reemplaza al método obsoleto {@link #encuentaLibroPorAutor(String)}.</p>
     * <p>El método devuelve una lista de libros por autor, 
     * en vez de un solo libro como el método antiguo.</p>
     * 
     * @vesion 2.0
     * @param autor Nombre del autor tipo String.
     * @return Retorna Lista de libros por autor.
     */
    public List<Libro> encuentraLibrosPorAutor(String autor) {
        List<Libro> listaLibros = null;
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                if (listaLibros == null) {
                    listaLibros = new ArrayList<>();
                }
                listaLibros.add(libro);
            }
        }
        return listaLibros;
    }
}