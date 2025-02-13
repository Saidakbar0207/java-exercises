package Booleans;
import java.util.Scanner;
public class Boolean2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A :");
        int a = sc.nextInt();
        System.out.print(a%2==1 ? "True" : "False");
    }
}
