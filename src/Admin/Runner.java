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
public class Runner extends User implements Serializable {
    private static final long serialVersionUID = 1L;
    
    public Runner(String id, String name, String phone, String password){
        super(id, name, phone, password);
    }    
}
