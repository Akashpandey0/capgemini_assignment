package self;
// write a program to calculate the average of numbers

import java.util.*;
public class prob9 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();
            sum += num;
        }
        double avg = (double)sum/n;
        System.out.println(avg);
    }
}
