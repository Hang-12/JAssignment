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

public class RejectOrder {
    private static String currentLine;

    public void Rejectorder(String username, String customerid, String food, String quantity, String price, String date, String dtd, String address, String runner) {
        File f = new File("orderpending.dat");
        File f2 = new File("order.dat");
        try {
            FileInputStream fis = new FileInputStream(f);
            BufferedInputStream bis = new BufferedInputStream(fis);
            DataInputStream dis = new DataInputStream(bis);

            String firstline = dis.readUTF();
            ArrayList<String> item = new ArrayList<>();
            item.add(firstline);

            try {
                while (dis.available()>0) {
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
                    if (!(cid.equals(customerid) && vndornm.equals(username) && foodnm.equals(food) && dt.equals(date) && tdt.equals(dtd) && add.equals(address))) {
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
            } catch (EOFException e) {
            }

            dis.close();

            FileOutputStream fos = new FileOutputStream(f);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            DataOutputStream dos = new DataOutputStream(bos);

            for (String str : item) {
                dos.writeUTF(str);
            }

            item.clear();
            dos.close();
            bos.close();
            fos.close();

            try {
                FileOutputStream fos2 = new FileOutputStream(f2, true);
                BufferedOutputStream bos2 = new BufferedOutputStream(fos2);
                DataOutputStream dos2 = new DataOutputStream(bos2);

                dos2.writeUTF(customerid);
                dos2.writeUTF(username);
                dos2.writeUTF(food);
                dos2.writeUTF(quantity);
                dos2.writeUTF(price); 
                dos2.writeUTF(date);
                dos2.writeUTF(dtd);
                dos2.writeUTF(address);
                dos2.writeUTF("Rejected");
                dos2.writeUTF(runner);
                dos2.close();
                bos2.close();
                fos2.close();
            } catch (IOException e) {
            }
        } catch (IOException e) {
        }
    }
}
