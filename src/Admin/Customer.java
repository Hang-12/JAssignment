package Admin;

import java.io.Serializable;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kevin
 */
public class Customer extends User implements Serializable {
    private static final long serialVersionUID = 1L;

    private double credit;
    
    public Customer(String id, String name, String phone, String password, double credit){
        super(id, name, phone, password);
        this.credit = credit;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    // Method to add the top-up amount to the current credit
    public void creditTopUp(double amount) {
        this.credit += amount;
    }
}
