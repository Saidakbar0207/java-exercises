package integers;

import java.util.Scanner;

public class Integer07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a twoDigit :");
        int a = sc.nextInt();
        if(a>9 && a<100) {
            int b = a / 10;
            int c = a % 10;
            int d = b + c;
            int e = b * c;
            System.out.println("sum" + "(" + a + ")=" + d);
            System.out.println("product" + "(" + a + ")=" + e);
        } else {
            System.out.println("invalid input");
        }
    }
}
