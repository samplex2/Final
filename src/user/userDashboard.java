/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import admin.admindashboard;
import admin.scholarshippage;
import config.session;
import java.awt.Color;
import javax.swing.JOptionPane;
import testapp2.loginform;

/**
 *
 * @author USER
 */
public class userDashboard extends javax.swing.JFrame {

    String nam;

    /**
     * Creates new form userDashboard
     */
    public userDashboard() {
        initComponents();
    }
    Color navcolor = new Color(204,255,255);
         Color hovercolor = new Color(204,255,255);


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        user_not = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        user2 = new javax.swing.JLabel();
        user3 = new javax.swing.JLabel();
        user1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        user_app = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setForeground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        user_not.setBackground(new java.awt.Color(204, 255, 255));
        user_not.setPreferredSize(new java.awt.Dimension(170, 180));
        user_not.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user_notMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                user_notMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                user_notMouseExited(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-menu-128.png"))); // NOI18N
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel9.setText("Not Accesable!");

        javax.swing.GroupLayout user_notLayout = new javax.swing.GroupLayout(user_not);
        user_not.setLayout(user_notLayout);
        user_notLayout.setHorizontalGroup(
            user_notLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, user_notLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(user_notLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9))
                .addGap(20, 20, 20))
        );
        user_notLayout.setVerticalGroup(
            user_notLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, user_notLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(28, 28, 28))
        );

        jPanel1.add(user_not, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, 170));

        user2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        user2.setText("User");
        jPanel1.add(user2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 221, 140, -1));

        user3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        user3.setText("User");
        jPanel1.add(user3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 140, 30));

        user1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        user1.setText("User");
        jPanel1.add(user1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 140, 30));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-log-out-30.png"))); // NOI18N
        jLabel10.setText("LOG OUT");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 420, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/uni.PNG"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, -1));

        user_app.setBackground(new java.awt.Color(204, 255, 255));
        user_app.setPreferredSize(new java.awt.Dimension(170, 180));
        user_app.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user_appMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                user_appMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                user_appMouseExited(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-scholarship-64.png"))); // NOI18N
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel4.setText("View Scholarship");

        javax.swing.GroupLayout user_appLayout = new javax.swing.GroupLayout(user_app);
        user_app.setLayout(user_appLayout);
        user_appLayout.setHorizontalGroup(
            user_appLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(user_appLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(user_appLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, user_appLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, user_appLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(50, 50, 50))))
        );
        user_appLayout.setVerticalGroup(
            user_appLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, user_appLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(30, 30, 30)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(user_app, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, -1, 170));

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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       session sess= session.getInstance();
       if(sess.getUid()== 0){
           JOptionPane.showMessageDialog(null,"No account, Please login!");
           loginform lf=new loginform();
         lf.setVisible(true);
           this.dispose();
       }
       
       user1.setText(""+sess.getFname());
       user2.setText(""+sess.getLname());
       user3.setText(""+sess.getEmail());
    }//GEN-LAST:event_formWindowActivated

    private void user_notMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_notMouseExited
      user_not.setBackground(hovercolor);    
    }//GEN-LAST:event_user_notMouseExited

    private void user_notMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_notMouseEntered
       user_not.setBackground(navcolor);    
    }//GEN-LAST:event_user_notMouseEntered

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        loginform lg = new loginform();
        lg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void user_notMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_notMouseClicked
 // Assuming 'userDashboard' is a container component like JFrame or JPanel

// Check if the user is an admin

    }//GEN-LAST:event_user_notMouseClicked

    private void user_appMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_appMouseClicked
     viewscholar sp = new viewscholar();
     sp.setVisible(true);
     this.dispose();
    }//GEN-LAST:event_user_appMouseClicked

    private void user_appMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_appMouseEntered
        user_app.setBackground(hovercolor);    
    }//GEN-LAST:event_user_appMouseEntered

    private void user_appMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_appMouseExited
        user_app.setBackground(navcolor);    
    }//GEN-LAST:event_user_appMouseExited

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
            java.util.logging.Logger.getLogger(userDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel user1;
    public javax.swing.JLabel user2;
    public javax.swing.JLabel user3;
    private javax.swing.JPanel user_app;
    private javax.swing.JPanel user_not;
    // End of variables declaration//GEN-END:variables
}
