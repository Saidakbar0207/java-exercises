package Integers;

import java.util.Scanner;

public class Integer21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N seconds :");
        int n = sc.nextInt();
        int m=n%60;
        System.out.println(m+" seconds ");
    }
}
