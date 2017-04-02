package newproject;

import java.awt.Color;
import java.sql.*;

import javax.swing.table.DefaultTableModel;

import javax.swing.*;

public final class ManagerStockBill extends javax.swing.JFrame {

    ResultSet rs;
    PreparedStatement ps;
    Statement st;
    DefaultTableModel model;  //close stat,prestat and rs                           //variable for executing static query

    GetDBConnection dbc = new GetDBConnection();

    double netAmount = 0;
    String company = "";
    String comid = "";

    public ManagerStockBill() {
        //when page load to do a process automatically use constractor
        initComponents();
        fillCompany();

    }

    private void fillCompany() {
        String query = "SELECT * FROM Company";

        String com1;
        int count;

        try {
            ps = dbc.con.prepareStatement(query);
            rs = this.ps.executeQuery();

            while (rs.next()) {
                com1 = rs.getString("comName");

                combo_company.addItem(com1);
                comid = rs.getString("comId");
            }

        } 
        catch (SQLException err) 
        {
            JOptionPane.showMessageDialog(null, " error");
        }
    }

  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbl_billno = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_dePhone = new javax.swing.JTextField();
        txt_deName = new javax.swing.JTextField();
        txt_billno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        combo_item = new javax.swing.JComboBox<>();
        txt_quan = new javax.swing.JTextField();
        combo_company = new javax.swing.JComboBox<>();
        btn_add = new javax.swing.JButton();
        btn_calculate = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_stock = new javax.swing.JTable();
        txt_bill = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Manager Stock Bill");
        setBackground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(740, 540));
        getContentPane().setLayout(null);
        getContentPane().add(jLabel10);
        jLabel10.setBounds(110, 101, 0, 0);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("Calculate Stock Bill");

        lbl_billno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_billno.setText("Bill No:");

        jLabel3.setBackground(new java.awt.Color(255, 204, 51));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Delar Name:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Phone:");

        txt_billno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_billnoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Item Code:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Quntity:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Company:");

        combo_item.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                combo_itemMouseClicked(evt);
            }
        });

        combo_company.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Company" }));
        combo_company.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_companyItemStateChanged(evt);
            }
        });
        combo_company.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                combo_companyMouseClicked(evt);
            }
        });

        btn_add.setText("Add");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_calculate.setText("Calculate Bill");
        btn_calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calculateActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Net Total:");

        tbl_stock.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Item Name", "Rate", "Supply quntity", "Item Net amount"
            }
        ));
        jScrollPane2.setViewportView(tbl_stock);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(lbl_billno))
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addComponent(jLabel4)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_billno, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_deName, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_dePhone, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(78, 78, 78)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(btn_calculate)
                                    .addGap(153, 153, 153)
                                    .addComponent(jLabel9)
                                    .addGap(47, 47, 47))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(258, 258, 258)
                                    .addComponent(btn_add)
                                    .addGap(136, 136, 136))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_bill, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combo_company, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_quan, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combo_item, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_billno)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel3)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_billno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(txt_deName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(txt_dePhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel7)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(combo_company, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(txt_quan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(combo_item, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addComponent(btn_add)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_calculate)
                    .addComponent(jLabel9)
                    .addComponent(txt_bill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 690, 530);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calculateActionPerformed

        String bill = txt_billno.getText();
        String delar = txt_deName.getText();
        int phone = Integer.parseInt(txt_dePhone.getText());

        txt_bill.setText(Double.toString(netAmount));

        //-------------INSERT INTO STOCKBILL------------------

        try {

            String cal = "INSERT INTO StockBill VALUES('" + bill + "', '" + delar + "', " + phone + ", " + netAmount + ",'" + comid + "')";

            ps = dbc.con.prepareStatement(cal);
            ps.execute();
            
        ///---------------------STOCK BILL DETAILS---------------------------////

            int row = 0;
            int col = 0;

            for(int r=0; r<tbl_stock.getRowCount(); r++)
            {

                String itcode = tbl_stock.getValueAt(r,0).toString();
                int quan = Integer.parseInt((tbl_stock.getValueAt(r, 3).toString()));
                double itnet = Double.parseDouble(tbl_stock.getValueAt(r, 4).toString());

                String std = "INSERT INTO StockBillDetails VALUES('"+bill+"','"+itcode+"',"+quan+","+itnet+")";
                ps = dbc.con.prepareStatement(std);
                ps.execute();
                
            }

        }

        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, " error");
        }

    }//GEN-LAST:event_btn_calculateActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed

        model = (DefaultTableModel) tbl_stock.getModel();

        int quan = Integer.parseInt(txt_quan.getText());
        String itCode = (String) combo_item.getSelectedItem();

        try {

            String query2 = "SELECT itemName, rate FROM Items WHERE itemCode = '" + itCode + "'";
            ps = dbc.con.prepareStatement(query2);
            this.rs = ps.executeQuery();

            if (rs.next()) {
                double itemNet = rs.getBigDecimal("rate").doubleValue() * quan;

                model.addRow(new Object[]{itCode, rs.getString("itemName"), rs.getBigDecimal("rate"), quan, itemNet});

                netAmount = netAmount + itemNet;

            }

        } 
        
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, " error");
        }

        
    }//GEN-LAST:event_btn_addActionPerformed

    private void combo_companyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combo_companyMouseClicked

    }//GEN-LAST:event_combo_companyMouseClicked

    private void combo_companyItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_companyItemStateChanged

    }//GEN-LAST:event_combo_companyItemStateChanged

    private void combo_itemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combo_itemMouseClicked
        combo_item.removeAllItems();
        company = (String) combo_company.getSelectedItem();

        String query = "SELECT itemCode FROM Supply WHERE comId = ANY (SELECT comId FROM Company WHERE comName = '" + company + "')";

        String item1;
        int count;

        try {
            ps = dbc.con.prepareStatement(query);
            rs = this.ps.executeQuery();

            while (rs.next()) {
                item1 = rs.getString("itemCode");
                combo_item.addItem(item1);

            }

        } 
        catch (SQLException err) 
        {
            JOptionPane.showMessageDialog(null, " error");
        }
    }//GEN-LAST:event_combo_itemMouseClicked

    private void txt_billnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_billnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_billnoActionPerformed

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
            java.util.logging.Logger.getLogger(ManagerStockBill.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerStockBill.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerStockBill.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerStockBill.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerStockBill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_calculate;
    private javax.swing.JComboBox<String> combo_company;
    private javax.swing.JComboBox<String> combo_item;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_billno;
    private javax.swing.JTable tbl_stock;
    private javax.swing.JTextField txt_bill;
    private javax.swing.JTextField txt_billno;
    private javax.swing.JTextField txt_deName;
    private javax.swing.JTextField txt_dePhone;
    private javax.swing.JTextField txt_quan;
    // End of variables declaration//GEN-END:variables

}

