/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Runner;

import Class.CheckOrderHistoryClass;
import Class.DisplayNotification;
import Class.Orderoo;
import Class.Transactionoo;
import Class.rrevenue;
import Vendor.LoginF;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class Dashboard extends javax.swing.JFrame {
    private HistoryTable historyTable;

    public Dashboard(String un) {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        revenue = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbWelcome = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
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
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbEarnings = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lbDelivery = new javax.swing.JLabel();

        revenue.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Revenue"
            }
        ));
        jScrollPane1.setViewportView(revenue);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        lbWelcome.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        lbWelcome.setText("Welcome,");

        username.setFont(new java.awt.Font("Bell MT", 1, 24)); // NOI18N
        username.setText("jLabel3");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lbWelcome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(username)
                .addContainerGap(780, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbWelcome)
                    .addComponent(username))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 1000, 60));

        jPanel3.setBackground(new java.awt.Color(153, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel3.add(bgLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 690, 230, 40));

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

        jPanel3.add(bgDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 230, 100));

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

        jPanel3.add(bgTask, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 230, 100));

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

        jPanel3.add(bgReview, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 230, 100));

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

        jPanel3.add(bgHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 230, 100));

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

        jPanel3.add(bgNotification, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 230, 100));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 730));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(153, 255, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Mongolian Baiti", 1, 22)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Earnings");

        lbEarnings.setFont(new java.awt.Font("Ink Free", 1, 18)); // NOI18N
        lbEarnings.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lbEarnings, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbEarnings, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(102, 255, 153));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Mongolian Baiti", 1, 22)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Deliveries");

        lbDelivery.setFont(new java.awt.Font("Ink Free", 1, 18)); // NOI18N
        lbDelivery.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(lbDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 1000, 670));

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

    private void lbDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbDashboardMouseClicked
        updateDashboardData();
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
        DisplayNotification dn = new DisplayNotification();
        dn.displayNotifications(username.getText());
    }//GEN-LAST:event_lbNotificationMouseClicked

    private void lbLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLogoutMouseClicked
        int result = JOptionPane.showConfirmDialog(this, "Are you sure want to logout?", "Logout", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (result == JOptionPane.YES_OPTION) {
            LoginF mainmenu = new LoginF();
            this.dispose();
        }
    }//GEN-LAST:event_lbLogoutMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        updateDashboardData();
    }//GEN-LAST:event_formWindowOpened
    
    private void updateDashboardData() {
        revenue.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        String un = username.getText();
        List<Transactionoo> foodItem = rrevenue.readData(un);
        DefaultTableModel table = (DefaultTableModel) revenue.getModel();
        for (Transactionoo order : foodItem) {
            table.addRow(new String[]{order.getTime(), order.getPrice()});
        }
        int rowCount = table.getRowCount();
        double totalRevenue = 0.0;
        for (int i = 0; i < rowCount; i++) {
            String revenueString = table.getValueAt(i, 1).toString();
            try {
                double revenue = Double.parseDouble(revenueString);
                totalRevenue += revenue;
                System.out.println(totalRevenue);
            } catch (NumberFormatException e) {
            }
        }
        lbEarnings.setText("Earnings: RM" + totalRevenue);
        lbDelivery.setText("Number of Deliveries: " + rowCount);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgDashboard;
    private javax.swing.JPanel bgHistory;
    private javax.swing.JPanel bgLogout;
    private javax.swing.JPanel bgNotification;
    private javax.swing.JPanel bgReview;
    private javax.swing.JPanel bgTask;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbDashboard;
    private javax.swing.JLabel lbDelivery;
    private javax.swing.JLabel lbEarnings;
    private javax.swing.JLabel lbHistory;
    private javax.swing.JLabel lbLogout;
    private javax.swing.JLabel lbNotification;
    private javax.swing.JLabel lbReview;
    private javax.swing.JLabel lbTask;
    private javax.swing.JLabel lbWelcome;
    private javax.swing.JTable revenue;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
