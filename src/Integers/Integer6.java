package Integers;
import java.util.Scanner;
public class Integer6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a two-digit :");
        int a = sc.nextInt();
        if(a>9 && a<100) {
            int tens_digit = a / 10;
            int ones_digit = a % 10;
            System.out.println("tens_digit ->" + tens_digit);
            System.out.println("ones_digit ->" + ones_digit);
        } else {
            System.out.println("invalid input");
        }
    }
}
