package Begins;

import java.util.Scanner;

public class begin35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter V :");
        int v = sc.nextInt();
        System.out.print("Enter U :");
        int u = sc.nextInt();
        System.out.print("Enter T_1 :");
        int t1 = sc.nextInt();
        System.out.print("Enter T_2 :");
        int t2 = sc.nextInt();
        int S=v*t1+u*t2;
        System.out.println("Distance = "+S);
    }

}
