package booleans;

import java.util.Scanner;

public class Boolean33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a :");
        int a = sc.nextInt();
        System.out.print("Enter b :");
        int b = sc.nextInt();
        System.out.print("Enter c :");
        int c = sc.nextInt();
        System.out.print((a+b>c && a+c>b && b+c>a ) ? "True" : "False");
    }
}
