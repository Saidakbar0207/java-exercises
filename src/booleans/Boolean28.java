package Booleans;

import java.util.Scanner;

public class Boolean28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x :");
        int x = sc.nextInt();
        System.out.print("Enter y :");
        int y = sc.nextInt();
        System.out.print((x<0 && y<0) || (x>0 && y>0 ) ? "True" : "False");
    }
}
