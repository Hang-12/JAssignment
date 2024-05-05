/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Customer;

/**
 *
 * @author titushoong
 */
import Class.User;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Loginfc {
    private User user;
    private static String line;

    public Loginfc(User user) {
        this.user = user;
    }
    
    public String authenticateUser() {
        String username = user.getUsername();
        String password = user.getPassword();
        File admin = new File("customer.dat");
        try (FileInputStream fis = new FileInputStream(admin);  BufferedInputStream bis = new BufferedInputStream(fis);  DataInputStream dis = new DataInputStream(bis);) {
            String firstline = dis.readUTF();
            while (dis.available()> 0) {
                String fileUsername = dis.readUTF();
                String filePassword = dis.readUTF();
                String fileName = dis.readUTF();
                String filePhoneNumber = dis.readUTF();
                String fileCredit = dis.readUTF();
                if (username.equals(fileUsername) && password.equals(filePassword)) {
                    return fileName;
                }
            }
        } catch (IOException e) {
        }
        return null;
    }
}

