package booleans;

import java.util.Scanner;

public class Boolean02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a :");
        int a = sc.nextInt();
        System.out.print(a%2==1 ? "True" : "False");
    }
}
