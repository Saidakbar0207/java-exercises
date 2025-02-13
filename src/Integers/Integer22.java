package Integers;
import java.util.Scanner;
public class Integer22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N seconds :");
        int n = sc.nextInt();
        int m=n%3600;
        System.out.println(m+" seconds ");
    }
}
