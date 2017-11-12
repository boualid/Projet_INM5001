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
    

    public static final double[] RATIO_PRET_VALEUR = {65, 75, 80, 85, 90, 95};
    public static final double[] TAUX_DE_PRIME = {0.60, 0.75, 1.25, 1.80, 2.40, 3.15};
    
    public static double assurancePretHypo(double pretHypo, double valeurMaison){
        double assurancePretHypo = 0.0;
        double ratioPretValeur = (pretHypo / valeurMaison) * 100;
        
        if (ratioPretValeur <= RATIO_PRET_VALEUR[0]) {
            assurancePretHypo = pretHypo * TAUX_DE_PRIME[0] / 100;
        } else {
            for (int i = 0; i <= 4; i++) {
                if (ratioPretValeur > RATIO_PRET_VALEUR[i]
                        && ratioPretValeur <= RATIO_PRET_VALEUR[i + 1]) {
                    assurancePretHypo = pretHypo * TAUX_DE_PRIME[i + 1] / 100;
                }
            }
        }
        return assurancePretHypo;
    }
    
    public static boolean assurancePretHypoObligatoire(double pretHypo, 
            double valeurMaison){
        return (pretHypo / valeurMaison) * 100 > 80;
    }
    
    public static double mensualite(double pret, double interetAnnuel, 
            int amortissement){
        double interetMensuel = interetAnnuel / 12;
        double denominateur = 1 - 1 / Math.pow(1 + interetMensuel, amortissement);
        if (denominateur != 0)
            return pret * interetMensuel / denominateur;
        else if (amortissement != 0)
            return  pret / amortissement;
        else
            return pret;
    }
}
