package procs;

import java.util.Scanner;

public class Proc26 {
    public static boolean IsPower5(double k) {
     while(k>5){
     k/=5;
     }
     if(k==5) return true;
     else if(k==0) return false;
     else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        double k = sc.nextInt();
        System.out.println(IsPower5(k));

    }
}
