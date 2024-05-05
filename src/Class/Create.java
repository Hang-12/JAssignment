package Class;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Create {

    File f = new File("Item.dat");

    public void createItem(String username, String foodName, String category, String price) {
        try {
            FileOutputStream fos = new FileOutputStream(f, true);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            DataOutputStream dos = new DataOutputStream(bos);
            dos.writeUTF(username);
            dos.writeUTF(foodName);
            dos.writeUTF(category);
            dos.writeUTF("RM" + price);
            dos.close();
            bos.close();
            fos.close();
        } catch (IOException e) {

        }
    }
}
