package booleans;

import java.util.Scanner;

public class Boolean23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N :");
        int n = sc.nextInt();
        int a=n/1000;
        int b=(n%1000)/100;
        int c=((n%100)%100)/10;
        int d=n%10;
        System.out.println(a==d && b==c ? "True" : "False");
    }
}
