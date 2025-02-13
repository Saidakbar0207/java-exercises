package Begins;

import java.util.Scanner;

public class begin22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A :");
        int a = sc.nextInt();
        System.out.print("Enter B :");
        int b = sc.nextInt();
        int c=a+b;
        a=c-a;
        b=c-b;
        System.out.println("New A = "+a);
        System.out.println("New B = "+b);
    }
}
