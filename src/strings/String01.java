package strings;

import java.util.Scanner;

public class String01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a char :");
        char ch = sc.next().charAt(0);
        System.out.print("Numeric value :"+(int)ch);
    }
}
