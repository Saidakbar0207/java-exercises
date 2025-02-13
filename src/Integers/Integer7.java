package Integers;
import java.util.Scanner;
public class Integer7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a two-digit :");
        int a = sc.nextInt();
        if(a>9 && a<100) {
            int b = a / 10;
            int c = a % 10;
            int d = b + c;
            int e = b * c;
            System.out.println("Sum" + "(" + a + ")=" + d);
            System.out.println("product" + "(" + a + ")=" + e);
        } else {
            System.out.println("invalid input");
        }
    }
}
