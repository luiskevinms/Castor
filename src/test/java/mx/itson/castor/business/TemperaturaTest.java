/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package mx.itson.castor.business;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alumnog
 */
public class TemperaturaTest {
    
    public TemperaturaTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
   

    /**
     * Test of convertirGrados method, of class Temperatura.
     */
    @org.junit.jupiter.api.Test
    public void testConvertirGrados() {
        //Nombre y descripcion del caso de prueba
        System.out.println("convertirGrados");
        // Input (datos de entrada)
        double centigrados = 25;
        //Expected result (resultado esperado)
        double expResult = 77;
        
        //Actual result (Resultado obtenido)
        double result = Temperatura.convertirGrados(centigrados);
        
        //Ejecucion de la prueba
        assertEquals(expResult, result, 0.5);
        
    }

    /**
     * Test of calcularPerimetro method, of class Temperatura.
     */
    @Test
    public void testCalcularPerimetro() {
        System.out.println("calcularPerimetro");
        int lado = 5;
        int expResult = 20;
        int result = Temperatura.calcularPerimetro(lado);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
