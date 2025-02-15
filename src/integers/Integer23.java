package integers;

import java.util.Scanner;

public class Integer23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N seconds :");
        int n = sc.nextInt();
        int m=(n%3600)/60;
        System.out.println(m+" minutes ");
    }
}
