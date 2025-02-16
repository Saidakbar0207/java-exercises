package begins;

import java.util.Scanner;

public class Begin38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a (a=!0):");
        int a = sc.nextInt();
        System.out.print("Enter b :");
        int b = sc.nextInt();
        double x=(-b)/a;
        System.out.println("x = "+x);
    }
}
