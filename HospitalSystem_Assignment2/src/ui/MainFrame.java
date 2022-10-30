/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

/**
 *
 * @author bhakti
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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

        headPanel = new javax.swing.JPanel();
        headingLabel = new javax.swing.JLabel();
        splitPane = new javax.swing.JSplitPane();
        detailsPanel = new javax.swing.JPanel();
        buttonPanel = new javax.swing.JPanel();
        patientLoginButton = new javax.swing.JButton();
        doctorLoginButton = new javax.swing.JButton();
        communityLoginButton = new javax.swing.JButton();
        systemLoginButton = new javax.swing.JButton();
        hospitalLoginButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        headingLabel.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        headingLabel.setForeground(new java.awt.Color(0, 102, 102));
        headingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headingLabel.setText("HOSPITAL MANAGEMENT SYSTEM");

        javax.swing.GroupLayout headPanelLayout = new javax.swing.GroupLayout(headPanel);
        headPanel.setLayout(headPanelLayout);
        headPanelLayout.setHorizontalGroup(
            headPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headingLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        headPanelLayout.setVerticalGroup(
            headPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addContainerGap())
        );

        splitPane.setBackground(new java.awt.Color(204, 204, 255));
        splitPane.setBorder(null);
        splitPane.setDividerLocation(200);
        splitPane.setDividerSize(0);
        splitPane.setForeground(new java.awt.Color(0, 102, 102));

        detailsPanel.setBackground(new java.awt.Color(204, 204, 255));
        detailsPanel.setForeground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout detailsPanelLayout = new javax.swing.GroupLayout(detailsPanel);
        detailsPanel.setLayout(detailsPanelLayout);
        detailsPanelLayout.setHorizontalGroup(
            detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        detailsPanelLayout.setVerticalGroup(
            detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 431, Short.MAX_VALUE)
        );

        splitPane.setRightComponent(detailsPanel);

        buttonPanel.setBackground(new java.awt.Color(204, 204, 255));
        buttonPanel.setForeground(new java.awt.Color(0, 102, 102));

        patientLoginButton.setBackground(new java.awt.Color(204, 204, 255));
        patientLoginButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        patientLoginButton.setForeground(new java.awt.Color(0, 102, 102));
        patientLoginButton.setText("Patient Login");
        patientLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientLoginButtonActionPerformed(evt);
            }
        });

        doctorLoginButton.setBackground(new java.awt.Color(204, 204, 255));
        doctorLoginButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        doctorLoginButton.setForeground(new java.awt.Color(0, 102, 102));
        doctorLoginButton.setText("Doctor Login");
        doctorLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorLoginButtonActionPerformed(evt);
            }
        });

        communityLoginButton.setBackground(new java.awt.Color(204, 204, 255));
        communityLoginButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        communityLoginButton.setForeground(new java.awt.Color(0, 102, 102));
        communityLoginButton.setText("Commuity Login");
        communityLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                communityLoginButtonActionPerformed(evt);
            }
        });

        systemLoginButton.setBackground(new java.awt.Color(204, 204, 255));
        systemLoginButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        systemLoginButton.setForeground(new java.awt.Color(0, 102, 102));
        systemLoginButton.setText("System Admin");
        systemLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                systemLoginButtonActionPerformed(evt);
            }
        });

        hospitalLoginButton.setBackground(new java.awt.Color(204, 204, 255));
        hospitalLoginButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        hospitalLoginButton.setForeground(new java.awt.Color(0, 102, 102));
        hospitalLoginButton.setText("Hospital Login");
        hospitalLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalLoginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonPanelLayout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(systemLoginButton)
                    .addComponent(communityLoginButton)
                    .addComponent(hospitalLoginButton)
                    .addComponent(doctorLoginButton)
                    .addComponent(patientLoginButton))
                .addGap(37, 37, 37))
        );

        buttonPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {communityLoginButton, doctorLoginButton, hospitalLoginButton, patientLoginButton, systemLoginButton});

        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(patientLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(doctorLoginButton)
                .addGap(18, 18, 18)
                .addComponent(hospitalLoginButton)
                .addGap(18, 18, 18)
                .addComponent(communityLoginButton)
                .addGap(18, 18, 18)
                .addComponent(systemLoginButton)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        buttonPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {communityLoginButton, doctorLoginButton, hospitalLoginButton, patientLoginButton, systemLoginButton});

        splitPane.setLeftComponent(buttonPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(splitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(splitPane))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void patientLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientLoginButtonActionPerformed
        // TODO add your handling code here:
        PatientLogin newPatient = new PatientLogin();
        newPatient.setVisible(true);
        splitPane.setRightComponent(newPatient);
    }//GEN-LAST:event_patientLoginButtonActionPerformed

    private void doctorLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorLoginButtonActionPerformed
        // TODO add your handling code here:
        DoctorLogin newDoctor = new DoctorLogin();
        newDoctor.setVisible(true);
        splitPane.setRightComponent(newDoctor);
    }//GEN-LAST:event_doctorLoginButtonActionPerformed

    private void communityLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_communityLoginButtonActionPerformed
        // TODO add your handling code here:
        CommunityLogin newCommunity = new CommunityLogin();
        newCommunity.setVisible(true);
        splitPane.setRightComponent(newCommunity);
    }//GEN-LAST:event_communityLoginButtonActionPerformed

    private void systemLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_systemLoginButtonActionPerformed
        // TODO add your handling code here:
        SystemLogin systemAdmin = new SystemLogin();
        systemAdmin.setVisible(true);
        splitPane.setRightComponent(systemAdmin);
    }//GEN-LAST:event_systemLoginButtonActionPerformed

    private void hospitalLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalLoginButtonActionPerformed
        // TODO add your handling code here:
         HospitalLogin newHospital = new HospitalLogin();
        newHospital.setVisible(true);
        splitPane.setRightComponent(newHospital);
    }//GEN-LAST:event_hospitalLoginButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton communityLoginButton;
    private javax.swing.JPanel detailsPanel;
    private javax.swing.JButton doctorLoginButton;
    private javax.swing.JPanel headPanel;
    private javax.swing.JLabel headingLabel;
    private javax.swing.JButton hospitalLoginButton;
    private javax.swing.JButton patientLoginButton;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JButton systemLoginButton;
    // End of variables declaration//GEN-END:variables
}
