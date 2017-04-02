
package newproject;
import java.sql.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class OwnerAddUpdateCompany extends javax.swing.JFrame {

    GetDBConnection dbc = new GetDBConnection();
  
    ResultSet rs;
    PreparedStatement ps;  
    Statement st;  
    DefaultTableModel model;  

    public OwnerAddUpdateCompany() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        com_cid = new javax.swing.JTextField();
        com_name = new javax.swing.JTextField();
        com_add = new javax.swing.JTextField();
        com_phone = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_com = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Owner Add Update Company");

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("ADD COMPANY");

        com_cid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com_cidActionPerformed(evt);
            }
        });

        com_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com_nameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("CID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Company Name");

        table_com.setBackground(new java.awt.Color(153, 153, 153));
        table_com.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Address", "Phone"
            }
        ));
        table_com.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_comMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table_com);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText(" Address");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Phone NO");

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 204, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("SEARCH");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(com_name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(com_cid, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(com_phone, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(44, 44, 44)
                        .addComponent(jButton4))
                    .addComponent(com_add, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(com_cid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(com_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(com_add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(com_phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public void tableload()
    {
        try{
            String sql="SELECT comId,comName,comAddress,comPhone FROM Company";
            ps=dbc.con.prepareStatement(sql);
            rs = ps.executeQuery();
        
        }
        catch(SQLException err){
             JOptionPane.showMessageDialog(null, "Error: " + err, "Error", JOptionPane.ERROR_MESSAGE);
            
        }
    
    }
    
    private void com_cidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_com_cidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_com_cidActionPerformed

    private void com_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_com_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_com_nameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        DefaultTableModel model=(DefaultTableModel) table_com.getModel();
        model.addRow(new Object[]{com_cid.getText(),com_name.getText(),com_add.getText(),com_phone.getText()});
        
        String id=com_cid.getText();
        String name1 = com_name.getText();
        String add1 = com_add.getText();
        String phone1 = com_phone.getText();
        
        try{
            
            String sql="INSERT INTO Company VALUES('"+id+"', '"+name1+"', '"+add1+"', '"+phone1+"')";
            ps=dbc.con.prepareStatement(sql);
            ps.execute();
            
            model.addRow(new Object[]{id,name1, add1, phone1});

            com_cid.setText("");
            com_name.setText("");
            com_add.setText("");
            com_phone.setText("");

        
        }
        catch(SQLException err){
        
            JOptionPane.showMessageDialog(null, "Error: " + err, "Error", JOptionPane.ERROR_MESSAGE);
            
        }
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int x= JOptionPane.showConfirmDialog(null, "Do you really want to update?");
        
        if(x==0){
        
            String ID=com_cid.getText();
            String Name = com_name.getText();
            String Add=com_add.getText();
            String Phone=com_phone.getText();
            
            String sql="Update Company SET  comName='"+Name+"' , comAddress='"+Add+"' , comPhone='"+Phone+"'  WHERE comId='"+ID+"' ";
            
            try{
                ps=dbc.con.prepareStatement(sql);
                ps.executeUpdate();
            
                model.addRow(new Object[]{ID,Name, Add, Phone});
            
            com_cid.setText("");
            com_name.setText("");
            com_add.setText("");
            com_phone.setText("");
            
           }
          
           catch(SQLException err){
               
                JOptionPane.showMessageDialog(null, "Error: " + err, "Error", JOptionPane.ERROR_MESSAGE);
           
           }
           
        tableload();
        
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        String ID= com_cid.getText();
        String NAME= com_name.getText();  
        
        try{
             
            String sql="Select * from Company where comId LIKE CONCAT('%','" + ID + "','%') and comName LIKE CONCAT('%','" + NAME + "','%')";
            ps=dbc.con.prepareStatement(sql);
            rs=ps.executeQuery();
            
            while(rs.next())
            {

                String cid = rs.getString("comId");
                String cname = rs.getString("comName");
                String caddress = rs.getString("comAddress");
                String cphone = Integer.toString(rs.getInt("comPhone"));


                com_cid.setText(cid);
                com_name.setText(cname);
                com_add.setText(caddress);
                com_phone.setText(cphone);
                
                DefaultTableModel model=(DefaultTableModel) table_com.getModel();
                model.addRow(new Object[]{cid, cname, caddress, cphone});
            }
        
        }
        catch(SQLException err)
        {
             JOptionPane.showMessageDialog(null, "Error: " + err, "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void table_comMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_comMouseClicked
        
        int r= table_com.getSelectedRow();
        
        String Cid=table_com.getValueAt(r, 0).toString();
        String name=table_com.getValueAt(r, 1).toString();
        String address=table_com.getValueAt(r, 2).toString();
        String phone=table_com.getValueAt(r, 3).toString();
        
        com_cid.setText(Cid);
        com_name.setText(name);
        com_add.setText(address);
        com_phone.setText(phone);
        
        
        
    }//GEN-LAST:event_table_comMouseClicked

  public class function{
 
  }
    
    
    
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
            java.util.logging.Logger.getLogger(OwnerAddUpdateCompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OwnerAddUpdateCompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OwnerAddUpdateCompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OwnerAddUpdateCompany.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OwnerAddUpdateCompany().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField com_add;
    private javax.swing.JTextField com_cid;
    private javax.swing.JTextField com_name;
    private javax.swing.JTextField com_phone;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table_com;
    // End of variables declaration//GEN-END:variables
}
