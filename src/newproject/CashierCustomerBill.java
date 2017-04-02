package newproject;

import java.sql.*;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CashierCustomerBill extends javax.swing.JFrame {

    Statement stat;                      //close stat,prestat and rs                           //variable for executing static query
    PreparedStatement ps;                                      //variable for executing dynamic query
    ResultSet rs;  
    
    static String billNum;   
    static String phone; 
     
    GetDBConnection dbc = new GetDBConnection();                    //Connect to the database
    
    
    DefaultTableModel model;
    static double netTotal=0;
        
  
    public CashierCustomerBill() {
        initComponents();
        fillCombo();
    }

    private void fillCombo()
    {
        String query = "SELECT itemCode FROM Items";              
                  
        String item1;
        int count;      
        
        try{
            stat = dbc.con.createStatement();
            rs = this.stat.executeQuery(query);                     
           
            while(rs.next())
            {
                item1 = rs.getString("itemCode");
                combo_item.addItem(item1);
              }
          
        }
        catch(SQLException err)
        {
            JOptionPane.showMessageDialog(null, " error");
        }
               
    }
  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        item = new javax.swing.JLabel();
        combo_item = new javax.swing.JComboBox();
        txt_phone = new javax.swing.JTextField();
        txt_billno = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_quantity = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        quan = new javax.swing.JLabel();
        btn_add = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_item = new javax.swing.JTable();
        tot = new javax.swing.JLabel();
        btn_calculate = new javax.swing.JButton();
        btn_print = new javax.swing.JButton();
        total = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Calculate Customer Payments");
        setIconImages(null);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        item.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        item.setText("Item Code ");

        combo_item.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item Code" }));
        combo_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_itemActionPerformed(evt);
            }
        });

        txt_phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_phoneActionPerformed(evt);
            }
        });

        txt_billno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_billnoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 0, 0));
        jLabel8.setText("CALCULATE CUSTOMER PAYMENTS");

        txt_quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_quantityActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Phone ");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Bill NO            ");

        quan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        quan.setText("Quantity");

        btn_add.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_add.setText("Add");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        tbl_item.setBackground(new java.awt.Color(255, 255, 153));
        tbl_item.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Rate", "Quantity", "Total"
            }
        ));
        tbl_item.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_itemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_item);

        tot.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tot.setText("Net Total");

        btn_calculate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_calculate.setText("Calculate");
        btn_calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_calculateActionPerformed(evt);
            }
        });

        btn_print.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_print.setText("Print Bill");
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });

        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(item)
                    .addComponent(quan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_add)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txt_billno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                        .addComponent(txt_phone, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(combo_item, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(193, 193, 193))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_calculate)
                        .addGap(84, 84, 84)
                        .addComponent(tot)
                        .addGap(40, 40, 40)
                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(btn_print)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_billno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item)
                    .addComponent(combo_item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quan)
                    .addComponent(txt_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btn_add)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tot)
                    .addComponent(btn_calculate)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(btn_print)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_calculateActionPerformed
        
        billNum = txt_billno.getText();
        phone = txt_phone.getText();
        int count=tbl_item.getRowCount();
        
        total.setText(Double.toString(netTotal)); 
        
        try{
            String query="INSERT INTO CustomerBill values ('"+billNum+"','"+phone+"' ,'"+netTotal+"')";
        
            ps = dbc.con.prepareStatement(query);
            ps.execute();
           
            for(int i=0;i<count;i++)
            {
                String Cid=tbl_item.getValueAt(i, 0).toString();
                String quan=tbl_item.getValueAt(i, 2).toString();
                String amount=tbl_item.getValueAt(i, 3).toString();
                String bill=txt_billno.getText();
                 
                String query4="INSERT INTO SellTo VALUES('"+bill+"','"+Cid+"','"+quan+"','"+amount+"')";
                ps=dbc.con.prepareStatement(query4);
                ps.execute();

            }
            
            txt_quantity.setText("");
        
            txt_billno.setText("");
            txt_phone.setText("");
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, " error");
        }
        
    
    }//GEN-LAST:event_btn_calculateActionPerformed

    private void txt_phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_phoneActionPerformed

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed
        
        CashierCusBillPrint pr = new CashierCusBillPrint();
        pr.setVisible(true);       
        
    }//GEN-LAST:event_btn_printActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
       
        model=(DefaultTableModel) tbl_item.getModel();
       
        String billNum = txt_billno.getText();
        String phone1 = txt_phone.getText();
        String itCode = (String)combo_item.getSelectedItem();
        int quan = Integer.parseInt(txt_quantity.getText());
        
        
        try{
            String query2 = "SELECT itemName, rate FROM Items WHERE itemCode = '"+itCode+"'";
            
            ps = dbc.con.prepareStatement(query2);
            this.rs = ps.executeQuery();
            
            while(rs.next())
            { 
                int count =0;
                double itemNet =rs.getBigDecimal(2).doubleValue() * quan; 
               
                model.addRow(new Object[]{itCode, rs.getBigDecimal(2), quan, itemNet});
                netTotal = netTotal + itemNet;
                count++;
            }
          
        }
        catch(SQLException ex)
        {
            System.out.println("Error: " + ex);
        }
        
        txt_quantity.setText("");
        
        combo_item.setSelectedItem("Item Code");
       
    }//GEN-LAST:event_btn_addActionPerformed

    
    private void txt_quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_quantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_quantityActionPerformed

    private void totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalActionPerformed

    
    private void combo_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_itemActionPerformed
               
        
    }//GEN-LAST:event_combo_itemActionPerformed

    private void tbl_itemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_itemMouseClicked
        
    }//GEN-LAST:event_tbl_itemMouseClicked

    private void txt_billnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_billnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_billnoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel)tbl_item.getModel();
        
        while(model.getRowCount()>0)
        {
            for(int i=0 ; i<model.getRowCount();i++)
                model.removeRow(i);
            
        }
        
        //String total=Double.toString(netTotal);
        netTotal=0;
        total.setText("");
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(CashierCustomerBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CashierCustomerBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CashierCustomerBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CashierCustomerBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CashierCustomerBill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_calculate;
    private javax.swing.JButton btn_print;
    private javax.swing.JComboBox combo_item;
    private javax.swing.JLabel item;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel quan;
    private javax.swing.JTable tbl_item;
    private javax.swing.JLabel tot;
    private javax.swing.JTextField total;
    private javax.swing.JTextField txt_billno;
    private javax.swing.JTextField txt_phone;
    private javax.swing.JTextField txt_quantity;
    // End of variables declaration//GEN-END:variables
}
