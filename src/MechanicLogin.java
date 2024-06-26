

import javax.swing.JFrame;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import java.sql.*;
import project1.ConnectionProvider;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shiva
 */
public class MechanicLogin extends javax.swing.JFrame {
     
    

    /**
     * Creates new form MechanicLogin
     */
    public MechanicLogin() {
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
        jLabel3 = new javax.swing.JLabel();
        HomeMechLogin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        MechSignUpFromLogin = new javax.swing.JButton();
        MechLoginPassword = new javax.swing.JPasswordField();
        ExitMechLogin = new javax.swing.JButton();
        MechLogin = new javax.swing.JButton();
        MechLicenceId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Password");

        HomeMechLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        HomeMechLogin.setText("Home");
        HomeMechLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeMechLoginActionPerformed(evt);
            }
        });

        jLabel4.setText("New mechanic user");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        MechSignUpFromLogin.setText("M Sign-up");
        MechSignUpFromLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MechSignUpFromLoginActionPerformed(evt);
            }
        });

        MechLoginPassword.setBackground(new java.awt.Color(255, 255, 204));
        MechLoginPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MechLoginPasswordActionPerformed(evt);
            }
        });

        ExitMechLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ExitMechLogin.setForeground(new java.awt.Color(255, 0, 0));
        ExitMechLogin.setText("Exit");
        ExitMechLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitMechLoginActionPerformed(evt);
            }
        });

        MechLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MechLogin.setForeground(new java.awt.Color(0, 204, 51));
        MechLogin.setText("Login");
        MechLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MechLoginActionPerformed(evt);
            }
        });

        MechLicenceId.setBackground(new java.awt.Color(255, 255, 204));
        MechLicenceId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MechLicenceIdActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Licence No");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Mechanic Login");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tools.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MechLicenceId, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MechLoginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(MechLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ExitMechLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HomeMechLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MechSignUpFromLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(49, 49, 49)
                .addComponent(jLabel5)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MechLicenceId, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MechLoginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(HomeMechLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ExitMechLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MechLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MechSignUpFromLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel5)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeMechLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeMechLoginActionPerformed
        // TODO add your handling code here:
        setVisible(false);
            new index().setVisible(true);
        
    }//GEN-LAST:event_HomeMechLoginActionPerformed

    private void ExitMechLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitMechLoginActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitMechLoginActionPerformed

    private void MechLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MechLoginActionPerformed
        try
        {
            Connection con=ConnectionProvider.getcon();
            Statement st=con.createStatement();
            String mechid=MechLicenceId.getText();
            String password=MechLoginPassword.getText();
            ResultSet rs;
            rs = st.executeQuery("select mechid,password from mechanic where mechid='"+mechid+"'and password='"+new String(password)+"'");
            if(rs.next())
            {
                new index().setVisible(true);
                this.dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(null,"login failed check username/password");
                
            }
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"connection not established");
        }
        
         
    }//GEN-LAST:event_MechLoginActionPerformed

    private void MechSignUpFromLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MechSignUpFromLoginActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new MechanicSignUp().setVisible(true);
    }//GEN-LAST:event_MechSignUpFromLoginActionPerformed

    private void MechLicenceIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MechLicenceIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MechLicenceIdActionPerformed

    private void MechLoginPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MechLoginPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MechLoginPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(MechanicLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MechanicLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MechanicLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MechanicLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MechanicLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitMechLogin;
    private javax.swing.JButton HomeMechLogin;
    private javax.swing.JTextField MechLicenceId;
    private javax.swing.JButton MechLogin;
    private javax.swing.JPasswordField MechLoginPassword;
    private javax.swing.JButton MechSignUpFromLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
