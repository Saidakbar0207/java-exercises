package booleans;

import java.util.Scanner;

public class Boolean05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A :");
        int a = sc.nextInt();
        System.out.print("Enter B :");
        int b = sc.nextInt();
        System.out.println(a>=0 || b<-2 ? "True" : "False");
    }
}
