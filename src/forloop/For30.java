package forloop;

import java.util.Scanner;

public class For30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a :");
        double a = sc.nextDouble();
        System.out.print("Enter number b(a<b):");
        double b = sc.nextDouble();
        System.out.print("Enter number n :");
        int n = sc.nextInt();
        double h=(b-a)/n;
        for(int i=0;i<=n;i++){
            double x=a+i*h;
            double f_x=1-Math.sin(x);
            System.out.println("F("+x+")="+f_x)   ;
        }
    }
}
