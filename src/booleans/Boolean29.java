package Booleans;

import java.util.Scanner;

public class Boolean29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x :");
        int x = sc.nextInt();
        System.out.print("Enter y :");
        int y = sc.nextInt();
        System.out.print("Enter x1 :");
        int x1 = sc.nextInt();
        System.out.print("Enter y1 :");
        int y1 = sc.nextInt();
        System.out.print("Enter x2 :");
        int x2 = sc.nextInt();
        System.out.print("Enter y2 :");
        int y2 = sc.nextInt();
        System.out.print((x>x1 && x<x2 &&(( y>y1 && y<y2)|| (y<y1 && y>y2))) ? "True" : "False");
    }
}
