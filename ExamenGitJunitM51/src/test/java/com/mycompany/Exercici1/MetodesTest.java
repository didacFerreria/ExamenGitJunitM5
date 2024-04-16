/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.Exercici1;

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
     * Test of introduirEuros method, of class Metodes.
     */

    /**
     * Test of introduirMoneda method, of class Metodes.
     */
    
    /**
     * Test of canviarMoneda method, of class Metodes.
     */
    @Test
    public void testCanviarMoneda() {
        System.out.println("canviarMoneda");
        String moneda = "lliures";
        double euros = 1.0;
        double expResult = 0.839;
        double result = Metodes.canviarMoneda(moneda, euros);
        assertEquals(expResult, result);
    }

}
