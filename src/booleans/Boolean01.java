package booleans;

import java.util.Scanner;

public class Boolean01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = sc.nextInt();
        System.out.println(a>0 ? "True" : "False");
    }
}
