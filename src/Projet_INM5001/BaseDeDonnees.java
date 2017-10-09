/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projet_INM5001;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import oracle.jdbc.pool.OracleDataSource;

/**
 *
 * @author Leopold
 */
public class BaseDeDonnees {
    
    // Database URL and credentials
   static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:XE";
   static final String USER = "inm5001";
   static final String PASS = "mni1005";
   

    private static Connection obtConnexion () throws SQLException {
        
        OracleDataSource ds = new OracleDataSource();
        ds.setURL(DB_URL);
        Connection conn = ds.getConnection(USER,PASS);
        System.out.println("Connected database successfully...");//test connexion
        return conn;
    }
    
    public static ResultSet requeteSelect(String reqSelect) {
        
        Connection conn = null;
        Statement stmt = null;
        ResultSet resSet = null;
        
       try {
         conn = obtConnexion();
         stmt = conn.createStatement();
         resSet = stmt.executeQuery(reqSelect);
         //Test début
         System.out.println("Resultat requête");
         System.out.println(resSet.next());
         while (resSet.next()) {System.out.println("Resultat requête");
                int idAmort = resSet.getInt("idAmortissement");
                int dureeAmort = resSet.getInt("dureeAmortissement");
                System.out.println(idAmort + "\t" + dureeAmort);
         }
         //Fin tst
       } catch (SQLException ex) {
           ex.printStackTrace();
       } finally {
            //finally block used to close resources
            try{
                if(stmt!=null)
                    conn.close();
            }catch(SQLException se){
            }
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }//end try
        return resSet;
    }
    
}
