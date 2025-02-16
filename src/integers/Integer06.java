package integers;

import java.util.Scanner;

public class Integer06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a twoDigit :");
        int a = sc.nextInt();
        if(a>9 && a<100) {
            int tensDigit = a / 10;
            int onesDigit = a % 10;
            System.out.println("tensDigit ->" + tensDigit);
            System.out.println("onesDigit ->" + onesDigit);
        } else {
            System.out.println("invalid input");
        }
    }
}
