/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Customer;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author titushoong
 */
public class Order {
    private String rice;
    private String rQuantity;
    private String drinks;
    private String dQuantity;
    private Date orderDate;
    private String vendornm;
    private String address;
    private String selection;

    public Order(String rice, String rQuantity, String drinks, String dQuantity, String vendornm, String address, Date orderDate, String selection) {
        this.rice = rice;
        this.rQuantity = rQuantity;
        this.drinks = drinks;
        this.dQuantity = dQuantity;
        this.vendornm = vendornm;
        this.address = address;
        this.orderDate = orderDate;
        this.selection = selection;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSelection() {
        return selection;
    }

    public void setSelection(String selection) {
        this.selection = selection;
    }

    public String getVendornm() {
        return vendornm;
    }

    public void setVendornm(String vendornm) {
        this.vendornm = vendornm;
    }

    public String formatDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(orderDate);
    }

    public String getRice() {
        return rice;
    }

    public String getrQuantity() {
        return rQuantity;
    }

    public String getDrinks() {
        return drinks;
    }

    public void setDrinks(String drinks) {
        this.drinks = drinks;
    }

    public String getdQuantity() {
        return dQuantity;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public String getDaddress() {
        return address;
    }
    
}





