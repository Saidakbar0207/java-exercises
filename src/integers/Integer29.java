package integers;

import java.util.Scanner;

public class Integer29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Enter b number: ");
        int b = sc.nextInt();
        System.out.print("Enter c number: ");
        int c = sc.nextInt();
        int placed=(a/c)* (b/c);
        int part=a*b-placed*c*c;
        System.out.println("squares placed on the rectangle->"+placed);
        System.out.println("part of rectangle->"+part);
    }
}
