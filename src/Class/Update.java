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

public class Update {

    File f = new File("item.dat");

    public void updateItem(String username, String foodName, String category, String price, String old_content) {
        try {
            String[] splitstr = old_content.split(",");
            FileInputStream fis = new FileInputStream(f);
            BufferedInputStream bis = new BufferedInputStream(fis);
            DataInputStream dis = new DataInputStream(bis);

            String firstline = dis.readUTF();
            ArrayList<String> item = new ArrayList<>();
            item.add(firstline);
            try {
                while (dis.available() > 0) {
                    String vendornm = dis.readUTF();
                    String itemnm = dis.readUTF();
                    String ctgr = dis.readUTF();
                    String pr = dis.readUTF();
                    FoodItem foodItem = new FoodItem(vendornm, itemnm, ctgr, pr);
                    if (foodItem.getFoodName().equals(splitstr[0]) && foodItem.getCategory().equals(splitstr[1]) && foodItem.getPrice().equals(splitstr[2])) {
                        item.add(username);
                        item.add(foodName);
                        item.add(category);
                        item.add(price);
                    } else {
                        item.add(foodItem.getVendorname());
                        item.add(foodItem.getFoodName());
                        item.add(foodItem.getCategory());
                        item.add(foodItem.getPrice());
                    }
                }
                dis.close();
            } catch (EOFException e) {
            }
            try (
                    FileOutputStream fos = new FileOutputStream(f); BufferedOutputStream bos = new BufferedOutputStream(fos); DataOutputStream dos = new DataOutputStream(bos);) {

                for (String str : item) {
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
