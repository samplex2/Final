/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import config.dbConnector;
import java.io.File;

import javax.swing.JOptionPane;

/**
 *
 * @author Hariell
 */
public class updateScholarForm extends javax.swing.JFrame {

    /**
     * Creates new form updateScholarForm
     */
    public static String name = "";
    public static String ads = "";

    public updateScholarForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel34 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        sc_id = new javax.swing.JTextField();
        sc_type = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        sc_des = new javax.swing.JTextField();
        sc_name = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        sc_status = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel34.setBackground(new java.awt.Color(102, 102, 255));
        jPanel34.setPreferredSize(new java.awt.Dimension(543, 594));
        jPanel34.setLayout(null);

        jPanel21.setBackground(new java.awt.Color(204, 204, 204));
        jPanel21.setForeground(new java.awt.Color(204, 204, 204));
        jPanel21.setPreferredSize(new java.awt.Dimension(530, 770));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel20.setBackground(new java.awt.Color(204, 204, 255));
        jPanel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Student ID :");
        jPanel20.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, 33));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Scholarship Name:");
        jPanel20.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, 20));

        sc_id.setEditable(false);
        sc_id.setBackground(new java.awt.Color(255, 255, 255));
        sc_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel20.add(sc_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 179, 28));

        sc_type.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel20.add(sc_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 178, 25));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Scholarship Type :");
        jPanel20.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 130, 33));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setText("Scholarship Description:");
        jPanel20.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 180, 33));
        jPanel20.add(sc_des, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 340, 80));

        sc_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel20.add(sc_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 178, 25));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel20.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, 120, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Status :");
        jPanel20.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 60, 33));

        sc_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Approved", "Declined", "Pending" }));
        jPanel20.add(sc_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, -1, 30));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel18.setText("UPDATE SCHOLARSHIP FORM");
        jPanel20.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 360, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/t_1.png"))); // NOI18N
        jPanel20.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 130));

        jPanel21.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 590));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/t_1.png"))); // NOI18N
        jPanel21.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel34.add(jPanel21);
        jPanel21.setBounds(0, 0, 750, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(updateScholarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateScholarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateScholarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateScholarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updateScholarForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel34;
    public javax.swing.JTextField sc_des;
    public javax.swing.JTextField sc_id;
    public javax.swing.JTextField sc_name;
    public javax.swing.JComboBox<String> sc_status;
    public javax.swing.JTextField sc_type;
    // End of variables declaration//GEN-END:variables
}