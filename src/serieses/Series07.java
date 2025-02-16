package serieses;

import java.util.Scanner;

public class Series07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = sc.nextInt();
        int sum = 0;
        System.out.print("Enter the real numbers :");
        for (int i = 1; i <= n; i++) {
            double num = sc.nextDouble();
            if (num - (int) num >=0.5) {
                num += 1;
                sum += num;
            } else {
                sum += (int) num;
            }
        }
        System.out.println("sum = " + sum);
    }
}
