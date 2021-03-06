/**
 * Interface prêt, Assurance hypothécaire 
 */
package Projet_INM5001;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.KeyStroke;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.ColorUIResource;


public class Interface extends javax.swing.JFrame {

    /**
     * *********************
     * CONSTANTES 
     ***********************
     */
    private static final String MSG_ERR_REVBRUT = "Entrer un montant positif "
            + "dans le champ « Revenus Bruts ».";
    private static final String MSG_ERR_ENG = "Entrer un montant positif dans le"
            + " champ « Engagements financiers ».";
    private static final String MSG_ERR_MISEDEFOND = "Entrer un montant positif "
            + "dans le champ « Mise de fonds ».";
    private static final String MSG_ERR_VERSMENSUEL = "Entrer un montant positif"
            + " dans le champ «Limiter vos versements mensuels. ";
    private static final String MSG_ERR_TAXEMUNICIPALE = "Entrer un montant "
            + "positif dans le champ « Taxes municipales et scolaires ».";
    private static final String MSG_ERR_COUTENERGIE = "Entrer un montant positif "
            + "dans le champ « Coûts d'énergie ».";
    private static final String MSG_ERR_FRAIS_PROP = "Entrer un montant dans le "
            + "champ « Frais de copropriété ».";
    private static final String MSG_ALERTE_MISE_FONDS = "Une mise de fonds  de "
            + "5% du prix de la maison est exigée !";
    private static final String MSG_INFO_ASS_HYPO_OBL = "Une assurance hypothécaire"
            + " (SCHL/Genworth) est obligatoire pour ce prêt";
    private static final String MSG_INFO_ASS_HYPO_OPT = "Une assurance hypothécaire"
            + " (SCHL/Genworth) est optionnelle. Désirez-vous cette assurance";
    private static final String MSG_INFO_NON_ADMISSIBLE = "Vous n'êtes pas "
            + "admissible pour un prêt: 40% de vos dépenses mensuelles fixes "
            + "dépasse votre limite de versement mensuel";
    //Données perso
    double revBruts, miseFonds, engagm, limitVersement;
    //Infos de la maison
    double taxMunicipalesScol, coutEnerg, fraisProprio, valeurMaison;
    //Infos du prêt
    int amort;
    double montantPret;
    double montantAssuranceHypo;


    /**
     * Creates new form Interface
     */
    public Interface() {
        initComponents();
        BaseDeDonnees.requeteSelectAmor();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
                new Interface().setVisible(true);
            }
        });
    }
    /**
     * Cette méthode permet de reconfigure la couleur 
     * et insérer le message d'erreur dans la fenêtre  de popup.
     * @param msg
     * @param titre
     * @param msgType 
     */
    public void msg_erreur(String msg, String titre, int msgType) {
        JFrame frame = new JFrame();
        UIManager.put("OptionPane.messageForeground", Color.RED);
        UIManager.put("OptionPane.background", new ColorUIResource(241, 240, 240));
        UIManager.getLookAndFeelDefaults().put("Panel.background",
                new ColorUIResource(241, 240, 240));

        UIManager.put("Button.background", new ColorUIResource(241, 240, 240));
        UIManager.put("Button.foreground", new ColorUIResource(241, 240, 240));

        JOptionPane.showMessageDialog(frame, msg, titre, msgType);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        JprêtHypothécaire = new javax.swing.JLabel();
        jdonnéesperso = new javax.swing.JLabel();
        jRevenusbruts = new javax.swing.JLabel();
        jTRevenusbruts = new javax.swing.JTextField();
        jParan = new javax.swing.JLabel();
        jMisedefonds = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTEngagements = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTMisedefonds = new javax.swing.JTextField();
        jCoui = new javax.swing.JCheckBox();
        jCnom = new javax.swing.JCheckBox();
        jTMois1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxAmortissement = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        ButCalculer = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTTaxesmunicipales = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTMois2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTMois3 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        ButEffacer = new javax.swing.JButton();
        Messages = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTValeurmaximale = new javax.swing.JTextField();
        JTprêtHypothécaire = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabelAssuranceHypo = new javax.swing.JLabel();
        jTAssuranceHypothecaire = new javax.swing.JTextField();
        jLabelMontantPrime = new javax.swing.JLabel();
        jLabelMensuelAvecAss = new javax.swing.JLabel();
        jTMensualiteAvecAssHypo = new javax.swing.JTextField();
        jTMensualiteSansAssHypo = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jButtonPagePrincipale = new javax.swing.JButton();
        jButtonPagePrincipale1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Prêt Hypothécaires");

        jPanel1.setBackground(new java.awt.Color(241, 240, 240));

        JprêtHypothécaire.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JprêtHypothécaire.setForeground(java.awt.Color.darkGray);
        JprêtHypothécaire.setText("Calcul Prêt Hypothécaire");

        jdonnéesperso.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jdonnéesperso.setForeground(java.awt.Color.gray);
        jdonnéesperso.setText("Entrer vos données personnelles");

        jRevenusbruts.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jRevenusbruts.setForeground(java.awt.Color.gray);
        jRevenusbruts.setText("* Revenus bruts ($) :");

        jTRevenusbruts.setForeground(java.awt.Color.darkGray);
        jTRevenusbruts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTRevenusbrutsActionPerformed(evt);
            }
        });

        jParan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jParan.setForeground(java.awt.Color.gray);
        jParan.setText("par an");

        jMisedefonds.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jMisedefonds.setForeground(java.awt.Color.gray);
        jMisedefonds.setText("* Mise de fonds ($) :");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(java.awt.Color.gray);
        jLabel1.setText("* Engagements financiers ($) :");

        jTEngagements.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTEngagementsActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(java.awt.Color.gray);
        jLabel2.setText("par mois");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(java.awt.Color.gray);
        jLabel3.setText("* Limiter vos versements mensuels ($):");

        jTMisedefonds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTMisedefondsActionPerformed(evt);
            }
        });

        jCoui.setBackground(new java.awt.Color(241, 240, 240));
        jCoui.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCoui.setForeground(java.awt.Color.gray);
        jCoui.setText("Oui");
        jCoui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCouiActionPerformed(evt);
            }
        });

        jCnom.setBackground(new java.awt.Color(241, 240, 240));
        jCnom.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCnom.setForeground(java.awt.Color.gray);
        jCnom.setText("Non");
        jCnom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCnomActionPerformed(evt);
            }
        });

        jTMois1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTMois1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(java.awt.Color.gray);
        jLabel4.setText("par mois");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(java.awt.Color.gray);
        jLabel5.setText("Ajouter les frais fixes de la future maison (approximatifs)");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(java.awt.Color.gray);
        jLabel6.setText("* Type de prêt et terme : ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(java.awt.Color.gray);
        jLabel7.setText("* Amortissement:");

        jComboBoxAmortissement.setEditable(true);
        jComboBoxAmortissement.setForeground(java.awt.Color.gray);
        jComboBoxAmortissement.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sélectionner" }));
        jComboBoxAmortissement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAmortissementActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(java.awt.Color.gray);
        jLabel8.setText("* Taux d'intérêt (%) : ");

        jTextField3.setForeground(java.awt.Color.gray);
        jTextField3.setText("3,89");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 173, 82));
        jLabel9.setText("Taux en vigueur");

        ButCalculer.setBackground(new java.awt.Color(11, 109, 11));
        ButCalculer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButCalculer.setForeground(new java.awt.Color(255, 255, 255));
        ButCalculer.setText("Calculer");
        ButCalculer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButCalculerActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(java.awt.Color.gray);
        jLabel10.setText("* Taxes municipales et ");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(java.awt.Color.gray);
        jLabel11.setText("scolaires ($) :");

        jTTaxesmunicipales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTTaxesmunicipalesActionPerformed(evt);
            }
        });

        jLabel12.setForeground(java.awt.Color.gray);
        jLabel12.setText("par an");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(java.awt.Color.gray);
        jLabel13.setText("* Coût d'énergie ($) :");

        jTMois2.setText(" ");
        jTMois2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTMois2ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(java.awt.Color.gray);
        jLabel14.setText("par mois");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(java.awt.Color.gray);
        jLabel15.setText("* Frais de corpropriété ($) :");

        jTMois3.setText(" ");
        jTMois3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTMois3ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(java.awt.Color.gray);
        jLabel16.setText("par mois");

        ButEffacer.setBackground(new java.awt.Color(11, 109, 11));
        ButEffacer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ButEffacer.setForeground(new java.awt.Color(255, 255, 255));
        ButEffacer.setText("Effacer");
        ButEffacer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButEffacerActionPerformed(evt);
            }
        });

        Messages.setForeground(new java.awt.Color(255, 0, 0));

        jTextField4.setForeground(java.awt.Color.gray);
        jTextField4.setText("4 ans");

        jPanel2.setBackground(new java.awt.Color(221, 240, 220));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 173, 82));
        jLabel17.setText("Résultat ");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 173, 82));
        jLabel18.setText("Valeur maximale de la maison :");

        jTValeurmaximale.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTValeurmaximale.setForeground(new java.awt.Color(0, 173, 82));
        jTValeurmaximale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTValeurmaximaleActionPerformed(evt);
            }
        });

        JTprêtHypothécaire.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        JTprêtHypothécaire.setForeground(new java.awt.Color(0, 173, 82));
        JTprêtHypothécaire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTprêtHypothécaireActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 173, 82));
        jLabel20.setText("Prêt hypothécaire maximal :");

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Projet_INM5001/Logo.png"))); // NOI18N

        jLabelAssuranceHypo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelAssuranceHypo.setForeground(new java.awt.Color(0, 173, 82));
        jLabelAssuranceHypo.setText("Assurance prêt Hypothécaire");

        jTAssuranceHypothecaire.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTAssuranceHypothecaire.setForeground(new java.awt.Color(0, 173, 82));
        jTAssuranceHypothecaire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTAssuranceHypothecaireActionPerformed(evt);
            }
        });

        jLabelMontantPrime.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelMontantPrime.setForeground(new java.awt.Color(0, 173, 82));
        jLabelMontantPrime.setText("Prime (SCHL/Genworth)");

        jLabelMensuelAvecAss.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelMensuelAvecAss.setForeground(new java.awt.Color(0, 173, 82));
        jLabelMensuelAvecAss.setText("Versement mensuel");

        jTMensualiteAvecAssHypo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTMensualiteAvecAssHypo.setForeground(new java.awt.Color(0, 173, 82));
        jTMensualiteAvecAssHypo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTMensualiteAvecAssHypoActionPerformed(evt);
            }
        });

        jTMensualiteSansAssHypo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTMensualiteSansAssHypo.setForeground(new java.awt.Color(0, 173, 82));
        jTMensualiteSansAssHypo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTMensualiteSansAssHypoActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 173, 82));
        jLabel22.setText("sans assurance");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 173, 82));
        jLabel23.setText("avec assurance");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelAssuranceHypo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(jTMensualiteSansAssHypo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23)
                                    .addComponent(jTMensualiteAvecAssHypo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabelMensuelAvecAss)
                            .addComponent(jLabel18)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(jTValeurmaximale, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTprêtHypothécaire, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTAssuranceHypothecaire, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelMontantPrime, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 65, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel21))
                .addGap(48, 48, 48)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTValeurmaximale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addComponent(JTprêtHypothécaire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelAssuranceHypo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTAssuranceHypothecaire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMontantPrime)
                .addGap(18, 18, 18)
                .addComponent(jLabelMensuelAvecAss)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTMensualiteSansAssHypo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTMensualiteAvecAssHypo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(104, Short.MAX_VALUE))
        );

        jButtonPagePrincipale.setBackground(new java.awt.Color(11, 109, 11));
        jButtonPagePrincipale.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonPagePrincipale.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPagePrincipale.setText("Quitter");
        jButtonPagePrincipale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPagePrincipaleActionPerformed(evt);
            }
        });

        jButtonPagePrincipale1.setBackground(new java.awt.Color(11, 109, 11));
        jButtonPagePrincipale1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonPagePrincipale1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPagePrincipale1.setText("Accueil");
        jButtonPagePrincipale1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPagePrincipale1ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(11, 109, 11));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("AssuranceAuto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(119, 119, 119)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTMois2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel16)))
                                .addGap(57, 57, 57)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTMois3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel14))
                                    .addComponent(jLabel15)))
                            .addComponent(jLabel8)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(113, 113, 113))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButtonPagePrincipale1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxAmortissement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(jButton1)
                                        .addGap(21, 21, 21)
                                        .addComponent(ButEffacer)
                                        .addGap(18, 18, 18)
                                        .addComponent(ButCalculer)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonPagePrincipale, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(126, 126, 126)
                        .addComponent(jLabel19))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRevenusbruts)
                                    .addComponent(jTMisedefonds, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jMisedefonds)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTRevenusbruts, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jParan)))
                                .addGap(212, 212, 212)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jCnom)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCoui)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTMois1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTEngagements, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)))
                            .addComponent(jdonnéesperso)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTTaxesmunicipales, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12))
                            .addComponent(Messages, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(JprêtHypothécaire, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(JprêtHypothécaire)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Messages, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jdonnéesperso)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRevenusbruts)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTRevenusbruts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jParan)
                    .addComponent(jTEngagements, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jMisedefonds)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCoui)
                        .addComponent(jTMois1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(jCnom))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTMisedefonds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTMois2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14)
                                .addComponent(jTMois3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel16))
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTTaxesmunicipales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxAmortissement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(10, 10, 10)))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPagePrincipale1)
                    .addComponent(ButEffacer)
                    .addComponent(ButCalculer)
                    .addComponent(jButtonPagePrincipale)
                    .addComponent(jButton1))
                .addGap(126, 126, 126))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1157, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void jTRevenusbrutsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTRevenusbrutsActionPerformed

    }//GEN-LAST:event_jTRevenusbrutsActionPerformed

    private void jTMisedefondsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTMisedefondsActionPerformed

    }//GEN-LAST:event_jTMisedefondsActionPerformed
    /**
     * Radio Bouton de limite de versement mensuels
     * Si l'utilisateur décide de saisir le montant de versement mentiels 
     * en choisissant le radio oui, le bouton radio non se désactive  
     * 
     * @param evt 
     */
    private void jCouiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCouiActionPerformed
        if (jCoui.isSelected()) {
            jCnom.setSelected(false);
        }
    }//GEN-LAST:event_jCouiActionPerformed

    private void jTTaxesmunicipalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTTaxesmunicipalesActionPerformed

    }//GEN-LAST:event_jTTaxesmunicipalesActionPerformed

    private void jTMois1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTMois1ActionPerformed

    }//GEN-LAST:event_jTMois1ActionPerformed
    /**
     * Bouton Calculer
     * permet de:
     *  - Validation de tous les champs d'interface
     *  - Générer une fenêtre de pop up dans le cas où un des champs et non valide
     *  - Calculer le montant de prêt hypothécaire et assurance hypothécaire 
     * @param evt 
     */
    private void ButCalculerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButCalculerActionPerformed

        Messages.setText("");

        String revenusbrut = jTRevenusbruts.getText().trim();
        String engagement = jTEngagements.getText().trim();
        String misedefond = jTMisedefonds.getText().trim();
        String verseMensuelparmoi = jTMois1.getText().trim();
        String taxemunicipales = jTTaxesmunicipales.getText().trim();
        String coutenergie = jTMois2.getText().trim();
        String fraisproprietaire = jTMois3.getText().trim();

        if (!revenusbrut.matches("[0-9]{1,6}")) {
            ButCalculer.setEnabled(false);
            msg_erreur(MSG_ERR_REVBRUT, "Erreur", JOptionPane.ERROR_MESSAGE);
        } else if (!engagement.matches("[0-9]{1,6}")) {
            msg_erreur(MSG_ERR_ENG, "Erreur", JOptionPane.ERROR_MESSAGE);
            ButCalculer.setEnabled(false);
        } else if (!misedefond.matches("[0-9]{1,6}")) {
            ButCalculer.setEnabled(false);
            msg_erreur(MSG_ERR_MISEDEFOND, "Erreur", JOptionPane.ERROR_MESSAGE);
        } else if (jCoui.isSelected() && !verseMensuelparmoi.matches("[0-9]{1,6}")) {
            ButCalculer.setEnabled(false);
            msg_erreur(MSG_ERR_VERSMENSUEL, "Erreur", JOptionPane.ERROR_MESSAGE);
        } else if (!taxemunicipales.matches("[0-9]{1,6}")) {
            msg_erreur(MSG_ERR_TAXEMUNICIPALE, "Erreur", JOptionPane.ERROR_MESSAGE);
            ButCalculer.setEnabled(false);
        } else if (!coutenergie.matches("[0-9]{1,6}")) {
            msg_erreur(MSG_ERR_COUTENERGIE, "Erreur", JOptionPane.ERROR_MESSAGE);
            ButCalculer.setEnabled(false); 
        } else if (!fraisproprietaire.matches("[0-9]{1,6}")) {
            msg_erreur(MSG_ERR_FRAIS_PROP, "Erreur", JOptionPane.ERROR_MESSAGE);
            ButCalculer.setEnabled(false);
        } else {
            //revenusbrut
            revBruts = Double.parseDouble(revenusbrut);
            //engagement
            engagm = Double.parseDouble(engagement);
            //mise de fond
            miseFonds = Double.parseDouble(misedefond);
            //versement Mensuel
            if (jCoui.isSelected()) {
                limitVersement = Double.parseDouble(verseMensuelparmoi);
            }

            //taxe Munisipale
            taxMunicipalesScol = Double.parseDouble(taxemunicipales);
            //Coût d'éergie
            coutEnerg = Double.parseDouble(coutenergie);
            //fraisproprietaire
            fraisProprio = Double.parseDouble(fraisproprietaire);

            if (jCnom.isSelected() && (jTMois1.getText().isEmpty())) {
                limitVersement = PretHypothecaires.calculeversement(revBruts, engagm, coutEnerg, fraisProprio);
                jTMois1.setText(limitVersement + "");
            }
            calcAffichValMaison();

            jTMois3ActionPerformed(evt);
            jTMois2ActionPerformed(evt);
            jTTaxesmunicipalesActionPerformed(evt);
            jTMois1ActionPerformed(evt);
            jTMisedefondsActionPerformed(evt);
            jTEngagementsActionPerformed(evt);
            jTRevenusbrutsActionPerformed(evt);
        }
    }//GEN-LAST:event_ButCalculerActionPerformed
    /**
     * Bouton Effacer
     * Sert à réinitialiser tout les champs de l'interface prêt hypothécaire 
     * @param evt 
     */
    private void ButEffacerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButEffacerActionPerformed
        jTRevenusbruts.setText("");
        jTEngagements.setText("");
        jTMisedefonds.setText("");
        jTMois1.setText("");
        jTMois2.setText("");
        jTMois3.setText("");
        jTTaxesmunicipales.setText("");
        jTValeurmaximale.setText("");
        JTprêtHypothécaire.setText("");
        Messages.setText("");
        jTAssuranceHypothecaire.setText("");
        jComboBoxAmortissement.setSelectedIndex(0);
        jTMensualiteAvecAssHypo.setText("");
        jTMensualiteSansAssHypo.setText("");

        jCnom.setSelected(false);
        jCoui.setSelected(false);
        ButCalculer.setEnabled(true);


    }//GEN-LAST:event_ButEffacerActionPerformed

    private void jTEngagementsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTEngagementsActionPerformed

    }//GEN-LAST:event_jTEngagementsActionPerformed

    private void jTMois2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTMois2ActionPerformed

    }//GEN-LAST:event_jTMois2ActionPerformed

    private void jTMois3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTMois3ActionPerformed

    }//GEN-LAST:event_jTMois3ActionPerformed

    private void jTValeurmaximaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTValeurmaximaleActionPerformed

    }//GEN-LAST:event_jTValeurmaximaleActionPerformed
    /**
     * Si l'utilisateur choisi de cocher sur le bouton radio nom
     * (il ne veut pas saisir le montant de versement mentiels ),
     * le bouton  radio oui se désactive.
     * @param evt 
     */
    private void jCnomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCnomActionPerformed
        if (jCnom.isSelected()) {
            jCoui.setSelected(false);
            jTMois1.setText("");
        }
    }//GEN-LAST:event_jCnomActionPerformed

    private void JTprêtHypothécaireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTprêtHypothécaireActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTprêtHypothécaireActionPerformed
    /**
     * Bouton Quitter 
     * @param evt 
     */
    private void jButtonPagePrincipaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPagePrincipaleActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonPagePrincipaleActionPerformed

    private void jTAssuranceHypothecaireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTAssuranceHypothecaireActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTAssuranceHypothecaireActionPerformed
    /**
     * Bouton page d'acceuil
     * bouton qui ramène à l'interface d'acceuil
     * @param evt 
     */
    private void jButtonPagePrincipale1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPagePrincipale1ActionPerformed
        new InterfacePrinciple().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonPagePrincipale1ActionPerformed

    private void jComboBoxAmortissementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAmortissementActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxAmortissementActionPerformed

    private void jTMensualiteAvecAssHypoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTMensualiteAvecAssHypoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTMensualiteAvecAssHypoActionPerformed
    /**
     * Bouton Interface Assurance 
     * bouton qui ramène à l'interface Assurance Auto
     * @param evt 
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new AssuranceAuto().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTMensualiteSansAssHypoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTMensualiteSansAssHypoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTMensualiteSansAssHypoActionPerformed
    /**
     * Cette méthode permet de converti une chaine de caractère en une entier 
     * @param chaine
     * @param msgErr
     * @return un entier 
     */
    protected int tryChnEnInt(String chaine, String msgErr) {
        int entier = 0;
        try {
            entier = Integer.parseInt(chaine);
        } catch (NumberFormatException e) {
            Messages.setText(msgErr);
        }
        return entier;
    }

    protected int anChEnMoisChiff(String anCh) {
        
        //Met nombre d'années en chiffres seulement
        anCh = anCh.replace("ans", "").trim();

        //Convertit en nombre de mois et retourne le résultat
        return 12 * tryChnEnInt(anCh, "Vous devez choisir un amortissement");
    }
    /**
     * Bouton Calculer
     * permet de:
     *  - Validation de tous les champs d'interface
     *  - Générer une fenêtre de pop up dans le cas où un des champs et non valide
     *  - Calculer le montant de le montant de prêt hypothécaire et assurance hypothécaire
     */

    private void calcAffichValMaison() {

        boolean assuranceHypoObligatoire;
        int assuranceHypoOptionnelleAccepter = 0;
        double mensualiteAssuranceHypo = 0.0;
        DecimalFormat df = new DecimalFormat("0.00");
        String amortChn = jComboBoxAmortissement.getItemAt(jComboBoxAmortissement.getSelectedIndex());
        amort = anChEnMoisChiff(amortChn);

        if (amort != 0) {
            valeurMaison = PretHypothecaires.calculePretHypothecaires(miseFonds,
                    limitVersement, amort, revBruts, engagm, coutEnerg,
                    fraisProprio);
            if (valeurMaison > 0) {
                if (miseFonds < ((valeurMaison * 5) / 100)) {
                    msg_erreur(MSG_ALERTE_MISE_FONDS, "Alerte", JOptionPane.WARNING_MESSAGE);
                    Messages.setText(MSG_ALERTE_MISE_FONDS);
                    jTValeurmaximale.setText(0.0 + " " + "$");
                    JTprêtHypothécaire.setText(0.0 + " " + "$");
                    jTAssuranceHypothecaire.setText(0.0 + " " + "$");
                    jTMensualiteAvecAssHypo.setText(0.0 + " " + "$");
                } else {
                    montantPret = valeurMaison - miseFonds;
                    assuranceHypoObligatoire = AssuranceHypothecaire
                            .assurancePretHypoObligatoire(montantPret, valeurMaison);
                    montantAssuranceHypo = AssuranceHypothecaire
                            .assurancePretHypo(montantPret, valeurMaison);
                    mensualiteAssuranceHypo = AssuranceHypothecaire
                            .mensualite(montantAssuranceHypo, 0.0389, amort);
                    if (assuranceHypoObligatoire) {
                        msg_erreur(MSG_INFO_ASS_HYPO_OBL, "Message", JOptionPane.INFORMATION_MESSAGE);
                        jLabelMontantPrime.setText("Prime (SCHL/gENWORTH) : "
                                + "OBLIGATOIRE !");
                    } else {
                        assuranceHypoOptionnelleAccepter = JOptionPane.showConfirmDialog(rootPane, MSG_INFO_ASS_HYPO_OPT, "Message",
                                JOptionPane.YES_NO_OPTION);
                        jLabelMontantPrime.setText("Prime (SCHL/gENWORTH) : "
                                + "OPTIONNELLE !");
                    }
                    valeurMaison = (double) Math.round(valeurMaison * 100) / 100;
                    jTValeurmaximale.setText(valeurMaison + " " + "$");
                    montantPret = (double) Math.round(montantPret * 100) / 100;
                    JTprêtHypothécaire.setText(montantPret + " " + "$");
                    jTMensualiteSansAssHypo.setText(df.format(limitVersement) + " $");
                    jTAssuranceHypothecaire.setText("");
                    jTMensualiteAvecAssHypo.setText("");
                    if (assuranceHypoObligatoire
                            || assuranceHypoOptionnelleAccepter == JOptionPane.YES_OPTION) {
                        jTAssuranceHypothecaire.setText(df.format(montantAssuranceHypo) + " $");
                        jTMensualiteAvecAssHypo.setText(df.format(limitVersement
                                + mensualiteAssuranceHypo) + " $");
                    }
                }
            } else if (valeurMaison == 0) {
                msg_erreur(MSG_INFO_NON_ADMISSIBLE, "Message", JOptionPane.INFORMATION_MESSAGE);
                Messages.setText(MSG_INFO_NON_ADMISSIBLE);
                jTValeurmaximale.setText(0.0 + " " + "$");
                JTprêtHypothécaire.setText(0.0 + " " + "$");
                jTAssuranceHypothecaire.setText(0.0 + " " + "$");
                jTMensualiteAvecAssHypo.setText(0.0 + " " + "$");
                jTMensualiteSansAssHypo.setText(0.0 + " " + "$");
            }
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButCalculer;
    private javax.swing.JButton ButEffacer;
    private javax.swing.JTextField JTprêtHypothécaire;
    private javax.swing.JLabel JprêtHypothécaire;
    private javax.swing.JLabel Messages;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonPagePrincipale;
    private javax.swing.JButton jButtonPagePrincipale1;
    private javax.swing.JCheckBox jCnom;
    protected static javax.swing.JComboBox<String> jComboBoxAmortissement;
    private javax.swing.JCheckBox jCoui;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAssuranceHypo;
    private javax.swing.JLabel jLabelMensuelAvecAss;
    private javax.swing.JLabel jLabelMontantPrime;
    private javax.swing.JLabel jMisedefonds;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jParan;
    private javax.swing.JLabel jRevenusbruts;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTAssuranceHypothecaire;
    private javax.swing.JTextField jTEngagements;
    private javax.swing.JTextField jTMensualiteAvecAssHypo;
    private javax.swing.JTextField jTMensualiteSansAssHypo;
    private javax.swing.JTextField jTMisedefonds;
    private javax.swing.JTextField jTMois1;
    private javax.swing.JTextField jTMois2;
    private javax.swing.JTextField jTMois3;
    private javax.swing.JTextField jTRevenusbruts;
    private javax.swing.JTextField jTTaxesmunicipales;
    private javax.swing.JTextField jTValeurmaximale;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel jdonnéesperso;
    // End of variables declaration//GEN-END:variables


}
