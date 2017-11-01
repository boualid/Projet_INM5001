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
public class AssuranceHypothecaireTest {
    
    public AssuranceHypothecaireTest() {
    }

    /**
     * Test of assurancePretHypo method, of class AssuranceHypothecaire.
     */
    @Test
    public void testAssurancePretHypo() {
        System.out.println("assurancePretHypo");
        double pretHypo = 0.0;
        double valeurMaison = 1;
        double expResult = 0.0;
        double result = AssuranceHypothecaire.assurancePretHypo(pretHypo, valeurMaison);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testAssurancePretHypo80() {
        System.out.println("assurancePretHypo80");
        double pretHypo = 80.0;
        double valeurMaison = 100;
        double expResult = 0.0;
        double result = AssuranceHypothecaire.assurancePretHypo(pretHypo, valeurMaison);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testAssurancePretHypo85() {
        System.out.println("assurancePretHypo85");
        double pretHypo = 85;
        double valeurMaison = 100.0;
        double expResult = 85 * 1.80 / 100;
        double result = AssuranceHypothecaire.assurancePretHypo(pretHypo, valeurMaison);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testAssurancePretHypo87() {
        System.out.println("assurancePretHypo87");
        double pretHypo = 87;
        double valeurMaison = 100.0;
        double expResult = 87 * 2.40 / 100;
        double result = AssuranceHypothecaire.assurancePretHypo(pretHypo, valeurMaison);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testAssurancePretHypo95() {
        System.out.println("assurancePretHypo95");
        double pretHypo = 95;
        double valeurMaison = 100.0;
        double expResult = 95 * 3.15 / 100;
        double result = AssuranceHypothecaire.assurancePretHypo(pretHypo, valeurMaison);
        assertEquals(expResult, result, 0.0);
    }
    
}
