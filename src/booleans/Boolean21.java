package Booleans;


import java.util.Scanner;

public class Boolean21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A :");
        int n= sc.nextInt();
        int a=n/100;
        int b=(n%100)/10;
        int c=n%10;
        System.out.print(a>b && b>c  ? "True" : "False");
    }
}
