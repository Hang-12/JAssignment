package Admin;

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
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class Admin extends javax.swing.JFrame {

    public Admin(String un) {
        initComponents();
        username.setText(un);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
        setTitle("Admin Menu");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        usernm = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        pnumber = new javax.swing.JTextField();
        Add = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        backButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        username = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("User Registration");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Username:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Name: ");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Phone: ");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Password: ");

        usernm.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        password.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        pnumber.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        Add.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Edit.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Edit.setText("Edit");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        Delete.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton1.setText("Customer");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton2.setText("Vendor");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jRadioButton3.setText("Runner");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        backButton.setText("< Back");
        backButton.setBorder(null);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Password", "Name", "Phone Number", "Credit"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        username.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        username.setText("jLabel6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(105, 105, 105)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Add)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel2)))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(usernm, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                            .addComponent(pnumber)))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(Edit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Delete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(username))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton3)
                        .addGap(112, 112, 112)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Add)
                            .addComponent(Edit)
                            .addComponent(Delete)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(usernm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(username))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // all good
    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // Step 1: Collect User Data from GUI
        String id = usernm.getText().trim();
        String nm = name.getText().trim();
        String phone = pnumber.getText().trim();
        String pw = password.getText().trim();

        // Validation: Check if any field is empty
        if (id.isEmpty() || nm.isEmpty() || phone.isEmpty() || pw.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields must be filled out.");
            return;
        } else if (isIdExists(id)) {
            JOptionPane.showMessageDialog(this, "This ID already exists. Please use a different ID.");
            return;
        }
        
        String userType;
        User newUser = null;
        double defaultCredit = 0.0;
        if (jRadioButton1.isSelected()) { // Customer
            userType = "Customer";
        } else if (jRadioButton2.isSelected()) { // Vendor
            userType = "Vendor";
        } else if (jRadioButton3.isSelected()) { // Runner
            userType = "Runner";
        } else {
            // If no radio button is selected
            JOptionPane.showMessageDialog(this, "Please select a user type.");
            return;
        }

        // Attempt to save the user and add to the table
        try {
            File f = new File(userType + ".dat");
            FileOutputStream fos = new FileOutputStream(f, true);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            DataOutputStream dos = new DataOutputStream(bos);
            dos.writeUTF(id);
            dos.writeUTF(pw);
            dos.writeUTF(nm);
            dos.writeUTF(phone);
            dos.writeUTF("0");
            dos.close();
            bos.close();
            fos.close();
            JOptionPane.showMessageDialog(this, "User registered successfully!");
            clearTextField(); // Clear fields on successful addition
            buttonGroup2.clearSelection();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_AddActionPerformed

    // dat done
    private boolean isIdExists(String id) {
        // You might want to check across all user type files: customers.txt, vendors.txt, runners.txt
        return isIdInFile(id, "customer.dat") || isIdInFile(id, "vendor.dat") || isIdInFile(id, "runner.dat");
    }

    // dat done
    private boolean isIdInFile(String id, String filepath) {
         try (
            FileInputStream fis = new FileInputStream(filepath);  BufferedInputStream bis = new BufferedInputStream(fis);  DataInputStream dis = new DataInputStream(bis);) {
            String firstline = dis.readUTF();
            while ((dis.available() > 0)) {
                String un = dis.readUTF();
                String pw = dis.readUTF();
                String name = dis.readUTF();
                String pn = dis.readUTF();
                String balance = dis.readUTF();
                if (un.trim().equals(id)) {
                    return true;
                }
            }
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(this, "File not found: " + e.getMessage());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error reading file: " + e.getMessage());
        }
        return false; // ID not found
    }

    // all good
    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        String id = usernm.getText();
        String pw = password.getText();
        String nm = name.getText();
        String phone = pnumber.getText();
        
        
        // Determine user type (similar to what we did in AddActionPerformed)
        String userType;
        if (jRadioButton1.isSelected()) { // Customer
            userType = "customer";
        } else if (jRadioButton2.isSelected()) { // Vendor
            userType = "vendor";
        } else if (jRadioButton3.isSelected()) { // Runner
            userType = "runner";
        } else {
            // If no radio button is selected
            JOptionPane.showMessageDialog(this, "Please select a user type.");
            return;
        }

        try {
            // Update user data in file
            updateUserInFile(id, nm, phone, pw, userType);

            // Reload the table data
            clearTextField();
            buttonGroup2.clearSelection();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            // Success message
            JOptionPane.showMessageDialog(this, "User details updated successfully!");

        } catch (Exception e) {
            // Failure message
            JOptionPane.showMessageDialog(this, "Failed to update user details: " + e.getMessage());
        }
    }//GEN-LAST:event_EditActionPerformed

    // all good
    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a user to delete.");
            return;
        }
        String userType;
        if (jRadioButton1.isSelected()) { // Customer
            userType = "customer";
        } else if (jRadioButton2.isSelected()) { // Vendor
            userType = "vendor";
        } else if (jRadioButton3.isSelected()) { // Runner
            userType = "runner";
        } else {
            // If no radio button is selected
            JOptionPane.showMessageDialog(this, "Please select a user type.");
            return;
        }
        try {
            // Delete the user from the file
            deleteUserFromFile(userType);

            // Clear input fields
            clearTextField();

            buttonGroup2.clearSelection();
            model.setRowCount(0);
            // Success message
            JOptionPane.showMessageDialog(this, "User deleted successfully!");

        } catch (Exception e) {
            // Failure message
            JOptionPane.showMessageDialog(this, "Failed to delete user: " + e.getMessage());
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        try (FileInputStream fis = new FileInputStream("runner.dat"); BufferedInputStream bis = new BufferedInputStream(fis); DataInputStream dis = new DataInputStream(bis)) {

            String firstline = dis.readUTF();
            while (dis.available() > 0) {
                String cid = dis.readUTF();
                String cpw = dis.readUTF();
                String cname = dis.readUTF();
                String cphone = dis.readUTF();
                String revenue = dis.readUTF();
                model.addRow(new Object[]{cid, cpw, cname, cphone, revenue});
            }

        } catch (IOException e) {
        }
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        AdminMenu adminMenu = new AdminMenu(username.getText());
        adminMenu.setVisible(true); // Show the other JFrame
        this.dispose(); // Close the current JFrame
    }//GEN-LAST:event_backButtonActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        try (FileInputStream fis = new FileInputStream("customer.dat"); BufferedInputStream bis = new BufferedInputStream(fis); DataInputStream dis = new DataInputStream(bis)) {

            String firstline = dis.readUTF();
            while (dis.available() > 0) {
                String cid = dis.readUTF();
                String cpw = dis.readUTF();
                String cname = dis.readUTF();
                String cphone = dis.readUTF();
                String revenue = dis.readUTF();
                model.addRow(new Object[]{cid, cpw, cname, cphone, revenue});
            }

        } catch (IOException e) {
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        try (FileInputStream fis = new FileInputStream("vendor.dat"); BufferedInputStream bis = new BufferedInputStream(fis); DataInputStream dis = new DataInputStream(bis)) {

            String firstline = dis.readUTF();
            while (dis.available() > 0) {
                String cid = dis.readUTF();
                String cpw = dis.readUTF();
                String cname = dis.readUTF();
                String cphone = dis.readUTF();
                String revenue = dis.readUTF();
                model.addRow(new Object[]{cid, cpw, cname, cphone, revenue});
            }

        } catch (IOException e) {
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       String idvalue, pwvalue, nmvalue, pnvalue;
        
        DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        int i = jTable1.getSelectedRow();
        if (jTable1.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to edit.");
        } else {
            idvalue = table.getValueAt(i, 0).toString();
            pwvalue = table.getValueAt(i, 1).toString();
            nmvalue = table.getValueAt(i, 2).toString();
            pnvalue = table.getValueAt(i, 3).toString();
            usernm.setText(idvalue);
            password.setText(pwvalue);
            name.setText(nmvalue);
            pnumber.setText(pnvalue);
        }
    }//GEN-LAST:event_jTable1MouseClicked


    // dat done
    private void updateUserInFile(String id, String name, String phone, String password, String userType) throws FileNotFoundException, IOException {
        File f = new File(userType + ".dat");
        ArrayList<String> users = new ArrayList<>();
        String idvalue, pwvalue, nmvalue, pnvalue;
        
        DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        int i = jTable1.getSelectedRow();
        if (jTable1.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to edit.");
        } else {
            idvalue = table.getValueAt(i, 0).toString();
            pwvalue = table.getValueAt(i, 1).toString();
            nmvalue = table.getValueAt(i, 2).toString();
            pnvalue = table.getValueAt(i, 3).toString();
        
        // Read all users from the file
        try (FileInputStream fis = new FileInputStream(f); BufferedInputStream bis = new BufferedInputStream(fis); DataInputStream dis = new DataInputStream(bis);) {
            try {
                String firstline = dis.readUTF();
                users.add(firstline);
                while (dis.available() > 0) {
                    String cid = dis.readUTF();
                    String cpw = dis.readUTF();
                    String cname = dis.readUTF();
                    String cphone = dis.readUTF();
                    String revenue = dis.readUTF();
                    if (cid.equals(idvalue) && cpw.equals(pwvalue) && cname.equals(nmvalue) && cphone.equals(pnvalue)) {
                        users.add(id);
                        users.add(password);
                        users.add(name);
                        users.add(phone);
                        users.add(revenue);
                    } else {
                        users.add(cid);
                        users.add(cpw);
                        users.add(cname);
                        users.add(cphone);
                        users.add(revenue);
                    }
                }
                try (
                    FileOutputStream fos = new FileOutputStream(f); BufferedOutputStream bos = new BufferedOutputStream(fos); DataOutputStream dos = new DataOutputStream(bos);) {

                for (String str : users) {
                    dos.writeUTF(str);
                }

                dos.close();
                bos.close();
                fos.close();
            }
            } catch (IOException e) {
            }
        }
        }
    }


    private void deleteUserFromFile(String userType) throws FileNotFoundException, IOException {
        File f = new File(userType + ".dat");
        ArrayList<String> users = new ArrayList<>();
        String idvalue, pwvalue, nmvalue, pnvalue;
        
        DefaultTableModel table = (DefaultTableModel) jTable1.getModel();
        int i = jTable1.getSelectedRow();
        if (jTable1.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to edit.");
        } else {
            idvalue = table.getValueAt(i, 0).toString();
            pwvalue = table.getValueAt(i, 1).toString();
            nmvalue = table.getValueAt(i, 2).toString();
            pnvalue = table.getValueAt(i, 3).toString();
        
        // Read all users from the file
        try (FileInputStream fis = new FileInputStream(f); BufferedInputStream bis = new BufferedInputStream(fis); DataInputStream dis = new DataInputStream(bis);) {
            try {
                String firstline = dis.readUTF();
                users.add(firstline);
                while (dis.available() > 0) {
                    String cid = dis.readUTF();
                    String cpw = dis.readUTF();
                    String cname = dis.readUTF();
                    String cphone = dis.readUTF();
                    String revenue = dis.readUTF();
                    if (!(cid.equals(idvalue) && cpw.equals(pwvalue) && cname.equals(nmvalue) && cphone.equals(pnvalue))) {
                        users.add(cid);
                        users.add(cpw);
                        users.add(cname);
                        users.add(cphone);
                        users.add(revenue);
                    }
                }
                try (
                    FileOutputStream fos = new FileOutputStream(f); BufferedOutputStream bos = new BufferedOutputStream(fos); DataOutputStream dos = new DataOutputStream(bos);) {

                for (String str : users) {
                    dos.writeUTF(str);
                }

                dos.close();
                bos.close();
                fos.close();
            }
            } catch (IOException e) {
            }
        }
        }
    }

    public void clearTextField() {
        usernm.setText("");
        password.setText("");
        name.setText("");
        pnumber.setText("");
    }

    // dat done
    public double getExistingCustomerCredit(String customerId) {
        File file = new File("customers.dat");
        if (!file.exists()) {
            return 0.0; // File doesn't exist, return default value
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            while (true) {
                try {
                    Object obj = ois.readObject();
                    if (obj instanceof Customer) {
                        Customer customer = (Customer) obj;
                        if (customer.getId().equals(customerId)) {
                            return customer.getCredit(); // Return the credit of the customer
                        }
                    }
                } catch (EOFException e) {
                    break; // End of file reached
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Error reading file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return 0.0; // Return default value if not found
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Edit;
    private javax.swing.JButton backButton;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField password;
    private javax.swing.JTextField pnumber;
    private javax.swing.JLabel username;
    private javax.swing.JTextField usernm;
    // End of variables declaration//GEN-END:variables
}
