package Vendor;

import Class.DeleteItem;
import Class.ItemManager;
import Class.FoodItem;
import java.awt.Color;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;

public class ModifyItem extends javax.swing.JFrame {

    public ModifyItem(String un) {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        Item = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        username = new javax.swing.JLabel();
        Back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Item.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Category", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Item);

        jButton1.setText("Create");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(50, 50, 50)
                .addComponent(jButton2)
                .addGap(50, 50, 50)
                .addComponent(jButton3)
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(username))
            .addGroup(layout.createSequentialGroup()
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(username))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private static String foodname, category, price;
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel table = (DefaultTableModel)Item.getModel();
        int i = Item.getSelectedRow();
        if (Item.getSelectedRow() == -1)
        {
            JOptionPane.showMessageDialog(this, "Please select a row to edit.");
        }
        else
        {
            foodname = table.getValueAt(i, 0).toString();
            category = table.getValueAt(i, 1).toString();
            price = table.getValueAt(i,2).toString();
            String un = username.getText();
            UpdateItem ui = new UpdateItem(foodname, category, price, un);
            this.dispose();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Item.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        String un = username.getText();
        List<FoodItem> foodItems = ItemManager.readData(un);
        DefaultTableModel table = (DefaultTableModel) Item.getModel();
        for (FoodItem foodItem : foodItems) {
            table.addRow(new String[]{foodItem.getFoodName(), foodItem.getCategory(), foodItem.getPrice()});
        }
    }//GEN-LAST:event_formWindowOpened

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DefaultTableModel table = (DefaultTableModel)Item.getModel();
        String un = username.getText();
        int i = Item.getSelectedRow();
        foodname = table.getValueAt(i, 0).toString();
        category = table.getValueAt(i, 1).toString();
        price = table.getValueAt(i, 2).toString();
        if (Item.getSelectedRow() == -1)
        {
            JOptionPane.showMessageDialog(this, "Please select a row to edit.");
        }
        try
        {
            DeleteItem di = new DeleteItem();
            di.deleteItem(foodname, category, price);
            JOptionPane.showMessageDialog(this, "Remove success.", "Delete", JOptionPane.INFORMATION_MESSAGE);
            Item.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            try
            {
                table.setRowCount(0);
                List<FoodItem> foodItems = ItemManager.readData(un);
                for (FoodItem foodItem : foodItems) {
                    table.addRow(new String[]{foodItem.getFoodName(), foodItem.getCategory(), foodItem.getPrice()});
                }
            }
            catch (Exception ex)
            { 
            }
        }        
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null, "Delete failed ", "Delete Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        String un = username.getText();
        VendorMenu menu = new VendorMenu(un);
        this.dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String un = username.getText();
        CreateItem ci = new CreateItem(un);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JTable Item;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
