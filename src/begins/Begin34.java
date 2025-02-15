package begins;

import java.util.Scanner;

public class Begin34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many kg chocolates are talking about? ");
        int X = sc.nextInt();
        System.out.print("How many cost chocolates are talking about? ");
        int A=sc.nextInt();
        System.out.print("How much kg sugar are talking about? ");
        int Y = sc.nextInt();
        System.out.print("How much cost sugar are talking about? ");
        int B=sc.nextInt();
        double y=A/X;
        double b=B/Y;
        double expensive=y-b;
        System.out.println("1 kg  cost  of chocolates ="+y);
        System.out.println("1 kg  cost of sugar ="+b);
        System.out.println("The expensive cost is "+expensive);
    }
}
