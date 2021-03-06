/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package loginform;
import javax.swing.JOptionPane;
import loginform.form;
/**
 *
 * @author HABIB UR REHMAN
 */
public class GUIloginform extends javax.swing.JFrame {

    /**
     * Creates new form GUIloginform
     */
    public GUIloginform() {
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

        jusername = new javax.swing.JLabel();
        jpassword = new javax.swing.JLabel();
        jlogin = new javax.swing.JButton();
        jreset = new javax.swing.JButton();
        textpassword = new javax.swing.JPasswordField();
        textuser = new javax.swing.JTextField();
        jexit = new javax.swing.JButton();
        check = new javax.swing.JCheckBox();
        seef = new javax.swing.JTextField();
        JL = new javax.swing.JLabel();
        JL2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jusername.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jusername.setText("Username");
        jusername.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jpassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jpassword.setText("Password");
        jpassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jlogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlogin.setText("Login");
        jlogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jloginActionPerformed(evt);
            }
        });

        jreset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jreset.setText("Reset");
        jreset.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jresetActionPerformed(evt);
            }
        });

        textpassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        textpassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        textpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textpasswordActionPerformed(evt);
            }
        });

        textuser.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        textuser.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jexit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jexit.setText("Exit");
        jexit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jexitActionPerformed(evt);
            }
        });

        check.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        check.setText("See Password");
        check.setToolTipText("");
        check.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });

        seef.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        JL.setFont(new java.awt.Font("Verdana", 2, 11)); // NOI18N
        JL.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jusername, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jpassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(check, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(seef, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jreset, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jexit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(textpassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                            .addComponent(textuser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                            .addComponent(JL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JL2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(68, 68, 68))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jusername)
                    .addComponent(textuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jpassword)
                    .addComponent(textpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(check, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JL, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(seef, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JL2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jexit, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jreset, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textpasswordActionPerformed

    private void jresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jresetActionPerformed
       textuser.setText("");
       textpassword.setText("");
          seef.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_jresetActionPerformed

    private void jexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jexitActionPerformed
       System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_jexitActionPerformed

    private void jloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jloginActionPerformed
       String Username=textuser.getText();
         String Password=textpassword.getText();
         if(Password.contains("123")&&Username.contains("raja"))
         {
             textuser.setText("");
              JOptionPane.showMessageDialog(this,"you have succesfully login");
             textpassword.setText("");
             JL.setText("");
             JL2.setText("");
          
             form info=new form();
             info.setVisible(true);
             
            
         }
        
         else
         {
                 JOptionPane.showMessageDialog(null,"invalid loging detail","LOGIN ERROR",JOptionPane.ERROR_MESSAGE);
             
                 textuser.setText("");
                 textpassword.setText("");
                 JL.setText("Password or username is incorect");
                
                 JL2.setText("");
                         }  
         
         
      // TODO add your handling code here:
    }//GEN-LAST:event_jloginActionPerformed

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
       if (check.isSelected())
           
       {
                 
           seef.setText(String.valueOf(textpassword.getPassword()));
           
           
       }
       else
       {
           seef.setText("");
       }
        // TODO add your handling code here:
    }//GEN-LAST:event_checkActionPerformed
    
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
            java.util.logging.Logger.getLogger(GUIloginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIloginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIloginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIloginform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIloginform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JL;
    private javax.swing.JLabel JL2;
    private javax.swing.JCheckBox check;
    private javax.swing.JButton jexit;
    private javax.swing.JButton jlogin;
    private javax.swing.JLabel jpassword;
    private javax.swing.JButton jreset;
    private javax.swing.JLabel jusername;
    private javax.swing.JTextField seef;
    private javax.swing.JPasswordField textpassword;
    private javax.swing.JTextField textuser;
    // End of variables declaration//GEN-END:variables
}
