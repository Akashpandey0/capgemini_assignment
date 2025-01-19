package self;
// write a program to calculate the simple interest

import java.util.*;
public class prob6 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount: ");
        double p = sc.nextDouble();
        System.out.println("Enter the rate of interest: ");
        double r = sc.nextDouble();
        System.out.println("Enter the time period: ");
        double t = sc.nextDouble();
        double si = (p * r * t) / 100;
        System.out.println("The simple interest is: " + si);
        }
}
