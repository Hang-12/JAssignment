package Class;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Authentication {

    private User user;
    private static String line;

    public Authentication(User user) {
        this.user = user;
    }

    public String authenticate() {
        String username = user.getUsername();
        String password = user.getPassword();
        File vendor = new File("vendor.dat");
        try (
            FileInputStream fis = new FileInputStream(vendor);  BufferedInputStream bis = new BufferedInputStream(fis);  DataInputStream dis = new DataInputStream(bis);) {
            String firstline = dis.readUTF();
            while ((dis.available() > 0)) {
                String un = dis.readUTF();
                String pw = dis.readUTF();
                String name = dis.readUTF();
                String pn = dis.readUTF();
                String revenue = dis.readUTF();
                if (un.trim().equals(username) && pw.trim().equals(password)) {
                    return name;
                }
            }
        } catch (IOException ex) {
        }
        return null;
    }
}
