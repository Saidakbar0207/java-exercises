package serieses;

import java.util.Scanner;

public class Series09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int n = sc.nextInt();
        int sum = 0;
        System.out.print("Enter numbers:");
        for (int i = 1; i <= n; i++) {
            int num = sc.nextInt();
            if(num%2==1){
                sum++;
                System.out.print(num+" ");
            }
        }
        System.out.println("\nSum: "+sum);
    }
}
