package begins;

import java.util.Scanner;

public class Begin33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many kg sweets are talking about? ");
        int x = sc.nextInt();
        System.out.print("How many cost sweets are talking about? ");
        int A=sc.nextInt();
        System.out.print("How many kg sweets do you want to buy ?  ");
        int y=sc.nextInt();
        double c=A/x;
        double b=y*c;
        System.out.println("1 kg  cost  of sweet ="+c);
        System.out.println(Y+" kg  cost of sweet ="+b);
    }
}
