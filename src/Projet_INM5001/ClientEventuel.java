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
    private double EngagmFinance = 0.0;
    private double limitVersm = 0.0;

     //Constructeurs
    ////////////////
    
    public ClientEventuel() {
    }
    
    public ClientEventuel(double revAnnuel, double EngagmFinance,
            double limitVersm) {
        this.revAnnuel = revAnnuel;
        this.EngagmFinance = EngagmFinance;
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

    @Override
    public String toString() {
        return "ClientEventuel{" + "revAnnuel=" + revAnnuel + 
                ", EngagmFinance=" + EngagmFinance + ", limitVersm=" + limitVersm + '}';
    }

}
