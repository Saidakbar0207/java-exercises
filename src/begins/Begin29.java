package Begins;

import java.util.Scanner;

public class begin29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter degrees (0<a<360):");
        int deg = sc.nextInt();
        double radians = Math.toRadians(deg);
        System.out.println("Radians of degrees is : "+radians);
    }
}
