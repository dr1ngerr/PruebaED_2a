/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package instituto;

import java.time.LocalDate;
import java.time.Month;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

/**
 *
 * @author andreib
 */
public class PersonaTest {

    @BeforeEach
    public void setUp() {
        Persona persona = new Persona(12345678, "Andrei", 'M', 1, 1, 2004);
    }

    @Test
    public void PersonaTest() {
        Persona p1 = new Persona(12345678, "Andrei", 'M', 20, 6, 2000);
        Persona p2 = new Persona(12345679, "Andreea", 'F', 8, 2, 2003);
        Persona p3 = new Persona(12233445, "Mario", 'M', 1, 1, 2004);
        
        assertFalse(p1.equals(p2));
        assertFalse(p1.equals(p3));
    }

    /**
     * Test del metodo getEdad
     */
    @Test
    public void testGetEdad() {
        Persona p = new Persona();
        p.setNacimiento(LocalDate.of(2000, 1, 1));
        assertEquals(24, p.getEdad());
    }

    /**
     * Test del metodo equals
     */
    @Test
    public void testEquals() {
        Persona p1 = new Persona(12345678, "Andrei", 'M', 20, 6, 2000);
        Persona p2 = new Persona(12345679, "Andreea", 'F', 8, 2, 2003);
        Persona p3 = new Persona(12233445, "Mario", 'M', 1, 1, 2004);
        
        assertFalse(p1.equals(p2));
        assertFalse(p1.equals(p3));
    }

    /**
     * 
     */
    @Test
    public void testCompareTo() {
        Persona p1 = new Persona(12345678, "Andrei", 'M', 20, 6, 2000);
        Persona p2 = new Persona(12345679, "Andreea", 'F', 8, 2, 2003);
        Persona p3 = new Persona(12233445, "Mario", 'M', 1, 1, 2004);
        
        Persona persona1 = new Persona(12345678);
        Persona persona2 = new Persona(87654321);
        assertTrue(persona1.compareTo(persona2) < 0);
        
    }
    
    @Test
    public void testConstructorCompleto() {
        Persona p = new Persona(12345678, "Andrei", 'M', 1, 1, 2004);
        assertEquals(new Nif(12345678), p.getNif());
        assertEquals("Andrei", p.getNombre());
        assertEquals('M', p.getGenero());
        assertEquals(LocalDate.of(2004, 1, 1), p.getNacimiento());
    }
    
}
