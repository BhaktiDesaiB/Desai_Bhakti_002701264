/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.VitalSigns;
import Model.VitalSignsHistory;
import javax.swing.JOptionPane;

/**
 *
 * @author bhakti
 */
public class CreateVitals extends javax.swing.JPanel {

    /**
     * Creates new form CreateVitals
     */
    VitalSignsHistory history;
    public CreateVitals(VitalSignsHistory history) {
        initComponents();
        this.history = history;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblBloodPressure = new javax.swing.JLabel();
        lblPulse = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        txtTemperature = new javax.swing.JTextField();
        txtBloodPressure = new javax.swing.JTextField();
        txtPulse = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        lblCreateSigns = new javax.swing.JLabel();
        lblTemparature = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();

        lblBloodPressure.setText("Blood Pressure:");

        lblPulse.setText("Pulse:");

        lblDate.setText("Date:");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        txtTemperature.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTemperatureKeyPressed(evt);
            }
        });

        txtBloodPressure.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBloodPressureKeyPressed(evt);
            }
        });

        txtPulse.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPulseKeyPressed(evt);
            }
        });

        lblCreateSigns.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreateSigns.setText("Cretate Vital Signs");

        lblTemparature.setText("Temperature:");

        jLabel1.setText("Patient_UserName:");

        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });
        txtUserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserNameKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblBloodPressure)
                            .addComponent(lblTemparature)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblDate)
                                .addComponent(lblPulse))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPulse, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtUserName)
                                .addGap(3, 3, 3))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(btnSave)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(lblCreateSigns, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                .addGap(189, 189, 189))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(lblCreateSigns, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTemparature)
                            .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblBloodPressure)
                                    .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(lblPulse))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPulse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)
                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblDate))
                .addGap(18, 18, 18)
                .addComponent(btnSave)
                .addContainerGap(282, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        double Temperature = Double.parseDouble(txtTemperature.getText());
        double BloodPressure = Double.parseDouble(txtBloodPressure.getText());
        int Pulse = Integer.parseInt(txtPulse.getText());
        String Date = txtDate.getText();
        String UserName = txtUserName.getText();
        
        VitalSigns vs = history.addNewVitals();
        System.out.println(history.getHistory().size());
        vs.setTemperature(Temperature);
        vs.setBloodPressure(BloodPressure);
        vs.setPulse(Pulse);
        vs.setDate(Date);
        vs.setUserName(UserName);
        
       JOptionPane.showMessageDialog(this, "Vitals are Saved");
       
       txtTemperature.setText("");
       txtBloodPressure.setText("");
       txtPulse.setText("");
       txtDate.setText("");
       txtUserName.setText("");
        
        
        
        
   
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void txtUserNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserNameKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
	if(Character.isLetter(c)|| Character.isISOControl(c))
    {
        txtUserName.setEditable(true);
    }
    else
    {
        txtUserName.setEditable(false);
        JOptionPane.showMessageDialog(this, "Invalid Input \nenter valid username");
    }
    }//GEN-LAST:event_txtUserNameKeyPressed

    private void txtTemperatureKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTemperatureKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
    if(Character.isISOControl(c)||Character.isWhitespace(c))
        {
            if (c== '.' || Character.isLetterOrDigit(c))
            {
                txtTemperature.setEditable(true);
            }
            else
            {
                txtTemperature.setEditable(false);
                JOptionPane.showMessageDialog(this, "not allowed to enter words");
            }
        }
    }//GEN-LAST:event_txtTemperatureKeyPressed

    private void txtBloodPressureKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBloodPressureKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
	if (c== '.' || Character.isDigit(c))
    {
        txtBloodPressure.setEditable(true);
    }
    else
    {
        txtBloodPressure.setEditable(false);
        JOptionPane.showMessageDialog(this, "not allowed to enter words");
}
    }//GEN-LAST:event_txtBloodPressureKeyPressed

    private void txtPulseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPulseKeyPressed
        // TODO add your handling code here:
        	char c = evt.getKeyChar();
    if(Character.isISOControl(c)||Character.isWhitespace(c))
        {
            if (c== '.' || Character.isDigit(c))
            {
                txtPulse.setEditable(true);
            }
            else
            {
                txtPulse.setEditable(false);
                JOptionPane.showMessageDialog(this, "not allowed to enter words");
            }
		}
    }//GEN-LAST:event_txtPulseKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBloodPressure;
    private javax.swing.JLabel lblCreateSigns;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblPulse;
    private javax.swing.JLabel lblTemparature;
    private javax.swing.JTextField txtBloodPressure;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtPulse;
    private javax.swing.JTextField txtTemperature;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}