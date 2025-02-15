package integers;

import java.util.Scanner;

public class Integer08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a two-digit :");
        int a = sc.nextInt();
        if(a>9 && a<100) {
            int b = a / 10;
            int c = a % 10;
            System.out.println("Exchange of its digits :" + c + b);
        } else {
            System.out.println("Invalid digit");
        }

    }
}
