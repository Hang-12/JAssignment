package Vendor;

import Admin.NonBlockingNotification;
import Class.AcceptOrder;
import Class.FoodItem;
import Class.ItemManager;
import Class.Orderoo;
import Class.Orderpending;
import Class.Orderpendingoo;
import Class.RejectOrder;
import java.awt.Color;
import java.awt.Component;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class ACOrder extends javax.swing.JFrame {

    public ACOrder(String un) {
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

        username = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderar = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        username.setText("username");

        orderar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Quantity", "Total Price", "DTD", "Date", "Address", "Customerid"
            }
        ));
        jScrollPane1.setViewportView(orderar);
        if (orderar.getColumnModel().getColumnCount() > 0) {
            orderar.getColumnModel().getColumn(0).setResizable(false);
            orderar.getColumnModel().getColumn(0).setPreferredWidth(200);
            orderar.getColumnModel().getColumn(6).setResizable(false);
        }

        jButton1.setText("Accept");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Reject");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Back.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        Back.setText("< Back");
        Back.setBorder(null);
        Back.setBorderPainted(false);
        Back.setContentAreaFilled(false);
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(username, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(107, 107, 107)
                        .addComponent(jButton2)
                        .addGap(171, 171, 171))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(9, 9, 9)
                .addComponent(username))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private static String item, quantity, price, date, customerid, dtd, address;

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel table = (DefaultTableModel) orderar.getModel();
        int i = orderar.getSelectedRow();
        if (orderar.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to edit.");
        } else {
            item = table.getValueAt(i, 0).toString();
            quantity = table.getValueAt(i, 1).toString();
            price = table.getValueAt(i, 2).toString();
            dtd = table.getValueAt(i, 3).toString();
            date = table.getValueAt(i, 4).toString();
            address = table.getValueAt(i, 5).toString();
            customerid = table.getValueAt(i, 6).toString();
            String un = username.getText();
            String runner = "na";
            AcceptOrder ao = new AcceptOrder();
            ao.Acceptorder(un, customerid, item, quantity, price, date, dtd, address,runner);
            
            try (FileOutputStream fos2 = new FileOutputStream("ctransaction.dat", true); BufferedOutputStream bos2 = new BufferedOutputStream(fos2); DataOutputStream dos2 = new DataOutputStream(bos2)){
                LocalDateTime currentDateTime = LocalDateTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                String formattedDateTime = currentDateTime.format(formatter);
                dos2.writeUTF(customerid);
                dos2.writeUTF("-"+price);
                dos2.writeUTF(formattedDateTime);
            String message = "You have accepted an order at";
            String message2 = "Your order has been accepted by vendor and your balance has been deducted by " + price + " at";
            NonBlockingNotification.logNotification(un,message);
            NonBlockingNotification.logNotification(customerid,message2);
                JOptionPane.showMessageDialog(this, "Order Accepted!", "Delete", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
            }
            table.setRowCount(0);
            orderar.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            List<Orderpendingoo> foodItem = Orderpending.readData(un);
            for (Orderpendingoo order : foodItem) {
                String foodAndBeverage = order.getFood();
                String quantity = order.getQuantity();
                String price = order.getPrice();
                String cid = order.getCustomerid();
                String dtd = order.getDtd();
                String date = order.getDate();
                String address = order.getAddress();
                table.addRow(new String[]{foodAndBeverage, quantity, price, dtd, date, address, cid});
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        orderar.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        String un = username.getText();
        List<Orderpendingoo> foodItem = Orderpending.readData(un);
        DefaultTableModel table = (DefaultTableModel) orderar.getModel();
        for (Orderpendingoo order : foodItem) {
            String foodAndBeverage = order.getFood();
            String quantity = order.getQuantity();
            String price = order.getPrice();
            String cid = order.getCustomerid();
            String dtd = order.getDtd();
            String date = order.getDate();
            String add = order.getAddress();
            table.addRow(new String[]{foodAndBeverage, quantity, price, dtd, date, add, cid});
        }
    }//GEN-LAST:event_formWindowOpened

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel table = (DefaultTableModel) orderar.getModel();
        int i = orderar.getSelectedRow();
        if (orderar.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to edit.");
        } else {
            item = table.getValueAt(i, 0).toString();
            quantity = table.getValueAt(i, 1).toString();
            price = table.getValueAt(i, 2).toString();
            dtd = table.getValueAt(i, 3).toString();
            date = table.getValueAt(i, 4).toString();
            address = table.getValueAt(i, 5).toString();
            customerid = table.getValueAt(i, 6).toString();
            String un = username.getText();
            String runner = "na";
            RejectOrder ro = new RejectOrder();
            try {
                ro.Rejectorder(un, customerid, item, quantity, price, date, dtd, address, runner);
                JOptionPane.showMessageDialog(this, "Order Rejected!", "Delete", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
            }
            table.setRowCount(0);
            orderar.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            List<Orderpendingoo> foodItem = Orderpending.readData(un);
            for (Orderpendingoo order : foodItem) {
                String foodAndBeverage = order.getFood();
                String quantity = order.getQuantity();
                String price = order.getPrice();
                String cid = order.getCustomerid();
                String dtd = order.getDtd();
                String date = order.getDate();

                table.addRow(new String[]{foodAndBeverage, quantity, price, date, cid});
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        String un = username.getText();
        VendorMenu menu = new VendorMenu(un);
        this.dispose();
    }//GEN-LAST:event_BackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable orderar;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
