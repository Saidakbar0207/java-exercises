package forloop;

import java.util.Scanner;

public class For19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int n = sc.nextInt();
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum*=i;
        }
        System.out.println("Sum = "+sum);
    }
}
