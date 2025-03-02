package procs;

import java.util.Scanner;

public class Proc07 {
    public static void InvDigits(int a,int b,int c,int d,int e,int[] results){
         int[] reversed=new int[5];
         while(a!=0){
             int digit=a%10;
             reversed[0]=reversed[0]*10+digit;
             a/=10;
         }
        while(b!=0){
            int digit=b%10;
            reversed[1]=reversed[1]*10+digit;
            b/=10;
        }
        while (c != 0) {
            int digit=c%10;
            reversed[2]=reversed[2]*10+digit;
            c/=10;
        }
        while(d!=0){
            int digit=d%10;
            reversed[3]=reversed[3]*10+digit;
            d/=10;
        }
        while(e!=0){
            int digit=e%10;
            reversed[4]=reversed[4]*10+digit;
            e/=10;
        }
         results[0]=reversed[0];
         results[1]=reversed[1];
         results[2]=reversed[2];
         results[3]=reversed[3];
         results[4]=reversed[4];


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = sc.nextInt();
        System.out.print("Enter b:");
        int b = sc.nextInt();
        System.out.print("Enter c:");
        int c = sc.nextInt();
        System.out.print("Enter d:");
        int d = sc.nextInt();
        System.out.print("Enter e:");
        int e = sc.nextInt();
        int[] results = new int[5];
         InvDigits(a,b,c,d,e,results);
        System.out.println("invert the order of digits->"+results[0]);
        System.out.println("invert the order of digits->"+results[1]);
        System.out.println("invert the order of digits->"+results[2]);
        System.out.println("invert the order of digits->"+results[3]);
        System.out.println("invert the order of digits->"+results[4]);
    }
}
