package Class;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class review {
    private static final String FILE_PATH = "review.dat";

    public static List<reviewoo> readData(String un) {
        List<reviewoo> foodItems = new ArrayList<>();

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
                String dtd = dis.readUTF();
                String date = dis.readUTF();
                String review = dis.readUTF();
                String runner = dis.readUTF();
                reviewoo rv = new reviewoo(cid,vndornm,food,price,dtd,review,quantity,date,runner);
                if (un.equals(rv.getVendorname())){
                    foodItems.add(rv);
                }
            }

        } catch (IOException e) {
        }
        return foodItems;
    }
}
