package Begins;

import java.util.Scanner;

public class begin24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A :");
        int a = sc.nextInt();
        System.out.print("Enter B :");
        int b = sc.nextInt();
        System.out.print("Enter C :");
        int c = sc.nextInt();
        int d=a+b+c;         // a->c    c->b   b->a
        c=d-b-c;             // c==a;  a==a;  b==b
        b=d-b-a;              // c==a    a==b   b==b
        a=d-b-c;                  // c==a   b==c    a==b
        System.out.println("New A ="+a);
        System.out.println("New B ="+b);
        System.out.println("New C ="+c);
    }
}
