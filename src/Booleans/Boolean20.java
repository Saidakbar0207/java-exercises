package Booleans;
import java.util.Scanner;
public class Boolean20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A :");
        int n= sc.nextInt();
        int a=n/100;
        int c=n%10;
        int b=(n%100)/10;
        System.out.print(a!=b && b!=c && a!=c ? "True" : "False");
    }
}
