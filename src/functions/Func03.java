package functions;

import java.util.Scanner;

public class Func03 {
    public static void CircleS(double r, double r1 , double r2, double[] results){
        double pi=Math.PI;
        results[0]=pi*r*r;
        results[1]=pi*r1*r1;
        results[2]=pi*r2*r2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of a circle :");
        double r= sc.nextDouble();
        System.out.print("Enter radius1 of a circle :");
        double r1= sc.nextDouble();
        System.out.print("Enter radius2 of a circle :");
        double r2= sc.nextDouble();
        double[] results=new double[3];
        CircleS(r,r1,r2,results);
        System.out.println("The area of circle = "+results[0]);
        System.out.println("The area of circle = "+results[1]);
        System.out.println("The area of circle = "+results[2]);
    }
}
