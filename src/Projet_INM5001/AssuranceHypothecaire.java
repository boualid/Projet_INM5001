/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projet_INM5001;

/**
 *
 * @author Leopold
 */
public class AssuranceHypothecaire {
    

        public static final double[] RATIO_PRET_VALEUR = {80, 85, 90, 95};

    public static final double[] TAUX_DE_PRIME = {1.80, 2.40, 3.15};

    public static double assurancePretHypo(double pretHypo, double valeurMaison){
        double assurancePretHypo = 0.0;
        double ratioPretValeur = 100 * (pretHypo / valeurMaison);
        
        for (int i = 0; i < 3; i++) {
            if (ratioPretValeur > RATIO_PRET_VALEUR[i]
                    && ratioPretValeur <= RATIO_PRET_VALEUR[i + 1]) {
                     assurancePretHypo = pretHypo * TAUX_DE_PRIME[i] / 100;
            }
        }
        return assurancePretHypo;
    }
    
}
