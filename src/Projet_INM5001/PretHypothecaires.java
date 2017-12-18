/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projet_INM5001;

public class PretHypothecaires {

    public static double tauxHypothecairesEnVigueur = 3.89;
    public static double taxRevenu = 15.5;
    public static double taxMunicipaleEtScolaire = 2800.00;
    public static double pretHypothecaires = 0.00;

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

        double revenuNet = 0.0;
        double tax = 0.0;
        double revenuNetMensuelle = 0.0;
        double percentage = 0.0;
        double chargesAnnuelle = 0.0;
        double taxaAplicable = 0.0;

        tauxGeneral = (tauxHypothecairesEnVigueur * 6.12);
        mesualiteNet = versementMensuel - ((versementMensuel * tauxGeneral) / 100);
        pretHypothecaires = (mesualiteNet * ammortissement);
        pretHypothecaires = (double) Math.round(pretHypothecaires * 100) / 100;
        taxaAplicable = PretHypothecaires.calculeTaxRevenu(revenuBrut);
        tax = (revenuBrut * taxaAplicable) / 100;
        chargesAnnuelle = (engagementFinancier + coutEnergie + fraisCopropriete) * 12;
        revenuNet = revenuBrut - (tax + chargesAnnuelle + taxMunicipaleEtScolaire);
        revenuNetMensuelle = revenuNet / 12;
        percentage = (revenuNetMensuelle * 40) / 100;
        if(percentage>=versementMensuel){
            resultat = pretHypothecaires + miseDeFonds;
        }
        return resultat;
    }

    public static double calculeversement(double revenuBrut, double engagementFinancier,
            double coutEnergie, double fraisCopropriete) {
        double taxaAplicable = 0.0;
        double tax = 0.0;
        double chargesAnnuelle = 0.0;
        double revenuNet = 0.0;
        double revenuNetMensuelle = 0.0;
        double resultat = 0.0;
        taxaAplicable = PretHypothecaires.calculeTaxRevenu(revenuBrut);
        tax = (revenuBrut * taxaAplicable) / 100;
        chargesAnnuelle = (engagementFinancier + coutEnergie + fraisCopropriete) * 12;
        revenuNet = revenuBrut - (tax + chargesAnnuelle + taxMunicipaleEtScolaire);
        revenuNetMensuelle = revenuNet / 12;
        resultat = (revenuNetMensuelle * 40) / 100;
        resultat = (double) Math.round(resultat * 100) / 100;
        System.out.println(resultat);
        return resultat;
    }

    /**
     *
     * @param revenu revenu brute annuelle du client
     * @return taxe applicable suivant marge salaire
     */
    public static double calculeTaxRevenu(double revenu) {
        double taxSurSalaire = 0.0;
        if (revenu < 25000) {
            taxSurSalaire = 15.5;
        } else if (25000 <= revenu && revenu <= 40000) {
            taxSurSalaire = 20.5;
        } else if (40000 < revenu && revenu <= 55000) {
            taxSurSalaire = 27.5;
        } else if (55000 < revenu && revenu <= 75000) {
            taxSurSalaire = 33.5;
        } //Erreur: changement 1150000 par 115000
        else if (75000 < revenu && revenu <= 115000) {
            taxSurSalaire = 39.5;
        } else {
            taxSurSalaire = 44.5;
        }
        return taxSurSalaire;
    }

}
