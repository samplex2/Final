/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testapp2;

import config.dbConnector;
import config.passwordHasher;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author SCC
 */
public class registrationForm extends javax.swing.JFrame {

    /**
     * Creates new form registrationForm
     */
    public registrationForm() {
        initComponents();
    }
public static String mail, usname; 
    
public boolean duplicateCheck(){
    dbConnector dbc = new dbConnector();
    try{
        String query = "SELECT * FROM tbl_user  WHERE u_username = '" + gpa.getText()+ "' AND u_email = '" + email.getText()+ "'";
            ResultSet resultSet =dbc.getData(query);
        if(resultSet.next()){
           mail = resultSet.getString("u_email");
            System.out.println(""+mail);
            if(mail.equals(email.getText())){
                JOptionPane.showMessageDialog(null,"Email is Already Used!");
              email.setText("");
            }
            usname = resultSet.getString("u_username");
            if(usname.equals(gpa.getText())){
                JOptionPane.showMessageDialog(null,"Username is Already Used!");
              gpa.setText("");
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        gpa = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        current = new javax.swing.JTextField();
        last = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("FirstName :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 50, 80, 20);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Lastname :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 90, 80, 10);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Email :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 120, 50, 10);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Username :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 150, 80, 10);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Password :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 170, 100, 20);

        jButton1.setBackground(new java.awt.Color(153, 153, 0));
        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(200, 320, 100, 30);
        jPanel1.add(gpa);
        gpa.setBounds(120, 260, 180, 30);

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel1.add(email);
        email.setBounds(116, 110, 180, 30);
        jPanel1.add(lname);
        lname.setBounds(116, 80, 180, 30);
        jPanel1.add(fname);
        fname.setBounds(116, 50, 180, 30);

        jLabel9.setBackground(new java.awt.Color(255, 255, 0));
        jLabel9.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel9.setText("Please fill up what is needed");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(150, 10, 370, 29);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Already Registered? Click here");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7);
        jLabel7.setBounds(170, 370, 180, 20);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Current School :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 200, 120, 20);
        jPanel1.add(password);
        password.setBounds(116, 170, 180, 30);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setText("GPA:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(10, 270, 80, 10);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setText("Last School Attended:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(10, 230, 170, 20);
        jPanel1.add(username);
        username.setBounds(116, 140, 180, 30);
        jPanel1.add(current);
        current.setBounds(180, 200, 180, 30);
        jPanel1.add(last);
        last.setBounds(180, 230, 180, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/scholarship.jpg"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(-10, 0, 600, 450);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        loginform lf = new loginform();
        lf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(password.getText().isEmpty()|| username.getText().isEmpty()|| lname.getText().isEmpty()|| email.getText().isEmpty()|| fname.getText().isEmpty()|| current.getText().isEmpty()|| last.getText().isEmpty()|| gpa.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"All Fields are Required!");
        }else if(password.getText().length()<8){
            password.setText("");
            JOptionPane.showMessageDialog(null,"Password character should be 8 above!");
        }else if(duplicateCheck()){
            System.out.println("Duplicate Exist");
        }else{
            dbConnector dbc = new dbConnector();

            try{
                String pass = passwordHasher.hashPassword(password.getText());

                if(dbc.insertData("INSERT INTO tbl_user(u_fname,u_lname,u_email,u_username,u_password,u_current,u_last,u_gpa,u_status)"
                    + "VALUES('"+fname.getText()+"','"+lname.getText()+"','"+email.getText()+"','"+username.getText()+"',"+ "'"+pass+"','"+current.getText()+"','"+last.getText()+"',"+Double.parseDouble(gpa.getText())+",'Pending')"))
            {
                JOptionPane.showMessageDialog(null,"Registration Success!");
                loginform lg = new loginform();
                lg.setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null,"Connection Error!");
    }//GEN-LAST:event_jButton1ActionPerformed
 }catch(NoSuchAlgorithmException ex){
           System.out.println(""+ex);
    }
  }
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
            java.util.logging.Logger.getLogger(registrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrationForm().setVisible(true);
            }
        });
    }
        
        
           

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField current;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField gpa;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField last;
    private javax.swing.JTextField lname;
    public javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables


}
