package self;
// write a program of power calculation without using loop and conditional statements

import java.lang.*;
import java.util.*;
public class prob8 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base number: ");
        double base = sc.nextDouble();
        System.out.println("Enter the exponent: ");
        double exponent = sc.nextDouble();
        double result = Math.pow(base, exponent);
        System.out.println("The result is: " + result);
        }
}
