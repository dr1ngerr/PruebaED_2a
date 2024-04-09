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
public class NifTest {

    /**
     * Test of equals method, of class Nif.
     */
    @Test
    public void testConstructorPorDefecto() {
        Nif nif = new Nif();
        assertNotNull(nif);
    }
    
    @Test
    public void testConstructorConNumero() {
        Nif nif = new Nif(12345678);
        assertNotNull(nif);
        assertEquals("12345678-S", nif.toString());
    

}
}
