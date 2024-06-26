/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Runner;

import Class.Transactionoo;
import Vendor.LoginF;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Zong Hang
 */
public class RunnerReview extends javax.swing.JFrame {
    private String customerID;
    private String date;
    private List<Review> reviews;
    
    /**
     * Creates new form ReviewExample
     */
    public RunnerReview(String un) {
        initComponents();
        username.setText(un);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setTitle("Runner Menu");
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
        jPanel2 = new javax.swing.JPanel();
        labelCustomerReview = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        review = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        bgLogout = new javax.swing.JPanel();
        lbLogout = new javax.swing.JLabel();
        bgDashboard = new javax.swing.JPanel();
        lbDashboard = new javax.swing.JLabel();
        bgTask = new javax.swing.JPanel();
        lbTask = new javax.swing.JLabel();
        bgReview = new javax.swing.JPanel();
        lbReview = new javax.swing.JLabel();
        bgHistory = new javax.swing.JPanel();
        lbHistory = new javax.swing.JLabel();
        bgNotification = new javax.swing.JPanel();
        lbNotification = new javax.swing.JLabel();
        username = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelCustomerReview.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        labelCustomerReview.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelCustomerReview.setText("Customer Review");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(397, Short.MAX_VALUE)
                .addComponent(labelCustomerReview, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(398, 398, 398))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(labelCustomerReview, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 1000, -1));

        review.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Customer", "Date", "Review"
            }
        ));
        jScrollPane1.setViewportView(review);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 921, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 1000, 630));

        jPanel4.setBackground(new java.awt.Color(153, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bgLogout.setBackground(new java.awt.Color(204, 255, 255));

        lbLogout.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        lbLogout.setText("LOGOUT");
        lbLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbLogoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bgLogoutLayout = new javax.swing.GroupLayout(bgLogout);
        bgLogout.setLayout(bgLogoutLayout);
        bgLogoutLayout.setHorizontalGroup(
            bgLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLogoutLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(lbLogout)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        bgLogoutLayout.setVerticalGroup(
            bgLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLogoutLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbLogout)
                .addGap(32, 32, 32))
        );

        jPanel4.add(bgLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 690, 230, 40));

        bgDashboard.setBackground(new java.awt.Color(204, 255, 255));

        lbDashboard.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        lbDashboard.setText("DASHBOARD");
        lbDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbDashboardMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bgDashboardLayout = new javax.swing.GroupLayout(bgDashboard);
        bgDashboard.setLayout(bgDashboardLayout);
        bgDashboardLayout.setHorizontalGroup(
            bgDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgDashboardLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lbDashboard)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        bgDashboardLayout.setVerticalGroup(
            bgDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgDashboardLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lbDashboard)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel4.add(bgDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 230, 100));

        bgTask.setBackground(new java.awt.Color(204, 255, 255));

        lbTask.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        lbTask.setText("TASK");
        lbTask.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbTaskMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bgTaskLayout = new javax.swing.GroupLayout(bgTask);
        bgTask.setLayout(bgTaskLayout);
        bgTaskLayout.setHorizontalGroup(
            bgTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgTaskLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(lbTask)
                .addContainerGap(85, Short.MAX_VALUE))
        );
        bgTaskLayout.setVerticalGroup(
            bgTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgTaskLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lbTask)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel4.add(bgTask, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 230, 100));

        bgReview.setBackground(new java.awt.Color(204, 255, 255));

        lbReview.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        lbReview.setText("REVIEW");
        lbReview.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbReviewMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bgReviewLayout = new javax.swing.GroupLayout(bgReview);
        bgReview.setLayout(bgReviewLayout);
        bgReviewLayout.setHorizontalGroup(
            bgReviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgReviewLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(lbReview)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        bgReviewLayout.setVerticalGroup(
            bgReviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgReviewLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(lbReview)
                .addGap(32, 32, 32))
        );

        jPanel4.add(bgReview, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 230, 100));

        bgHistory.setBackground(new java.awt.Color(204, 255, 255));

        lbHistory.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        lbHistory.setText("HISTORY");
        lbHistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbHistoryMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bgHistoryLayout = new javax.swing.GroupLayout(bgHistory);
        bgHistory.setLayout(bgHistoryLayout);
        bgHistoryLayout.setHorizontalGroup(
            bgHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgHistoryLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(lbHistory)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        bgHistoryLayout.setVerticalGroup(
            bgHistoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgHistoryLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lbHistory)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel4.add(bgHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 230, 100));

        bgNotification.setBackground(new java.awt.Color(204, 255, 255));

        lbNotification.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        lbNotification.setText("NOTIFICATION");
        lbNotification.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbNotificationMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bgNotificationLayout = new javax.swing.GroupLayout(bgNotification);
        bgNotification.setLayout(bgNotificationLayout);
        bgNotificationLayout.setHorizontalGroup(
            bgNotificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgNotificationLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lbNotification)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        bgNotificationLayout.setVerticalGroup(
            bgNotificationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgNotificationLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lbNotification)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel4.add(bgNotification, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 230, 100));

        username.setFont(new java.awt.Font("Tempus Sans ITC", 2, 18)); // NOI18N
        username.setText("jLabel1");
        jPanel4.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 730));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLogoutMouseClicked
        int result = JOptionPane.showConfirmDialog(this, "Are you sure want to logout?", "Logout", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
            LoginF mainmenu = new LoginF();
            this.dispose();
        }
    }//GEN-LAST:event_lbLogoutMouseClicked

    private void lbDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDashboardMouseClicked
        Dashboard dashboard = new Dashboard(username.getText());
        dashboard.setVisible(true);
        dispose();
    }//GEN-LAST:event_lbDashboardMouseClicked

    private void lbTaskMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbTaskMouseClicked
        RunnerTask task = new RunnerTask(username.getText());
        task.setVisible(true);
        dispose();
    }//GEN-LAST:event_lbTaskMouseClicked

    private void lbReviewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbReviewMouseClicked
        RunnerReview review = new RunnerReview(username.getText());
        review.setVisible(true);
        dispose();
    }//GEN-LAST:event_lbReviewMouseClicked

    private void lbHistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHistoryMouseClicked
        RunnerHistory history = new RunnerHistory(username.getText());
        history.setVisible(true);
        dispose();
    }//GEN-LAST:event_lbHistoryMouseClicked

    private void lbNotificationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNotificationMouseClicked
        // Kelvin's notification page
    }//GEN-LAST:event_lbNotificationMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        readReviews();
    }//GEN-LAST:event_formWindowOpened

    private void readReviews() {
        review.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        DefaultTableModel table = (DefaultTableModel) review.getModel();
        try (FileInputStream fis = new FileInputStream("review.dat"); BufferedInputStream bis = new BufferedInputStream(fis); DataInputStream dis = new DataInputStream(bis)) {

            String firstline = dis.readUTF();

            while (dis.available() > 0) {
                String cid = dis.readUTF();
                String vndornm = dis.readUTF();
                String foodnm = dis.readUTF();
                String qtt = dis.readUTF();
                String pr = dis.readUTF();
                String dtd = dis.readUTF();
                String dt = dis.readUTF();
                String rv = dis.readUTF();
                String run = dis.readUTF();
                if (username.getText().equals(run)) {
                    table.addRow(new Object[]{cid,dt,rv});
                }
            }
        } catch (EOFException e) {

        } catch (IOException ex) {
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgDashboard;
    private javax.swing.JPanel bgHistory;
    private javax.swing.JPanel bgLogout;
    private javax.swing.JPanel bgNotification;
    private javax.swing.JPanel bgReview;
    private javax.swing.JPanel bgTask;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCustomerReview;
    private javax.swing.JLabel lbDashboard;
    private javax.swing.JLabel lbHistory;
    private javax.swing.JLabel lbLogout;
    private javax.swing.JLabel lbNotification;
    private javax.swing.JLabel lbReview;
    private javax.swing.JLabel lbTask;
    private javax.swing.JTable review;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
