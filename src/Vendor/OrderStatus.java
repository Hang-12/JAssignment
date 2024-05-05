package Vendor;

import Admin.Customer;
import Admin.NonBlockingNotification;
import Class.FoodItem;
import Class.Orderoo;
import Class.Orderpending;
import Class.Orderpendingoo;
import Class.Orderstatus;
import Class.Vendor;
import java.awt.Color;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class OrderStatus extends javax.swing.JFrame {

    public OrderStatus(String un) {
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
        pickup = new javax.swing.JButton();
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
                "Item", "Quantity", "Price", "DTD", "Address", "Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(orderar);
        if (orderar.getColumnModel().getColumnCount() > 0) {
            orderar.getColumnModel().getColumn(0).setResizable(false);
            orderar.getColumnModel().getColumn(0).setPreferredWidth(200);
            orderar.getColumnModel().getColumn(1).setResizable(false);
            orderar.getColumnModel().getColumn(2).setResizable(false);
            orderar.getColumnModel().getColumn(5).setResizable(false);
            orderar.getColumnModel().getColumn(6).setResizable(false);
        }

        pickup.setText("Order Prepared");
        pickup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pickupActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 415, Short.MAX_VALUE)
                .addComponent(username))
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Back)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(pickup)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Back)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(pickup)
                .addGap(20, 20, 20)
                .addComponent(username))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        orderar.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        String un = username.getText();
        List<Orderoo> foodItem = Orderstatus.readData(un);
        DefaultTableModel table = (DefaultTableModel) orderar.getModel();
        for (Orderoo order : foodItem) {
            table.addRow(new String[]{order.getFood(), order.getQuantity(), order.getPrice(), order.getDtd(), order.getAddress(), order.getDate(), order.getStatus()});
        }
    }//GEN-LAST:event_formWindowOpened

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        String un = username.getText();
        VendorMenu menu = new VendorMenu(un);
        this.dispose();
    }//GEN-LAST:event_BackActionPerformed

    private static String item, quantity, price, date, customerid, dtd, address, status;

    private void pickupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pickupActionPerformed
        DefaultTableModel table = (DefaultTableModel) orderar.getModel();
        int i = orderar.getSelectedRow();
        if (orderar.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to edit.");
        } else {
            item = table.getValueAt(i, 0).toString();
            quantity = table.getValueAt(i, 1).toString();
            price = table.getValueAt(i, 2).toString();
            dtd = table.getValueAt(i, 3).toString();
            address = table.getValueAt(i, 4).toString();
            date = table.getValueAt(i, 5).toString();
            status = table.getValueAt(i, 6).toString();
            String un = username.getText();
            double credit = Double.parseDouble(price);
            File f = new File("order.dat");
            try {
                FileInputStream fis = new FileInputStream(f);
                BufferedInputStream bis = new BufferedInputStream(fis);
                DataInputStream dis = new DataInputStream(bis);
                String firstline = dis.readUTF();
                ArrayList<String> foodItems = new ArrayList<>();
                foodItems.add(firstline);
                try {
                    while (dis.available() > 0) {
                        String cid = dis.readUTF();
                        String vndornm = dis.readUTF();
                        String food = dis.readUTF();
                        String qtt = dis.readUTF();
                        String pr = dis.readUTF();
                        String dt = dis.readUTF();
                        String tdt = dis.readUTF();
                        String add = dis.readUTF();
                        String status = dis.readUTF();
                        String run = dis.readUTF();
                        Orderoo order = new Orderoo(cid, vndornm, food, pr, qtt, dt, status, tdt, add, run);
                        if (order.getFood().equals(food) && order.getQuantity().equals(quantity) && order.getPrice().equals(price) && order.getDtd().equals(dtd) && order.getAddress().equals(address) && order.getDate().equals(date) && order.getStatus().equals("Preparing")) {
                            foodItems.add(cid);
                            foodItems.add(vndornm);
                            foodItems.add(food);
                            foodItems.add(qtt);
                            foodItems.add(pr);
                            foodItems.add(dt);
                            foodItems.add(tdt);
                            foodItems.add(add);
                            foodItems.add("Prepared");
                            foodItems.add(run);
                        } else {
                            foodItems.add(cid);
                            foodItems.add(vndornm);
                            foodItems.add(food);
                            foodItems.add(qtt);
                            foodItems.add(pr);
                            foodItems.add(dt);
                            foodItems.add(tdt);
                            foodItems.add(add);
                            foodItems.add(status);
                            foodItems.add(run);
                        }
                    }
                    dis.close();
                } catch (EOFException e) {
                }
                try (
                        FileOutputStream fos = new FileOutputStream(f); BufferedOutputStream bos = new BufferedOutputStream(fos); DataOutputStream dos = new DataOutputStream(bos);) {

                    for (String str : foodItems) {
                        dos.writeUTF(str);
                    }

                    dos.close();
                    bos.close();
                    fos.close();
                }
                JOptionPane.showMessageDialog(this, "The order status has been turned to prepared!");
                try (FileOutputStream fos2 = new FileOutputStream("vrevenue.dat", true); BufferedOutputStream bos2 = new BufferedOutputStream(fos2); DataOutputStream dos2 = new DataOutputStream(bos2)) {
                    LocalDateTime currentDateTime = LocalDateTime.now();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                    String formattedDateTime = currentDateTime.format(formatter);
                    dos2.writeUTF(un);
                    dos2.writeUTF("+" + price);
                    dos2.writeUTF(formattedDateTime);
                } catch (FileNotFoundException ex) {
                } catch (IOException ex) {
                }
                orderar.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                table.setRowCount(0);
                List<Orderoo> foodItem = Orderstatus.readData(un);
                for (Orderoo order : foodItem) {
                    table.addRow(new String[]{order.getFood(), order.getQuantity(), order.getPrice(), order.getDtd(), order.getAddress(), order.getDate(), order.getStatus()});
                }
            } catch (EOFException e) {
            } catch (IOException e) {
            }
            try (FileInputStream fis = new FileInputStream("vendor.dat"); BufferedInputStream bis = new BufferedInputStream(fis); DataInputStream dis = new DataInputStream(bis);) {
                ArrayList<String> vendor = new ArrayList<>();
                String firstline = dis.readUTF();
                vendor.add(firstline);
                while (dis.available() > 0) {
                    String cid = dis.readUTF();
                    String cpw = dis.readUTF();
                    String cname = dis.readUTF();
                    String cphone = dis.readUTF();
                    double revenue = Double.parseDouble(dis.readUTF());
                    Vendor ven = new Vendor(cid, cname, cphone, cpw, revenue);
                    if (ven.getName().equals(cid)) {
                        ven.creditTopUp(credit);
                        vendor.add(cid);
                        vendor.add(cpw);
                        vendor.add(cname);
                        vendor.add(cphone);
                        vendor.add(String.valueOf(ven.getCredit()));
                    } else {
                        vendor.add(cid);
                        vendor.add(cpw);
                        vendor.add(cname);
                        vendor.add(cphone);
                        vendor.add(String.valueOf(revenue));
                    }
                }
                try {
                    FileOutputStream fos = new FileOutputStream("vendor.dat");
                    BufferedOutputStream bos = new BufferedOutputStream(fos);
                    DataOutputStream dos = new DataOutputStream(bos);
                    for (String str : vendor) {
                        dos.writeUTF(str);
                    }
                    dos.close();
                    bos.close();
                    fos.close();
                    String message = "Your revenue has been added for RM" + price + " at";
                    NonBlockingNotification.logNotification(un, message);

                    ArrayList<String> uname = new ArrayList<>();
                    FileInputStream fis2 = new FileInputStream("runner.dat");
                    BufferedInputStream bis2 = new BufferedInputStream(fis2);
                    DataInputStream dis2 = new DataInputStream(bis2);
                    String firstline2 = dis2.readUTF();
                    while (dis2.available() > 0) {
                        String unm = dis2.readUTF();
                        String pw = dis2.readUTF();
                        String nm = dis2.readUTF();
                        String pn = dis2.readUTF();
                        String revenue = dis2.readUTF();
                        uname.add(nm);
                    }
                    for (String uname1 : uname) {
                        String message2 = "An order has been prepared for deliver with RM" + price + " at";
                        System.out.println(uname1);
                        NonBlockingNotification.logNotification(uname1, message2);
                    }
                } catch (IOException e) {

                }
            } catch (IOException e) {
            }
        }
    }//GEN-LAST:event_pickupActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable orderar;
    private javax.swing.JButton pickup;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
