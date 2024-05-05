package Vendor;

import Class.DisplayNotification;
import java.awt.Color;
import javax.swing.JOptionPane;

public class VendorMenu extends javax.swing.JFrame {

    public VendorMenu(String un) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setTitle("Vendor Menu");
        String usernm = un;
        getContentPane().setBackground(Color.WHITE);
        username.setText(usernm);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        timetable3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        logout3 = new javax.swing.JButton();
        add3 = new javax.swing.JButton();
        pending3 = new javax.swing.JButton();
        pending4 = new javax.swing.JButton();
        pending5 = new javax.swing.JButton();
        Notification = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Vendor Menu");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Asia Pacific");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(121, 121, 121))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel3)
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(21, 21, 21))
        );

        username.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        username.setText("username");

        timetable3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        timetable3.setText("Modify Item");
        timetable3.setBorder(null);
        timetable3.setBorderPainted(false);
        timetable3.setContentAreaFilled(false);
        timetable3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timetable3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timetable3ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setText("Order Status");
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        logout3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        logout3.setText("Logout");
        logout3.setBorder(null);
        logout3.setBorderPainted(false);
        logout3.setContentAreaFilled(false);
        logout3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout3ActionPerformed(evt);
            }
        });

        add3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add3.setText("Accept / Cancel Order");
        add3.setBorder(null);
        add3.setBorderPainted(false);
        add3.setContentAreaFilled(false);
        add3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add3ActionPerformed(evt);
            }
        });

        pending3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pending3.setText("Customer Review");
        pending3.setBorder(null);
        pending3.setBorderPainted(false);
        pending3.setContentAreaFilled(false);
        pending3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pending3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pending3ActionPerformed(evt);
            }
        });

        pending4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pending4.setText("Check Order History");
        pending4.setBorder(null);
        pending4.setBorderPainted(false);
        pending4.setContentAreaFilled(false);
        pending4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pending4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pending4ActionPerformed(evt);
            }
        });

        pending5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pending5.setText("Revenue Dashboard");
        pending5.setBorder(null);
        pending5.setBorderPainted(false);
        pending5.setContentAreaFilled(false);
        pending5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pending5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pending5ActionPerformed(evt);
            }
        });

        Notification.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Notification.setText("Notification");
        Notification.setToolTipText("");
        Notification.setActionCommand("Notification");
        Notification.setBorder(null);
        Notification.setBorderPainted(false);
        Notification.setContentAreaFilled(false);
        Notification.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Notification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NotificationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(username))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(timetable3)
                            .addComponent(jButton5)
                            .addComponent(add3)
                            .addComponent(pending3)
                            .addComponent(pending5)
                            .addComponent(pending4))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Notification)
                            .addComponent(logout3))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timetable3)
                .addGap(18, 18, 18)
                .addComponent(add3)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addComponent(pending4)
                .addGap(18, 18, 18)
                .addComponent(pending3)
                .addGap(18, 18, 18)
                .addComponent(pending5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(username))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Notification)
                        .addGap(18, 18, 18)
                        .addComponent(logout3)
                        .addGap(0, 26, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void timetable3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timetable3ActionPerformed
        String un = username.getText();
        ModifyItem menu = new ModifyItem(un);
        this.dispose();
    }//GEN-LAST:event_timetable3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        OrderStatus os = new OrderStatus(username.getText());
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void logout3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout3ActionPerformed
        int result = JOptionPane.showConfirmDialog(this, "Are you sure want to logout?", "Logout", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
            LoginF mainmenu = new LoginF();
            this.dispose();
        }
    }//GEN-LAST:event_logout3ActionPerformed

    private void add3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add3ActionPerformed
        ACOrder ac = new ACOrder(username.getText());
        this.dispose();
    }//GEN-LAST:event_add3ActionPerformed

    private void pending3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pending3ActionPerformed
        CustomerReview cr = new CustomerReview(username.getText());
        this.dispose();
    }//GEN-LAST:event_pending3ActionPerformed

    private void pending4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pending4ActionPerformed
        CheckOrderHistory coh = new CheckOrderHistory(username.getText());
        this.dispose();
    }//GEN-LAST:event_pending4ActionPerformed

    private void pending5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pending5ActionPerformed
        RevenueDashboard rd = new RevenueDashboard(username.getText());
        this.dispose();
    }//GEN-LAST:event_pending5ActionPerformed

    private void NotificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NotificationActionPerformed
        DisplayNotification dn = new DisplayNotification();
        dn.displayNotifications(username.getText());
    }//GEN-LAST:event_NotificationActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Notification;
    private javax.swing.JButton add3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton logout3;
    private javax.swing.JButton pending3;
    private javax.swing.JButton pending4;
    private javax.swing.JButton pending5;
    private javax.swing.JButton timetable3;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
