package procs;

import java.util.Scanner;

public class Proc02 {
    static void PoweraA234(double a) {
        double a2 = Math.pow(a, 2);
        double a3= Math.pow(a, 3);
        double a4= Math.pow(a, 4);
        System.out.println(a + " ^ 2 = " + a2);
        System.out.println(a + " ^ 3 = " + a3);
        System.out.println(a + " ^ 4 = " + a4);
        System.out.println("-----------------------");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5  real numbers: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(i+" - number :");
            double num = sc.nextDouble();
            PoweraA234(num);
        }
        sc.close();
    }

}
