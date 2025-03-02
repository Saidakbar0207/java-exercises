package procs;

import java.util.Scanner;

public class Proc04 {
    public static void TrianglePS(double a, double[] results){
        results[0] =3*a;
        results[1] = Math.pow(a, 2)*Math.sqrt(3)/4;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
         double a = sc.nextDouble();
         double[] results = new double[2];
         TrianglePS(a,results);
         System.out.println("Perimetr of triangle = "+results[0]);
         System.out.println("Area = "+results[1]);
    }
}
