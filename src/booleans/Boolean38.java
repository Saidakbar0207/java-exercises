package booleans;

import java.util.Scanner;

public class Boolean38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1 :");
        int x1 = sc.nextInt();
        System.out.print("Enter y1 :");
        int y1 = sc.nextInt();
        System.out.print("Enter x2 :");
        int x2 = sc.nextInt();
        System.out.print("Enter y2 :");
        int y2 = sc.nextInt();
        System.out.print(Math.absExact(x2-x1)==Math.absExact(y2-y1)  ? "True" : "False");
    }
}
