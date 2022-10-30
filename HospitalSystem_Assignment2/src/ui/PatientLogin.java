/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.JOptionPane;
import model.PatientDirectory;

/**
 *
 * @author nisha
 */
public class PatientLogin extends javax.swing.JPanel {

    /**
     * Creates new form PatientLogin
     */
    
    PatientDirectory patientDirectory;
    
    public PatientLogin() {
        initComponents();
        patientDirectory = new PatientDirectory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginSplit = new javax.swing.JSplitPane();
        loginPanel = new javax.swing.JPanel();
        loginHead = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        password = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        addButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        createButton = new javax.swing.JButton();
        lblAlreadyUser = new javax.swing.JLabel();
        createNewPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(204, 204, 255));
        setForeground(new java.awt.Color(0, 102, 102));

        loginSplit.setBackground(new java.awt.Color(204, 204, 255));
        loginSplit.setDividerLocation(200);
        loginSplit.setDividerSize(0);
        loginSplit.setForeground(new java.awt.Color(0, 102, 102));
        loginSplit.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        loginPanel.setBackground(new java.awt.Color(204, 204, 255));
        loginPanel.setForeground(new java.awt.Color(0, 102, 102));

        loginHead.setFont(new java.awt.Font("Times New Roman", 3, 30)); // NOI18N
        loginHead.setForeground(new java.awt.Color(0, 102, 102));
        loginHead.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginHead.setText("LOGIN");

        username.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        username.setForeground(new java.awt.Color(0, 102, 102));
        username.setText("USERNAME : ");

        txtUserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserNameKeyPressed(evt);
            }
        });

        password.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        password.setForeground(new java.awt.Color(0, 102, 102));
        password.setText("PASSWORD : ");

        addButton.setBackground(new java.awt.Color(204, 204, 255));
        addButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        addButton.setForeground(new java.awt.Color(0, 102, 102));
        addButton.setText("LOGIN");
        addButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        resetButton.setBackground(new java.awt.Color(204, 204, 255));
        resetButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        resetButton.setForeground(new java.awt.Color(0, 102, 102));
        resetButton.setText("RESET");
        resetButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        createButton.setBackground(new java.awt.Color(204, 204, 255));
        createButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        createButton.setForeground(new java.awt.Color(0, 102, 102));
        createButton.setText("Create New");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        lblAlreadyUser.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblAlreadyUser.setForeground(new java.awt.Color(0, 102, 102));
        lblAlreadyUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAlreadyUser.setText("Don't have username?");

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(username)
                            .addComponent(password))
                        .addGap(30, 30, 30)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(addButton)
                        .addGap(18, 18, 18)
                        .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                        .addComponent(lblAlreadyUser, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(174, 174, 174))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                        .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128))))
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(304, 304, 304)
                .addComponent(loginHead, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        loginPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtPassword, txtUserName});

        loginPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addButton, resetButton});

        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginHead)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(lblAlreadyUser, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(username)
                            .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(password)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        loginPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtPassword, txtUserName});

        loginPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addButton, resetButton});

        loginSplit.setLeftComponent(loginPanel);

        createNewPanel.setBackground(new java.awt.Color(204, 204, 255));
        createNewPanel.setForeground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout createNewPanelLayout = new javax.swing.GroupLayout(createNewPanel);
        createNewPanel.setLayout(createNewPanelLayout);
        createNewPanelLayout.setHorizontalGroup(
            createNewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 798, Short.MAX_VALUE)
        );
        createNewPanelLayout.setVerticalGroup(
            createNewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 299, Short.MAX_VALUE)
        );

        loginSplit.setRightComponent(createNewPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginSplit)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginSplit, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserNameKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isWhitespace(c)||Character.isLetterOrDigit(c) ||Character.isISOControl(c))
        {
            txtUserName.setEditable(true);
        }
        else
        {
            txtUserName.setEditable(false);
            JOptionPane.showMessageDialog(this, "No special characters allowed!");
        }
    }//GEN-LAST:event_txtUserNameKeyPressed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        String username = txtUserName.getText();
        String password = txtPassword.getText();

        if(username == "" || password == "")
        {
            System.out.println(username);
            System.out.println(password);

            JOptionPane.showMessageDialog(null, "login successful");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "login unsuccessful \nall feilds are required");
        }

        txtUserName.setText("");
        txtPassword.setText("");
    }//GEN-LAST:event_addButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
        txtUserName.setText("");
        txtPassword.setText("");

        loginSplit.setRightComponent(null);
        JOptionPane.showMessageDialog(null, "feilds set to reset");
    }//GEN-LAST:event_resetButtonActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        // TODO add your handling code here:
        NewPatientDetails patient = new NewPatientDetails(patientDirectory);
        //patient.setVisible(true);
        loginSplit.setRightComponent(patient);
    }//GEN-LAST:event_createButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton createButton;
    private javax.swing.JPanel createNewPanel;
    private javax.swing.JLabel lblAlreadyUser;
    private javax.swing.JLabel loginHead;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JSplitPane loginSplit;
    private javax.swing.JLabel password;
    private javax.swing.JButton resetButton;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
