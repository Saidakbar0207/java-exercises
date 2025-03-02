package procs;

import java.util.Scanner;

public class Proc27 {
    public static boolean IsPowerN(double k,double n) {
        while(k>n){
            k/=n;
        }
        if(k==n) return true;
        else if(k==0) return false;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        double n = sc.nextInt();
        System.out.print("Enter the power n :");
        double k = sc.nextDouble();
        System.out.println(IsPowerN(k,n));

    }
}


