/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.io.Serializable;

/**
 *
 * @author CW
 */
public class Runner extends Admin.User implements Serializable {
    private static final long serialVersionUID = 1L;

    private double credit;
    
    public Runner(String id, String name, String phone, String password, double credit){
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
