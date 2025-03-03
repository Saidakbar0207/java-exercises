package strings;

import java.util.Scanner;

public class String27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s1 = sc.nextLine();
        System.out.println("Enter an integer :");
        int n1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter a string :");
        String s2 = sc.nextLine();
        System.out.println("Enter an integer :");
        int n2 = sc.nextInt();

        System.out.print(s1.substring(0,n1)+s2.substring(s2.length()-n2));
    }
}
