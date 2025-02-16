package booleans;

import java.util.Scanner;

public class Boolean11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.println((((a%2==1) == (b%2==1)) || (a%2==0) == (b%2==0)) ? "True" : "False");
    }
}
