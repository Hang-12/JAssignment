package Admin;


import java.io.Serializable;
import java.time.LocalDateTime;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kevin
 */
public class Receipt implements Serializable {
    private static final long serialVersionUID = 1L;

    private String customerId;
    private double topUpAmount;
    private LocalDateTime timestamp;

    public Receipt(String customerId, double topUpAmount) {
        this.customerId = customerId;
        this.topUpAmount = topUpAmount;
        this.timestamp = LocalDateTime.now();
    }

    // Getters
    public String getCustomerId() {
        return customerId;
    }

    public double getTopUpAmount() {
        return topUpAmount;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    // toString method for debugging or logging (optional)
    // Uncomment if needed
    // @Override
    // public String toString() {
    //     return "Receipt(customerId='" + customerId + "', topUpAmount=" + topUpAmount + ", timestamp=" + timestamp + ")";
    // }
}