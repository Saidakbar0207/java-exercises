package begins;

import java.util.Scanner;

public class Begin40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a1 :");
        int a1 = sc.nextInt();
        System.out.print("Enter a2 :");
        int a2 = sc.nextInt();
        System.out.print("Enter b1 :");
        int b1 = sc.nextInt();
        System.out.print("Enter b2 :");
        int b2 = sc.nextInt();
        System.out.print("Enter c1 :");
        int c1 = sc.nextInt();
        System.out.print("Enter c2 :");
        int c2 = sc.nextInt();
        int d=a1*b2-a2*b1;
        int x=(c1*b2-c2*b1)/d;
        int y=(a1*c2-a2*c1)/d;
        System.out.println("d = "+d);
        System.out.println("x = "+x);
        System.out.println("y = "+y);
    }
}
