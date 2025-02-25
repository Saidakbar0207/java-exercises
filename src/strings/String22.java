package strings;

import java.util.Scanner;

public class String22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string :");
        String s = sc.nextLine();
        int sum=0;
        for (int i = 0; i < s.length(); i++) {
            sum +=s.charAt(i)-'0';
        }
        System.out.println("Sum of digits is "+sum);
    }
}
