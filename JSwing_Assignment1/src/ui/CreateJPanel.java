/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.*;

import model.Employee;
import model.History;

/**
 *
 * @author nisha
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    
    History history;
    
    public CreateJPanel(History history) {
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

        genderButtonGroup = new javax.swing.ButtonGroup();
        titleJPanel = new javax.swing.JPanel();
        createTitle = new javax.swing.JLabel();
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
        tfName = new javax.swing.JTextField();
        tfID = new javax.swing.JTextField();
        tfAge = new javax.swing.JTextField();
        tfJoiningDate = new javax.swing.JTextField();
        tfLevel = new javax.swing.JTextField();
        tfTeam = new javax.swing.JTextField();
        tfPosition = new javax.swing.JTextField();
        tfPhoneNo = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        create = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        tfGender = new javax.swing.JTextField();
        photo = new javax.swing.JLabel();
        imageURL = new javax.swing.JLabel();
        btnImage = new javax.swing.JButton();

        setBackground(new java.awt.Color(253, 227, 222));

        titleJPanel.setBackground(new java.awt.Color(255, 228, 232));

        createTitle.setBackground(new java.awt.Color(255, 222, 205));
        createTitle.setFont(new java.awt.Font("Corbel Light", 3, 24)); // NOI18N
        createTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        createTitle.setText("New Employee");
        createTitle.setToolTipText("");

        javax.swing.GroupLayout titleJPanelLayout = new javax.swing.GroupLayout(titleJPanel);
        titleJPanel.setLayout(titleJPanelLayout);
        titleJPanelLayout.setHorizontalGroup(
            titleJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(createTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 836, Short.MAX_VALUE)
        );
        titleJPanelLayout.setVerticalGroup(
            titleJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(createTitle)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        detailsJPanel.setBackground(new java.awt.Color(255, 218, 255));
        detailsJPanel.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 12)); // NOI18N

        employeeName.setText("Employee Name :");

        employeeID.setText("Employee ID :");

        age.setText("Age : ");

        gender.setText("Gender :");

        joiningDate.setText("Joining Date :  (in dd month year)");

        level.setText("Level :");

        teamInfo.setText("Team Info : ");

        position.setText("Position Title :");

        contactInfo.setText("Contact Information : ");

        phoneNo.setText("phone no. : ");

        emailID.setText("email-id : ");

        tfName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNameActionPerformed(evt);
            }
        });
        tfName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfNameKeyPressed(evt);
            }
        });

        tfID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfIDKeyPressed(evt);
            }
        });

        tfAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAgeActionPerformed(evt);
            }
        });
        tfAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfAgeKeyPressed(evt);
            }
        });

        tfJoiningDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfJoiningDateActionPerformed(evt);
            }
        });
        tfJoiningDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfJoiningDateKeyPressed(evt);
            }
        });

        tfLevel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfLevelKeyPressed(evt);
            }
        });

        tfTeam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfTeamKeyPressed(evt);
            }
        });

        tfPosition.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfPositionKeyPressed(evt);
            }
        });

        tfPhoneNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPhoneNoActionPerformed(evt);
            }
        });
        tfPhoneNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfPhoneNoKeyPressed(evt);
            }
        });

        tfEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfEmailKeyPressed(evt);
            }
        });

        create.setBackground(new java.awt.Color(255, 226, 201));
        create.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 12)); // NOI18N
        create.setText("Create");
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });

        reset.setBackground(new java.awt.Color(255, 226, 201));
        reset.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 12)); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        tfGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfGenderActionPerformed(evt);
            }
        });
        tfGender.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfGenderKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout detailsJPanelLayout = new javax.swing.GroupLayout(detailsJPanel);
        detailsJPanel.setLayout(detailsJPanelLayout);
        detailsJPanelLayout.setHorizontalGroup(
            detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsJPanelLayout.createSequentialGroup()
                .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detailsJPanelLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(emailID, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(phoneNo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(position, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(teamInfo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(level, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(joiningDate, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(age, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(detailsJPanelLayout.createSequentialGroup()
                                    .addComponent(employeeName)
                                    .addGap(120, 120, 120)))
                            .addGroup(detailsJPanelLayout.createSequentialGroup()
                                .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(employeeID)
                                    .addComponent(gender)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailsJPanelLayout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(contactInfo)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGap(0, 58, Short.MAX_VALUE)
                        .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfGender, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(tfJoiningDate, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(tfAge, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(tfID, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(tfName, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(tfLevel, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(tfTeam, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(tfPosition, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(tfPhoneNo, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(tfEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)))
                    .addGroup(detailsJPanelLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(create)
                        .addGap(48, 48, 48)
                        .addComponent(reset)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(29, 29, 29))
        );

        detailsJPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tfAge, tfEmail, tfGender, tfID, tfJoiningDate, tfLevel, tfName, tfPhoneNo, tfPosition, tfTeam});

        detailsJPanelLayout.setVerticalGroup(
            detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsJPanelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
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
                .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(joiningDate)
                    .addComponent(tfJoiningDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(level)
                    .addComponent(tfLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teamInfo)
                    .addComponent(tfTeam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(position)
                    .addComponent(tfPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contactInfo)
                .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detailsJPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phoneNo)
                            .addComponent(tfPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailID)
                            .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detailsJPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                        .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(reset)
                            .addComponent(create))
                        .addGap(97, 97, 97))))
        );

        photo.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 12)); // NOI18N
        photo.setText("Photo:");

        btnImage.setBackground(new java.awt.Color(255, 226, 201));
        btnImage.setFont(new java.awt.Font("Microsoft JhengHei Light", 0, 12)); // NOI18N
        btnImage.setText("Choose File");
        btnImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(detailsJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(photo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnImage))
                    .addComponent(imageURL, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(detailsJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(photo)
                            .addComponent(btnImage))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(imageURL, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        tfName.setText("");
        tfID.setText("");
        tfAge.setText("");
        tfGender.setText("");
        tfJoiningDate.setText("");
        tfLevel.setText("");
        tfPosition.setText("");
        tfTeam.setText("");
        tfPhoneNo.setText("");
        tfEmail.setText("");
        
        JOptionPane.showMessageDialog(null, "Information reset");
    }//GEN-LAST:event_resetActionPerformed

    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed
        // TODO add your handling code here:

        String name = tfName.getText();
        String empID = tfID.getText();
        int age = Integer.parseInt(tfAge.getText());
        String gender = tfGender.getText();
        String joiningDate = tfJoiningDate.getText();
        String level = tfLevel.getText();
        String position = tfPosition.getText();
        String teamInfo = tfTeam.getText();
        long phoneNo = Long.parseLong(tfPhoneNo.getText());
        String emailID = tfEmail.getText();
        
        
        Employee emp = history.addNewEmployee();

        emp.setEmployeeName(name);
        emp.setEmployeeID(empID);
        emp.setAge(age);
        emp.setGender(gender);
        emp.setStartDate(joiningDate);
        emp.setLevel(level);
        emp.setPosition(position);
        emp.setTeamInfo(teamInfo);
        emp.setContactNo(phoneNo);
        emp.setEmailID(emailID);

        JOptionPane.showMessageDialog(null, "Employee Information Saved!");

        tfName.setText("");
        tfID.setText("");
        tfAge.setText("");
        tfGender.setText("");
        tfJoiningDate.setText("");
        tfLevel.setText("");
        tfPosition.setText("");
        tfTeam.setText("");
        tfPhoneNo.setText("");
        tfEmail.setText("");
    }//GEN-LAST:event_createActionPerformed

    private void tfPhoneNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPhoneNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPhoneNoActionPerformed

    private void tfJoiningDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfJoiningDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfJoiningDateActionPerformed

    private void tfAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAgeActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tfAgeActionPerformed

    private void tfGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfGenderActionPerformed

    private void tfNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNameKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isLetter(c)||Character.isWhitespace(c)||Character.isISOControl(c))
        {
            tfName.setEditable(true);  
        }
        else
        {
            tfName.setEditable(false);
            JOptionPane.showMessageDialog(this, "Please enter character");
        }
    }//GEN-LAST:event_tfNameKeyPressed

    private void tfIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfIDKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isWhitespace(c)||Character.isISOControl(c)||Character.isLetterOrDigit(c))
        {
            tfID.setEditable(true);  
        }
        else
        {
            tfID.setEditable(false);
            JOptionPane.showMessageDialog(this, "No special characters allowed!");
        }
    }//GEN-LAST:event_tfIDKeyPressed

    private void tfGenderKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfGenderKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isLetter(c))
        {
            if(c == 'M' ||c == 'F' || c == 'O' || c == 'm' ||c == 'f' || c == 'o')
            {
                tfGender.setEditable(true);
            }
           else
            {
                tfGender.setEditable(false);
            JOptionPane.showMessageDialog(this, "Enter M for Male, F for Female, O for Other");
            }
        }
    }//GEN-LAST:event_tfGenderKeyPressed

    private void tfJoiningDateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfJoiningDateKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isWhitespace(c)||Character.isLetterOrDigit(c)||Character.isISOControl(c)||Character.isWhitespace(c))
        {
            tfJoiningDate.setEditable(true);  
        }
        else
        {
            tfJoiningDate.setEditable(false);
            JOptionPane.showMessageDialog(this, "No special characters allowed!");
        }
    }//GEN-LAST:event_tfJoiningDateKeyPressed

    private void tfLevelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfLevelKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isWhitespace(c)||Character.isLetterOrDigit(c))
        {
            tfLevel.setEditable(true);  
        }
        else
        {
            tfLevel.setEditable(false);
            JOptionPane.showMessageDialog(this, "No special characters allowed!");
        }
    }//GEN-LAST:event_tfLevelKeyPressed

    private void tfTeamKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfTeamKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isLetter(c)||Character.isWhitespace(c))
        {
            tfTeam.setEditable(true);  
        }
        else
        {
            tfTeam.setEditable(false);
            JOptionPane.showMessageDialog(this, "Numbers and special characters not allowed");
        }
    }//GEN-LAST:event_tfTeamKeyPressed

    private void tfPositionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPositionKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isLetter(c)||Character.isWhitespace(c))
        {
            tfPosition.setEditable(true);  
        }
        else
        {
            tfPosition.setEditable(false);
            JOptionPane.showMessageDialog(this, "Enter in words");
        }
    }//GEN-LAST:event_tfPositionKeyPressed

    private void tfPhoneNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPhoneNoKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isDigit(c)||Character.isWhitespace(c))
        {
            tfPhoneNo.setEditable(true); 
        }
        else
        {
            tfPhoneNo.setEditable(false);
            JOptionPane.showMessageDialog(this, "Enter in digits! Phone number not valid");
        }
    }//GEN-LAST:event_tfPhoneNoKeyPressed

    private void tfEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfEmailKeyPressed
        // TODO add your handling code here:
        
         char c = evt.getKeyChar();
        if(Character.isLetterOrDigit(c) || Character.isISOControl(c) || Character.isWhitespace(c) )
            {
                if (c == '@' || c== '.' || Character.isLetterOrDigit(c))
                {
                    tfEmail.setEditable(true);
                }
                else
                {
                    tfEmail.setEditable(false);
                    JOptionPane.showMessageDialog(this, "enter valid email address");
                }
            }
    }//GEN-LAST:event_tfEmailKeyPressed

    private void tfAgeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfAgeKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isDigit(c)||Character.isWhitespace(c))
        {   
            
            tfAge.setEditable(true);  
        }
        else
        {
            tfAge.setEditable(false);
            JOptionPane.showMessageDialog(this, "Enter a valid age");
        }
    }//GEN-LAST:event_tfAgeKeyPressed

    private void tfNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNameActionPerformed

    private void btnImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImageActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        Image getAbsolutePath = null;
        ImageIcon icon = new ImageIcon(filename);
        Image image = icon.getImage().getScaledInstance(imageURL.getWidth(), imageURL.getHeight(), Image.SCALE_SMOOTH);
        imageURL.setIcon(icon);
    }//GEN-LAST:event_btnImageActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel age;
    private javax.swing.JButton btnImage;
    private javax.swing.JLabel contactInfo;
    private javax.swing.JButton create;
    private javax.swing.JLabel createTitle;
    private javax.swing.JPanel detailsJPanel;
    private javax.swing.JLabel emailID;
    private javax.swing.JLabel employeeID;
    private javax.swing.JLabel employeeName;
    private javax.swing.JLabel gender;
    private javax.swing.ButtonGroup genderButtonGroup;
    private javax.swing.JLabel imageURL;
    private javax.swing.JLabel joiningDate;
    private javax.swing.JLabel level;
    private javax.swing.JLabel phoneNo;
    private javax.swing.JLabel photo;
    private javax.swing.JLabel position;
    private javax.swing.JButton reset;
    private javax.swing.JLabel teamInfo;
    private javax.swing.JTextField tfAge;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfGender;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfJoiningDate;
    private javax.swing.JTextField tfLevel;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfPhoneNo;
    private javax.swing.JTextField tfPosition;
    private javax.swing.JTextField tfTeam;
    private javax.swing.JPanel titleJPanel;
    // End of variables declaration//GEN-END:variables
}
