package Booleans;
import java.util.Scanner;
public class Boolean3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A :");
        int a = sc.nextInt();
        System.out.println(a%2==0 ? "True" : "False");
    }
}
