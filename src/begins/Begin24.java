package begins;

import java.util.Scanner;

public class Begin24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a :");
        int a = sc.nextInt();
        System.out.print("Enter b :");
        int b = sc.nextInt();
        System.out.print("Enter c :");
        int c = sc.nextInt();
        int d=a+b+c;         // a->c    c->b   b->a
        c=d-b-c;             // c==a;  a==a;  b==b
        b=d-b-a;              // c==a    a==b   b==b
        a=d-b-c;                  // c==a   b==c    a==b
        System.out.println("New a ="+a);
        System.out.println("New b ="+b);
        System.out.println("New c ="+c);
    }
}
