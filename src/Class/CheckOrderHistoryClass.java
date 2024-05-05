package Class;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CheckOrderHistoryClass {

    private static String line;

    public static List<Orderoo> readData(String un) {
        List<Orderoo> foodItems = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream("order.dat"); BufferedInputStream bis = new BufferedInputStream(fis); DataInputStream dis = new DataInputStream(bis)) {

            String firstline = dis.readUTF();

            while (dis.available() > 0) {
                String cid = dis.readUTF();
                String vndornm = dis.readUTF();
                String foodnm = dis.readUTF();
                String qtt = dis.readUTF();
                String pr = dis.readUTF();
                String dt = dis.readUTF();
                String tdt = dis.readUTF();
                String add = dis.readUTF();
                String status = dis.readUTF();
                String run = dis.readUTF();
                Orderoo order = new Orderoo(cid, vndornm, foodnm, pr, qtt, dt, status, tdt, add, run);
                if (un.equals(order.getVendorname()) && !order.getStatus().equals("Preparing")) {
                    foodItems.add(order);
                } else {
                }
            }
        } catch (EOFException e) {

        } catch (IOException ex) {
        }
        return foodItems;
    }
}
