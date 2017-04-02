
package newproject;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.math.BigDecimal;

public class OwnerAddItems extends javax.swing.JFrame {

    PreparedStatement preStat;                                      //variable for executing dynamic query
    ResultSet rs;                                                   //variable for executing query
    
    GetDBConnection dbc = new GetDBConnection();                    //Connect to the database  
    
    DefaultTableModel model;
    
        
    public OwnerAddItems() {
        initComponents();
        fillCompany();
    }
    
    private void fillCompany()
    {
        String query = "SELECT * FROM Company";              
                  
        String com1;
        int count;      
        
        try{
            preStat = dbc.con.prepareStatement(query);
            rs = this.preStat.executeQuery();                     
            
            while(rs.next())
            {
                com1 = rs.getString("comName");
                combo_company.addItem(com1);                
            }
            
        }
        catch(SQLException err)
        {
            JOptionPane.showMessageDialog(null, "error");
        }
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_itemcode = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_itemcode = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_items = new javax.swing.JTable();
        btn_add = new javax.swing.JButton();
        lbl_itemname = new javax.swing.JLabel();
        txt_itemname = new javax.swing.JTextField();
        lbl_rate = new javax.swing.JLabel();
        txt_rate = new javax.swing.JTextField();
        lbl_rate1 = new javax.swing.JLabel();
        combo_company = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add New Items");
        setBackground(new java.awt.Color(153, 153, 153));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        lbl_itemcode.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_itemcode.setText("Item Code : ");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ADD NEW ITEMS");

        txt_itemcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_itemcodeActionPerformed(evt);
            }
        });

        tbl_items.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Item Name", "Company", "Rate", "Remain Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_items.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(tbl_items);

        btn_add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_add.setText("Add");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        lbl_itemname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_itemname.setText("Item Name : ");

        txt_itemname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_itemnameActionPerformed(evt);
            }
        });

        lbl_rate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_rate.setText("Item Rate : ");

        txt_rate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_rateActionPerformed(evt);
            }
        });

        lbl_rate1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_rate1.setText("Supplier Company : ");

        combo_company.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Company" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_rate1)
                                .addGap(2, 2, 2)
                                .addComponent(combo_company, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_rate, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_rate))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_itemname, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_itemname))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_itemcode, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_itemcode, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_add)))
                .addGap(63, 63, 63))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_itemcode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_itemcode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_itemname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_itemname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_rate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_rate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_rate1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_company, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_add))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_itemcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_itemcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_itemcodeActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        
        String itcode = txt_itemcode.getText();
        String itname = txt_itemname.getText();
        double itrate = Double.parseDouble(txt_rate.getText());
        String company = combo_company.getSelectedItem().toString();
        String query = "";
        
        this.model = (DefaultTableModel) tbl_items.getModel();
                
        try{
            String comid = "";
            
            query = "INSERT INTO Items VALUES('"+itcode+"', '"+itname+"', "+itrate+", "+0+")";
            preStat = dbc.con.prepareStatement(query);
            this.preStat.execute();
                        
            
            query = "SELECT comId FROM Company WHERE comName = '"+company+"'";
            preStat = dbc.con.prepareStatement(query);
            this.rs = this.preStat.executeQuery();
            if(rs.next()){
                comid = rs.getString("comId");
            }
                         
            query = "INSERT INTO Supply VALUES('"+itcode+"', '"+comid+"')";
            preStat = dbc.con.prepareStatement(query);
            this.preStat.execute();
                            
            model.addRow(new Object[]{itcode, itname, company, itrate, "0"});
            
        }
        catch (SQLException err){
            
            JOptionPane.showMessageDialog(null, "Error: " + err, "Error", JOptionPane.ERROR_MESSAGE);
        }
      
        txt_itemcode.setText("");
        txt_itemname.setText("");
        txt_rate.setText("");
        combo_company.setSelectedIndex(1);
             
    }//GEN-LAST:event_btn_addActionPerformed

    private void txt_itemnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_itemnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_itemnameActionPerformed

    private void txt_rateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_rateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_rateActionPerformed

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
            java.util.logging.Logger.getLogger(OwnerAddItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OwnerAddItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OwnerAddItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OwnerAddItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new OwnerAddItems().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JComboBox<String> combo_company;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_itemcode;
    private javax.swing.JLabel lbl_itemname;
    private javax.swing.JLabel lbl_rate;
    private javax.swing.JLabel lbl_rate1;
    private javax.swing.JTable tbl_items;
    private javax.swing.JTextField txt_itemcode;
    private javax.swing.JTextField txt_itemname;
    private javax.swing.JTextField txt_rate;
    // End of variables declaration//GEN-END:variables
}
