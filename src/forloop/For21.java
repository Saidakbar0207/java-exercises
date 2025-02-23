package forloop;

import java.util.Scanner;

public class For21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int n = sc.nextInt();
        double sum = 0;
        int temp = 1;
        for (int i = 1; i <= n; i++) {
            temp *= i;
            sum += 1.0/temp;
        }
        System.out.println("Sum = " + sum);
    }
}
