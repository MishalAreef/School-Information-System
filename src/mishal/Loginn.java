/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mishal;

import javax.swing.JOptionPane;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import mishal.Main;

/**
 *
 * @author Mish
 */
public class Loginn extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Loginn() {
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
        jLabel2 = new javax.swing.JLabel();
        jbtLogin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfUserName = new javax.swing.JTextField();
        jpfPassword = new javax.swing.JPasswordField();
        jbtBack = new javax.swing.JButton();
        jbtLogin1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jLabel2.setText("UniMap School");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(140, 30, 110, 20);

        jbtLogin.setBackground(new java.awt.Color(153, 153, 153));
        jbtLogin.setText("Reset");
        jbtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtLoginActionPerformed(evt);
            }
        });
        jPanel1.add(jbtLogin);
        jbtLogin.setBounds(570, 190, 80, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Password");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(280, 230, 80, 20);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Username");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(280, 190, 80, 20);
        jPanel1.add(jtfUserName);
        jtfUserName.setBounds(420, 190, 120, 30);
        jPanel1.add(jpfPassword);
        jpfPassword.setBounds(420, 230, 120, 30);

        jbtBack.setBackground(new java.awt.Color(255, 51, 51));
        jbtBack.setText("Exit");
        jbtBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtBackActionPerformed(evt);
            }
        });
        jPanel1.add(jbtBack);
        jbtBack.setBounds(10, 273, 80, 30);

        jbtLogin1.setBackground(new java.awt.Color(51, 255, 51));
        jbtLogin1.setText("Login");
        jbtLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtLogin1ActionPerformed(evt);
            }
        });
        jPanel1.add(jbtLogin1);
        jbtLogin1.setBounds(570, 270, 80, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mish\\Desktop\\YURRRRRR\\Work\\HND\\Assignments\\Object Oriented Programming\\Mishal 85-35\\System\\Images\\GRADUATE-5-fb-Facebook-Profile-Timeline-Cover_facebook_cover.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 670, 320);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtBackActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbtBackActionPerformed

    private void jbtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtLoginActionPerformed
        jtfUserName.setText(null);
        jpfPassword.setText(null);
    }//GEN-LAST:event_jbtLoginActionPerformed

    private void jbtLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtLogin1ActionPerformed
        
        String password =jpfPassword.getText();
        String username =jtfUserName.getText();
        
        if (password.contains("hello") && (username.contains("Mish")))
        {
            jtfUserName.setText(null);
            jpfPassword.setText(null);
            systemExit();
            
            Main Info = new Main();
            Info.setVisible(true);
            
        }
        
        
            else
        {
            JOptionPane.showMessageDialog(null,"Invalid Login Details", "Login Error",JOptionPane.ERROR_MESSAGE);
            jpfPassword.setText(null);
            jtfUserName.setText(null);
        }
    }//GEN-LAST:event_jbtLogin1ActionPerformed

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
            java.util.logging.Logger.getLogger(Loginn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loginn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loginn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loginn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loginn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtBack;
    private javax.swing.JButton jbtLogin;
    private javax.swing.JButton jbtLogin1;
    private javax.swing.JPasswordField jpfPassword;
    private javax.swing.JTextField jtfUserName;
    // End of variables declaration//GEN-END:variables

    private void systemExit() 
    {
        WindowEvent winClosing = new WindowEvent (this,WindowEvent.WINDOW_CLOSING);
    }
    
}
