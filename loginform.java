/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package registration;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class loginform extends javax.swing.JFrame {

    /**
     * Creates new form loginform
     */
    public loginform() {
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
        jLabel1 = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        Spassword = new javax.swing.JPasswordField();
        Susername = new javax.swing.JTextField();
        Cbutton = new javax.swing.JButton();
        Lbutton = new javax.swing.JButton();
        Vpassword = new javax.swing.JCheckBox();
        Rbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 153, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Login form");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(226, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 640, 70));

        Username.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Username.setText("Username:");
        getContentPane().add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 146, 180, 70));

        Password.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Password.setText("Password:");
        getContentPane().add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 246, 180, 80));
        getContentPane().add(Spassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 280, 50));
        getContentPane().add(Susername, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 160, 280, 50));

        Cbutton.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        Cbutton.setText("clear");
        Cbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(Cbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 90, 50));

        Lbutton.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        Lbutton.setText("login ");
        Lbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(Lbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 90, 50));

        Vpassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Vpassword.setText("show password");
        Vpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VpasswordActionPerformed(evt);
            }
        });
        getContentPane().add(Vpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 140, -1));

        Rbutton.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        Rbutton.setText("Register here !!!");
        Rbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(Rbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 463, 170, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbuttonActionPerformed
       
     registration1 reg = new registration1();
      reg.setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_RbuttonActionPerformed

    private void CbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbuttonActionPerformed
        // TODO add your handling code here:
            Susername.setText(null);
        Spassword.setText(null);
    }//GEN-LAST:event_CbuttonActionPerformed

    private void VpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VpasswordActionPerformed
        // TODO add your handling code here:
           if (Vpassword.isSelected()){
            Spassword.setEchoChar((char)0);
        }
        else {
            Spassword.setEchoChar('*');
        }
    }//GEN-LAST:event_VpasswordActionPerformed

    private void LbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LbuttonActionPerformed
        // TODO add your handling code here:
         if (Susername.getText().equals("")){
       JOptionPane.showMessageDialog(null,"please enter username");
    }
    else if (Spassword.getText().equals("")){
        JOptionPane.showMessageDialog(null,"please enter password");
    }
    
    else{
        JOptionPane.showMessageDialog(null,"successfully login");
    }
    }//GEN-LAST:event_LbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cbutton;
    private javax.swing.JButton Lbutton;
    private javax.swing.JLabel Password;
    private javax.swing.JButton Rbutton;
    private javax.swing.JPasswordField Spassword;
    private javax.swing.JTextField Susername;
    private javax.swing.JLabel Username;
    private javax.swing.JCheckBox Vpassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private static class Login {

        public Login() {
        }
    }
}
