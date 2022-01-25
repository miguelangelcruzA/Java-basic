/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LambdaExpresion;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author migue
 */
public class LambdaExpresionExercise01 {

    
   interface A{
       
       void show();
   } 
    
    
    
    
    public static void main(String[] args) {
        
        List fruits = Arrays.asList("Apples","Oranges","Grapes","Mango");
        
        
        
        
        fruits.forEach(n -> System.out.println(n));
        
        
        
        A obj;
        
        obj = () -> {System.out.println("Hello !!!");};
        
        
        obj.show();
    }


    
}
