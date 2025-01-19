package assisted;
//write a program to take two input from user and sum 
import java.util.Scanner;
public class prob2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,sum;
        System.out.println("Enter first number");
        a = sc.nextInt();
        System.out.println("Enter second number");
        b = sc.nextInt();
        sum = a + b;
        System.out.println("Sum of two number is "+sum);
        sc.close();
        }
}
