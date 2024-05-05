package Customer;

import Class.CancelOrder;
import java.awt.Color;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class Order_Status extends javax.swing.JFrame {

    public Order_Status(String name) {
        initComponents();
        String username = name;
        usernm.setText(username);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
        setTitle("Customer Menu");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        ostable = new javax.swing.JTable();
        usernm = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jToggleButton1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jToggleButton1.setText("< Back");
        jToggleButton1.setBorder(null);
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        ostable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "VendorName", "Food", "Quantity", "Price", "Date", "DTD", "Address", "Status"
            }
        ));
        jScrollPane3.setViewportView(ostable);
        if (ostable.getColumnModel().getColumnCount() > 0) {
            ostable.getColumnModel().getColumn(0).setPreferredWidth(150);
            ostable.getColumnModel().getColumn(1).setPreferredWidth(200);
        }

        usernm.setText("username");

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 672, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(usernm)))
                .addContainerGap())
            .addComponent(jScrollPane3)
            .addGroup(layout.createSequentialGroup()
                .addGap(332, 332, 332)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(usernm))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        String username = usernm.getText();
        Menu menu = new Menu(username);
        menu.setVisible(true);
        menu.pack();
        menu.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        DefaultTableModel model = (DefaultTableModel) ostable.getModel();
        model.setRowCount(0);
        try (FileInputStream fis = new FileInputStream("orderpending.dat"); BufferedInputStream bis = new BufferedInputStream(fis); DataInputStream dis = new DataInputStream(bis)) {

            String firstline = dis.readUTF();
            while (dis.available() > 0) {
                String cid = dis.readUTF();
                String vendornm = dis.readUTF();
                String food = dis.readUTF();
                String quantity = dis.readUTF();
                String price = dis.readUTF();
                String date = dis.readUTF();
                String dtd = dis.readUTF();
                String address = dis.readUTF();
                String status = dis.readUTF();
                if (cid.equals(usernm.getText())) {
                    model.addRow(new Object[]{vendornm, food, quantity, price, date, dtd, address, status});
                }
            }
        } catch (IOException e) {
        }
    }//GEN-LAST:event_formWindowOpened

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel table = (DefaultTableModel) ostable.getModel();
        int i = ostable.getSelectedRow();
        if (ostable.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to edit.");
        } else {
            String vendorname = table.getValueAt(i, 0).toString();
            String food = table.getValueAt(i, 1).toString();
            String quantity = table.getValueAt(i, 2).toString();
            String price = table.getValueAt(i, 3).toString();
            String date = table.getValueAt(i, 4).toString();
            String dtd = table.getValueAt(i, 5).toString();
            String address = table.getValueAt(i, 6).toString();
            String status = table.getValueAt(i,7).toString();
            String un = usernm.getText();
            String runner = "na";
            CancelOrder co = new CancelOrder();
            try {
                co.Cancelorder(vendorname, un, food, quantity, price, date, dtd, address);
                JOptionPane.showMessageDialog(this, "Order has been cancelled!", "Delete", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
            }
            ostable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            table.setRowCount(0);
        try (FileInputStream fis = new FileInputStream("orderpending.dat"); BufferedInputStream bis = new BufferedInputStream(fis); DataInputStream dis = new DataInputStream(bis)) {

            String firstline = dis.readUTF();
            while (dis.available() > 0) {
                String cid = dis.readUTF();
                String vendornm = dis.readUTF();
                String foods = dis.readUTF();
                String quantitys = dis.readUTF();
                String prices = dis.readUTF();
                String dates = dis.readUTF();
                String dtds = dis.readUTF();
                String addresss = dis.readUTF();
                String statuss = dis.readUTF();
                if (cid.equals(usernm.getText())) {
                    table.addRow(new Object[]{vendornm, foods, quantitys, prices, dates, dtds, addresss, statuss});
                }
            }
        } catch (IOException e) {
        }
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTable ostable;
    private javax.swing.JLabel usernm;
    // End of variables declaration//GEN-END:variables
}
