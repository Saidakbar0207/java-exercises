package booleans;

import java.util.Scanner;

public class Boolean22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a :");
        int n = sc.nextInt();
        int a=n/100;
        int b=(n%100)/10;
        int c=n%10;
        System.out.print((a>b && b>c) || (a<b && b<c) ? "True" : "False");
    }
}
