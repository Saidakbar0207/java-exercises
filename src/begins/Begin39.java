package begins;

import java.util.Scanner;

public class Begin39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a :");
        int a = sc.nextInt();
        System.out.print("Enter b :");
        int b = sc.nextInt();
        System.out.print("Enter c :");
        int c = sc.nextInt();
        double discriminant=b*b-4*a*c;
        if (discriminant>=0){
            System.out.println("discriminan is "+discriminant);
            double x1=(-b-Math.sqrt(discriminant)) /(2*a);
            double x2=(-b+Math.sqrt(discriminant)) /(2*a);
            System.out.println("x_1 = "+x1);
            System.out.println("x_2 = "+x2);
        } else {
            System.out.println("0");
        }
    }
}
