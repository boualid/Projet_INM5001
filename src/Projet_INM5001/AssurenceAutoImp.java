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
        final double coefficientfixe = 1.33;
        double resultat = 0.0;
        double coefficientVoiture = 0.0;
        double coefficientDriver = 0.0;
        double coefficientType = 0.0;
        double coefficientVariable = 0.0;
        coefficientVoiture = AssurenceAutoImp.calculeCoefficientVoiture(marque, modele, annee, kilometrage);
        coefficientDriver = AssurenceAutoImp.calculeCoefficientDriver(sex, age, experience, dossier);
        coefficientType = AssurenceAutoImp.calculeCoefficientType(type);
        coefficientVariable = (((coefficientVoiture * 60) + (coefficientDriver * 20) + (coefficientType * 20)) / 100);

        resultat = coefficientVariable * coefficientfixe;

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

        resultat = (coefficientMarque + coefficientModele + coefficientAnnee + coefficientKilometrage);
        return resultat;
    }

    /**
     *
     * @param marque : marque de la voiture 
     * @return  un Coefficient pour la marque de la voiture
     */
    public static double xMarque(String marque) {
        double resultat = 0.0;
        switch (marque) {
            case "Lamburguini":
            case "mazarati":
                resultat = 22.00;
                break;
            case "Mercedes":
            case "Bmw":
            case "Audi":
            case "Porshe":
                resultat = 14.0;
                break;
            case "Gmc":
            case "Mazda":
            case "Honda":
            case "Toyota":
            case "Ford":
                resultat = 10.0;
                break;
            case "Camion":
                resultat = 13.00;
                break;
            case "Moto":
                resultat = 12.00;

        }
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
            case "huracan":
            case "aventador":
                resultat = 21.00;
                break;
            case "S600":
            case "X6":
            case "A7":
            case "Panamera":
            case "Boxter":
                resultat = 15.0;
                break;
            case "C250":
            case "X3":
            case "X4":
            case "A4":
            case "A3":
            case "Fiesta":
            case "Yaris":
            case "Corolla":
            case "Civic":
            case "Yokon":
            case "C3":
                resultat = 10.0;
                break;
            case "Cammionette":
                resultat = 11.00;
                break;
            case "Poid Lourd":
                resultat = 20.00;
                break;
            case "125cc":
                resultat = 13.00;
            case "50cc":
                resultat = 6.00;
        }
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

        if (agevoiture > 0 || agevoiture <= 1) {
            resultat = 1.0;
        } else if (agevoiture > 1 || agevoiture <= 3) {
            resultat = 0.85;
        } else if (agevoiture > 3 || agevoiture <= 5) {
            resultat = 0.65;
        } else if (agevoiture > 5 || agevoiture <= 8) {
            resultat = 0.55;
        } else if (agevoiture > 8 || agevoiture <= 10) {
            resultat = 0.45;
        } else if (agevoiture > 10) {
            resultat = 0.30;
        }
        return resultat;
    }

    /**
     *
     * @param kilometrage
     * @return
     */
    public static double xkilometrage(double kilometrage) {
        double resultat = 0.0;

        if (kilometrage > 0 || kilometrage <= 22000.00) {
            resultat = 1.0;
        } else if (kilometrage > 22000.00 || kilometrage <= 50000.00) {
            resultat = 0.85;
        } else if (kilometrage > 50000.00 || kilometrage <= 80000.00) {
            resultat = 0.70;
        } else if (kilometrage > 80000.00 || kilometrage <= 110000.00) {
            resultat = 0.60;
        } else if (kilometrage > 110000.00 || kilometrage <= 160000.00) {
            resultat = 0.53;
        } else if (kilometrage > 160000.00) {
            resultat = 0.45;
        }

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
                resultat = 7;
                break;
            case "female":
                resultat = 5;
                break;
        }
        return resultat;
    }

    /**
     *
     * @param age
     * @return
     */
    public static double xAge(int age) {
        double resultat = 0.0;
        if (age >= 25 || age <= 25) {
            resultat = 15.0;
        } else if (age > 25 || age <= 35) {
            resultat = 10;
        } else if (age > 30 || age <= 40) {
            resultat = 8;
        } else if (age > 40 || age <= 55) {
            resultat = 7;
        } else if (age > 55 || age <= 65) {
            resultat = 9;
        } else if (age > 65) {
            resultat = 11;
        }
        return resultat;
    }

    /**
     *
     * @param experience
     * @return
     */
    public static double xExperience(int experience) {
        double resultat = 0.0;
        if (experience >= 0 || experience <= 1) {
            resultat = 16.0;
        } else if (experience > 1 || experience <= 3) {
            resultat = 12;
        } else if (experience > 3 || experience <= 7) {
            resultat = 8;
        } else if (experience > 7 || experience <= 15) {
            resultat = 6;
        } else if (experience > 15) {
            resultat = 5;
        }
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
            case "Exellent":
                resultat = 3;
                break;
            case "Bon":
                resultat = 6;
                break;
            case "Moyenne":
                resultat = 10;
                break;
            case "Mauvais":
                resultat = 14;
                break;
            case "Tres Mauvais":
                resultat = 19;
                break;

        }
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
            case "Simple Base":
                resultat = 8;
                break;
            case "Simple TRisque":
                resultat = 13;
                break;
            case "Double Base":
                resultat = 13;
                break;
            case "Bouble TRisque":
                resultat = 19;
                break;
        }
        return resultat;
    }

}
