package strings;

import java.util.Scanner;

public class String07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string :");
        String s = sc.nextLine();
        System.out.println("The first character of String is-> "+String.valueOf(s.charAt(0)));
        System.out.println("The last character of String is-> "+String.valueOf(s.charAt(s.length()-1)));
    }
}
