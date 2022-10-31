/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.HospitalDetails;
import Model.HospitalEntryHistory;
import Model.LoginDetails;
import Model.VitalSignsHistory;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author bhakti
 */
public class HospitalAdminLoginPage extends javax.swing.JPanel {

    /**
     * Creates new form HospitalAdminLoginPage
     */
    LoginDetails HospitalAdminDetails;
    HospitalDetails HospitalDetails;
    HospitalEntryHistory HospitalHistory;
    LoginDetails PatientDetails;
    VitalSignsHistory history;
    public HospitalAdminLoginPage(LoginDetails HospitalAdminDetails,HospitalDetails HospitalDetails,HospitalEntryHistory HospitalHistory,LoginDetails PatientDetails,VitalSignsHistory history) {
        initComponents();
        this.HospitalAdminDetails = HospitalAdminDetails;
        this.HospitalDetails = HospitalDetails;
        this.HospitalHistory = HospitalHistory;
        this.PatientDetails = PatientDetails;
        this.history = history;
        btnAddDoctor.setVisible(false);
        btnCreatePatient.setVisible(false);
        btnViewVitals.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HospitalAdminSplitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnAddDoctor = new javax.swing.JButton();
        btnCreatePatient = new javax.swing.JButton();
        btnViewVitals = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();

        HospitalAdminSplitPane.setDividerLocation(250);
        HospitalAdminSplitPane.setDividerSize(0);
        HospitalAdminSplitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lblUsername.setText("Username:");

        lblPassword.setText("Password:");

        txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsernameKeyPressed(evt);
            }
        });

        jLabel1.setText("Hospital Admin Login");

        btnAddDoctor.setText("Add Doctor");
        btnAddDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDoctorActionPerformed(evt);
            }
        });

        btnCreatePatient.setText("Create Patient");
        btnCreatePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatePatientActionPerformed(evt);
            }
        });

        btnViewVitals.setText("View Vitals");
        btnViewVitals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewVitalsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btnAddDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCreatePatient)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnViewVitals, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(594, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtPassword, txtUsername});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddDoctor)
                    .addComponent(btnCreatePatient)
                    .addComponent(btnViewVitals))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        HospitalAdminSplitPane.setTopComponent(jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        HospitalAdminSplitPane.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HospitalAdminSplitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(HospitalAdminSplitPane))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        Set<String> Keys = HospitalAdminDetails.HAKeys();
        String Username = txtUsername.getText();
        String Password = txtPassword.getText();
        for(String key: Keys){
            if(Username.equals(key)){
                if(Password.equals(HospitalAdminDetails.getHAValue(key))){
                    btnAddDoctor.setVisible(true);
                    btnCreatePatient.setVisible(true);
                    btnViewVitals.setVisible(true);

                }
            }
        }

        /*Set<String> Keys = this.PatientDetailsinPatientInitial.keys();
        String UserName = txtUsername.getText();
        String Password = txtPassword.getText();

        for(String key: Keys){
            if(UserName.equals(key)){
                if(Password.equals(PatientDetailsinPatientInitial.getValue(key))){
                    PatientAfterLogin UserLogin = new PatientAfterLogin();
                    PatientSplitPane.setRightComponent(UserLogin);
                    txtLoggedPerson.setText(key);
                    lblLogged.setVisible(true);
                    txtLoggedPerson.setVisible(true);
                    btnBookAppointment.setVisible(true);
                    btnEncounterHistory.setVisible(true);
                    btnPersonalDetails.setVisible(true);

                }
            }

        }*/
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnAddDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDoctorActionPerformed
        // TODO add your handling code here:
        AddDoctor AddDoctor = new AddDoctor(HospitalHistory);
        HospitalAdminSplitPane.setRightComponent(AddDoctor);
        
    }//GEN-LAST:event_btnAddDoctorActionPerformed

    private void btnViewVitalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewVitalsActionPerformed
        // TODO add your handling code here:
        ViewVitals viewVitals = new ViewVitals(history);
        HospitalAdminSplitPane.setRightComponent(viewVitals);
    }//GEN-LAST:event_btnViewVitalsActionPerformed

    private void btnCreatePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatePatientActionPerformed
        // TODO add your handling code here:
        PatientCreate HospitalAdminPatientCreate = new PatientCreate(PatientDetails);
        HospitalAdminSplitPane.setRightComponent(HospitalAdminPatientCreate);
        
    }//GEN-LAST:event_btnCreatePatientActionPerformed

    private void txtUsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyPressed
        // TODO add your handling code here:
        	char c = evt.getKeyChar();
	if(Character.isLetterOrDigit(c)|| Character.isISOControl(c))
    {
        txtUsername.setEditable(true);
    }
    else
    {
        txtUsername.setEditable(false);
        JOptionPane.showMessageDialog(this, "Invalid Input \nenter valid username");
    }
    }//GEN-LAST:event_txtUsernameKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSplitPane HospitalAdminSplitPane;
    private javax.swing.JButton btnAddDoctor;
    private javax.swing.JButton btnCreatePatient;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnViewVitals;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}