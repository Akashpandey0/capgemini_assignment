package assisted;
// write a program celsius to farenheit

import java.util.*;
public class prob3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in celsius");
        double c = sc.nextDouble();
        double f = (c * 9/5) + 32;
        System.out.println("Temperature in fahrenheit is " + f);
        }
}
