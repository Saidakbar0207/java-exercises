package procs;

import java.util.Scanner;

public class Proc01 {
    static double PowerA3(double a) {
        return Math.pow(a, 3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            double num = sc.nextDouble();
            double result = PowerA3(num);
            System.out.println(num + " ^ 3 = " + result);
        }
        sc.close();
    }
}