package Booleans;

import java.util.Scanner;

public class Boolean40 {
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
        System.out.print((Math.abs(x1-x2)==2 && Math.abs(y1-y2)==1) || Math.abs(x1-x2)==1 && Math.abs(y1-y2)==2 ? "True" : "False");
    }
}
