package begins;

import java.util.Scanner;

public class Begin21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x_1 :");
        int x_1 = sc.nextInt();
        System.out.print("Enter x_2 :");
        int x_2 = sc.nextInt();
        System.out.print("Enter x_3 :");
        int x_3 = sc.nextInt();
        System.out.print("Enter y_1 :");
        int y_1 = sc.nextInt();
        System.out.print("Enter y_2 :");
        int y_2 = sc.nextInt();
        System.out.print("Enter y_3 :");
        int y_3 = sc.nextInt();
        double a=Math.sqrt(Math.pow(x_2-x_1,2)+Math.pow(y_2-y_1,2));
        System.out.println("a = "+a);
        double b=Math.sqrt(Math.pow(x_3-x_2,2)+Math.pow(y_3-y_2,2));
        System.out.println("b = "+b);
        double c=Math.sqrt(Math.pow(x_1-x_3,2)+Math.pow(y_1-y_3,2));
        System.out.println("c = "+c);
        double perimetr =a+b+c;
        System.out.println("perimetr = "+perimetr);
        double S=Math.sqrt(perimetr*(perimetr-a)*(perimetr-b)*(perimetr-c));
        System.out.println("S = "+S);
    }
}
