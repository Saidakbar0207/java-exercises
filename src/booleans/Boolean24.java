package booleans;

import java.util.Scanner;

public class Boolean24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a :");
        int a = sc.nextInt();
        System.out.print("Enter b :");
        int b = sc.nextInt();
        System.out.print("Enter c :");
        int c = sc.nextInt();
        int d=b*b-4*a*c;
        System.out.println(d>0 && a>0 ? "True" : "False" );
    }
}
