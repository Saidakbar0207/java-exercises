package Conditionals;

import java.util.Scanner;

public class If17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Enter b number: ");
        int b = sc.nextInt();
        System.out.print("Enter c number: ");
        int c = sc.nextInt();
        if((a<b && b<c) || (a>b && b>c)){
            System.out.println("a = "+(2*a));
            System.out.println("b = "+(2*b));
            System.out.println("c = "+(2*c));
        } else {
            System.out.println("a = "+(-a));
            System.out.println("b = "+(-b));
            System.out.println("c = "+(-c));
        }
    }
}
