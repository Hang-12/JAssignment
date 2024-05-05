package Class;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Transaction {
    public static List<Transactionoo> readData(String un) {
        List<Transactionoo> array = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream("ctransaction.dat"); BufferedInputStream bis = new BufferedInputStream(fis); DataInputStream dis = new DataInputStream(bis)) {

            String firstline = dis.readUTF();

            while (dis.available() > 0) {
                String cid = dis.readUTF();
                String price = dis.readUTF();
                String time = dis.readUTF();
                Transactionoo trans = new Transactionoo(cid, price, time);
                if (un.equals(trans.getUsername())) {
                    array.add(trans);
                }
            }
        } catch (EOFException e) {

        } catch (IOException ex) {
        }
        return array;
    }
}
