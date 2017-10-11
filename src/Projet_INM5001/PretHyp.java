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
public class PretHyp {
    
     //Attributs
    ////////////
    private double pret = 0.0;
    private double taux = 0.0;
    private double versm = 0.0;
    private int amortissm = 0;
    private String frequence = "";
    private ClientEventuel clientEv = null;
    private Maison maison = null;

     //Constructeurs
    ////////////////

    public PretHyp() {
    }
    
    public PretHyp(double pret, double taux, int amortissm, double versm,
            String frequence, Maison maison, ClientEventuel clientEv) {
        this.pret = pret;
        this.taux = taux;
        this.amortissm = amortissm;
        this.versm = versm;
        this.frequence = frequence;
        this.maison = maison;
        this.clientEv = clientEv;
    }
    
     //Settrers & geters
    ////////////////////
    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }

    public double getVersm() {
        return versm;
    }

    public void setVersm(double versm) {
        this.versm = versm;
    }

    public int getAmortissm() {
        return amortissm;
    }

    public void setAmortissm(int amortissm) {
        this.amortissm = amortissm;
    }

    public String getFrequence() {
        return frequence;
    }

    public void setFrequence(String frequence) {
        this.frequence = frequence;
    }
    
    /**
     * Get the value of pret
     *
     * @return the value of pret
     */
    public double getPret() {
        return pret;
    }

    /**
     * Set the value of pret
     *
     * @param pret new value of pret
     */ 
    public void setPret(double pret) {
        this.pret = pret;
    }

    public ClientEventuel getClientEv() {
        return clientEv;
    }

    public void setClientEv(ClientEventuel clientEv) {
        this.clientEv = clientEv;
    }

    public Maison getMaison() {
        return maison;
    }

    public void setMaison(Maison maison) {
        this.maison = maison;
    }

    @Override
    public String toString() {
        return "PretHyp{" + "pret=" + pret + ", taux=" + taux + ", versm=" + versm
                + ", amortissm=" + amortissm + ", frequence=" + frequence +
                ", clientEv=" + clientEv + ", maison=" + maison + '}';
    }

    
}
