package begins;

import java.util.Scanner;

public class Begin22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a :");
        int a = sc.nextInt();
        System.out.print("Enter b :");
        int b = sc.nextInt();
        int c=a+b;
        a=c-a;
        b=c-b;
        System.out.println("New a = "+a);
        System.out.println("New b = "+b);
    }
}
