package procs;

import java.util.Scanner;

public class Proc19 {
    public static double RingS(double r1,double r2){
        double pi=Math.PI;
        double different=r1*r1*pi-r2*r2*pi;
        return different;
    }
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter radius1 of a circle (r1>r2):");
     double r1= sc.nextDouble();
     System.out.print("Enter radius2 of a circle :");
     double r2= sc.nextDouble();
     RingS(r1,r2);
     System.out.print(RingS(r1,r2));
 }
}
