package Booleans;

import java.util.Scanner;

public class Boolean24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A :");
        int a = sc.nextInt();
        System.out.print("Enter B :");
        int b = sc.nextInt();
        System.out.print("Enter C :");
        int c = sc.nextInt();
        int D=b*b-4*a*c;
        System.out.println(D>0 && a>0 ? "True" : "False" );
    }
}
