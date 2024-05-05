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

public class AcceptOrder {

    private static String currentLine;

    public void Acceptorder(String username, String customerid, String food, String quantity, String price, String date, String dtd, String address, String runner) {
        File f = new File("orderpending.dat");
        File f2 = new File("order.dat");
        System.out.println("1");
        try {
            FileInputStream fis = new FileInputStream(f);
            BufferedInputStream bis = new BufferedInputStream(fis);
            DataInputStream dis = new DataInputStream(bis);
            System.out.println("2");
            String firstline = dis.readUTF();
            ArrayList<String> item = new ArrayList<>();
            item.add(firstline);
            System.out.println("3");
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
                    Orderpendingoo order = new Orderpendingoo(cid, vndornm, foodnm, pr, qtt, dt, status, tdt, add, run);
                    if (!(cid.equals(customerid) && vndornm.equals(username) && qtt.equals(quantity) && foodnm.equals(food) && dt.equals(date) && tdt.equals(dtd) && add.equals(address))) {
                        item.add(order.getCustomerid());
                        item.add(order.getVendorname());
                        item.add(order.getFood());
                        item.add(order.getQuantity());
                        item.add(order.getPrice());
                        item.add(order.getDate());
                        item.add(order.getDtd());
                        item.add(order.getAddress());
                        item.add(order.getStatus());
                        item.add(order.getRunner());
                    }
                }
            } catch (EOFException e) {
                // Do nothing here, just let the inner try block complete
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
                if (dtd.equals("Delivery")) {
                    double newprice = Double.parseDouble(price);
                    double vprice = newprice - 5;
                    dos2.writeUTF(customerid);
                    dos2.writeUTF(username);
                    dos2.writeUTF(food);
                    dos2.writeUTF(quantity);
                    dos2.writeUTF(String.valueOf(vprice));
                    dos2.writeUTF(date);
                    dos2.writeUTF(dtd);
                    dos2.writeUTF(address);
                    dos2.writeUTF("Preparing");
                    dos2.writeUTF(runner);
                } else if (dtd.equals("Dine-In") || dtd.equals("Take-Away")) {
                    dos2.writeUTF(customerid);
                    dos2.writeUTF(username);
                    dos2.writeUTF(food);
                    dos2.writeUTF(quantity);
                    dos2.writeUTF(price);
                    dos2.writeUTF(date);
                    dos2.writeUTF(dtd);
                    dos2.writeUTF(address);
                    dos2.writeUTF("Preparing");
                    dos2.writeUTF(runner);
                }
                dos2.close();
                bos2.close();
                fos2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
