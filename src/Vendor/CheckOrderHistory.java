package Vendor;

import Class.CheckOrderHistoryClass;
import Class.Orderoo;
import Class.Orderpending;
import java.awt.Color;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class CheckOrderHistory extends javax.swing.JFrame {

    public CheckOrderHistory(String un) {
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
        Back = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderar = new javax.swing.JTable();
        month = new com.toedter.calendar.JMonthChooser();
        year = new com.toedter.calendar.JYearChooser();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        username.setText("username");

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

        orderar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer", "Food", "Quantity", "Price", "DTD", "Address", "Date", "Status"
            }
        ));
        jScrollPane1.setViewportView(orderar);
        if (orderar.getColumnModel().getColumnCount() > 0) {
            orderar.getColumnModel().getColumn(0).setPreferredWidth(100);
            orderar.getColumnModel().getColumn(1).setPreferredWidth(250);
        }

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Check");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 873, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(username))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jButton1)
                        .addGap(161, 161, 161)
                        .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(username))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        String un = username.getText();
        VendorMenu menu = new VendorMenu(un);
        this.dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        orderar.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        String un = username.getText();
        List<Orderoo> foodItem = CheckOrderHistoryClass.readData(un);
        DefaultTableModel table = (DefaultTableModel) orderar.getModel();
        for (Orderoo order : foodItem) {
            table.addRow(new String[]{order.getCustomerid(), order.getFood(), order.getQuantity(), order.getPrice(), order.getDtd(), order.getAddress(), order.getDate(), order.getStatus()});
        }
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        orderar.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        String un = username.getText();
        List<Orderoo> foodItem = CheckOrderHistoryClass.readData(un);
        DefaultTableModel table = (DefaultTableModel) orderar.getModel();
        table.setRowCount(0);
        for (Orderoo order : foodItem) {
            table.addRow(new String[]{order.getCustomerid(), order.getFood(), order.getQuantity(), order.getPrice(), order.getDtd(), order.getAddress(), order.getDate(), order.getStatus()});
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        orderar.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        String un = username.getText();
        int m = month.getMonth()+1;
        int y = year.getYear();
        List<Orderoo> foodItem = CheckOrderHistoryClass.readData(un);
        DefaultTableModel table = (DefaultTableModel) orderar.getModel();
        table.setRowCount(0);
        for (Orderoo order : foodItem) {
            LocalDate orderDate = LocalDate.parse(order.getDate(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            int orderMonth = orderDate.getMonthValue();
            int orderYear = orderDate.getYear();
            if (orderMonth == m && orderYear == y) {
                table.addRow(new String[]{order.getCustomerid(), order.getFood(), order.getQuantity(), order.getPrice(), order.getDtd(), order.getAddress(), order.getDate(), order.getStatus()});
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JMonthChooser month;
    private javax.swing.JTable orderar;
    private javax.swing.JLabel username;
    private com.toedter.calendar.JYearChooser year;
    // End of variables declaration//GEN-END:variables
}
