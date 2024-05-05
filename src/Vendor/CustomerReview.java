package Vendor;

import Class.Orderoo;
import Class.Orderstatus;
import Class.review;
import Class.reviewoo;
import java.awt.Color;
import java.util.List;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class CustomerReview extends javax.swing.JFrame {

    public CustomerReview(String un) {
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
                "CustomerID", "Food", "Price", "DTD", "Date", "Review"
            }
        ));
        jScrollPane1.setViewportView(orderar);
        if (orderar.getColumnModel().getColumnCount() > 0) {
            orderar.getColumnModel().getColumn(1).setPreferredWidth(250);
            orderar.getColumnModel().getColumn(5).setPreferredWidth(200);
        }

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
                .addGap(0, 681, Short.MAX_VALUE)
                .addComponent(username))
            .addGroup(layout.createSequentialGroup()
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
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
        List<reviewoo> foodItem = review.readData(un);
        DefaultTableModel table = (DefaultTableModel) orderar.getModel();
        for (reviewoo rv : foodItem) {
                table.addRow(new String[]{rv.getCustomerid(),rv.getFood(),rv.getPrice(),rv.getDtd(),rv.getDate(),rv.getReview()});
        }
    }//GEN-LAST:event_formWindowOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable orderar;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
