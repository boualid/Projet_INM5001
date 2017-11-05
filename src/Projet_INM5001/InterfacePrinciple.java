/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projet_INM5001;

/**
 *
 * @author bwali
 */
public class InterfacePrinciple extends javax.swing.JFrame {

    /**
     * Creates new form InterfacePrinciple
     */
    public InterfacePrinciple() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonPrêt = new javax.swing.JButton();
        jButtonAssurance = new javax.swing.JButton();
        jButtonQuitter = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(241, 240, 240));

        jButtonPrêt.setBackground(new java.awt.Color(11, 109, 11));
        jButtonPrêt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonPrêt.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPrêt.setText("Prêt Hypothécaire");
        jButtonPrêt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrêtActionPerformed(evt);
            }
        });

        jButtonAssurance.setBackground(new java.awt.Color(11, 109, 11));
        jButtonAssurance.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonAssurance.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAssurance.setText("Assurance Auto");
        jButtonAssurance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAssuranceActionPerformed(evt);
            }
        });

        jButtonQuitter.setBackground(new java.awt.Color(11, 109, 11));
        jButtonQuitter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonQuitter.setForeground(new java.awt.Color(255, 255, 255));
        jButtonQuitter.setText("Sortir");
        jButtonQuitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQuitterActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(java.awt.Color.darkGray);
        jLabel1.setText("<html><center>Simulateur de calcul: <br> Prêt Hypothécaire & Assurance Prêt Hypothécaire <br>Assurance Auto</center></html> ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("<html>Le simulateur de calcul est un outil vous permettant de connaître le montant qui pourrait vous être accordé pour: <br> <ul><li>Prêt hypothécaire</li><li>Assurance prêt hypothécaire</li><li>Assurance auto.</li><br></ul>La précision du résultat dépend de l’exactitude des renseignements que vous inscrirez dans les différents champs.<html>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jButtonPrêt)
                        .addGap(37, 37, 37)
                        .addComponent(jButtonAssurance)
                        .addGap(48, 48, 48)
                        .addComponent(jButtonQuitter, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPrêt)
                    .addComponent(jButtonAssurance)
                    .addComponent(jButtonQuitter))
                .addGap(76, 76, 76))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonQuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQuitterActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonQuitterActionPerformed

    private void jButtonAssuranceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAssuranceActionPerformed
        new AssuranceAuto().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonAssuranceActionPerformed

    private void jButtonPrêtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrêtActionPerformed
        new Interface().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonPrêtActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAssurance;
    private javax.swing.JButton jButtonPrêt;
    private javax.swing.JButton jButtonQuitter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
