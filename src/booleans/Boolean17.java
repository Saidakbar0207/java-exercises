package booleans;

import java.util.Scanner;

public class Boolean17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N :");
        int n = sc.nextInt();
        System.out.print(n>99 && n<1000 & n%2==1 ? "True" : "False");
    }
}
