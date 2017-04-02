
package newproject;


public class ManagerPage extends javax.swing.JFrame {

    public ManagerPage() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_homebtn = new javax.swing.JLabel();
        lbl_header = new javax.swing.JLabel();
        lbl_item = new javax.swing.JLabel();
        lbl_bill = new javax.swing.JLabel();
        lbl_add = new javax.swing.JLabel();
        lbl_view = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbl_background = new javax.swing.JLabel();
        managerMenuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Manager Page");

        jPanel1.setLayout(null);

        lbl_homebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newproject/empHomeBtn.png"))); // NOI18N
        lbl_homebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_homebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_homebtnMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_homebtn);
        lbl_homebtn.setBounds(0, 10, 80, 60);

        lbl_header.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newproject/empheader.png"))); // NOI18N
        jPanel1.add(lbl_header);
        lbl_header.setBounds(0, 0, 800, 60);

        lbl_item.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newproject/item.png"))); // NOI18N
        jPanel1.add(lbl_item);
        lbl_item.setBounds(380, 280, 190, 40);

        lbl_bill.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newproject/bill.png"))); // NOI18N
        jPanel1.add(lbl_bill);
        lbl_bill.setBounds(70, 280, 190, 40);

        lbl_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newproject/addButton.png"))); // NOI18N
        lbl_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_addMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_add);
        lbl_add.setBounds(80, 350, 50, 40);

        lbl_view.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newproject/view.png"))); // NOI18N
        lbl_view.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_viewMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_view);
        lbl_view.setBounds(380, 350, 50, 40);

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Stock Bill");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7);
        jLabel7.setBounds(150, 350, 160, 30);

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Item View");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8);
        jLabel8.setBounds(440, 350, 160, 40);

        lbl_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newproject/empBack.png"))); // NOI18N
        jPanel1.add(lbl_background);
        lbl_background.setBounds(0, 0, 800, 550);

        jMenu1.setText("Stock Bill");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setText("CalCulate Bill");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseClicked(evt);
            }
        });
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        managerMenuBar.add(jMenu1);

        jMenu2.setText("    Item");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setText("Item View");
        jMenuItem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem2MouseClicked(evt);
            }
        });
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        managerMenuBar.add(jMenu2);

        setJMenuBar(managerMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        ManagerStockBill msb = new ManagerStockBill();
        msb.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
         
        ManagerItemView ai = new  ManagerItemView();
        ai.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void lbl_homebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_homebtnMouseClicked
       
        this.dispose();
        HomePage hp = new HomePage();
        hp.setVisible(true);
        
    }//GEN-LAST:event_lbl_homebtnMouseClicked

    private void jMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseClicked
        
        ManagerStockBill msb = new ManagerStockBill();
        msb.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem1MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
         
        ManagerStockBill msb = new ManagerStockBill();
        msb.setVisible(true);
        
    }//GEN-LAST:event_jLabel7MouseClicked

    private void lbl_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_addMouseClicked
        
        ManagerStockBill msb = new ManagerStockBill();
        msb.setVisible(true);
        
    }//GEN-LAST:event_lbl_addMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
       
        ManagerItemView msb = new ManagerItemView();
        msb.setVisible(true);
        
    }//GEN-LAST:event_jLabel8MouseClicked

    private void lbl_viewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_viewMouseClicked
        
        ManagerStockBill msb = new ManagerStockBill();
        msb.setVisible(true);
        
    }//GEN-LAST:event_lbl_viewMouseClicked

    private void jMenuItem2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MouseClicked
        
        ManagerStockBill msb = new ManagerStockBill();
        msb.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem2MouseClicked

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

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
            java.util.logging.Logger.getLogger(ManagerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_add;
    private javax.swing.JLabel lbl_background;
    private javax.swing.JLabel lbl_bill;
    private javax.swing.JLabel lbl_header;
    private javax.swing.JLabel lbl_homebtn;
    private javax.swing.JLabel lbl_item;
    private javax.swing.JLabel lbl_view;
    private javax.swing.JMenuBar managerMenuBar;
    // End of variables declaration//GEN-END:variables
}
