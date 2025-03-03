package functions;

import java.util.Scanner;

public class Func05 {
    public static int  TriangleP(int a, double h){
        double b,c;
        double p;
        b=Math.sqrt(Math.pow(a/2,2)+h*h);
        c=Math.sqrt(Math.pow(b,2)+Math.pow(a,2));
        p=a+b+c;
        return (int)p;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a base :");
        int a = sc.nextInt();
        System.out.print("Enter h altitude :");
        double h = sc.nextDouble();
        TriangleP(a,h);
        System.out.println("Triangle P is "+TriangleP(a,h));
    }
}
