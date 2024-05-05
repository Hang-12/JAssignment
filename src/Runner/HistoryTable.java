/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Runner;

import Class.Orderoo;
import java.io.*;
import java.util.*;

/**
 *
 * @author Zong Hang
 */
public class HistoryTable {
    public void HistoryTable(String un) throws IOException {
        try (FileInputStream fis = new FileInputStream("order.dat"); BufferedInputStream bis = new BufferedInputStream(fis); DataInputStream dis = new DataInputStream(bis)) {
            List<Orderoo> foodItems = new ArrayList<>();
            String firstline = dis.readUTF();
            while (dis.available() > 0) {
                String cid = dis.readUTF();
                String vndornm = dis.readUTF();
                String food = dis.readUTF();
                String quantity = dis.readUTF();
                String price = dis.readUTF();
                String date = dis.readUTF();
                String dtd = dis.readUTF();
                String address = dis.readUTF();
                String status = dis.readUTF();
                String run = dis.readUTF();
                Orderoo order = new Orderoo(cid, vndornm, food, price, quantity, date, status, dtd, address, run);
                if (un.equals(order.getRunner()) && order.getStatus().equals("Preparing")) {
                    foodItems.add(order);
                }
            }
        } catch (IOException e) {
        }
    }
}
