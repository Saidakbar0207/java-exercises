package begins;

import java.util.Scanner;

public class Begin10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a :");
        int a = sc.nextInt();
        System.out.print("Enter b :");
        int b = sc.nextInt();
        int c=a+b;
        int d=a*b;
        int pow_a=a*a;
        int pow_b=b*b;
        System.out.println("sum = "+c);
        System.out.println("difference = "+d);
        System.out.println("pow_a= "+pow_a);
        System.out.println("pow_b = "+pow_b);
    }
}
