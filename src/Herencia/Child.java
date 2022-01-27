/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author migue
 */
public class Child extends Parent{
    
    
    
    public int numBrother;
    
    
    public Child(String name,String last_name,int age, int numBrother){
        super(name, last_name, age);
        this.numBrother = numBrother;
    }
    
    
    @Override
    public String toString(){
        return (super.toString() + "num of brothers: " + numBrother);
    }
}
