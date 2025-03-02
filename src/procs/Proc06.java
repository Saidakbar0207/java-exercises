package procs;

import java.util.Scanner;

public class Proc06 {
    public static void DigitCountSum(int k,int[] results){
        int count=0;
        int sum=0;
        while(k>0){
            sum+=k%10;
            k=k/10;
            count++;
        }
        results[0]=count;
        results[1]=sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter k :");
        int k = sc.nextInt();
        int[] results = new int[2];
      DigitCountSum(k,results);
      System.out.println("Amount C of digits ->"+results[0]);
      System.out.println("The sum S of its digits ->"+results[1]);
    }
}
