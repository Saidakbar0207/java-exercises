package begins;

import java.util.Scanner;

public class Begin21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1 :");
        int x1 = sc.nextInt();
        System.out.print("Enter x2 :");
        int x2 = sc.nextInt();
        System.out.print("Enter x3 :");
        int x3 = sc.nextInt();
        System.out.print("Enter y1 :");
        int y1 = sc.nextInt();
        System.out.print("Enter y2 :");
        int y2 = sc.nextInt();
        System.out.print("Enter y3 :");
        int y3 = sc.nextInt();
        double a=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        System.out.println("a = "+a);
        double b=Math.sqrt(Math.pow(x3-x2,2)+Math.pow(y3-y2,2));
        System.out.println("b = "+b);
        double c=Math.sqrt(Math.pow(x1-x3,2)+Math.pow(y1-y3,2));
        System.out.println("c = "+c);
        double perimetr =a+b+c;
        System.out.println("perimetr = "+perimetr);
        double s=Math.sqrt(perimetr*(perimetr-a)*(perimetr-b)*(perimetr-c));
        System.out.println("s = "+s);
    }
}
