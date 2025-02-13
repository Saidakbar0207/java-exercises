package Integers;
import java.util.Scanner;
public class Integer29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A number: ");
        int a = sc.nextInt();
        System.out.print("Enter B number: ");
        int b = sc.nextInt();
        System.out.print("Enter C number: ");
        int c = sc.nextInt();
        int placed=(a/c)* (b/c);
        int part=a*b-placed*c*c;
        System.out.println("squares placed on the rectangle->"+placed);
        System.out.println("part of rectangle->"+part);
    }
}
