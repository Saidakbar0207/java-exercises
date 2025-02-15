package Begins;

import java.util.Scanner;

public class begin40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A_1 :");
        int a1 = sc.nextInt();
        System.out.print("Enter A_2 :");
        int a2 = sc.nextInt();
        System.out.print("Enter B_1 :");
        int b1 = sc.nextInt();
        System.out.print("Enter B_2 :");
        int b2 = sc.nextInt();
        System.out.print("Enter C_1 :");
        int c1 = sc.nextInt();
        System.out.print("Enter C_2 :");
        int c2 = sc.nextInt();
        int D=a1*b2-a2*b1;
        int x=(c1*b2-c2*b1)/D;
        int y=(a1*c2-a2*c1)/D;
        System.out.println("D = "+D);
        System.out.println("x = "+x);
        System.out.println("y = "+y);
    }
}
