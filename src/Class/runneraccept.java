package Class;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class runneraccept {

    public void runneraccept(String un, String customer, String price, String address, String date) {
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
                    String foods = dis.readUTF();
                    String qtt = dis.readUTF();
                    String pr = dis.readUTF();
                    String dt = dis.readUTF();
                    String tdt = dis.readUTF();
                    String add = dis.readUTF();
                    String status = dis.readUTF();
                    String run = dis.readUTF();
                    Orderoo order = new Orderoo(cid, vndornm, foods, pr, qtt, dt, status, tdt, add, run);
                    if (order.getCustomerid().equals(customer) && order.getPrice().equals(price) && order.getAddress().equals(address) && order.getDate().equals(date) && order.getStatus().equals("Prepared")) {
                        foodItems.add(cid);
                        foodItems.add(vndornm);
                        foodItems.add(foods);
                        foodItems.add(qtt);
                        foodItems.add(pr);
                        foodItems.add(dt);
                        foodItems.add(tdt);
                        foodItems.add(add);
                        foodItems.add("Delivering");
                        foodItems.add(un);
                    } else {
                        foodItems.add(cid);
                        foodItems.add(vndornm);
                        foodItems.add(foods);
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
        } catch (EOFException e) {
        } catch (IOException e) {
        }
    }
}
