package Conditionals;

import java.util.Scanner;

public class If14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter a number: ");
        int number2 = sc.nextInt();
        System.out.print("Enter a number: ");
        int number3 = sc.nextInt();
        int max = Math.max(Math.max(number1, number2), number3);
        int min = Math.min(Math.min(number1, number2), number3);
        System.out.println("The maximum number is " + max);
        System.out.println("The minimum number is " + min);
    }
}
