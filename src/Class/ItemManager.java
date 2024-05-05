package Class;

import java.util.List;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.ArrayList;

public class ItemManager{
    private static final String FILE_PATH = "item.dat";

    public static List<FoodItem> readData(String un) {
        List<FoodItem> foodItems = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(FILE_PATH);
             BufferedInputStream bis = new BufferedInputStream(fis);
             DataInputStream dis = new DataInputStream(bis)) {

            String firstline = dis.readUTF();
            while (dis.available() > 0) {
                String vendornm = dis.readUTF();
                String item = dis.readUTF();
                String category = dis.readUTF();
                String price = dis.readUTF();
                FoodItem foodItem = new FoodItem(vendornm,item, category, price);
                if (un.equals(foodItem.getVendorname())){
                    foodItems.add(foodItem);
                }
            }
        } catch (IOException e) {
        }
        return foodItems;
    }
}