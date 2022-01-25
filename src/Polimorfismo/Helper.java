/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfismo;

/**
 *
 * @author migue
 */
public class Helper {
    
    static int Multply(int a, int b){
        return a*b;
    }
    
    static double Multyply(double a, double b){
        return a * b;
    }
 }

class GFG{
    public static void main(String[] args) {
        System.out.println(Helper.Multply(1, 2));
        System.out.println(Helper.Multyply(4, 3));
    }
}
