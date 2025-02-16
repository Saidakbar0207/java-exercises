package begins;

import java.util.Scanner;

public class Begin23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a :");
        int a = sc.nextInt();
        System.out.print("Enter b :");
        int b = sc.nextInt();
        System.out.print("Enter c :");
        int c = sc.nextInt();
        int d=a+b+c;
        b=d-b-c;
        c=d-a-c;
        a=d-a-c;
        System.out.println("New a = "+a);
        System.out.println("New b = "+b);
        System.out.println("New c = "+c);
    }
}
