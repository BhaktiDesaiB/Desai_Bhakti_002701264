/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import model.Employee;

/**
 *
 * @author nisha
 */
public class UpdateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdateJPanel
     */
    
    Employee emp;
    
    public UpdateJPanel(Employee emp) {
        initComponents();
        this.emp = emp;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        detailsJPanel = new javax.swing.JPanel();
        employeeName = new javax.swing.JLabel();
        employeeID = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        joiningDate = new javax.swing.JLabel();
        level = new javax.swing.JLabel();
        teamInfo = new javax.swing.JLabel();
        position = new javax.swing.JLabel();
        contactInfo = new javax.swing.JLabel();
        phoneNo = new javax.swing.JLabel();
        emailID = new javax.swing.JLabel();
        photo = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        tfID = new javax.swing.JTextField();
        tfAge = new javax.swing.JTextField();
        tfGender = new javax.swing.JTextField();
        tfJoining = new javax.swing.JTextField();
        tfLevel = new javax.swing.JTextField();
        tfTeamInfo = new javax.swing.JTextField();
        tfPosition = new javax.swing.JTextField();
        tfPhoneNo = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        titleJPanel = new javax.swing.JPanel();
        updateTitle = new javax.swing.JLabel();

        employeeName.setText("Employee Name :");

        employeeID.setText("Employee ID :");

        age.setText("Age : ");

        gender.setText("Gender :");

        joiningDate.setText("Joining Date : ");

        level.setText("Level :");

        teamInfo.setText("Team Info : ");

        position.setText("Position Title :");

        contactInfo.setText("Contact Information : ");

        phoneNo.setText("phone no. : ");

        emailID.setText("email-id : ");

        photo.setText("photo :");

        tfAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAgeActionPerformed(evt);
            }
        });

        tfPhoneNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPhoneNoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout detailsJPanelLayout = new javax.swing.GroupLayout(detailsJPanel);
        detailsJPanel.setLayout(detailsJPanelLayout);
        detailsJPanelLayout.setHorizontalGroup(
            detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsJPanelLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(photo)
                    .addComponent(contactInfo)
                    .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(detailsJPanelLayout.createSequentialGroup()
                            .addComponent(emailID)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(detailsJPanelLayout.createSequentialGroup()
                            .addComponent(phoneNo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(detailsJPanelLayout.createSequentialGroup()
                            .addComponent(position)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(detailsJPanelLayout.createSequentialGroup()
                            .addComponent(teamInfo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(detailsJPanelLayout.createSequentialGroup()
                            .addComponent(level)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(detailsJPanelLayout.createSequentialGroup()
                            .addComponent(joiningDate)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfJoining, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(detailsJPanelLayout.createSequentialGroup()
                            .addComponent(gender)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(detailsJPanelLayout.createSequentialGroup()
                            .addComponent(age)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(detailsJPanelLayout.createSequentialGroup()
                            .addComponent(employeeID)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(detailsJPanelLayout.createSequentialGroup()
                            .addComponent(employeeName)
                            .addGap(56, 56, 56)
                            .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        detailsJPanelLayout.setVerticalGroup(
            detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsJPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(employeeName)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(employeeID)
                    .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(age)
                    .addComponent(tfAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gender)
                    .addComponent(tfGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(joiningDate)
                    .addComponent(tfJoining, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(level)
                    .addComponent(tfLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(teamInfo)
                    .addComponent(tfTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(position)
                    .addComponent(tfPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contactInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNo)
                    .addComponent(tfPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailID)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(photo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        updateTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        updateTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updateTitle.setText("Update Employee Details");
        updateTitle.setToolTipText("");

        javax.swing.GroupLayout titleJPanelLayout = new javax.swing.GroupLayout(titleJPanel);
        titleJPanel.setLayout(titleJPanelLayout);
        titleJPanelLayout.setHorizontalGroup(
            titleJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(updateTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        titleJPanelLayout.setVerticalGroup(
            titleJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleJPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(updateTitle)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(detailsJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titleJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(detailsJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tfAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAgeActionPerformed

    private void tfPhoneNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPhoneNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPhoneNoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel age;
    private javax.swing.JLabel contactInfo;
    private javax.swing.JPanel detailsJPanel;
    private javax.swing.JLabel emailID;
    private javax.swing.JLabel employeeID;
    private javax.swing.JLabel employeeName;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel joiningDate;
    private javax.swing.JLabel level;
    private javax.swing.JLabel phoneNo;
    private javax.swing.JLabel photo;
    private javax.swing.JLabel position;
    private javax.swing.JLabel teamInfo;
    private javax.swing.JTextField tfAge;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfGender;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfJoining;
    private javax.swing.JTextField tfLevel;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfPhoneNo;
    private javax.swing.JTextField tfPosition;
    private javax.swing.JTextField tfTeamInfo;
    private javax.swing.JPanel titleJPanel;
    private javax.swing.JLabel updateTitle;
    // End of variables declaration//GEN-END:variables
}
