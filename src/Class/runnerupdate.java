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

public class runnerupdate {

    File f = new File("order.dat");

    public void runnerupdate(String customer, String price, String address, String date) {
        try {
            FileInputStream fis = new FileInputStream(f);
            BufferedInputStream bis = new BufferedInputStream(fis);
            DataInputStream dis = new DataInputStream(bis);

            String firstline = dis.readUTF();
            ArrayList<String> item = new ArrayList<>();
            item.add(firstline);
            try {
                while (dis.available() > 0) {
                    String cid = dis.readUTF();
                    String vndornm = dis.readUTF();
                    String foodnm = dis.readUTF();
                    String qtt = dis.readUTF();
                    String pr = dis.readUTF();
                    String dt = dis.readUTF();
                    String tdt = dis.readUTF();
                    String add = dis.readUTF();
                    String status = dis.readUTF();
                    String run = dis.readUTF();
                    Orderoo order = new Orderoo(cid, vndornm, foodnm, pr, qtt, dt, status, tdt, add, run);
                    if (order.getCustomerid().equals(cid) && order.getAddress().equals(address) && order.getPrice().equals(pr) && order.getDate().equals(date)) {
                        item.add(cid);
                        item.add(vndornm);
                        item.add(foodnm);
                        item.add(qtt);
                        item.add(pr);
                        item.add(dt);
                        item.add(tdt);
                        item.add(add);
                        item.add("Delivered");
                        item.add(run);
                    } else {
                        item.add(cid);
                        item.add(vndornm);
                        item.add(foodnm);
                        item.add(qtt);
                        item.add(pr);
                        item.add(dt);
                        item.add(tdt);
                        item.add(add);
                        item.add(status);
                        item.add(run);
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
