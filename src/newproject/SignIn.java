
package newproject;

import java.awt.Color;
import java.sql.*;
import javax.swing.*;


public class SignIn extends javax.swing.JFrame {

    Statement stat;                      //close stat,prestat and rs                           //variable for executing static query
    PreparedStatement preStat;                                      //variable for executing dynamic query
    ResultSet rs;                                                   //variable for executing query
    GetDBConnection dbc = new GetDBConnection();                    //Connect to the database
    
    private String inputUsername;
    private String inputpassword;
    private String empPost;
    
    
    public SignIn() {
        setUndecorated(true);
        setBackground(new Color(1.0f,1.0f,1.0f,0.5f));
               
        initComponents();
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_username = new javax.swing.JTextField();
        lbl_username = new javax.swing.JLabel();
        lbl_password = new javax.swing.JLabel();
        btn_signIn = new javax.swing.JButton();
        lbl_signIn = new javax.swing.JLabel();
        btn_close = new javax.swing.JButton();
        txt_password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbl_username.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lbl_username.setText("username");

        lbl_password.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        lbl_password.setText("password");

        btn_signIn.setText("SIGN IN");
        btn_signIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signInActionPerformed(evt);
            }
        });

        lbl_signIn.setFont(new java.awt.Font("Vrinda", 1, 24)); // NOI18N
        lbl_signIn.setText("SIGN IN");

        btn_close.setText("CLOSE");
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_password, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_username, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_username, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(txt_password)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(lbl_signIn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(btn_signIn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(btn_close, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lbl_signIn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_username, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_password, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_signIn)
                    .addComponent(btn_close))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        
        this.dispose();
        
    }//GEN-LAST:event_btn_closeActionPerformed

    private void btn_signInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signInActionPerformed
        
        this.inputUsername = txt_username.getText();
        this.inputpassword = txt_password.getText();        
        
        try{   
            //execute sql queries and load the records into results set
            String query = "SELECT * FROM Employee WHERE username=? AND password=?";     
            
            this.preStat = this.dbc.con.prepareStatement(query);                    //search for the relavant results
            preStat.setString(1, this.inputUsername);                               //assign user input username for 1st ? place
            preStat.setString(2, this.inputpassword);                               //assign user input password for 2nd ? place
            this.rs = this.preStat.executeQuery();                                  //execute the query and assign values to a result set 
            
            //validate login details
            if(rs.next())
            {                                           
                JOptionPane.showMessageDialog(this, "You have login successfully..!!!!", "Login Message" ,JOptionPane.PLAIN_MESSAGE);   //login succes message
                
                //get the post of the employee and give them relavant welcome page
                empPost = this.rs.getString("post");                                                  
                                
                if(empPost.equals("Owner"))
                {
                    OwnerPage op = new OwnerPage();
                    op.setVisible(true);
                    this.dispose();     
                }
                else if(empPost.equals("Manager"))
                {
                    ManagerPage mp = new ManagerPage();
                    mp.setVisible(true);
                    this.dispose();     
                }
                else if(empPost.equals("Cashier"))
                {
                    CashierPage cp = new CashierPage();
                    cp.setVisible(true);
                    this.dispose();     
                }
                else if(empPost.equals("Worker"))
                {
                    WorkerPage wp = new WorkerPage();
                    wp.setVisible(true);
                    this.dispose();     
                }             
                           
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password.!! \nTry Again..!", "ERROR" ,JOptionPane.ERROR_MESSAGE);
            }    
            
            
            this.rs.close();
            this.preStat.close();
        }

        catch(SQLException err)
        {
            JOptionPane.showMessageDialog(null, "Error: " + err, "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btn_signInActionPerformed

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
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_close;
    private javax.swing.JButton btn_signIn;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JLabel lbl_signIn;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
