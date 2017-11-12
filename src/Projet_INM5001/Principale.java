/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projet_INM5001;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
    public static void main(String args[]) {
        //AssurenceAutoImp.calculeAssurenceAuto("honda", "civic", 2002, 160000, "male", 45, 18, "bon", "simple base");
        
        
          /**
     * @param args the command line arguments
     */
  
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfacePrinciple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfacePrinciple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfacePrinciple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfacePrinciple.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfacePrinciple().setVisible(true);
            }
        });
  
    /*
        //Test début methode pour un "select" table Amortissement de la BD
        requeteSelectAmortssm();
        //Fin test
        
        //Test début methode pour un "insert" table Amortissement de la BD
        String reqSSql = "INSERT INTO Amortissement "
                + "(idAmortissement, dureeAmortissement)"
                + "VALUES (seq_amort.nextval, ?)";
        //System.out.println(requeteInserAmortssm(reqSSql, 24));
        //System.out.println(requeteInserAmortssm(reqSSql, 36));
        //System.out.println(requeteInserAmortssm(reqSSql, 48));
        //System.out.println(requeteInserAmortssm(reqSSql, 60));
        //Fin test
    }

            public static ArrayList<String> requeteSelectAmortssm() {
        
        String reqSelect = "select * from Amortissement";
        ArrayList<String> tab = new ArrayList<>();
        ResultSet resSet = null;
        
       try {
         resSet = BaseDeDonnees.requeteSelect(reqSelect);
         
         System.out.println("Resultat requête");
        System.out.printf("%-20s\t%-20s\n", "idAmortissement","dureeAmortissement");
         while (resSet.next()) {
                int idAmort = resSet.getInt("idAmortissement");
                String dureeAmort = resSet.getString("dureeAmortissement");
                System.out.printf("%-20d\t%-20s\n", idAmort, dureeAmort);
                
                tab.add(dureeAmort);
         }
         
       } catch (SQLException ex) {
           ex.printStackTrace();
       } finally {
            BaseDeDonnees.fermConnexion();
        }
       return tab;
    }

    
    public static int requeteInserAmortssm(String reqSql, int nbMois) {
        int nbLignes = 0;
        PreparedStatement preStmt = null;
        Connection conn = null;
        
        try {
            conn = BaseDeDonnees.obtConnexion();
            conn.setAutoCommit(false);
            
            preStmt = conn.prepareStatement(reqSql);
            preStmt.setInt(1, nbMois);
            
            nbLignes = preStmt.executeUpdate();
            conn.commit();
        } catch (SQLException ex) {
            ex.printStackTrace();
            if (conn != null) {
                try {
                    System.err.print("Annulation de la transaction (rolled back)");
                    conn.rollback();
                } catch(SQLException excep) {
                    ex.printStackTrace();
                }//fin try-catch (Roll-back)
            }
        } finally {
            BaseDeDonnees.fermStatement(preStmt);
            try {
                conn.setAutoCommit(true);
            } catch (SQLException ex) {
            }
            BaseDeDonnees.fermConnexion(conn);
        }//fin try-catch-finally
        
        return nbLignes;
    }
*/
 }    
}
