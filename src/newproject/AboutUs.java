
package newproject;

public class AboutUs extends javax.swing.JFrame {

    GetDBConnection dbc = new GetDBConnection();   
    
    public AboutUs() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_homebtn = new javax.swing.JLabel();
        lbl_header = new javax.swing.JLabel();
        lbl_description = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("About  Us");

        jPanel1.setLayout(null);

        lbl_homebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newproject/homebutton.png"))); // NOI18N
        lbl_homebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_homebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_homebtnMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_homebtn);
        lbl_homebtn.setBounds(-10, 0, 80, 60);

        lbl_header.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newproject/about header.png"))); // NOI18N
        jPanel1.add(lbl_header);
        lbl_header.setBounds(0, -50, 800, 110);

        lbl_description.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newproject/aboutDescription.png"))); // NOI18N
        jPanel1.add(lbl_description);
        lbl_description.setBounds(0, 370, 800, 200);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newproject/4935329.gif"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(120, 70, 570, 290);

        lbl_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newproject/back1.png"))); // NOI18N
        jPanel1.add(lbl_back);
        lbl_back.setBounds(0, 0, 800, 570);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 799, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_homebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_homebtnMouseClicked
        
        HomePage hp = new HomePage();
        hp.setVisible(true);
        this.dispose();
                
    }//GEN-LAST:event_lbl_homebtnMouseClicked

   
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
            java.util.logging.Logger.getLogger(AboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AboutUs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AboutUs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_back;
    private javax.swing.JLabel lbl_description;
    private javax.swing.JLabel lbl_header;
    private javax.swing.JLabel lbl_homebtn;
    // End of variables declaration//GEN-END:variables
}
