package booleans;

import java.util.Scanner;

public class Boolean04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a :");
        int a = sc.nextInt();
        System.out.print("Enter b :");
        int b = sc.nextInt();
        System.out.print(a>2 && b<=3 ? "True" : "False");
    }
}
