/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import config.dbConnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static testapp2.registrationForm.mail;
import static testapp2.registrationForm.usname;


/**
 *
 * @author USER
 */
public class createuserform extends javax.swing.JFrame {

    /**
     * Creates new form createuserform
     */
    public createuserform() {
        initComponents();
    }
    
    
    public boolean duplicateCheck(){
    dbConnector dbc = new dbConnector();
    try{
       String query = "SELECT * FROM tbl_user WHERE u_username = '" + username.getText() + "' OR u_email = '" + email.getText() + "'";

            ResultSet resultSet =dbc.getData(query);
        if(resultSet.next()){
           mail = resultSet.getString("u_email");
            System.out.println(""+mail);
            if(mail.equals(email.getText())){
                JOptionPane.showMessageDialog(null,"Email is Already Used!");
              email.setText("");
            }
            usname = resultSet.getString("u_username");
            if(usname.equals(username.getText())){
                JOptionPane.showMessageDialog(null,"Username is Already Used!");
              username.setText("");
            } 
           usname = resultSet.getString("u_username");
             return true;
        }else{
            return false;
        }
    }catch(SQLException ex){
        System.out.println(""+ex);
        return false;
    }
}
    public boolean updateCheck(){
    dbConnector dbc = new dbConnector();
    try{
        String query = "SELECT * FROM tbl_user WHERE (u_username = '"+username.getText()+"' OR u_email = '"+email.getText()+"') AND u_id !='"+uid.getText()+"'";

            ResultSet resultSet =dbc.getData(query);
        if(resultSet.next()){
           mail = resultSet.getString("u_email");
            System.out.println(""+mail);
            if(mail.equals(email.getText())){
                JOptionPane.showMessageDialog(null,"Email is Already Used!");
              email.setText("");
            }
            usname = resultSet.getString("u_username");
            if(usname.equals(username.getText())){
                JOptionPane.showMessageDialog(null,"Username is Already Used!");
              username.setText("");
            } 
           usname = resultSet.getString("u_username");
             return true;
        }else{
            return false;
        }
    }catch(SQLException ex){
        System.out.println(""+ex);
        return false;
    }
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        username = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        ADD = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        usertype = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        us = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        uid = new javax.swing.JTextField();
        UPDATE = new javax.swing.JButton();
        DELETE = new javax.swing.JButton();
        CLEAR = new javax.swing.JButton();
        CANCEL = new javax.swing.JButton();
        REFRESH = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        password = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        ADD.setText("Add");
        ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDActionPerformed(evt);
            }
        });

        jLabel1.setText("Firstname");

        usertype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));
        usertype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usertypeActionPerformed(evt);
            }
        });

        jLabel2.setText("Lastname");

        jLabel6.setText("Usertype");

        jLabel3.setText("Email");

        jLabel4.setText("Username");

        jLabel5.setText("Password");

        us.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Pending", " " }));
        us.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usActionPerformed(evt);
            }
        });

        jLabel7.setText("Userstatus");

        jLabel8.setText("UserID");

        uid.setEnabled(false);

        UPDATE.setText("Update");
        UPDATE.setEnabled(false);
        UPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATEActionPerformed(evt);
            }
        });

        DELETE.setText("Delete");
        DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEActionPerformed(evt);
            }
        });

        CLEAR.setText("Clear");
        CLEAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLEARActionPerformed(evt);
            }
        });

        CANCEL.setText("Cancel");
        CANCEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CANCELActionPerformed(evt);
            }
        });

        REFRESH.setText("Refresh");
        REFRESH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REFRESHActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-student-100.png"))); // NOI18N
        jLabel9.setText("User Registration Form ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(username)
                            .addComponent(email)
                            .addComponent(lname)
                            .addComponent(fname)
                            .addComponent(usertype, 0, 125, Short.MAX_VALUE)
                            .addComponent(us, 0, 125, Short.MAX_VALUE)
                            .addComponent(uid)
                            .addComponent(password))
                        .addGap(155, 155, 155))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ADD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CLEAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(UPDATE)
                                    .addComponent(CANCEL, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(REFRESH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(DELETE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(124, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(uid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(usertype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(us, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ADD)
                    .addComponent(UPDATE)
                    .addComponent(DELETE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CLEAR)
                    .addComponent(CANCEL)
                    .addComponent(REFRESH))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed
        
          
        if(fname.getText().isEmpty()|| lname.getText().isEmpty()|| email.getText().isEmpty()
            || username.getText().isEmpty()|| password.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"All Fields are Required!");
        }else if(password.getText().length()<8){
            password.setText("");
            JOptionPane.showMessageDialog(null,"Password character should be 8 above!");
        }else if(duplicateCheck()){
            System.out.println("Duplicate Exist");
       
        }else{
            dbConnector dbc = new dbConnector();
            if(dbc.insertData("INSERT INTO tbl_user(u_fname,u_lname,u_email,u_username,u_password,u_type,u_status)"
                + "VALUES('"+fname.getText()+"','"+lname.getText()+"','"+email.getText()+"','"+username.getText()+"',"
               + "'"+password.getText()+"','"+usertype.getSelectedItem()+"','"+us.getSelectedItem()+"')"))
        {
            JOptionPane.showMessageDialog(null,"Registration Success!");
            userform uf= new userform();
            uf.setVisible(true);
            this.dispose(); 
        }else{
     
            JOptionPane.showMessageDialog(null,"Connection Error!");
                }
        }
    }//GEN-LAST:event_ADDActionPerformed

    private void usertypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usertypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usertypeActionPerformed

    private void usActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usActionPerformed

    private void UPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATEActionPerformed
       if(fname.getText().isEmpty()|| lname.getText().isEmpty()|| email.getText().isEmpty()
            || username.getText().isEmpty()|| password.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"All Fields are Required!");
        }else if(password.getText().length()<8){
            password.setText("");
            JOptionPane.showMessageDialog(null,"Password character should be 8 above!");
        }else if(updateCheck()){
            System.out.println("Duplicate Exist");
       
        }else{
        
        
        dbConnector dbc= new dbConnector();
       dbc.updateData("UPDATE tbl_user SET u_fname= '"+fname.getText()+"', u_lname='"+lname.getText()+"', u_email='"+email.getText()+"', u_username='"+username.getText()+"',u_password='"+password.getText()+"', u_type='"+usertype.getSelectedItem()+"', u_status= '"+us.getSelectedItem()+"' WHERE u_id= '"+uid.getText()+"'");
   
            userform uf= new userform();
            uf.setVisible(true);
            this.dispose(); 
        }
    }//GEN-LAST:event_UPDATEActionPerformed

    private void DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DELETEActionPerformed

    private void CLEARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLEARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CLEARActionPerformed

    private void CANCELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CANCELActionPerformed
      userform uf= new userform();
      uf.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_CANCELActionPerformed

    private void REFRESHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REFRESHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_REFRESHActionPerformed

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
            java.util.logging.Logger.getLogger(createuserform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(createuserform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(createuserform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(createuserform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new createuserform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton ADD;
    public javax.swing.JButton CANCEL;
    public javax.swing.JButton CLEAR;
    public javax.swing.JButton DELETE;
    public javax.swing.JButton REFRESH;
    public javax.swing.JButton UPDATE;
    public javax.swing.JTextField email;
    public javax.swing.JTextField fname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JTextField lname;
    public javax.swing.JTextField password;
    public javax.swing.JTextField uid;
    public javax.swing.JComboBox<String> us;
    public javax.swing.JTextField username;
    public javax.swing.JComboBox<String> usertype;
    // End of variables declaration//GEN-END:variables
}
