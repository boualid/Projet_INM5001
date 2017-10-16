/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projet_INM5001;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
    
     //Constantes
    /////////////
    
    // Database URL and credentials
   public  static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:XE";
   public static final String USER = "inm5001";
   public static final String PASS = "mni1005";
   
     //Attributs statiques
    //////////////////////    
    private static Connection conn = null;
    private static Statement stmt = null;
    private static PreparedStatement preStmt = null;
    
    public static Connection obtConnexion () throws SQLException {
        
        if (conn == null) {
            OracleDataSource ds = new OracleDataSource();
            ds.setURL(DB_URL);
            conn = ds.getConnection(USER,PASS);    
        }
        System.out.println("Connected database successfully...\n");//test connexion
        return conn;
    }

    public static void fermConnexion() {
        try{
            if(stmt != null)
                stmt.close();
        }catch(SQLException se){
        }
        try{
            if(conn != null)
                conn.close();
        }catch(SQLException se){
            se.printStackTrace();
        }
        System.out.println("\nClosed database successfully...");//test connexion fermée
    }

    public static ResultSet requeteSelect(String reqSelect) throws SQLException{
        
        ResultSet resSet = null;
        
        obtConnexion();
        stmt = conn.createStatement();
        resSet = stmt.executeQuery(reqSelect);
        
        return resSet;
    }
    
    public static PreparedStatement requeteAutre(String reqSql) throws SQLException{
        
        obtConnexion();
        preStmt = conn.prepareStatement(reqSql);
        
        return preStmt;
    }

}
