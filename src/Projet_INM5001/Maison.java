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
public class Maison {
    
     //Attributs
    ////////////    
    private double valeur = 0.0;
    private double taxMunicipScol = 0.0;
    private double coutEnerg = 0.0;
    private double fraisProp = 0.0;

     //Constructeurs
    ////////////////
    public Maison(double valeur, double taxMunicipScol, double coutEnerg,
            double fraisProp) {
        this.valeur = valeur;
        this.taxMunicipScol = taxMunicipScol;
        this.coutEnerg = coutEnerg;
        this.fraisProp = fraisProp;
    }
    
    public Maison() {
    }

     //Settrers & geters
    ////////////////////
    /**
     * Get the value of valeur
     *
     * @return the value of valeur
     */
    public double getValeur() {
        return valeur;
    }

    public double getTaxMunicipScol() {
        return taxMunicipScol;
    }

    public double getCoutEnerg() {
        return coutEnerg;
    }

    public double getFraisProp() {
        return fraisProp;
    }

    public void setValeur(double valeur) {
        this.valeur = valeur;
    }

    public void setTaxMunicipScol(double taxMunicipScol) {
        this.taxMunicipScol = taxMunicipScol;
    }

    public void setCoutEnerg(double coutEnerg) {
        this.coutEnerg = coutEnerg;
    }

    public void setFraisProp(double fraisProp) {
        this.fraisProp = fraisProp;
    }

     //Methodes
    ////////////
    @Override
    public String toString() {
        return "Maison{" + "valeur=" + valeur + ", taxMunicipScol=" + taxMunicipScol + 
                ", coutEnerg=" + coutEnerg + ", fraisProp=" + fraisProp + '}';
    }

}
