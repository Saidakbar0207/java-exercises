package Integers;

import java.util.Scanner;

public class Integer11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enrer a three-digit :");
        int a = sc.nextInt();
        if(a>99 && a<1000){
            int b=a/100;
            int c=(a%100)/10;
            int d=a%10;
            System.out.println("Sum("+a+")="+(b+c+d));
            System.out.println("product("+a+")="+b*c*d);
        }   else {
            System.out.println("Error");
        }
    }
}
