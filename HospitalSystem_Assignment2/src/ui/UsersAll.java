/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

/**
 *
 * @author nisha
 */
public class UsersAll extends javax.swing.JPanel {

    /**
     * Creates new form UsersAll
     */
    public UsersAll() {
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

        goBackButton = new javax.swing.JButton();

        goBackButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        goBackButton.setForeground(new java.awt.Color(0, 102, 102));
        goBackButton.setText("Go Back");
        goBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(goBackButton)
                .addContainerGap(709, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(goBackButton)
                .addContainerGap(464, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void goBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_goBackButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton goBackButton;
    // End of variables declaration//GEN-END:variables
}