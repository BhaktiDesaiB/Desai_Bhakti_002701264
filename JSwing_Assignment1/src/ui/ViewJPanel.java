/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.*;

import model.Employee;
import model.History;

/**
 *
 * @author nisha
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    
    History history;
    public ViewJPanel(History history) {
        initComponents();
        this.history = history;
        
        employeeDetailsTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        detailsTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        empTable = new javax.swing.JTable();
        viewButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
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
        tfJoiningDate = new javax.swing.JTextField();
        tfLevel = new javax.swing.JTextField();
        tfTeam = new javax.swing.JTextField();
        tfPosition = new javax.swing.JTextField();
        tfPhoneNo = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        tfGender = new javax.swing.JTextField();
        deleteButton = new javax.swing.JButton();
        viewPhoto = new javax.swing.JLabel();
        viewImage = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 226, 225));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        detailsTitle.setBackground(new java.awt.Color(200, 242, 200));
        detailsTitle.setFont(new java.awt.Font("Corbel Light", 3, 24)); // NOI18N
        detailsTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        detailsTitle.setText("View Employee Details");

        empTable.setAutoCreateRowSorter(true);
        empTable.setBackground(new java.awt.Color(255, 230, 250));
        empTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        empTable.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        empTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee Name", "Employee ID", "Age", "Gender", "Joining Date", "Level", "Team Info", "Position", "Contact No.", "Email ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(empTable);

        viewButton.setBackground(new java.awt.Color(255, 204, 255));
        viewButton.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        viewButton.setText("View");
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });

        updateButton.setBackground(new java.awt.Color(255, 204, 255));
        updateButton.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        detailsJPanel.setBackground(new java.awt.Color(255, 238, 242));
        detailsJPanel.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N

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

        tfJoiningDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfJoiningDateActionPerformed(evt);
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
                    .addGroup(detailsJPanelLayout.createSequentialGroup()
                        .addComponent(photo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(detailsJPanelLayout.createSequentialGroup()
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
                        .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfJoiningDate, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfAge, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfID, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfLevel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfTeam, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfPosition, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfPhoneNo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfGender, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                        .addGap(124, 124, 124))))
        );
        detailsJPanelLayout.setVerticalGroup(
            detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsJPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
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
                .addGroup(detailsJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                .addContainerGap(74, Short.MAX_VALUE))
        );

        deleteButton.setBackground(new java.awt.Color(255, 204, 255));
        deleteButton.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        viewPhoto.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        viewPhoto.setText("Photo :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(detailsTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 805, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(564, 564, 564)
                .addComponent(viewButton)
                .addGap(12, 12, 12)
                .addComponent(updateButton)
                .addGap(12, 12, 12)
                .addComponent(deleteButton))
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(detailsJPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(viewPhoto)
                .addGap(12, 12, 12)
                .addComponent(viewImage, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(detailsTitle)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewButton)
                    .addComponent(updateButton)
                    .addComponent(deleteButton))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(detailsJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viewPhoto)
                            .addComponent(viewImage, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        // TODO add your handling code here:
        int selectedIndex = empTable.getSelectedRow();
        
        if(selectedIndex<0)
        {
            JOptionPane.showMessageDialog(this, "Please select a record");
        }
        
        DefaultTableModel model = (DefaultTableModel) empTable.getModel();
        Employee selectedEmp = (Employee) history.getHistory().get(selectedIndex);
        
        tfName.setText(selectedEmp.getEmployeeName());
        tfID.setText(selectedEmp.getEmployeeID());
        tfAge.setText(String.valueOf(selectedEmp.getAge()));
        tfGender.setText(selectedEmp.getGender());
        tfJoiningDate.setText(selectedEmp.getStartDate());
        tfLevel.setText(selectedEmp.getLevel());
        tfTeam.setText(selectedEmp.getTeamInfo());
        tfPosition.setText(selectedEmp.getPosition());
        tfPhoneNo.setText(String.valueOf(selectedEmp.getContactNo()));
        tfEmail.setText(selectedEmp.getEmailID());
        
    }//GEN-LAST:event_viewButtonActionPerformed

    private void tfAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAgeActionPerformed

    private void tfJoiningDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfJoiningDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfJoiningDateActionPerformed

    private void tfPhoneNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPhoneNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPhoneNoActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        int selectedIndex = empTable.getSelectedRow();
        if(selectedIndex<0)
        {
            JOptionPane.showMessageDialog(null,"Please select a row to update");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) empTable.getModel();
        
        if(selectedIndex>=0)
        {
            model.setValueAt(tfName.getText(),selectedIndex,0);
            model.setValueAt(tfID.getText(),selectedIndex,1);
            model.setValueAt(tfAge.getText(),selectedIndex,2);
            model.setValueAt(tfGender.getText(),selectedIndex,3);
            model.setValueAt(tfJoiningDate.getText(),selectedIndex,4);
            model.setValueAt(tfLevel.getText(),selectedIndex,5);
            model.setValueAt(tfTeam.getText(),selectedIndex,6);
            model.setValueAt(tfPosition.getText(),selectedIndex,7);
            model.setValueAt(tfPhoneNo.getText(),selectedIndex,8);
            model.setValueAt(tfEmail.getText(),selectedIndex,9);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Error!");
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        int selectedIndex = empTable.getSelectedRow();
        if(selectedIndex<0)
        {
            JOptionPane.showMessageDialog(null,"Please select a row to delete");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) empTable.getModel();
        Employee selectedEmp = (Employee) history.getHistory().get(selectedIndex);
        history.deleteEmp(selectedEmp);
        
        model.removeRow(selectedIndex);
        JOptionPane.showMessageDialog(null,"Employee details deleted");
        employeeDetailsTable();
       
        tfName.setText("");
        tfID.setText("");
        tfAge.setText("");
        tfGender.setText("");
        tfJoiningDate.setText("");
        tfLevel.setText("");
        tfTeam.setText("");
        tfPosition.setText("");
        tfPhoneNo.setText("");
        tfEmail.setText("");
    }//GEN-LAST:event_deleteButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel age;
    private javax.swing.JLabel contactInfo;
    private javax.swing.JButton deleteButton;
    private javax.swing.JPanel detailsJPanel;
    private javax.swing.JLabel detailsTitle;
    private javax.swing.JLabel emailID;
    public javax.swing.JTable empTable;
    private javax.swing.JLabel employeeID;
    private javax.swing.JLabel employeeName;
    private javax.swing.JLabel gender;
    private javax.swing.JScrollPane jScrollPane1;
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
    private javax.swing.JTextField tfJoiningDate;
    private javax.swing.JTextField tfLevel;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfPhoneNo;
    private javax.swing.JTextField tfPosition;
    private javax.swing.JTextField tfTeam;
    private javax.swing.JButton updateButton;
    private javax.swing.JButton viewButton;
    private javax.swing.JLabel viewImage;
    private javax.swing.JLabel viewPhoto;
    // End of variables declaration//GEN-END:variables

    private void employeeDetailsTable() 
    {
        DefaultTableModel model = (DefaultTableModel) empTable.getModel();
        
        Object[][] rows = new Object [history.getHistory().size()][11];
        
        for(int i=0; i < history.getHistory().size();i++)
        {
            System.out.println(history.getHistory().get(i));
        }
        
        ArrayList<Employee> empList = history.getHistory();
        
        for(int i = 0; i < empList.size(); i++)
        {
            Employee emp = empList.get(i);
            
            Object[] record = new Object[11];
            record[0] = emp.getEmployeeName();
            record[1] = emp.getEmployeeID();
            record[2] = emp.getAge();
            record[3] = emp.getGender();
            record[4] = emp.getStartDate();
            record[5] = emp.getLevel();
            record[6] = emp.getTeamInfo();
            record[7] = emp.getPosition();
            record[8] = emp.getContactNo();
            record[9] = emp.getEmailID();
            
            model.addRow(record);
        }
    }
}
