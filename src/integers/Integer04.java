package integers;

import java.util.Scanner;

public class Integer04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a= sc.nextInt();
        System.out.print("Enter b number: ");
        int b= sc.nextInt();
        int c=a/b;
        System.out.println(c);

    }
}
