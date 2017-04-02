
package newproject;


public class WorkerPage extends javax.swing.JFrame {

  
    public WorkerPage() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        lbl_homebtn = new javax.swing.JLabel();
        lbl_header = new javax.swing.JLabel();
        lbl_item = new javax.swing.JLabel();
        lbl_view2 = new javax.swing.JLabel();
        lbl_byCode = new javax.swing.JLabel();
        lbl_view1 = new javax.swing.JLabel();
        lbl_byName = new javax.swing.JLabel();
        lbl_background = new javax.swing.JLabel();
        workerMenuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menu_name = new javax.swing.JMenuItem();
        menu_code = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Worker Page");

        jPanel1.setLayout(null);

        lbl_homebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newproject/empHomeBtn.png"))); // NOI18N
        lbl_homebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_homebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_homebtnMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_homebtn);
        lbl_homebtn.setBounds(10, 10, 80, 60);

        lbl_header.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newproject/empheader.png"))); // NOI18N
        jPanel1.add(lbl_header);
        lbl_header.setBounds(0, 0, 800, 60);

        lbl_item.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newproject/item.png"))); // NOI18N
        jPanel1.add(lbl_item);
        lbl_item.setBounds(90, 260, 200, 50);

        lbl_view2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newproject/view.png"))); // NOI18N
        lbl_view2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_view2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_view2MouseClicked(evt);
            }
        });
        jPanel1.add(lbl_view2);
        lbl_view2.setBounds(120, 390, 60, 40);

        lbl_byCode.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lbl_byCode.setForeground(new java.awt.Color(255, 255, 255));
        lbl_byCode.setText("View By Code");
        lbl_byCode.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_byCode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_byCodeMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_byCode);
        lbl_byCode.setBounds(190, 390, 160, 30);

        lbl_view1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newproject/view.png"))); // NOI18N
        lbl_view1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_view1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_view1MouseClicked(evt);
            }
        });
        jPanel1.add(lbl_view1);
        lbl_view1.setBounds(120, 330, 60, 40);

        lbl_byName.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lbl_byName.setForeground(new java.awt.Color(255, 255, 255));
        lbl_byName.setText("View By Name");
        lbl_byName.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_byName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_byNameMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_byName);
        lbl_byName.setBounds(190, 330, 160, 30);

        lbl_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newproject/empBack.png"))); // NOI18N
        jPanel1.add(lbl_background);
        lbl_background.setBounds(0, 0, 800, 550);

        jMenu1.setText("    Item   ");

        menu_name.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK));
        menu_name.setText("View By Name");
        menu_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_nameActionPerformed(evt);
            }
        });
        jMenu1.add(menu_name);

        menu_code.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        menu_code.setText("View By Code");
        menu_code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_codeActionPerformed(evt);
            }
        });
        jMenu1.add(menu_code);

        workerMenuBar.add(jMenu1);
        workerMenuBar.add(jMenu2);

        setJMenuBar(workerMenuBar);

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

    private void lbl_homebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_homebtnMouseClicked
        
        this.dispose();
        //HomePage hp = new HomePage();
        //hp.setVisible(true);
         
    }//GEN-LAST:event_lbl_homebtnMouseClicked

    private void menu_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_nameActionPerformed
        
        WorkerViewByName byname = new WorkerViewByName();
        byname.setVisible(true);
                
    }//GEN-LAST:event_menu_nameActionPerformed

    private void menu_codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_codeActionPerformed
        
        WorkerViewByCode bycode = new WorkerViewByCode();
        bycode.setVisible(true);
                
    }//GEN-LAST:event_menu_codeActionPerformed

    private void lbl_byNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_byNameMouseClicked
        
        WorkerViewByName byname = new WorkerViewByName();
        byname.setVisible(true);
          
    }//GEN-LAST:event_lbl_byNameMouseClicked

    private void lbl_byCodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_byCodeMouseClicked
        
        WorkerViewByCode bycode = new WorkerViewByCode();
        bycode.setVisible(true);
           
    }//GEN-LAST:event_lbl_byCodeMouseClicked

    private void lbl_view1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_view1MouseClicked
        
        WorkerViewByName byname = new WorkerViewByName();
        byname.setVisible(true);
         
    }//GEN-LAST:event_lbl_view1MouseClicked

    private void lbl_view2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_view2MouseClicked
        
        WorkerViewByCode bycode = new WorkerViewByCode();
        bycode.setVisible(true);
         
    }//GEN-LAST:event_lbl_view2MouseClicked

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
            java.util.logging.Logger.getLogger(WorkerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WorkerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WorkerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WorkerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WorkerPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JLabel lbl_background;
    private javax.swing.JLabel lbl_byCode;
    private javax.swing.JLabel lbl_byName;
    private javax.swing.JLabel lbl_header;
    private javax.swing.JLabel lbl_homebtn;
    private javax.swing.JLabel lbl_item;
    private javax.swing.JLabel lbl_view1;
    private javax.swing.JLabel lbl_view2;
    private javax.swing.JMenuItem menu_code;
    private javax.swing.JMenuItem menu_name;
    private javax.swing.JMenuBar workerMenuBar;
    // End of variables declaration//GEN-END:variables
}
