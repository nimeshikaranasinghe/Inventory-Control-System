
package newproject;

import java.awt.Color;


public class HomePage extends javax.swing.JFrame {
   
    GetDBConnection dbc = new GetDBConnection();   
    
    public HomePage() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_header = new javax.swing.JLabel();
        lbl_about = new javax.swing.JLabel();
        lbl_signIn = new javax.swing.JLabel();
        lbl_background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home Page - DINS Liqour Shop");

        jPanel1.setLayout(null);

        lbl_header.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newproject/header.png"))); // NOI18N
        jPanel1.add(lbl_header);
        lbl_header.setBounds(0, 0, 800, 60);

        lbl_about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newproject/about.png"))); // NOI18N
        lbl_about.setText("jLabel4");
        lbl_about.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_about.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_aboutMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_about);
        lbl_about.setBounds(660, 200, 140, 30);

        lbl_signIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newproject/SignIn.png"))); // NOI18N
        lbl_signIn.setText("jLabel1");
        lbl_signIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_signIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_signInMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_signIn);
        lbl_signIn.setBounds(660, 140, 140, 30);

        lbl_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newproject/back1.png"))); // NOI18N
        jPanel1.add(lbl_background);
        lbl_background.setBounds(0, 0, 800, 570);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_signInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_signInMouseClicked
        
        SignIn signin = new SignIn();           //create sign in pop up box object
        signin.setVisible(true);                //call and display sign in pop up box    
                
    }//GEN-LAST:event_lbl_signInMouseClicked

    private void lbl_aboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_aboutMouseClicked
        
        AboutUs abs = new AboutUs();            //create about us page
        abs.setVisible(true);                   //call and display about us page      
        //this.dispose();
        
    }//GEN-LAST:event_lbl_aboutMouseClicked
  
    
    
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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_about;
    private javax.swing.JLabel lbl_background;
    private javax.swing.JLabel lbl_header;
    private javax.swing.JLabel lbl_signIn;
    // End of variables declaration//GEN-END:variables
}
