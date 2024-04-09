/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package instituto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author andreib
 */
public class CursoTest {
    

    /**
     * Test of getNombre method, of class Curso.
     */
    @Test
    public void testConstructor() {
        Curso c = new Curso("Programacion");
        Persona p1 = new Persona(12345678, "Andrei", 'M', 20, 6, 2000);
        Persona p2 = new Persona(12345679, "Andreea", 'F', 8, 2, 2003);
        
        c.aniadirAlumno(p1);
        c.aniadirAlumno(p2);

        p1.toString();
        p2.toString();
             
    }

    /**
     * Test of toString method, of class Curso.
     */
    @Test
    public void testNombre() {
        String nombre = "Programacion";
        Curso c = new Curso(nombre);
        assertEquals(nombre, c.getNombre());
    }
    }
