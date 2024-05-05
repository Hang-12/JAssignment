package Class;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Orderpending {
    private static final String FILE_PATH = "orderpending.dat";

    public static List<Orderpendingoo> readData(String un) {
        List<Orderpendingoo> foodItems = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(FILE_PATH);
            BufferedInputStream bis = new BufferedInputStream(fis);
            DataInputStream dis = new DataInputStream(bis)) {
            String firstline = dis.readUTF();
            while (dis.available()>0) {
                String cid = dis.readUTF();
                String vndornm = dis.readUTF();
                String food = dis.readUTF();
                String quantity = dis.readUTF();
                String price = dis.readUTF();
                String date = dis.readUTF();
                String dtd = dis.readUTF();
                String address = dis.readUTF();
                String status = dis.readUTF();
                String runner = dis.readUTF();
                Orderpendingoo orderpending = new Orderpendingoo(cid,vndornm,food,price,quantity,date,status,dtd,address, runner);
                if (un.equals(orderpending.getVendorname()) && orderpending.getDtd().equals("Delivery")){
                    foodItems.add(orderpending);
                }else if(un.equals(orderpending.getVendorname())){
                    foodItems.add(orderpending);
                }
            }

        } catch (IOException e) {
        }
        return foodItems;
    }
}
