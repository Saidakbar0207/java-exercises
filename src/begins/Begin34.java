package begins;

import java.util.Scanner;

public class Begin34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many kg chocolates are talking about? ");
        int x = sc.nextInt();
        System.out.print("How many cost chocolates are talking about? ");
        int a=sc.nextInt();
        System.out.print("How much kg sugar are talking about? ");
        int y = sc.nextInt();
        System.out.print("How much cost sugar are talking about? ");
        int b=sc.nextInt();
        double z=a/x;
        double c=b/y;
        double expensive=y-c;
        System.out.println("1 kg  cost  of chocolates ="+y);
        System.out.println("1 kg  cost of sugar ="+b);
        System.out.println("The expensive cost is "+expensive);
    }
}
