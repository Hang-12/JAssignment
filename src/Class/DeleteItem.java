package Class;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DeleteItem {

    File f = new File("Item.dat");

    public void deleteItem(String foodName, String category, String price) {
        try (FileInputStream fis = new FileInputStream(f); BufferedInputStream bis = new BufferedInputStream(fis); DataInputStream dis = new DataInputStream(bis);) {
            String firstline = dis.readUTF();
            ArrayList<String> tmpArray = new ArrayList<>();
            tmpArray.add(firstline);
            try {
                while (dis.available() > 0) {
                    String vendornm = dis.readUTF();
                    String item = dis.readUTF();
                    String ctgr = dis.readUTF();
                    String pr = dis.readUTF();
                    FoodItem foodItem = new FoodItem(vendornm,item, ctgr, pr);
                    if (!(foodItem.getFoodName().equals(foodName) && foodItem.getCategory().equals(category) && foodItem.getPrice().equals(price))) {
                        tmpArray.add(vendornm);
                        tmpArray.add(item);
                        tmpArray.add(ctgr);
                        tmpArray.add(pr);
                    }
                }
            } catch (EOFException e) {

            }
            try (FileOutputStream fos = new FileOutputStream(f); BufferedOutputStream bos = new BufferedOutputStream(fos); DataOutputStream dos = new DataOutputStream(bos)) {

                for (String str : tmpArray) {
                    dos.writeUTF(str);
                }

                dos.close();
                bos.close();
                fos.close();
                tmpArray.clear();
            } catch (IOException e) {

            }
        } catch (IOException e) {

        }
    }
}
