/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projet_INM5001;

/**
 *
 * @author naim
 */
public class PretHypothecaires {

    public static double tauxHypothecairesEnVigueur = 4.3;
    public static double taxRevenu = 15.5;
    public static double taxMunicipaleEtScolaire = 2800.00;

    /**
     *
     * @param miseDeFonds : montant utiliser comme mise de fonds pour l'achat de
     * la maison.
     * @param versementMensuel : montant du paiement mensuel maximal budgété
     * @param ammortissement : le nombre d'années nécessaire au remboursement
     * total du prêt hypothécaire.
     * @param revenuBrut : revenus bruts annuels avant impôts et déductions
     * @param engagementFinancier : total de paiements ou remboursements
     * mensuels pour cartes de crédit, prêts personnels, prêts auto (ou frais de
     * location d'auto) et marges de crédit.
     * @param coutEnergie : coût mensuel de chauffage et d'électricité de la
     * maison
     * @param fraisCopropriete : les frais de copropriété mensuels
     *
     * @return resultat : calcule du montant total du pretHypothecaires et de la
     * mise de fonds si le client et admmisible pour un pretHypothecaires.
     */
    public static double calculePretHypothecaires(double miseDeFonds, double versementMensuel, int ammortissement,
            double revenuBrut, double engagementFinancier, double coutEnergie, double fraisCopropriete) {

        double resultat = 0.0;
        double tauxGeneral = 0.0;
        double mesualiteNet = 0.0;
        double pretHypothecaires = 0.0;
        double revenuNet = 0.0;
        double tax = 0.0;
        double revenuNetMensuelle = 0.0;
        double percentage = 0.0;
        double chargesAnnuelle = 0.0;

        tauxGeneral = (tauxHypothecairesEnVigueur * 5) + 15.5 + 1.55;
        mesualiteNet = versementMensuel - ((versementMensuel * tauxGeneral) / 100);
        pretHypothecaires = (mesualiteNet * ammortissement * 12);

        tax = (revenuBrut * taxRevenu) / 100;
        chargesAnnuelle = (engagementFinancier + coutEnergie + fraisCopropriete) * 12;
        revenuNet = revenuBrut - (tax + chargesAnnuelle + taxMunicipaleEtScolaire);

        revenuNetMensuelle = revenuNet / 12;

        percentage = (revenuNetMensuelle * 40) / 100;

        if (percentage > versementMensuel) {
            resultat = pretHypothecaires + miseDeFonds;

        } else {
            resultat = 0.0;
        }

        return resultat;

    }

    /**
 *
 * @author Leopold
 */
    
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

    public PretHypothecaires() {
    }
    
    public PretHypothecaires(double pret, int amortissm, Maison maison, 
            ClientEventuel clientEv) {
        this.pret = pret;
        this.amortissm = amortissm;
        this.clientEv = clientEv;
        
        maison.setValeur( calculePretHypothecaires(clientEv.getMiseFonds(), 
                clientEv.getLimitVersm(), amortissm, clientEv.getRevAnnuel(), 
                clientEv.getEngagmFinance(), maison.getCoutEnerg(), maison
                .getFraisProp()) );
        if (maison.getValeur() > 0) {
            this.pret = maison.getValeur() - clientEv.getMiseFonds();
        }
        
        this.maison = maison;
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

     //Methodes
    ////////////
    public int anChnEnMois(String an){
        return Integer.parseInt(an.replace("ans", "").trim());
    }
    
    
    @Override
    public String toString() {
        return "PretHyp{" + "pret=" + pret + ", taux=" + taux + ", versm=" + versm
                + ", amortissm=" + amortissm + ", frequence=" + frequence +
                ", clientEv=" + clientEv + ", maison=" + maison + '}';
    }

    
}
