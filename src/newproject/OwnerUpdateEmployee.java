
package newproject;

//import dinsowner.*;
import java.sql.Connection;
import java.sql.*;
import java.util.*;
import java.sql.ResultSet;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class OwnerUpdateEmployee extends javax.swing.JFrame {

    Statement stat;                      //close stat,prestat and rs                           //variable for executing static query
    PreparedStatement pst;                                      //variable for executing dynamic query
    ResultSet rs;                                                   //variable for executing query
                                                   //variable for executing query
    GetDBConnection dbc = new GetDBConnection();                    //Connect to the database
    
    
    public OwnerUpdateEmployee() {
        initComponents();
        
     
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nametext = new javax.swing.JTextField();
        CIDtext = new javax.swing.JTextField();
        phonetext = new javax.swing.JTextField();
        addtext = new javax.swing.JTextField();
        postComboBox = new javax.swing.JComboBox();
        genderComboB = new javax.swing.JComboBox();
        SearcheButton = new javax.swing.JButton();
        UpdateButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        addemptable = new javax.swing.JTable();
        calen_dofbirth = new com.toedter.calendar.JCalendar();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Owner Update Employee Details");

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("Update  Employee");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Employee ID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Address");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Post");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Phone num");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Date Of Birth");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Gender");

        nametext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametextActionPerformed(evt);
            }
        });

        CIDtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CIDtextActionPerformed(evt);
            }
        });

        phonetext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonetextActionPerformed(evt);
            }
        });

        addtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtextActionPerformed(evt);
            }
        });

        postComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Post", "Owner", "Manager", "Cashier", "Worker", "" }));

        genderComboB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Gender", "Male", "Female", " " }));
        genderComboB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderComboBActionPerformed(evt);
            }
        });

        SearcheButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SearcheButton.setText("Search");
        SearcheButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearcheButtonActionPerformed(evt);
            }
        });

        UpdateButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        UpdateButton.setText("UPDATE");
        UpdateButton.setDoubleBuffered(true);
        UpdateButton.setEnabled(false);
        UpdateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAddbutton3ActionPerformed(evt);
            }
        });

        addemptable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIC", "Name", "Post", "Phone", "Gender", "Date of Birth", "Address"
            }
        ));
        addemptable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addemptableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(addemptable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(60, 60, 60)
                        .addComponent(phonetext))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CIDtext)
                            .addComponent(nametext)
                            .addComponent(postComboBox, 0, 277, Short.MAX_VALUE)
                            .addComponent(genderComboB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addtext)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(calen_dofbirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SearcheButton)
                    .addComponent(UpdateButton))
                .addGap(139, 139, 139))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CIDtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearcheButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(nametext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel5))
                            .addComponent(postComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(phonetext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(genderComboB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(addtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(100, 100, 100))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(calen_dofbirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nametextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nametextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nametextActionPerformed

    private void CIDtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CIDtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CIDtextActionPerformed

    private void phonetextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonetextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phonetextActionPerformed

    private void addtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addtextActionPerformed

    private void SearcheButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearcheButtonActionPerformed
       
        //-------------enebled(true)-------------
        UpdateButton.setEnabled(true);
       
        //--------------search ------------
       
          try{ 
        
              String id = CIDtext.getText();
              String name = nametext.getText();

              String sql = "select * from Employee where empId LIKE CONCAT('%','" + id + "','%') and empName LIKE CONCAT('%','" + name + "','%')";
              pst = dbc.con.prepareStatement(sql);
              rs = pst.executeQuery();
              

            while (rs.next()) {

                String did = rs.getString("empId");
                String dname = rs.getString("empName");
                String post = rs.getString("post");
                String phone = rs.getString("empPhone");
                String gender = rs.getString("gender");
                String add = rs.getString("empAddress");
                java.sql.Date date1 = rs.getDate("dOfBirth");
                
  
                CIDtext.setText(did);
                nametext.setText(dname);
                postComboBox.setSelectedItem(post);
                phonetext.setText(phone);
                genderComboB.setSelectedItem(gender);
                addtext.setText(add);
                
                addtext.setText(add);
                
                DefaultTableModel model = (DefaultTableModel) addemptable.getModel();
                model.addRow(new Object[]{did, dname, post, phone, gender,  date1,add});
               
            }

        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, " error!!");
        }

        
    }//GEN-LAST:event_SearcheButtonActionPerformed

    private void genderComboBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderComboBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderComboBActionPerformed

    private void addemptableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addemptableMouseClicked
        
                 int r=addemptable.getSelectedRow();
        
                String id= addemptable.getValueAt(r, 0).toString();
                String name= addemptable.getValueAt(r, 1).toString();  
                String post= addemptable.getValueAt(r, 2).toString();
                String phone= addemptable.getValueAt(r, 3).toString();
                String gender= addemptable.getValueAt(r, 4).toString();
                String add= addemptable.getValueAt(r, 6).toString();
                String dob= addemptable.getValueAt(r, 5).toString();


                CIDtext.setText(id);
                nametext.setText(name);
                postComboBox.setSelectedItem(post);
                phonetext.setText(phone);
                genderComboB.setSelectedItem(gender);
                addtext.setText(add);

        
    }//GEN-LAST:event_addemptableMouseClicked

    private void CAddbutton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAddbutton3ActionPerformed
  
        //----------------Update---------------------
        
        int x = JOptionPane.showConfirmDialog(null, "Do You Realiy Want to update ?");
        
        if (x == 0) {
            String id = CIDtext.getText();
            String name = nametext.getText();
            String post = (String) postComboBox.getSelectedItem();
            String phone = phonetext.getText();
            String gender = (String) genderComboB.getSelectedItem();
            String add = addtext.getText();
            
             Calendar calen = calen_dofbirth.getCalendar();
             int bdate = calen.get(Calendar.DATE);
             int bmonth = calen.get(Calendar.MONTH);
             int byear = calen.get(Calendar.YEAR);


            try {
                
                String sql = "UPDATE Employee SET empId='"+id+"',empName ='" + name + "',post='" + post + "',empPhone='" + phone + "',gender='" + gender + "',dOfBirth='"+byear+"-"+bmonth+"-"+bdate+"',empAddress='" + add + "' where empId='" + id + "' ";
                pst = dbc.con.prepareStatement(sql);
                pst.execute();
               
             }

            catch (Exception e) 
            {
                JOptionPane.showMessageDialog(null, "error !!!");

            }

        } 
            //-----------reset textfields---------------

            CIDtext.setText("");
            nametext.setText("");
            postComboBox.setSelectedItem("Post");
            phonetext.setText("");
            genderComboB.setSelectedItem("Gender");
           
            addtext.setText("");

    }//GEN-LAST:event_CAddbutton3ActionPerformed

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
            java.util.logging.Logger.getLogger(OwnerUpdateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OwnerUpdateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OwnerUpdateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OwnerUpdateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new OwnerUpdateEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CIDtext;
    private javax.swing.JButton SearcheButton;
    private javax.swing.JButton UpdateButton;
    private javax.swing.JTable addemptable;
    private javax.swing.JTextField addtext;
    private com.toedter.calendar.JCalendar calen_dofbirth;
    private javax.swing.JComboBox genderComboB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nametext;
    private javax.swing.JTextField phonetext;
    private javax.swing.JComboBox postComboBox;
    // End of variables declaration//GEN-END:variables

    private void tableload() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
