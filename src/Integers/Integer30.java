package Integers;
import java.util.Scanner;
public class Integer30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year :");
        int year = sc.nextInt();
        int century = (year / 100)+1;
        System.out.println(year + " is a " + century + "th century");
    }
}
