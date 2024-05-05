/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Runner;

import Admin.NonBlockingNotification;
import Class.Orderoo;
import Class.Vendor;
import Class.runneraccept;
import Class.runnerupdate;
import Vendor.LoginF;
import javax.swing.*;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Zong Hang
 */
public class RunnerTask extends javax.swing.JFrame {

    public RunnerTask(String un) {
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

        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableTask = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        taskaccepted = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        bnAccept = new javax.swing.JButton();
        bnUpdate = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableTask.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer", "Address", "Price", "Date", "Status"
            }
        ));
        jScrollPane2.setViewportView(tableTask);

        taskaccepted.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer", "Address", "Price", "Date", "Status"
            }
        ));
        jScrollPane1.setViewportView(taskaccepted);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 750, 730));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        bnAccept.setText("Accept");
        bnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnAcceptActionPerformed(evt);
            }
        });

        bnUpdate.setText("Update");
        bnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bnAccept, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(bnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(293, 293, 293)
                .addComponent(bnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 0, 250, 730));

        jPanel7.setBackground(new java.awt.Color(153, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel7.add(bgLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 690, 230, 40));

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

        jPanel7.add(bgDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 230, 100));

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

        jPanel7.add(bgTask, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 230, 100));

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

        jPanel7.add(bgReview, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 230, 100));

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

        jPanel7.add(bgHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 230, 100));

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

        jPanel7.add(bgNotification, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 230, 100));

        username.setFont(new java.awt.Font("Tempus Sans ITC", 2, 18)); // NOI18N
        username.setText("jLabel1");
        jPanel7.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 730));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnUpdateActionPerformed
        DefaultTableModel table = (DefaultTableModel) taskaccepted.getModel();
        DefaultTableModel model = (DefaultTableModel) tableTask.getModel();
        int selectedRow = taskaccepted.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to update the status", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            String cid = taskaccepted.getValueAt(selectedRow, 0).toString();
            String add = taskaccepted.getValueAt(selectedRow, 1).toString();
            String pr = taskaccepted.getValueAt(selectedRow, 2).toString();
            String dt = taskaccepted.getValueAt(selectedRow, 3).toString();
            String currentStatus = taskaccepted.getValueAt(selectedRow, 4).toString();
            runnerupdate ru = new runnerupdate();
            ru.runnerupdate(cid, pr, add, dt);
            if ("Delivering".equals(currentStatus)) {
                int response = JOptionPane.showConfirmDialog(null, "Have you done the delivery?", "Status", JOptionPane.YES_NO_OPTION);
//            String deliveryStatus = (String) tableTask.getValueAt(selectedRow, 4);
                if (response == JOptionPane.YES_OPTION) {

                    JOptionPane.showMessageDialog(this, "Order is delivered", "Success", JOptionPane.INFORMATION_MESSAGE);
                    try (FileOutputStream fos2 = new FileOutputStream("rrevenue.dat", true); BufferedOutputStream bos2 = new BufferedOutputStream(fos2); DataOutputStream dos2 = new DataOutputStream(bos2)) {
                        LocalDateTime currentDateTime = LocalDateTime.now();
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                        String formattedDateTime = currentDateTime.format(formatter);
                        dos2.writeUTF(username.getText());
                        dos2.writeUTF("+" + 5);
                        dos2.writeUTF(formattedDateTime);
                        try (FileInputStream fis = new FileInputStream("runner.dat"); BufferedInputStream bis = new BufferedInputStream(fis); DataInputStream dis = new DataInputStream(bis);) {
                            ArrayList<String> vendor = new ArrayList<>();
                            String firstline = dis.readUTF();
                            vendor.add(firstline);
                            while (dis.available() > 0) {
                                String id = dis.readUTF();
                                String cpw = dis.readUTF();
                                String cname = dis.readUTF();
                                String cphone = dis.readUTF();
                                double revenue = Double.parseDouble(dis.readUTF());
                                Vendor ven = new Vendor(id, cname, cphone, cpw, revenue);
                                if (ven.getName().equals(id)) {
                                    ven.creditTopUp(5);
                                    vendor.add(id);
                                    vendor.add(cpw);
                                    vendor.add(cname);
                                    vendor.add(cphone);
                                    vendor.add(String.valueOf(ven.getCredit()));
                                } else {
                                    vendor.add(id);
                                    vendor.add(cpw);
                                    vendor.add(cname);
                                    vendor.add(cphone);
                                    vendor.add(String.valueOf(revenue));
                                }
                            }
                            try {
                                FileOutputStream fos = new FileOutputStream("runner.dat");
                                BufferedOutputStream bos = new BufferedOutputStream(fos);
                                DataOutputStream dos = new DataOutputStream(bos);
                                for (String str : vendor) {
                                    dos.writeUTF(str);
                                }
                                dos.close();
                                bos.close();
                                fos.close();
                                String message = "Your revenue has been added for RM" + 5 + " at";
                                NonBlockingNotification.logNotification(username.getText(), message);
                                table.setRowCount(0);
                                model.setRowCount(0);
                                loadData();
                            } catch (IOException e) {

                            }
                        } catch (IOException e) {
                        }
                    } catch (FileNotFoundException ex) {
                    } catch (IOException ex) {
                    }

                } else {
                    JOptionPane.showMessageDialog(this, "Update cancelled", "Information", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Cannot update status. Current status is not delivering", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_bnUpdateActionPerformed

    private void bnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnAcceptActionPerformed
        DefaultTableModel table = (DefaultTableModel) tableTask.getModel();
        DefaultTableModel model = (DefaultTableModel) taskaccepted.getModel();
        int selectedRow = tableTask.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to deliver", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String cid = tableTask.getValueAt(selectedRow, 0).toString();
        String add = tableTask.getValueAt(selectedRow, 1).toString();
        String pr = tableTask.getValueAt(selectedRow, 2).toString();
        String dt = tableTask.getValueAt(selectedRow, 3).toString();
        String currentStatus = tableTask.getValueAt(selectedRow, 4).toString();

        if (("Prepared".equals(currentStatus))) {
            runneraccept ra = new runneraccept();
            ra.runneraccept(username.getText(), cid, pr, add, dt);
            table.setRowCount(0);
            model.setRowCount(0);
            loadData();
            JOptionPane.showMessageDialog(this, "Order has been accepted, status changed to delivering.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Cannot accept order", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_bnAcceptActionPerformed

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
        DefaultTableModel table = (DefaultTableModel) taskaccepted.getModel();
        DefaultTableModel model = (DefaultTableModel) tableTask.getModel();
        table.setRowCount(0);
        model.setRowCount(0);
        loadData();
    }//GEN-LAST:event_formWindowOpened

    private void loadData() {
        try (FileInputStream fis = new FileInputStream("order.dat"); BufferedInputStream bis = new BufferedInputStream(fis); DataInputStream dis = new DataInputStream(bis)) {
            List<Orderoo> foodItems = new ArrayList<>();
            String firstline = dis.readUTF();

            while (dis.available() > 0) {
                String cid = dis.readUTF();
                String vndornm = dis.readUTF();
                String foodnm = dis.readUTF();
                String qtt = dis.readUTF();
                String pr = dis.readUTF();
                String dt = dis.readUTF();
                String tdt = dis.readUTF();
                String add = dis.readUTF();
                String status = dis.readUTF();
                String runner = dis.readUTF();
                Orderoo order = new Orderoo(cid, vndornm, foodnm, pr, qtt, dt, status, tdt, add, runner);
                if (status.equals("Prepared") && tdt.equals("Delivery")) {
                    foodItems.add(order);
                }
            }
            DefaultTableModel table = (DefaultTableModel) tableTask.getModel();
            for (Orderoo str : foodItems) {
                String cid = str.getCustomerid();
                String add = str.getAddress();
                String pr = str.getPrice();
                String dt = str.getDate();
                String status = str.getStatus();
                table.addRow(new Object[]{cid, add, pr, dt, status});
            }
        } catch (EOFException e) {
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error loading data from file", "Error", JOptionPane.ERROR_MESSAGE);
        }
        try (FileInputStream fis = new FileInputStream("order.dat"); BufferedInputStream bis = new BufferedInputStream(fis); DataInputStream dis = new DataInputStream(bis)) {
            List<Orderoo> foodItems = new ArrayList<>();
            String firstline = dis.readUTF();

            while (dis.available() > 0) {
                String cid = dis.readUTF();
                String vndornm = dis.readUTF();
                String foodnm = dis.readUTF();
                String qtt = dis.readUTF();
                String pr = dis.readUTF();
                String dt = dis.readUTF();
                String tdt = dis.readUTF();
                String add = dis.readUTF();
                String status = dis.readUTF();
                String runner = dis.readUTF();
                Orderoo order = new Orderoo(cid, vndornm, foodnm, pr, qtt, dt, status, tdt, add, runner);
                if (status.equals("Delivering") && tdt.equals("Delivery") && runner.equals(username.getText())) {
                    foodItems.add(order);
                }
            }
            DefaultTableModel model = (DefaultTableModel) taskaccepted.getModel();
            for (Orderoo str : foodItems) {
                String cid = str.getCustomerid();
                String add = str.getAddress();
                String pr = str.getPrice();
                String dt = str.getDate();
                String status = str.getStatus();
                model.addRow(new Object[]{cid, add, pr, dt, status});
            }
        } catch (EOFException e) {
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error loading data from file", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgDashboard;
    private javax.swing.JPanel bgHistory;
    private javax.swing.JPanel bgLogout;
    private javax.swing.JPanel bgNotification;
    private javax.swing.JPanel bgReview;
    private javax.swing.JPanel bgTask;
    private javax.swing.JButton bnAccept;
    private javax.swing.JButton bnUpdate;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbDashboard;
    private javax.swing.JLabel lbHistory;
    private javax.swing.JLabel lbLogout;
    private javax.swing.JLabel lbNotification;
    private javax.swing.JLabel lbReview;
    private javax.swing.JLabel lbTask;
    private javax.swing.JTable tableTask;
    private javax.swing.JTable taskaccepted;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}