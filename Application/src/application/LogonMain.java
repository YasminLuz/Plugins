package application;

import interfaces.ILogon;
import logins.Logins;
/**
 *
 * @author Aluno
 */
public class LogonMain extends javax.swing.JFrame {

    /**
     * Creates new form LogonMain
     */
    
    public LogonMain() {
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

        jButtonFace = new javax.swing.JButton();
        jButtonGoogle = new javax.swing.JButton();
        jButtonLinkedIn = new javax.swing.JButton();
        jButtonTwitt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonFace.setText("Facebook");
        jButtonFace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFaceActionPerformed(evt);
            }
        });

        jButtonGoogle.setText("Google");
        jButtonGoogle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGoogleActionPerformed(evt);
            }
        });

        jButtonLinkedIn.setText("LinkedIn");
        jButtonLinkedIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLinkedInActionPerformed(evt);
            }
        });

        jButtonTwitt.setText("Twitter");
        jButtonTwitt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTwittActionPerformed(evt);
            }
        });

        jLabel1.setText("Acessar sua conta usando:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonFace, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addComponent(jButtonLinkedIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonGoogle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonTwitt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1)))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addComponent(jButtonFace)
                .addGap(18, 18, 18)
                .addComponent(jButtonLinkedIn)
                .addGap(18, 18, 18)
                .addComponent(jButtonGoogle)
                .addGap(18, 18, 18)
                .addComponent(jButtonTwitt)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jButtonFace.getAccessibleContext().setAccessibleDescription("face");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonFaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFaceActionPerformed
        instance(Logins.create(jButtonFace.getText()));
    }//GEN-LAST:event_jButtonFaceActionPerformed

    private void jButtonLinkedInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLinkedInActionPerformed
        instance(Logins.create(jButtonLinkedIn.getText()));
    }//GEN-LAST:event_jButtonLinkedInActionPerformed

    private void jButtonGoogleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGoogleActionPerformed
        instance(Logins.create(jButtonGoogle.getText()));
    }//GEN-LAST:event_jButtonGoogleActionPerformed

    private void jButtonTwittActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTwittActionPerformed
        instance(Logins.create(jButtonTwitt.getText()));
    }//GEN-LAST:event_jButtonTwittActionPerformed

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
            java.util.logging.Logger.getLogger(LogonMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogonMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogonMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogonMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogonMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFace;
    private javax.swing.JButton jButtonGoogle;
    private javax.swing.JButton jButtonLinkedIn;
    private javax.swing.JButton jButtonTwitt;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
   
    private void instance(ILogon logon){
        new Logon(logon.createLogon()).setVisible(true);
        this.dispose(); 
    }

}
