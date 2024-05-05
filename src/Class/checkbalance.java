package Class;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class checkbalance {

    public String checkavailable(String un, String price) throws FileNotFoundException, IOException {
        File f = new File("ctransaction.dat");
        double check = 0;
        double pr = Double.parseDouble(price);
        try (FileInputStream fis = new FileInputStream(f); BufferedInputStream bis = new BufferedInputStream(fis); DataInputStream dis = new DataInputStream(bis)) {
            String firstline = dis.readUTF();
            while (dis.available() > 0) {
                String username = dis.readUTF();
                String balance = dis.readUTF();
                String DateTime = dis.readUTF();
                double cbalance = Double.parseDouble(balance);
                if (username.equals(un)){
                    check += cbalance;
                }
            }
            if (check > pr){
                return "good";
            }
        }
        return null;
    }
}
