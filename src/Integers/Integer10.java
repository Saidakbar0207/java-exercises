package Integers;
import java.util.Scanner;
public class Integer10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a three-digit :");
        int a = sc.nextInt();
        if (a > 99 && a < 1000) {
            int b = a % 10;
            int c = a % 100;
            int d = c / 10;
            System.out.println("a ones digit->" + b);
            System.out.println("a tens digit->" + d);
        }
    }
}
