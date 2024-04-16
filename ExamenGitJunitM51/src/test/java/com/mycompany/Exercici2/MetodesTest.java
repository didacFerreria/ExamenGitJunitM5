/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.Exercici2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author rodri
 */
public class MetodesTest {
    
    public MetodesTest() {
    }
    
    /**
     * Test of existeixNom method, of class Metodes.
     */
    @Test
    public void testExisteixNom() {
        System.out.println("existeixNom");
        String[] llista = {"Manuel", "Paco"};
        String busqueda = "Paco";
        boolean expResult = true;
        boolean result = Metodes.existeixNom(llista, busqueda);
        assertEquals(expResult, result);
        
        System.out.println("existeixNom");
        String[] llista2 = {"Manuel", "Paco"};
        busqueda = "Jorge";
        expResult = false;
        result = Metodes.existeixNom(llista2, busqueda);
        assertEquals(expResult, result);
    }

    /**
     * Test of posicioArray method, of class Metodes.
     */
    @Test
    public void testPosicioArray() {
        System.out.println("posicioArray1");
        String[] llista = {"Manuel", "Paco"};
        String busqueda = "Paco";
        int expResult = 1;
        int result = Metodes.posicioArray(llista, busqueda);
        assertEquals(expResult, result);
        
        System.out.println("posicioArray2");
        String[] llista2 = {"Manuel", "Paco"};
        busqueda = "Jorge";
        expResult = -1;
        result = Metodes.posicioArray(llista2, busqueda);
        assertEquals(expResult, result);
    }
    
}
