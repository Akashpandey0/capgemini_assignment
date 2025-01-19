package assisted;
// write a program to calculate volume of cylinder.

import java.util.*;
public class prob5 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of cylinder: ");
        double r = sc.nextDouble();
        System.out.println("Enter height of cylinder: ");
        double h = sc.nextDouble();
        double volume = 3.14 * r * r * h;
        System.out.println("Volume of cylinder is: "+volume);
        }
}
