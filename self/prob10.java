package self;
// write a program to convert kilometers to miles

import java.util.*;
public class prob10 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance in kilometers: ");
        double km = sc.nextDouble();
        double miles = km * 0.621371;
        System.out.println(km + " kilometers is equal to " + miles + " miles");
        }
}
