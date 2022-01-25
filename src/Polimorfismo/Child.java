/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfismo;

/**
 *
 * @author migue
 */
public class Child extends Parent {
    
    
    
    void run(){
        System.out.println("The child is running");
    }
    
    
    
    public static void main(String[] args) {
        Child c = new Child();
        Parent p = new Child();
        p.run();
        
        c.run();
    }
}
