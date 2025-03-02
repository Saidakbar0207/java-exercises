package procs;

import java.util.Scanner;

public class Proc09 {
    public static void AddLeftDigit(int k,int num1,int num2,int[] res) {
       int count=0;
       int m=k;
       while(k>0){
           k=k/10;
           count++;
       }
       res[0]=(int)(m+num1*Math.pow(10,count));
       res[1]=(int)(res[0]+num2*Math.pow(10,count+1));
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter k :");
    int k = sc.nextInt();
        System.out.print("Enter num1:");
    int num1 = sc.nextInt();
        System.out.print("Enter num2:");
    int num2 = sc.nextInt();
    int[] res=new int[2];
    AddLeftDigit(k,num1,num2,res);
        System.out.println(res[0]);
        System.out.println(res[1]);
    }
}
