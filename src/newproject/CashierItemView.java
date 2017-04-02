
package newproject;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class CashierItemView extends javax.swing.JFrame {
    
    Statement stat;                      //close stat,prestat and rs                           //variable for executing static query
    PreparedStatement ps;                                      //variable for executing dynamic query
    ResultSet rs;                                                   //variable for executing query
                                                   //variable for executing query
    GetDBConnection dbc = new GetDBConnection();                    //Connect to the database
    
    String comid = "";
        
    DefaultTableModel model;

    
    public CashierItemView() {
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

        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, " error");
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_view = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_code = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        combo_company = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_item = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        btn_new = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cashier Item View");
        setBackground(new java.awt.Color(153, 153, 153));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        btn_view.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_view.setText("View");
        btn_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Item Code");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Item Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Company");

        combo_company.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Company" }));

        tbl_item.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Item Name", "Rate", "Quantity"
            }
        ));
        jScrollPane1.setViewportView(tbl_item);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setText("ITEM VIEW");

        btn_new.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_new.setText("New Search");
        btn_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(txt_code)
                    .addComponent(txt_name)
                    .addComponent(combo_company, 0, 162, Short.MAX_VALUE)
                    .addComponent(btn_view, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_new, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(combo_company, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_view)
                    .addComponent(btn_new))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewActionPerformed

        String sql = "";
        
             
        try{ 
        
            String code = txt_code.getText();
            String companyId =(String) combo_company.getSelectedItem();
            String item=txt_name.getText();

            
            if("".equals(code) && !"".equals(item) && !"Company".equals(companyId))
            {
            
                sql = "select i.itemCode,i.itemName,i.rate,i.remainQuantity from items i,supply s,company c where  i.itemCode=s.itemCode and s.comId = c.comId  and i.itemName LIKE CONCAT('%', '" +item+ "', '%') OR c.comId LIKE CONCAT('%', '" +companyId+ "', '%')";
                ps = dbc.con.prepareStatement(sql);

                ps = dbc.con.prepareStatement(sql);
                rs = ps.executeQuery();

                while (rs.next()) 
                {
                    String itemname=rs.getString("itemName");
                    String Coddd=rs.getString("itemCode");
                    double rate = rs.getBigDecimal("rate").doubleValue();
                    int quentity = rs.getInt("remainQuantity");


                    //----------send values to tabel--------------

                    DefaultTableModel model = (DefaultTableModel) tbl_item.getModel();
                    model.addRow(new Object[]{Coddd,itemname,rate,quentity});

                }
            }
                
            if(!"".equals(code) && "".equals(item) && !"Company".equals(companyId))
            {
            
                sql = "select i.itemCode,i.itemName,i.rate,i.remainQuantity from items i,supply s,company c where  i.itemCode=s.itemCode and s.comId = c.comId  and i.itemCode LIKE CONCAT('%', '" +code+ "', '%') OR c.comId LIKE CONCAT('%', '" +companyId+ "', '%')";
                ps = dbc.con.prepareStatement(sql);

                ps = dbc.con.prepareStatement(sql);
                rs = ps.executeQuery();

                while (rs.next()) 
                {
                    String itemname=rs.getString("itemName");
                    String Coddd=rs.getString("itemCode");
                    double rate = rs.getBigDecimal("rate").doubleValue();
                    int quentity = rs.getInt("remainQuantity");


                    //----------send values to tabel--------------

                    DefaultTableModel model = (DefaultTableModel) tbl_item.getModel();
                    model.addRow(new Object[]{Coddd,itemname,rate,quentity});

                }
            }
                
            if(!"".equals(code) && !"".equals(item) && "Company".equals(companyId))
            {
            
                sql = "select i.itemCode,i.itemName,i.rate,i.remainQuantity from items i,supply s,company c where  i.itemCode=s.itemCode and s.comId = c.comId  and i.itemCode LIKE CONCAT('%', '" +code+ "', '%') AND i.itemName LIKE CONCAT('%', '" +item+ "', '%')";

                ps = dbc.con.prepareStatement(sql);
                rs = ps.executeQuery();

                while (rs.next()) 
                {
                    String itemname=rs.getString("itemName");
                    String Coddd=rs.getString("itemCode");
                    double rate = rs.getBigDecimal("rate").doubleValue();
                    int quentity = rs.getInt("remainQuantity");


                    //----------send values to tabel--------------

                    DefaultTableModel model = (DefaultTableModel) tbl_item.getModel();
                    model.addRow(new Object[]{Coddd,itemname,rate,quentity});

                }
            }
           
        } 
        catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Error: " + err, "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btn_viewActionPerformed

    private void btn_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newActionPerformed
        
        
         
        DefaultTableModel model=(DefaultTableModel)tbl_item.getModel();
        
        while(model.getRowCount()>0)
        {
            for(int i=0 ; i<model.getRowCount();i++)
                model.removeRow(i);
            
        }
        
        
    }//GEN-LAST:event_btn_newActionPerformed

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
            java.util.logging.Logger.getLogger(CashierItemView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CashierItemView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CashierItemView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CashierItemView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new CashierItemView().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_new;
    private javax.swing.JButton btn_view;
    private javax.swing.JComboBox combo_company;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_item;
    private javax.swing.JTextField txt_code;
    private javax.swing.JTextField txt_name;
    // End of variables declaration//GEN-END:variables
}
