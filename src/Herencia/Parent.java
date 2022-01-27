/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author migue
 */
public class Parent {
    
    private String name;
    private String last_name;
    private int age;
    
    
    public Parent(String name, String last_name, int age){
        this.name = name;
        this.last_name = last_name;
        this.age = age;
    }
    
    
    public void calculateDifferentYear(){
        age = age-19;
    }
    
    public String toString(){
        return ("different age is: " + age); 
        
    }
}
