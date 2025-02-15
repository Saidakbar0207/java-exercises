package begins;

import java.util.Scanner;

public class Begin05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = sc.nextInt();
        int  V=a*a*a;
        int S=6*a*a;
        System.out.println("V = "+V);
        System.out.println("S = "+S);
    }
}
