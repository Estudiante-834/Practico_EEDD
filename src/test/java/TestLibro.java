package test.java;

import main.java.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestLibro {

	@Test
	void testConstructor() {
		Libro libro = new Libro("Caperucita Roja", "Charles Perrault", 1697);
		
		assertTrue(libro instanceof Libro);
		assertEquals("Caperucita Roja", libro.getTitulo());
		assertEquals("Charles Perrault", libro.getAutor());
		assertEquals(1697, libro.getAnioPublicacion());
	}

}
