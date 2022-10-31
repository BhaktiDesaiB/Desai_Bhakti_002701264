/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.HospitalEntryHistory;
import Model.LoginDetails;
import Model.VitalSignsHistory;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author Bhakti
 */
public class PatientInitialPage extends javax.swing.JPanel {

    /**
     * Creates new form PatientIntialPage
     */
    LoginDetails PatientDetailsinPatientInitial;
    VitalSignsHistory history;
    HospitalEntryHistory HospitalEntryHistory;
    public PatientInitialPage(){
        
    }
    public PatientInitialPage(LoginDetails PatientDetails,VitalSignsHistory history,HospitalEntryHistory HospitalEntryHistory) {
        initComponents();
        this.PatientDetailsinPatientInitial = PatientDetails;
        this.history = new VitalSignsHistory();
        this.HospitalEntryHistory = HospitalEntryHistory;
        lblLogged.setVisible(false);
        txtLoggedPerson.setVisible(false);
        btnBookAppointment.setVisible(false);
        btnEncounterHistory.setVisible(false);
        btnPersonalDetails.setVisible(false);
        
        
    }
    public String getVariable(){
        return txtLoggedPerson.getText();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PatientSplitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        lblWelcome = new javax.swing.JLabel();
        lblWelcomemsg2 = new javax.swing.JLabel();
        btnCreatePatient = new javax.swing.JButton();
        lblAlreadyUser = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblLogged = new javax.swing.JLabel();
        txtLoggedPerson = new javax.swing.JTextField();
        btnBookAppointment = new javax.swing.JButton();
        btnPersonalDetails = new javax.swing.JButton();
        btnEncounterHistory = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();

        PatientSplitPane.setDividerLocation(350);
        PatientSplitPane.setDividerSize(0);
        PatientSplitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        lblWelcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWelcome.setText("Hello, Welcome");

        lblWelcomemsg2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWelcomemsg2.setText("First Time to the App");

        btnCreatePatient.setText("Create Account");
        btnCreatePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatePatientActionPerformed(evt);
            }
        });

        lblAlreadyUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAlreadyUser.setText("Already an User? Please Login:");

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

        lblLogged.setText("Logged in as:");

        txtLoggedPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoggedPersonActionPerformed(evt);
            }
        });

        btnBookAppointment.setText("Book an Appointment");
        btnBookAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookAppointmentActionPerformed(evt);
            }
        });

        btnPersonalDetails.setText("Personal Details");
        btnPersonalDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPersonalDetailsActionPerformed(evt);
            }
        });

        btnEncounterHistory.setText("Encounter History");
        btnEncounterHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncounterHistoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAlreadyUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblWelcomemsg2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCreatePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(311, 311, 311))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(251, 251, 251)
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
                                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnBookAppointment)
                                .addGap(18, 18, 18)
                                .addComponent(btnPersonalDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEncounterHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblLogged)
                                .addGap(18, 18, 18)
                                .addComponent(txtLoggedPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(217, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtPassword, txtUsername});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblWelcomemsg2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCreatePatient)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAlreadyUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLogged, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLoggedPerson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBookAppointment)
                    .addComponent(btnPersonalDetails)
                    .addComponent(btnEncounterHistory))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        PatientSplitPane.setTopComponent(jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 349, Short.MAX_VALUE)
        );

        PatientSplitPane.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PatientSplitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PatientSplitPane)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreatePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatePatientActionPerformed
        // TODO add your handling code here:
        PatientCreate NewPatient = new PatientCreate(this.PatientDetailsinPatientInitial);
        PatientSplitPane.setRightComponent(NewPatient);
        
    }//GEN-LAST:event_btnCreatePatientActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        Set<String> Keys = PatientDetailsinPatientInitial.keys();
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
            
        }
        
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnBookAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookAppointmentActionPerformed
        // TODO add your handling code here:
        AppointmentBooking BookingPane = new AppointmentBooking(HospitalEntryHistory);
        PatientSplitPane.setRightComponent(BookingPane);

    }//GEN-LAST:event_btnBookAppointmentActionPerformed

    private void btnPersonalDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPersonalDetailsActionPerformed
        // TODO add your handling code here:
        PatientPDView DetailsSearch = new PatientPDView();
        PatientSplitPane.setRightComponent(DetailsSearch);
    }//GEN-LAST:event_btnPersonalDetailsActionPerformed

    private void btnEncounterHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncounterHistoryActionPerformed
        // TODO add your handling code here:
        ViewVitals viewVitals = new ViewVitals(history);
        PatientSplitPane.setRightComponent(viewVitals);
        
    }//GEN-LAST:event_btnEncounterHistoryActionPerformed

    private void txtLoggedPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoggedPersonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoggedPersonActionPerformed

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
    private javax.swing.JSplitPane PatientSplitPane;
    private javax.swing.JButton btnBookAppointment;
    private javax.swing.JButton btnCreatePatient;
    private javax.swing.JButton btnEncounterHistory;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnPersonalDetails;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAlreadyUser;
    private javax.swing.JLabel lblLogged;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JLabel lblWelcomemsg2;
    public static javax.swing.JTextField txtLoggedPerson;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
