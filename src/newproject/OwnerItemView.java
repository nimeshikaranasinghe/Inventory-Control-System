
package newproject;

import java.sql.Connection;
import java.sql.*;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class OwnerItemView extends javax.swing.JFrame {

    Statement stat;                      //close stat,prestat and rs                           //variable for executing static query
    PreparedStatement pst;                                      //variable for executing dynamic query
    ResultSet rs;                                                   //variable for executing query
                                                   //variable for executing query
    GetDBConnection dbc = new GetDBConnection(); 
    
    String comid= "";
    
    public OwnerItemView() {
        initComponents();
        fillCompany();
         
    }

    
    private void fillCompany()
    {
        String query = "SELECT * FROM Company";              
                  
        String com1;
        int count;      
        
        try{
            pst = dbc.con.prepareStatement(query);
            rs = this.pst.executeQuery();                     
            
            while(rs.next())
            {
                com1 = rs.getString("comName");
                combo_company.addItem(com1);
                comid = rs.getString("comId");
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        codetext = new javax.swing.JTextField();
        nametext = new javax.swing.JTextField();
        combo_company = new javax.swing.JComboBox();
        CAddbutton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemviewtabel = new javax.swing.JTable();
        btn_new = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Manager Item View");

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("Item View ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Item Code");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Item Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Company Name");

        codetext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codetextActionPerformed(evt);
            }
        });

        nametext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametextActionPerformed(evt);
            }
        });

        combo_company.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Company" }));
        combo_company.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_companyActionPerformed(evt);
            }
        });

        CAddbutton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CAddbutton2.setText("VIEW");
        CAddbutton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAddbutton2ActionPerformed(evt);
            }
        });

        itemviewtabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Code", "Item Name", "Company Name", "Company ID", "Rate", "Quantity"
            }
        ));
        jScrollPane1.setViewportView(itemviewtabel);

        btn_new.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_new.setText("NEW SEARCH");
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(codetext, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(combo_company, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nametext, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(195, 195, 195)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 112, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(CAddbutton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_new)
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codetext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nametext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_company, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CAddbutton2)
                    .addComponent(btn_new))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void codetextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codetextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codetextActionPerformed

    private void nametextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nametextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nametextActionPerformed

    private void CAddbutton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAddbutton2ActionPerformed
        
        //-----------view items--------------
        String sql = "";  
        
        try{ 
        
            String code = codetext.getText();
            String item=nametext.getText();
            String companyId =(String) combo_company.getSelectedItem();

            if("".equals(code) && !"".equals(item) && !"Company".equals(companyId) )
            {
                
                sql = "select i.itemCode,i.itemName,c.comName,s.comId,i.rate,i.remainQuantity from items i,supply s,company c where  i.itemCode=s.itemCode and s.comId=c.comId and i.itemName LIKE CONCAT('%', '" +item+ "', '%') OR c.comId LIKE CONCAT('%', '" +companyId+ "', '%')";
                pst = dbc.con.prepareStatement(sql);
                rs = pst.executeQuery();
                
                while (rs.next())
                {   
                    String itemname=rs.getString("itemName");
                    String Coddd=rs.getString("itemCode");
                    String Cname=rs.getString("comName");
                    double rate = rs.getBigDecimal("rate").doubleValue();
                    String Com=rs.getString("comId");

                    int quentity = rs.getInt("remainQuantity");

                          //----------send values to tabel--------------

                    DefaultTableModel model = (DefaultTableModel) itemviewtabel.getModel();
                    model.addRow(new Object[]{Coddd,itemname,Cname,Com,rate,quentity});

                }
            }
            
            if(!"".equals(code) && "".equals(item) && !"Company".equals(companyId) )
            {
                sql = "select i.itemCode,i.itemName,c.comName,s.comId,i.rate,i.remainQuantity from items i,supply s,company c where  i.itemCode=s.itemCode and s.comId=c.comId and i.itemCode LIKE CONCAT('%', '" +code+ "', '%') OR c.comId LIKE CONCAT('%', '" +companyId+ "', '%')";
                pst = dbc.con.prepareStatement(sql);
                rs = pst.executeQuery();

                while (rs.next())
                {   
                    String itemname=rs.getString("itemName");
                    String Coddd=rs.getString("itemCode");
                    String Cname=rs.getString("comName");
                    double rate = rs.getBigDecimal("rate").doubleValue();
                    String Com=rs.getString("comId");

                    int quentity = rs.getInt("remainQuantity");

                          //----------send values to tabel--------------

                    DefaultTableModel model = (DefaultTableModel) itemviewtabel.getModel();
                    model.addRow(new Object[]{Coddd,itemname,Cname,Com,rate,quentity});

                }
            }
            
            if(!"".equals(code) && !"".equals(item) && "Company".equals(companyId) )
            {
                sql = "select i.itemCode,i.itemName,c.comName,s.comId,i.rate,i.remainQuantity from items i,supply s,company c where  i.itemCode=s.itemCode and s.comId=c.comId and i.itemCode LIKE CONCAT('%', '" +code+ "', '%') AND i.itemName LIKE CONCAT('%', '" +item+ "', '%')";
                pst = dbc.con.prepareStatement(sql);
                rs = pst.executeQuery();

                while (rs.next())
                {   
                    String itemname=rs.getString("itemName");
                    String Coddd=rs.getString("itemCode");
                    String Cname=rs.getString("comName");
                    double rate = rs.getBigDecimal("rate").doubleValue();
                    String Com=rs.getString("comId");

                    int quentity = rs.getInt("remainQuantity");

                          //----------send values to tabel--------------

                    DefaultTableModel model = (DefaultTableModel) itemviewtabel.getModel();
                    model.addRow(new Object[]{Coddd,itemname,Cname,Com,rate,quentity});

                }
            }
            
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, " error");
        }

        //----------reset Textfields--------------
        
        codetext.setText("");
        nametext.setText("");
       
    }//GEN-LAST:event_CAddbutton2ActionPerformed

    private void combo_companyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_companyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_companyActionPerformed

    private void btn_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newActionPerformed
        
         
        DefaultTableModel model=(DefaultTableModel)itemviewtabel.getModel();
        
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
            java.util.logging.Logger.getLogger(OwnerItemView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OwnerItemView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OwnerItemView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OwnerItemView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new OwnerItemView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CAddbutton2;
    private javax.swing.JButton btn_new;
    private javax.swing.JTextField codetext;
    private javax.swing.JComboBox combo_company;
    private javax.swing.JTable itemviewtabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nametext;
    // End of variables declaration//GEN-END:variables
}
