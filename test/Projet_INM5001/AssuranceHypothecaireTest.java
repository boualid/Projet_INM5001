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
        double expResult = 80.0 *1.25 / 100;
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
    @Test
    public void testAssurancePretHypoPlusDe95() {
        System.out.println("assurancePretHypoPlusDe95");
        double pretHypo = 96;
        double valeurMaison = 100.0;
        double expResult = 0.0;
        double result = AssuranceHypothecaire.assurancePretHypo(pretHypo, valeurMaison);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testAssurancePretHypoMoinsDe65() {
        System.out.println("assurancePretHypoMoinsDe65");
        double pretHypo = 60;
        double valeurMaison = 100.0;
        double expResult = 60 * 0.60 / 100;
        double result = AssuranceHypothecaire.assurancePretHypo(pretHypo, valeurMaison);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testAssurancePretHypo65() {
        System.out.println("assurancePretHypo65");
        double pretHypo = 65;
        double valeurMaison = 100.0;
        double expResult = 65 * 0.60 / 100;
        double result = AssuranceHypothecaire.assurancePretHypo(pretHypo, valeurMaison);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testAssurancePretHypo70() {
        System.out.println("assurancePretHypo70");
        double pretHypo = 70;
        double valeurMaison = 100.0;
        double expResult = 70 * 0.75 / 100;
        double result = AssuranceHypothecaire.assurancePretHypo(pretHypo, valeurMaison);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testAssurancePretHypo78() {
        System.out.println("assurancePretHypo78");
        double pretHypo = 78;
        double valeurMaison = 100.0;
        double expResult = 78 * 1.25 / 100;
        double result = AssuranceHypothecaire.assurancePretHypo(pretHypo, valeurMaison);
        assertEquals(expResult, result, 0.0);
    }
    
    /**
     * Test of assurancePretHypoObligatoire method, of class AssuranceHypothecaire.
     */
    @Test
    public void testAssurancePretHypoObligatoire() {
        System.out.println("assurancePretHypoObligatoire");
        double pretHypo = 0.0;
        double valeurMaison = 1.0;
        boolean expResult = false;
        boolean result = AssuranceHypothecaire.assurancePretHypoObligatoire(pretHypo, valeurMaison);
        assertEquals(expResult, result);
    }
    @Test
    public void testAssurancePretHypoObligatoire40() {
        System.out.println("assurancePretHypoObligatoire40");
        double pretHypo = 40.0;
        double valeurMaison = 100.0;
        boolean expResult = false;
        boolean result = AssuranceHypothecaire.assurancePretHypoObligatoire(pretHypo, valeurMaison);
        assertEquals(expResult, result);
    }
    @Test
    public void testAssurancePretHypoObligatoire80() {
        System.out.println("assurancePretHypoObligatoire80");
        double pretHypo = 80.0;
        double valeurMaison = 100.0;
        boolean expResult = false;
        boolean result = AssuranceHypothecaire.assurancePretHypoObligatoire(pretHypo, valeurMaison);
        assertEquals(expResult, result);
    }
    @Test
    public void testAssurancePretHypoObligatoire90() {
        System.out.println("assurancePretHypoObligatoire90");
        double pretHypo = 90.0;
        double valeurMaison = 100.0;
        boolean expResult = true;
        boolean result = AssuranceHypothecaire.assurancePretHypoObligatoire(pretHypo, valeurMaison);
        assertEquals(expResult, result);
    }

    /**
     * Test of mensualite method, of class AssuranceHypothecaire.
     */
    @Test
    public void testMensualite() {
        System.out.println("mensualite");
        double pret = 0.0;
        double interetAnnuel = 0.0;
        int amortissement = 0;
        double expResult = 0.0;
        double result = AssuranceHypothecaire.mensualite(pret, interetAnnuel, amortissement);
        assertEquals(expResult, result, 0.0);
    }
    @Test
    public void testMensualite1() {
        System.out.println("mensualite1");
        double pret = 100000.0;
        double interetAnnuel = 5.0 /100;
        int amortissement = 180;
        double expResult = 790.79;
        double result = AssuranceHypothecaire.mensualite(pret, interetAnnuel, amortissement);
        assertEquals(expResult, result, 0.01);
    }
    
}
