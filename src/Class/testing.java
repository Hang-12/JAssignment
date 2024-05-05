package Class;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class testing {
    private static String read;
    public static void main(String[] args) throws IOException {
        File f = new File("vrevenue.dat");
        ArrayList<String> tmparray = new ArrayList<>();
        FileOutputStream fos = new FileOutputStream(f);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        DataOutputStream dos = new DataOutputStream(bos);
        dos.writeUTF("Username/Balance/DateTime");
//        dos.writeUTF("CustomerTesting001");
//        dos.writeUTF("Mamak Istilah");
//        dos.writeUTF("Nasi Lemak,RM10/Teh O Limau Iced,RM4.30");
//        dos.writeUTF("1/1");
//        dos.writeUTF("8.40");
//        dos.writeUTF("2023-12-11");
//        dos.writeUTF("Delivery");
//        dos.writeUTF("asd");
//        dos.writeUTF("Preparing");
//        dos.writeUTF("na");
//        dos.writeUTF("CustomerTesting001");
//        dos.writeUTF("Mamak Istilah");
//        dos.writeUTF("Roti Telur,RM4.10/Teh O Limau Iced,RM4.30");
//        dos.writeUTF("1/1");
//        dos.writeUTF("8.40");
//        dos.writeUTF("2023-12-13");
//        dos.writeUTF("Take-Away");
//        dos.writeUTF("");
//        dos.writeUTF("Prepared");
//        dos.writeUTF("");
//        dos.writeUTF("CustomerTesting002");
//        dos.writeUTF("Mamak Istilah");
//        dos.writeUTF("Roti Telur,RM4.10/Teh O Limau Iced,RM4.30");
//        dos.writeUTF("1/1");
//        dos.writeUTF("8.40");
//        dos.writeUTF("2023-12-11");
//        dos.writeUTF("Dine-In");
//        dos.writeUTF("");
//        dos.writeUTF("Preparing");
//        dos.writeUTF("");
        dos.close();
        bos.close();
        fos.close();
        FileInputStream fis = new FileInputStream(f);
        BufferedInputStream bis = new BufferedInputStream(fis);
        DataInputStream dis = new DataInputStream(bis);
        try {
            while (dis.available()>0) {
                String everything = dis.readUTF();
                tmparray.add(everything);
            }
        } catch (EOFException e) {
        }
        System.out.println(tmparray);
    }

}
