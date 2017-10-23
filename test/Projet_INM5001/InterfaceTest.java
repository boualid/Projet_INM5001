/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projet_INM5001;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Leopold
 */
public class InterfaceTest {
    
    Interface instance = null;
    
    public InterfaceTest() {
    }
    
    @Before
    public void setUp() {
        instance = new Interface();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of tryChnEnInt method, of class Interface.
     */
    @Test
    public void testTryChnEnInt() {
        System.out.println("tryChnEnInt : \"\"");
        String chaine = "";
        String msgErr = "";
        
        int expResult = 0;
        int result = instance.tryChnEnInt(chaine, msgErr);
        assertEquals(expResult, result);
    }
    @Test
    public void testTryChnEnInt855() {
        System.out.println("tryChnEnInt : \"855\"");
        String chaine = "855";
        String msgErr = "";
        
        int expResult = 855;
        int result = instance.tryChnEnInt(chaine, msgErr);
        assertEquals(expResult, result);
    }
    @Test
    public void testTryChnEnIntDix() {
        System.out.println("tryChnEnInt : \"dix\"");
        String chaine = "dix";
        String msgErr = "";
        
        int expResult = 0;
        int result = instance.tryChnEnInt(chaine, msgErr);
        assertEquals(expResult, result);
    }

    /**
     * Test of anChEnMoisChiff method, of class Interface.
     */
    @Test
    public void testAnChEnMoisChiff() {
        System.out.println("anChEnMoisChiff : \"\"");
        String anCh = "";

        int expResult = 0;
        int result = instance.anChEnMoisChiff(anCh);
        assertEquals(expResult, result);
    }
    @Test
    public void testAnChEnMoisChiff5ans() {
        System.out.println("anChEnMoisChiff : \"5 ans\"");
        String anCh = "5 ans";

        int expResult = 5*12;
        int result = instance.anChEnMoisChiff(anCh);
        assertEquals(expResult, result);
    }
    @Test
    public void testAnChEnMoisChiff15ans() {
        System.out.println("anChEnMoisChiff : \"15 ans\"");
        String anCh = "15 ans";

        int expResult = 15*12;
        int result = instance.anChEnMoisChiff(anCh);
        assertEquals(expResult, result);
    }
    @Test
    public void testAnChEnMoisChiffEsp() {
        System.out.println("anChEnMoisChiff : \" \"");
        String anCh = " ";

        int expResult = 0;
        int result = instance.anChEnMoisChiff(anCh);
        assertEquals(expResult, result);
    }
}
