/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import config.dbConnector;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
import testapp2.loginform;

/**
 *
 * @author USER
 */
public class scholarshippage extends javax.swing.JFrame {

    String ads;

    /**
     * Creates new form userform2
     */
    public scholarshippage() {
        initComponents();
        displayDatas();
    }
     Color navcolor = new Color(51,204,255);
     Color hovercolor = new Color (255,204,255);
   public void displayDatas(){
    try{
        dbConnector dbc = new dbConnector();
        ResultSet rs = dbc.getData("SELECT scholarship_id,scholarship_name,scholarship_type,scholarship_description,scholarship_status FROM tbl_scholarship");
        scholarshiptable.setModel(DbUtils.resultSetToTableModel(rs));
        rs.close();
    } catch(SQLException ex){
        System.out.println("Errors: "+ex.getMessage());
    }

   }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        currentuser = new javax.swing.JLabel();
        userid = new javax.swing.JLabel();
        p_add = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        update = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        userstable = new javax.swing.JScrollPane();
        scholarshiptable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        jLabel1.setText("Scholarship Informations");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 10, 480, 40);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-student-100.png"))); // NOI18N
        jPanel2.add(jLabel7);
        jLabel7.setBounds(570, 30, 120, 100);

        currentuser.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        currentuser.setText("Current User");
        jPanel2.add(currentuser);
        currentuser.setBounds(580, 130, 90, 17);

        userid.setText("User ID");
        jPanel2.add(userid);
        userid.setBounds(590, 160, 36, 14);

        p_add.setBackground(new java.awt.Color(102, 204, 255));
        p_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p_addMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p_addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p_addMouseExited(evt);
            }
        });
        p_add.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel5.setText("ADD");
        p_add.add(jLabel5);
        jLabel5.setBounds(30, 10, 30, 17);

        jPanel2.add(p_add);
        p_add.setBounds(30, 90, 110, 30);

        update.setBackground(new java.awt.Color(102, 204, 255));
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateMouseExited(evt);
            }
        });
        update.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel3.setText("EDIT");
        update.add(jLabel3);
        jLabel3.setBounds(30, 10, 31, 17);

        jPanel2.add(update);
        update.setBounds(30, 140, 110, 30);

        userstable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userstableMouseClicked(evt);
            }
        });

        scholarshiptable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        scholarshiptable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                scholarshiptableMouseClicked(evt);
            }
        });
        userstable.setViewportView(scholarshiptable);

        jPanel2.add(userstable);
        userstable.setBounds(10, 180, 760, 240);

        jPanel3.setBackground(new java.awt.Color(51, 204, 255));
        jPanel3.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("Back");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel2);
        jLabel2.setBounds(10, 0, 60, 30);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(660, 430, 80, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/scholarship.jpg"))); // NOI18N
        jPanel2.add(jLabel4);
        jLabel4.setBounds(0, 0, 810, 470);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 810, 470);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 808, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void scholarshiptableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scholarshiptableMouseClicked

    }//GEN-LAST:event_scholarshiptableMouseClicked

    private void userstableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userstableMouseClicked

    }//GEN-LAST:event_userstableMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        admindashboard ds = new admindashboard ();
        ds.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void p_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_addMouseClicked
        addscholarshipform as = new addscholarshipform();
        as.setVisible(true);
     
        this.dispose();
    }//GEN-LAST:event_p_addMouseClicked

    private void p_addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_addMouseEntered

        p_add.setBackground(hovercolor);
    }//GEN-LAST:event_p_addMouseEntered

    private void p_addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_addMouseExited

        p_add.setBackground(navcolor);
    }//GEN-LAST:event_p_addMouseExited

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
      int rowIndex = scholarshiptable.getSelectedRow();
        loginform lb = new loginform();
        admindashboard ad = new admindashboard();
       
     
        Connection conn;
        String newImage = null;
        if (rowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Please Select an Item!");
        } else {
            TableModel model = scholarshiptable.getModel();
            updateScholarForm usf = new updateScholarForm();
            usf.sc_id.setText("" + model.getValueAt(rowIndex, 0));
            usf.sc_name.setText("" + model.getValueAt(rowIndex, 1));
            usf.sc_type.setText("" + model.getValueAt(rowIndex, 2));
            usf.sc_des.setText("" + model.getValueAt(rowIndex, 3));
            usf.sc_status.setSelectedItem(model.getValueAt(rowIndex, 4).toString());
            usf.setVisible(true);
            this.hide();
            usf.ads = ads;
        }

    }//GEN-LAST:event_updateMouseClicked

    private void updateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseEntered
        update.setBackground(hovercolor);
    }//GEN-LAST:event_updateMouseEntered

    private void updateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseExited
        update.setBackground(navcolor);
    }//GEN-LAST:event_updateMouseExited

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
            java.util.logging.Logger.getLogger(scholarshippage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(scholarshippage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(scholarshippage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(scholarshippage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new scholarshippage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel currentuser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel p_add;
    private javax.swing.JTable scholarshiptable;
    private javax.swing.JPanel update;
    public javax.swing.JLabel userid;
    private javax.swing.JScrollPane userstable;
    // End of variables declaration//GEN-END:variables

    private void displayData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
