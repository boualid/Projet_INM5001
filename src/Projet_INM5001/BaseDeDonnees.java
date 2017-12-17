/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projet_INM5001;

import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import oracle.jdbc.pool.OracleDataSource;

public class BaseDeDonnees {

    //Constantes
    /////////////
    // Database URL and credentials
    public static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:XE";
    public static final String USER = "inm5001";
    public static final String PASS = "mni1005";

    //Attributs statiques
    //////////////////////    
    private static Connection conn = null;
    private static Statement stmt = null;
    private static PreparedStatement preStmt = null;

    public static Connection obtConnexion() throws SQLException {

        if (conn == null) {
            OracleDataSource ds = new OracleDataSource();
            ds.setURL(DB_URL);
            conn = ds.getConnection(USER, PASS);
        }
        return conn;
    }

    public static void fermConnexion() {
        fermStatement(stmt);
        fermConnexion(conn);
    }

    public static void fermStatement(Statement stmt) {
        try {
            if (stmt != null) {
                stmt.close();
            }
        } catch (SQLException se) {
        }
    }

    public static void fermConnexion(Connection conn) {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException se) {
            se.printStackTrace();
        }
    }

    public static ResultSet requeteSelect(String reqSelect) throws SQLException {

        ResultSet resSet = null;

        obtConnexion();
        stmt = conn.createStatement();
        resSet = stmt.executeQuery(reqSelect);

        return resSet;
    }

    public static PreparedStatement requeteAutre(String reqSql) throws SQLException {

        obtConnexion();
        preStmt = conn.prepareStatement(reqSql);

        return preStmt;
    }

    protected static void requeteSelect() {
        try {
            conn = BaseDeDonnees.obtConnexion();
            //Mois
            String reqSqlMois = "select * from mois";
            preStmt = conn.prepareStatement(reqSqlMois);
            ResultSet rsMois = preStmt.executeQuery();
            while (rsMois.next()) {
                String mois = rsMois.getString("mois");
                AssuranceAuto.jComboMois.addItem(mois);
            }
            //État Matrimonial
            String reqSqlEtat = "select * from ETAT_MATRIMONIAL";
            preStmt = conn.prepareStatement(reqSqlEtat);
            ResultSet rsEtat = preStmt.executeQuery();
            while (rsEtat.next()) {
                String etat = rsEtat.getString("Etat");
                AssuranceAuto.jComboEtat.addItem(etat);
            }
            //nbr d'année en tant que conducteur principale
            String reqSqlConducteur = "select * from NBR_ANN_CONDUCTEUR";
            preStmt = conn.prepareStatement(reqSqlConducteur);
            ResultSet rscond = preStmt.executeQuery();
            while (rscond.next()) {
                String nbrAnnee = rscond.getString("NBRANNEE");
                AssuranceAuto.jCombonbrANN.addItem(nbrAnnee);
            }
            // Marque du Véhicule
            String reqSqlVehicule = "select * from MARQUE_VEHICULE";
            preStmt = conn.prepareStatement(reqSqlVehicule);
            ResultSet rsVehicule = preStmt.executeQuery();
            while (rsVehicule.next()) {
                String marqueVehicule = rsVehicule.getString("MARQUE");
                AssuranceAuto.jCombomarqueVehicule.addItem(marqueVehicule);
            }
            //Année du Véhicule
            String reqSqlModele = "select * from ANN_VOI_TURE";
            preStmt = conn.prepareStatement(reqSqlModele);
            ResultSet rsAnnee = preStmt.executeQuery();
            while (rsAnnee.next()) {
                String modeleAnnee = rsAnnee.getString("ANNEE");
                AssuranceAuto.jComboAnnVehi.addItem(modeleAnnee);
            }
            //modele du Dossier         
            String reqSqlDossier = "select * from dossier";
            preStmt = conn.prepareStatement(reqSqlDossier);
            ResultSet rsDossier = preStmt.executeQuery();
            while (rsDossier.next()) {
                String dossierV = rsDossier.getString("STATUS");
                AssuranceAuto.jComboDossier.addItem(dossierV);
            }

            //modele du Type Assurance         
            String reqSqlTypeAssurance = "select * from type_assurance";
            preStmt = conn.prepareStatement(reqSqlTypeAssurance);
            ResultSet rsAssurance = preStmt.executeQuery();
            while (rsAssurance.next()) {
                String assuranceV = rsAssurance.getString("ASSURANCE");
                AssuranceAuto.jComboTypeassurance.addItem(assuranceV);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {

        }
    }

    protected static void requeteSelectAmor() {

        try {
            conn = BaseDeDonnees.obtConnexion();
            //Mois
            String reqSqlAmor = "select * from AMORTISS";
            preStmt = conn.prepareStatement(reqSqlAmor);
            ResultSet rsAmor = preStmt.executeQuery();
            while (rsAmor.next()) {
                String amortissement = rsAmor.getString("DUREE");
                Interface.jComboBoxAmortissement.addItem(amortissement);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {

        }
    }

    public static ArrayList<String> requeteSelectModele(String modele) {
        ArrayList<String> list = new ArrayList();
        try {
            conn = BaseDeDonnees.obtConnexion();
            String reqSqlMode = " select distinct md.MODELE\n"
                    + " from MODELE_VEHICULE md , MARQUE_VEHICULE mq\n"
                    + " where md.ID_MA = mq.ID\n"
                    + " and mq.MARQUE = ? \n"
                    + " group by md.MODELE";
            preStmt = conn.prepareStatement(reqSqlMode);
            preStmt.setString(1, modele);
            ResultSet rsModele = preStmt.executeQuery();
            while (rsModele.next()) {
                list.add(rsModele.getString("MODELE"));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {

        }
        return list;
    }

}
