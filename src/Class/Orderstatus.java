/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author CW
 */
public class Orderstatus {

    private static final String FILE_PATH = "order.dat";

    public static List<Orderoo> readData(String un) {
        List<Orderoo> foodItems = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(FILE_PATH); BufferedInputStream bis = new BufferedInputStream(fis); DataInputStream dis = new DataInputStream(bis)) {
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
                if (un.equals(order.getVendorname()) && order.getStatus().equals("Preparing")) {
                    foodItems.add(order);
                }
            }

        } catch (IOException e) {
        }
        return foodItems;
    }
}
