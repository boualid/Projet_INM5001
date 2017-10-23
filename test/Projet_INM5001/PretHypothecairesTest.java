/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projet_INM5001;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Leopold
 */
public class PretHypothecairesTest {
    
    public PretHypothecairesTest() {
    }
    
    
    /**
     * Test of calculePretHypothecaires method, of class PretHypothecaires.
     */
    @Test
    public void testCalculePretHypothecaires() {
        System.out.println("calculePretHypothecaires");
        double miseDeFonds = 0.0;
        double versementMensuel = 0.0;
        int ammortissement = 0;
        double revenuBrut = 0.0;
        double engagementFinancier = 0.0;
        double coutEnergie = 0.0;
        double fraisCopropriete = 0.0;
        
        double expResult = 0.0;
        double result = PretHypothecaires.calculePretHypothecaires(miseDeFonds,
                versementMensuel, ammortissement, revenuBrut, engagementFinancier,
                coutEnergie, fraisCopropriete);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testCalculePretHypothecaires1() {
        System.out.println("calculePretHypothecaires-1");
        double miseDeFonds = 35000;
        double versementMensuel = 750;
        int ammortissement = 60;
        double revenuBrut = 50000;
        double engagementFinancier = 600;
        double coutEnergie = 125;
        double fraisCopropriete = 0.0;
        
        double expResult = 69286.94;
        double result = PretHypothecaires.calculePretHypothecaires(miseDeFonds,
                versementMensuel, ammortissement, revenuBrut, engagementFinancier,
                coutEnergie, fraisCopropriete);
        assertEquals(expResult, result, 0.0);
        
    }
    @Test
    public void testCalculePretHypothecaires2() {
        System.out.println("calculePretHypothecaires-2");
        double miseDeFonds = 35000;
        double versementMensuel = 750;
        int ammortissement = 180;
        double revenuBrut = 50000;
        double engagementFinancier = 600;
        double coutEnergie = 125;
        double fraisCopropriete = 0.0;
        
        double expResult = 137860.82;
        double result = PretHypothecaires.calculePretHypothecaires(miseDeFonds,
                versementMensuel, ammortissement, revenuBrut, engagementFinancier,
                coutEnergie, fraisCopropriete);
        assertEquals(expResult, result, 0.0);
        
    }

    /**
     * Test of calculeTaxRevenu method, of class PretHypothecaires.
     */
    @Test
    public void testCalculeTaxRevenu() {
        System.out.println("calculeTaxRevenu : 0.0");
        double revenu = 0.0;
        double expResult = 15.5;
        double result = PretHypothecaires.calculeTaxRevenu(revenu);
        assertEquals(expResult, result, 0.0);
        
    }
    
    @Test
    public void testCalculeTaxRevenu25000() {
        System.out.println("calculeTaxRevenu : <25000");
        double revenu = 20000;
        double expResult = 15.5;
        double result = PretHypothecaires.calculeTaxRevenu(revenu);
        assertEquals(expResult, result, 0.0);
        
    }
    
    @Test
    public void testCalculeTaxRevenu40000() {
        System.out.println("calculeTaxRevenu : entre 2500 et 40000");
        double revenu = 30000;
        double expResult = 20.5;
        double result = PretHypothecaires.calculeTaxRevenu(revenu);
        assertEquals(expResult, result, 0.0);
        
    }
    
    @Test
    public void testCalculeTaxRevenu55000() {
        System.out.println("calculeTaxRevenu : entre 40000 et 55000");
        double revenu = 50000;
        double expResult = 27.5;
        double result = PretHypothecaires.calculeTaxRevenu(revenu);
        assertEquals(expResult, result, 0.0);
        
    }
    
    @Test
    public void testCalculeTaxRevenu75000() {
        System.out.println("calculeTaxRevenu : entre 55000 et 75000");
        double revenu = 70000;
        double expResult = 33.5;
        double result = PretHypothecaires.calculeTaxRevenu(revenu);
        assertEquals(expResult, result, 0.0);
        
    }
    
    @Test
    public void testCalculeTaxRevenu115000() {
        System.out.println("calculeTaxRevenu : entre 75000 et 115000");
        double revenu = 100000;
        double expResult = 39.5;
        double result = PretHypothecaires.calculeTaxRevenu(revenu);
        assertEquals(expResult, result, 0.0);
        
    }
    
    @Test
    public void testCalculeTaxRevenuPlus() {
        System.out.println("calculeTaxRevenu : > 115000");
        double revenu = 130000;
        double expResult = 44.5;
        double result = PretHypothecaires.calculeTaxRevenu(revenu);
        assertEquals(expResult, result, 0.0);
        
    }
    
}
