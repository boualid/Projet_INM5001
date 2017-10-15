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
public class ClientEventuel {
    
    //Attributs
    ////////////
    private double revAnnuel = 0.0;
    private double engagmFinance = 0.0;
    private double miseFonds = 0.0;
    private double limitVersm = 0.0;

     //Constructeurs
    ////////////////
    
    public ClientEventuel() {
    }
    
    public ClientEventuel(double revAnnuel, double engagmFinance,double miseFonds,
            double limitVersm) {
        this.revAnnuel = revAnnuel;
        this.engagmFinance = engagmFinance;
        this.miseFonds = miseFonds;
        this.limitVersm = limitVersm;
    }

     //Settrers & geters
    ////////////////////
    /**
     * Get the value of revAnnuel
     *
     * @return the value of revAnnuel
     */
    public double getRevAnnuel() {
        return revAnnuel;
    }

    /**
     * Set the value of revAnnuel
     *
     * @param revAnnuel new value of revAnnuel
     */
    public void setRevAnnuel(double revAnnuel) {
        this.revAnnuel = revAnnuel;
    }

    public double getEngagmFinance() {
        return engagmFinance;
    }

    public void setEngagmFinance(double engagmFinance) {
        this.engagmFinance = engagmFinance;
    }

    public double getMiseFonds() {
        return miseFonds;
    }

    public void setMiseFonds(double miseFonds) {
        this.miseFonds = miseFonds;
    }

    public double getLimitVersm() {
        return limitVersm;
    }

    public void setLimitVersm(double limitVersm) {
        this.limitVersm = limitVersm;
    }

     //Methodes
    ////////////
    @Override
    public String toString() {
        return "ClientEventuel{" + "revAnnuel=" + revAnnuel 
                + ", engagmFinance=" + engagmFinance + ", miseFonds=" + miseFonds 
                + ", limitVersm=" + limitVersm + '}';
    }

    

}
