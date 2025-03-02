package procs;

import java.util.Scanner;

public class Proc03 {
    public static void Mean(double x, double y, double[] result) {
        result[0] = (x + y)/2;
        result[1]=Math.sqrt(x*y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the a :");
        double a = sc.nextDouble();
        System.out.print("Enter the b :");
        double b = sc.nextDouble();
        System.out.print("Enter the c :");
        double c = sc.nextDouble();
        System.out.print("Enter the d :");
        double d = sc.nextDouble();
        double[] result = new double[2];
        Mean(a,b,result);
        System.out.println("Arithmetical mean  of a and b = "+result[0]);
        System.out.println("Geometrical  mean  of a and b = "+result[1]);
        Mean(a,c,result);
        System.out.println("Arithmetical mean  of a and c = "+result[0]);
        System.out.println("Geometrical  mean  of a and c = "+result[1]);
        Mean(a,d,result);
        System.out.println("Arithmetical mean  of a and d = "+result[0]);
        System.out.println("Geometrical  mean  of a and d = "+result[1]);
    }

}
