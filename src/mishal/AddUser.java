/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mishal;

import java.io.File;
import javax.swing.ButtonGroup;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Mish
 */
public class AddUser extends javax.swing.JFrame {

    /**
     * Creates new form AddUser
     */
    
    // Variable to set the Image Path in it
    String image_path = null;
    
    public AddUser() {
        initComponents();
        
        // ButtonGroup
        ButtonGroup bg = new ButtonGroup();
        bg.add(jrbtMale);
        bg.add(jrbtFemale);
        
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfUserName = new javax.swing.JTextField();
        jpfConfirmPassword = new javax.swing.JPasswordField();
        jpfPassword = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jtfTelephoneNo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtfFullName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jrbtFemale = new javax.swing.JRadioButton();
        jrbtMale = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jbtSelectImage = new javax.swing.JButton();
        jLabel_imgpath = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jbtRegister1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Create User Account");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(410, 0, 210, 50);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Confirm Password");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(320, 190, 120, 20);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Full Name");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(320, 100, 70, 20);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Image:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(320, 280, 50, 20);
        jPanel1.add(jtfUserName);
        jtfUserName.setBounds(470, 130, 140, 30);
        jPanel1.add(jpfConfirmPassword);
        jpfConfirmPassword.setBounds(470, 190, 140, 30);
        jPanel1.add(jpfPassword);
        jpfPassword.setBounds(470, 160, 140, 30);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Password");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(320, 160, 56, 20);

        jtfTelephoneNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTelephoneNoActionPerformed(evt);
            }
        });
        jtfTelephoneNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfTelephoneNoKeyTyped(evt);
            }
        });
        jPanel1.add(jtfTelephoneNo);
        jtfTelephoneNo.setBounds(470, 220, 140, 30);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Username");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(320, 130, 62, 20);
        jPanel1.add(jtfFullName);
        jtfFullName.setBounds(470, 100, 140, 30);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Telephone No");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(320, 220, 90, 20);

        jrbtFemale.setText("Female");
        jPanel1.add(jrbtFemale);
        jrbtFemale.setBounds(540, 250, 70, 23);

        jrbtMale.setText("Male");
        jrbtMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbtMaleActionPerformed(evt);
            }
        });
        jPanel1.add(jrbtMale);
        jrbtMale.setBounds(470, 250, 60, 23);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Gender");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(320, 250, 50, 20);

        jbtSelectImage.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbtSelectImage.setText("Select Image");
        jbtSelectImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSelectImageActionPerformed(evt);
            }
        });
        jPanel1.add(jbtSelectImage);
        jbtSelectImage.setBounds(390, 280, 120, 23);

        jLabel_imgpath.setFont(new java.awt.Font("Sylfaen", 0, 11)); // NOI18N
        jLabel_imgpath.setText("Image Path");
        jPanel1.add(jLabel_imgpath);
        jLabel_imgpath.setBounds(390, 310, 220, 15);

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(10, 413, 90, 40);

        jbtRegister1.setBackground(new java.awt.Color(153, 255, 153));
        jbtRegister1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtRegister1.setText("Register");
        jbtRegister1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtRegister1ActionPerformed(evt);
            }
        });
        jPanel1.add(jbtRegister1);
        jbtRegister1.setBounds(470, 390, 160, 60);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 640, 460);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfTelephoneNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTelephoneNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTelephoneNoActionPerformed

    private void jtfTelephoneNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfTelephoneNoKeyTyped
        // Allow only numbers:
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_jtfTelephoneNoKeyTyped

    private void jrbtMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbtMaleActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jrbtMaleActionPerformed

    private void jbtSelectImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSelectImageActionPerformed
        // Select an image and set the image path into a jlabel
        String path = null;
        
        JFileChooser chooser = new JFileChooser();
        
        chooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        
        // file extensions
        FileNameExtensionFilter extension = new FileNameExtensionFilter("*Images","jpg","png","jpeg");
        chooser.addChoosableFileFilter(extension);
        
        int filestate = chooser.showSaveDialog(null);
        
        // Check if the User Selects an image
        if(filestate == JFileChooser.APPROVE_OPTION){
            
            File selectedImage = chooser.getSelectedFile();
            path = selectedImage.getAbsolutePath();
            jLabel_imgpath.setText(path);
            
            image_path = path;
        }
        
    }//GEN-LAST:event_jbtSelectImageActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        Main obj = new Main();
        obj.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbtRegister1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtRegister1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtRegister1ActionPerformed

    // Function to Verify the Empty fields
    public boolean verifyFields()
    {
        String fname = jtfFullName.getText();
        String uname = jtfUserName.getText();
        String phone = jtfTelephoneNo.getText();
        String pass1 = String.valueOf(jpfPassword.getPassword());
        String pass2 = String.valueOf(jpfConfirmPassword.getPassword());
        
        //Check Empty Fields
        if(fname.trim().equals("") || uname.trim().equals("") || phone.trim().equals("")
            || pass1.trim().equals("") || pass2.trim().equals(""))
        {
            JOptionPane.showMessageDialog(null, "One or More Fields Are Empty","Empty Fields",2);
            return false;
        }
        
        // Check if Password and Confirmed Password Match
        else if(!pass1.equals(pass2))
        {
           JOptionPane.showMessageDialog(null, "Password Doesn't Match","Confirm Password",2);
           return false;
        }
        
        //if Everything Cool
        else{
            return true;
        }
    }
    
    
    // Function to check Entered Usrname exists in the Database
    
    
    
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
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_imgpath;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtRegister1;
    private javax.swing.JButton jbtSelectImage;
    private javax.swing.JPasswordField jpfConfirmPassword;
    private javax.swing.JPasswordField jpfPassword;
    private javax.swing.JRadioButton jrbtFemale;
    private javax.swing.JRadioButton jrbtMale;
    private javax.swing.JTextField jtfFullName;
    private javax.swing.JTextField jtfTelephoneNo;
    private javax.swing.JTextField jtfUserName;
    // End of variables declaration//GEN-END:variables
}
