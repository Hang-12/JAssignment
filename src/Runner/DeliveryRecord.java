/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Runner;

/**
 *
 * @author Zong Hang
 */
public class DeliveryRecord {
    private double price;
    private String status;

    public DeliveryRecord(double price, String status) {
        this.price = price;
        this.status = status;
    }

    public double getPrice() {
        return price;
    }

    public String getStatus() {
        return status;
    }
}
