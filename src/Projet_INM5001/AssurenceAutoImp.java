/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projet_INM5001;

/**
 *
 * @author naim ouakaf
 */
public class AssurenceAutoImp {

    /**
     *
     * @param marque : marque de la voiture.
     * @param modele : modele de la voiture.
     * @param annee : annee de la voiture.
     * @param kilometrage : kilometrage de la voiture.
     * @param sex : sex du conducteur.
     * @param age : age conducteur.
     * @param experience : experience de conduite de conducteur.
     * @param dossier : dossier au pres de la saaq du conducteur.
     * @param type : type d'assurence
     * @return montant a payer par le client.
     */
    public static double calculeAssurenceAuto(String marque, String modele, int annee, int kilometrage,
            String sex, int age, int experience, String dossier, String type) {

        double resultat = 0.0;
        double coefficientVoiture = 0.0;
        double coefficientDriver = 0.0;
        double coefficientType = 0.0;

        coefficientVoiture = AssurenceAutoImp.calculeCoefficientVoiture(marque, modele, annee, kilometrage);
        coefficientDriver = AssurenceAutoImp.calculeCoefficientDriver(sex, age, experience, dossier);
        coefficientType = AssurenceAutoImp.calculeCoefficientType(type);
        resultat = (((coefficientVoiture) + (coefficientDriver)) * (coefficientType));

        resultat = resultat = (double) Math.round(resultat * 100) / 100;
        System.out.println("le resultat finale est :" + resultat + "$");
        return resultat;
    }

    /**
     *
     * @param marque : marque de la voiture
     * @param modele : modele de la voiture.
     * @param annee : annee de la voiture.
     * @param kilometrage : kilometrage de la voiture.
     * @return un Coefficient pour la Voiture.
     */
    public static double calculeCoefficientVoiture(String marque, String modele, int annee, int kilometrage) {
        double resultat = 0.0;
        double coefficientMarque = 0.0;
        double coefficientModele = 0.0;
        double coefficientAnnee = 0.0;
        double coefficientKilometrage = 0.0;

        coefficientMarque = AssurenceAutoImp.xMarque(marque);
        coefficientModele = AssurenceAutoImp.xModele(modele);
        coefficientAnnee = AssurenceAutoImp.xAnnee(annee);
        coefficientKilometrage = AssurenceAutoImp.xkilometrage(kilometrage);

        resultat = (((coefficientMarque + coefficientModele) * coefficientAnnee) * coefficientKilometrage);
        resultat = resultat = (double) Math.round(resultat * 100) / 100;
        System.out.println("le resultat Coefficient Voiture est :" + resultat + "$");
        return resultat;
    }

    /**
     *
     * @param marque : marque de la voiture
     * @return un Coefficient pour la marque de la voiture
     */
    public static double xMarque(String marque) {
        double resultat = 0.0;
        switch (marque) {
            case "lamburguini":
            case "mazarati":
            case "bugatti":
                resultat = 640.00;
                break;
                
            case "mercedes":
            case "bmw":
            case "audi":
            case "porshe":
                resultat = 380.0;
                break;
                
            case "mazda":
            case "honda":
            case "toyota":
            case "ford":
                resultat = 120.0;
                break;
                
            case "camion":
                resultat = 330.00;
                break;
                
            case "moto":
                resultat = 110.00;

        }
        System.out.println("le resultat Coefficient marque est :" + resultat + "$");
        return resultat;
    }

    /**
     *
     * @param modele de la voiture
     * @return Coefficient model du voiture.
     */
    public static double xModele(String modele) {
        double resultat = 0.0;
        switch (modele) {
            case "aventador":
            case "quattroporte":
            case "veyron":
                resultat = 420.00;
                break;
                
            case "s600":
            case "x6":
            case "a7":
            case "panamera":
            
                resultat = 440.0;
                break;
                
            case "c250":
            case "x3":
            case "a3":
            case "fiesta":
            case "yaris":
            case "corolla":
            case "civic":
            case "mazda3":               
                resultat = 120.0;
                break;
                
            case "cammionette":               
                resultat = 210.00;
                break;
                
            case "poid Lourd":                
                resultat = 500.00;
                break;
                
            case "125cc":
                resultat = 130.00;
                break;
                
            case "50cc":
                resultat = 90.00;
        }
        System.out.println("le resultat Coefficient Modele est :" + resultat + "$");
        return resultat;
    }

    /**
     *
     * @param annee
     * @return
     */
    public static double xAnnee(double annee) {
        double resultat = 0.0;
        double agevoiture = 2018 - annee;
        System.out.println("anne voiture :" + agevoiture);
        if (agevoiture > 0 && agevoiture <= 1) {
            resultat = 1.0;
        } else if (agevoiture > 1 && agevoiture <= 3) {
            resultat = 0.95;
        } else if (agevoiture > 3 && agevoiture <= 5) {
            resultat = 0.90;
        } else if (agevoiture > 5 && agevoiture <= 8) {
            resultat = 0.83;
        } else if (agevoiture > 8 && agevoiture <= 10) {
            resultat = 0.79;
        } else if (agevoiture > 10) {
            resultat = 0.66;
        }
        System.out.println("le resultat Coefficient Annee est :" + resultat + "$");
        return resultat;
    }

    /**
     *
     * @param kilometrage
     * @return
     */
    public static double xkilometrage(double kilometrage) {
        double resultat = 0.0;

        if (kilometrage > 0 && kilometrage <= 22000.00) {
            resultat = 1.0;
        } else if (kilometrage > 22000.00 && kilometrage <= 50000.00) {
            resultat = 0.95;
        } else if (kilometrage > 50000.00 && kilometrage <= 80000.00) {
            resultat = 0.92;
        } else if (kilometrage > 80000.00 && kilometrage <= 110000.00) {
            resultat = 0.83;
        } else if (kilometrage > 110000.00 && kilometrage <= 160000.00) {
            resultat = 0.73;
        } else if (kilometrage > 160000.00) {
            resultat = 0.75;
        }
        System.out.println("le resultat Coefficient Kilometrage est :" + resultat + "$");
        return resultat;
    }

    /**
     *
     * @param sex
     * @param age
     * @param experience
     * @param dossier
     * @return
     */
    public static double calculeCoefficientDriver(String sex, int age, int experience, String dossier) {
        double resultat = 0.0;
        double coefficientsex = 0.0;
        double coefficientage = 0.0;
        double coefficientexperience = 0.0;
        double coefficientdossier = 0.0;

        coefficientsex = AssurenceAutoImp.xSex(sex);
        coefficientage = AssurenceAutoImp.xAge(age);
        coefficientexperience = AssurenceAutoImp.xExperience(experience);
        coefficientdossier = AssurenceAutoImp.xDossier(dossier);

        resultat = (coefficientsex + coefficientage + coefficientexperience + coefficientdossier);
        resultat = resultat = (double) Math.round(resultat * 100) / 100;
        System.out.println("le resultat Coefficient Driver est :" + resultat + "$");
        return resultat;
    }

    /**
     *
     * @param sex
     * @return
     */
    public static double xSex(String sex) {
        double resultat = 0.0;
        switch (sex) {
            case "male":
                resultat = 10;
                break;
            case "female":
                resultat = 7;
                break;
        }
        System.out.println("le resultat Coefficient Sex est :" + resultat + "$");
        return resultat;
    }

    /**
     *
     * @param age
     * @return
     */
    public static double xAge(int age) {
        double resultat = 0.0;
        //if (age >= 25 && age <= 25) {
        if (age >= 15 && age <= 25) {
            resultat = 19.0;
        } else if (age > 25 && age <= 35) {
            resultat = 15;
        //} else if (age > 30 && age <= 40) {
        } else if (age > 35 && age <= 45) {
            resultat = 12;
        //} else if (age > 40 && age <= 55) {
        } else if (age > 45 && age <= 55) {
            resultat = 10;
        } else if (age > 55 && age <= 65) {
            resultat = 9;
        } else if (age > 65) {
            resultat = 13;
        } else {
            resultat = 0;
        }
        System.out.println("le resultat Coefficient Age est :" + resultat + "$");
        return resultat;
    }

    /**
     *
     * @param experience
     * @return
     */
    public static double xExperience(int experience) {
        double resultat = 0.0;
        if (experience >= 0 && experience <= 1) {
            resultat = 20.0;
        } else if (experience > 1 && experience <= 3) {
            resultat = 17.00;
        } else if (experience > 3 && experience <= 7) {
            resultat = 15.00;
        } else if (experience > 7 && experience <= 15) {
            resultat = 12.00;
        } else if (experience > 15) {
            resultat = 10.00;
        }
        System.out.println("le resultat Coefficient Experience est :" + resultat + "$");
        return resultat;
    }
    
    //Surcharge de la méthode de la méthode ci-dessus avec une chaine en param
    public static double xExperience(String experience) {
        double resultat = 0.0;
        if (experience.equalsIgnoreCase("Moins de 1 an")) {
            resultat = 20.0;
        } else if (experience.equalsIgnoreCase("Entre 1 et 2 ans")
                || experience.equalsIgnoreCase("Entre 2 et 3 ans")) {
            resultat = 17.00;
        } else if (experience.equalsIgnoreCase("Entre 3 et 4 ans")
                || experience.equalsIgnoreCase("Entre 4 et 5 ans")
                || experience.equalsIgnoreCase("5 ans et plus")) {
            resultat = 15.00;
        }  else if (experience.equalsIgnoreCase("N est pas conducteur principale actuellement")) {
            resultat = 20.00;
        } else {
            resultat = 10.00;
        }
            
        System.out.println("le resultat Coefficient Experience est :" + resultat + "$");
        return resultat;
    }

    /**
     *
     * @param experience
     * @return
     */
    public static double xDossier(String dossier) {
        double resultat = 0.0;
        switch (dossier) {
            case "excellent":
                resultat = 6;
                break;
            case "bon":
                resultat = 11;
                break;
            case "moyenne":
            case "moyen":
                resultat = 19;
                break;
            case "mauvais":
                resultat = 46;
                break;
            case "tres Mauvais":
            case "grave":
                resultat = 62;
                break;

        }
        System.out.println("le resultat Coefficient Dossier est :" + resultat + "$");
        return resultat;
    }

    /**
     *
     * @param type
     * @return
     */
    public static double calculeCoefficientType(String type) {
        double resultat = 0.0;
        switch (type) {
            case "simple base":
            case "assurance simple":
                resultat = 0.16;
                break;
            case "simple tr":
            case "assurance simple tous risque":
                resultat = 0.24;
                break;
            case "double base":
            case "assurance double":
                resultat = 0.27;
                break;
            case "double tr":
            case "assurance double tous risque":
                resultat = 0.35;
                break;
        }
        System.out.println("le resultat Coefficient Type est :" + resultat + "$");
        return resultat;
    }

}
