
package newproject;

public class OwnerPage extends javax.swing.JFrame {

    public OwnerPage() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_homebtn = new javax.swing.JLabel();
        lbl_header = new javax.swing.JLabel();
        lbl_employee = new javax.swing.JLabel();
        lbl_company = new javax.swing.JLabel();
        lbl_item = new javax.swing.JLabel();
        lbl_view1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbl_delete = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbl_add1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lbl_view3 = new javax.swing.JLabel();
        lbl_add2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lbl_update4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lbl_add3 = new javax.swing.JLabel();
        lbl_item1 = new javax.swing.JLabel();
        lbl_update2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbl_background = new javax.swing.JLabel();
        lbl_update3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        managerMenuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mi_addemp = new javax.swing.JMenuItem();
        mi_deleteemp = new javax.swing.JMenuItem();
        updateemp = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        menu_item = new javax.swing.JMenu();
        mi_additems = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Owner Page");

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

        lbl_employee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newproject/employee.png"))); // NOI18N
        jPanel1.add(lbl_employee);
        lbl_employee.setBounds(50, 200, 190, 40);

        lbl_company.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newproject/company.png"))); // NOI18N
        jPanel1.add(lbl_company);
        lbl_company.setBounds(320, 200, 190, 40);

        lbl_item.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newproject/item.png"))); // NOI18N
        jPanel1.add(lbl_item);
        lbl_item.setBounds(560, 200, 190, 40);

        lbl_view1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newproject/view.png"))); // NOI18N
        lbl_view1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_view1MouseClicked(evt);
            }
        });
        jPanel1.add(lbl_view1);
        lbl_view1.setBounds(560, 310, 50, 40);

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Update Employee");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10);
        jLabel10.setBounds(80, 310, 190, 30);

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Delete Employee");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11);
        jLabel11.setBounds(80, 365, 190, 30);

        lbl_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newproject/delete new.png"))); // NOI18N
        lbl_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_deleteMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_delete);
        lbl_delete.setBounds(-5, 365, 80, 50);

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("View Employee");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9);
        jLabel9.setBounds(80, 420, 160, 30);

        lbl_add1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newproject/addButton.png"))); // NOI18N
        lbl_add1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_add1MouseClicked(evt);
            }
        });
        jPanel1.add(lbl_add1);
        lbl_add1.setBounds(20, 260, 50, 40);

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Update Company");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel12);
        jLabel12.setBounds(350, 320, 190, 30);

        lbl_view3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newproject/view.png"))); // NOI18N
        lbl_view3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_view3MouseClicked(evt);
            }
        });
        jPanel1.add(lbl_view3);
        lbl_view3.setBounds(20, 420, 50, 40);

        lbl_add2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newproject/addButton.png"))); // NOI18N
        lbl_add2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_add2MouseClicked(evt);
            }
        });
        jPanel1.add(lbl_add2);
        lbl_add2.setBounds(290, 260, 50, 40);

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Add Company");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel13);
        jLabel13.setBounds(350, 260, 160, 30);

        lbl_update4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newproject/update new.png"))); // NOI18N
        lbl_update4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_update4MouseClicked(evt);
            }
        });
        jPanel1.add(lbl_update4);
        lbl_update4.setBounds(273, 315, 70, 40);

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("View Items");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel14);
        jLabel14.setBounds(610, 310, 160, 30);

        lbl_add3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newproject/addButton.png"))); // NOI18N
        lbl_add3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_add3MouseClicked(evt);
            }
        });
        jPanel1.add(lbl_add3);
        lbl_add3.setBounds(550, 260, 50, 40);

        lbl_item1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lbl_item1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_item1.setText("Add Items");
        lbl_item1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_item1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_item1MouseClicked(evt);
            }
        });
        jPanel1.add(lbl_item1);
        lbl_item1.setBounds(610, 260, 160, 30);

        lbl_update2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newproject/update new.png"))); // NOI18N
        lbl_update2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_update2MouseClicked(evt);
            }
        });
        jPanel1.add(lbl_update2);
        lbl_update2.setBounds(2, 305, 70, 40);

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Add Employee");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7);
        jLabel7.setBounds(80, 260, 160, 30);

        lbl_background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newproject/empBack.png"))); // NOI18N
        jPanel1.add(lbl_background);
        lbl_background.setBounds(0, 0, 800, 550);

        lbl_update3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newproject/update new.png"))); // NOI18N
        jPanel1.add(lbl_update3);
        lbl_update3.setBounds(540, 410, 70, 40);

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Update Items");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel15);
        jLabel15.setBounds(610, 420, 190, 30);

        jMenu1.setText("Employee");

        mi_addemp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        mi_addemp.setText("Add Employee");
        mi_addemp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mi_addempMouseClicked(evt);
            }
        });
        mi_addemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_addempActionPerformed(evt);
            }
        });
        jMenu1.add(mi_addemp);

        mi_deleteemp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK));
        mi_deleteemp.setText("Delete Employee");
        mi_deleteemp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mi_deleteempMouseClicked(evt);
            }
        });
        mi_deleteemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_deleteempActionPerformed(evt);
            }
        });
        jMenu1.add(mi_deleteemp);

        updateemp.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.ALT_MASK));
        updateemp.setText("Update Employee");
        updateemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateempActionPerformed(evt);
            }
        });
        jMenu1.add(updateemp);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem4.setText("View Employee");
        jMenuItem4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem4MouseClicked(evt);
            }
        });
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        managerMenuBar.add(jMenu1);

        jMenu2.setText("    Company");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Add Company");
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

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Update Company");
        jMenuItem5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem5MouseClicked(evt);
            }
        });
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        managerMenuBar.add(jMenu2);

        menu_item.setText("Items");

        mi_additems.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK));
        mi_additems.setText("Add Items");
        mi_additems.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mi_additemsMouseClicked(evt);
            }
        });
        mi_additems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_additemsActionPerformed(evt);
            }
        });
        menu_item.add(mi_additems);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem8.setText("View Items");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        menu_item.add(jMenuItem8);

        managerMenuBar.add(menu_item);

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

    private void mi_addempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_addempActionPerformed
        
        OwnerAddEmployee addemp =new OwnerAddEmployee();
        addemp.setVisible(true);
        
    }//GEN-LAST:event_mi_addempActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
             
        OwnerAddUpdateCompany addcompany = new OwnerAddUpdateCompany();
        addcompany.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void lbl_homebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_homebtnMouseClicked
        
        this.dispose();
        HomePage hp = new HomePage();
        hp.setVisible(true);
    }//GEN-LAST:event_lbl_homebtnMouseClicked

    private void lbl_item1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_item1MouseClicked
        
        OwnerAddItems ai = new OwnerAddItems();
        ai.setVisible(true);
        
    }//GEN-LAST:event_lbl_item1MouseClicked

    private void lbl_add3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_add3MouseClicked
        
        OwnerAddItems ai = new OwnerAddItems();
        ai.setVisible(true);
        
    }//GEN-LAST:event_lbl_add3MouseClicked

    private void mi_additemsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mi_additemsMouseClicked
        
        OwnerAddItems ai = new OwnerAddItems();
        ai.setVisible(true);
        
    }//GEN-LAST:event_mi_additemsMouseClicked

    private void mi_additemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_additemsActionPerformed
        
        OwnerAddItems ai = new OwnerAddItems();
        ai.setVisible(true);
        
    }//GEN-LAST:event_mi_additemsActionPerformed

    private void lbl_update2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_update2MouseClicked
        
        OwnerUpdateEmployee ue = new OwnerUpdateEmployee();
        ue.setVisible(true);
        
    }//GEN-LAST:event_lbl_update2MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        
        OwnerUpdateEmployee ue = new OwnerUpdateEmployee();
        ue.setVisible(true);
        
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        
        OwnerAddEmployee addemp =new OwnerAddEmployee();
        addemp.setVisible(true);
                
    }//GEN-LAST:event_jLabel7MouseClicked

    private void lbl_add1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_add1MouseClicked
        
        OwnerAddEmployee addemp =new OwnerAddEmployee();
        addemp.setVisible(true);
        
    }//GEN-LAST:event_lbl_add1MouseClicked

    private void lbl_deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_deleteMouseClicked
        
        OwnerDeleteEmployee de = new OwnerDeleteEmployee();
        de.setVisible(true);
        
    }//GEN-LAST:event_lbl_deleteMouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        
        OwnerDeleteEmployee de = new OwnerDeleteEmployee();
        de.setVisible(true);
        
    }//GEN-LAST:event_jLabel11MouseClicked

    private void lbl_view3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_view3MouseClicked
        
        OwnerViewEmployee ve = new OwnerViewEmployee();
        ve.setVisible(true);
        
    }//GEN-LAST:event_lbl_view3MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        
        OwnerViewEmployee ve = new OwnerViewEmployee();
        ve.setVisible(true);
        
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        
        OwnerAddUpdateCompany addcompany = new OwnerAddUpdateCompany();
        addcompany.setVisible(true);
        
    }//GEN-LAST:event_jLabel13MouseClicked

    private void lbl_add2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_add2MouseClicked
             
        OwnerAddUpdateCompany addcompany = new OwnerAddUpdateCompany();
        addcompany.setVisible(true);
        
    }//GEN-LAST:event_lbl_add2MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
       
        OwnerAddUpdateCompany addcompany = new OwnerAddUpdateCompany();
        addcompany.setVisible(true);
        
    }//GEN-LAST:event_jLabel12MouseClicked

    private void lbl_update4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_update4MouseClicked
             
        OwnerAddUpdateCompany addcompany = new OwnerAddUpdateCompany();
        addcompany.setVisible(true);
        
    }//GEN-LAST:event_lbl_update4MouseClicked

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
             
        OwnerAddUpdateCompany addcompany = new OwnerAddUpdateCompany();
        addcompany.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem2MouseClicked
             
        OwnerAddUpdateCompany addcompany = new OwnerAddUpdateCompany();
        addcompany.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem2MouseClicked

    private void jMenuItem5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem5MouseClicked
             
        OwnerAddUpdateCompany addcompany = new OwnerAddUpdateCompany();
        addcompany.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem5MouseClicked

    private void mi_deleteempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_deleteempActionPerformed
        
        OwnerDeleteEmployee de = new OwnerDeleteEmployee();
        de.setVisible(true);
        
    }//GEN-LAST:event_mi_deleteempActionPerformed

    private void updateempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateempActionPerformed
        
        OwnerUpdateEmployee ue = new OwnerUpdateEmployee();
        ue.setVisible(true);
        
    }//GEN-LAST:event_updateempActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        
        OwnerViewEmployee ve = new OwnerViewEmployee();
        ve.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem4MouseClicked
        
        OwnerViewEmployee ve = new OwnerViewEmployee();
        ve.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem4MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        
        OwnerItemView oiv = new  OwnerItemView();
        oiv.setVisible(true);
        
    }//GEN-LAST:event_jLabel14MouseClicked

    private void lbl_view1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_view1MouseClicked
        
         OwnerItemView oiv = new  OwnerItemView();
        oiv.setVisible(true);
        
    }//GEN-LAST:event_lbl_view1MouseClicked

    private void mi_addempMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mi_addempMouseClicked
        
        OwnerAddEmployee addemp =new OwnerAddEmployee();
        addemp.setVisible(true);
        
    }//GEN-LAST:event_mi_addempMouseClicked

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
         OwnerItemView oiv = new  OwnerItemView();
         oiv.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void mi_deleteempMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mi_deleteempMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_mi_deleteempMouseClicked

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
            java.util.logging.Logger.getLogger(OwnerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OwnerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OwnerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OwnerPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OwnerPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_add1;
    private javax.swing.JLabel lbl_add2;
    private javax.swing.JLabel lbl_add3;
    private javax.swing.JLabel lbl_background;
    private javax.swing.JLabel lbl_company;
    private javax.swing.JLabel lbl_delete;
    private javax.swing.JLabel lbl_employee;
    private javax.swing.JLabel lbl_header;
    private javax.swing.JLabel lbl_homebtn;
    private javax.swing.JLabel lbl_item;
    private javax.swing.JLabel lbl_item1;
    private javax.swing.JLabel lbl_update2;
    private javax.swing.JLabel lbl_update3;
    private javax.swing.JLabel lbl_update4;
    private javax.swing.JLabel lbl_view1;
    private javax.swing.JLabel lbl_view3;
    private javax.swing.JMenuBar managerMenuBar;
    private javax.swing.JMenu menu_item;
    private javax.swing.JMenuItem mi_addemp;
    private javax.swing.JMenuItem mi_additems;
    private javax.swing.JMenuItem mi_deleteemp;
    private javax.swing.JMenuItem updateemp;
    // End of variables declaration//GEN-END:variables
}
