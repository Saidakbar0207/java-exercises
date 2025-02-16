package begins;

import java.util.Scanner;

public class Begin28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a :");
        int a = sc.nextInt();
        int a_2=a*a;
        int a_3=a*a_2;
        int a_5=a_2*a_3;
        int a_10=a_5*a_5;
        int a_15=a_10*a_5;
        System.out.println("a^15 = "+a_15);
    }
}
