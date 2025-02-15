package begins;

import java.util.Scanner;

public class Begin27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A :");
        int a = sc.nextInt();
        int a_2=a*a;
        int a_4=a_2*a_2;
        int a_8=a_4*a_4;
        System.out.println("A^8 = "+a_8);
    }
}
