/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projet_INM5001;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bwali
 */
public class Principale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Test methode requetSelect() BD
        String reqSelect = "select * from Amortissement";
        BaseDeDonnees.requeteSelect(reqSelect);
        /*try {
            while (resSet.next()) {
                int idAmort = resSet.getInt("idAmortissement");
                int dureeAmort = resSet.getInt("dureeAmortissement");
                System.out.println(idAmort + "\t" + dureeAmort);
            }
            // Fin test methode requetSelect()
        } catch (SQLException ex) {
            ex.printStackTrace();
        }*/

    }
    
}
