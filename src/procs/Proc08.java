package procs;

import java.util.Scanner;

public class Proc08 {
    public static void AddRightDigit(int k,int num1,int num2,int[] res){
        res[0]=k*10+num1;
        res[1]=res[0]*10+num2;

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
        AddRightDigit(k,num1,num2,res);
        System.out.println(res[0]);
        System.out.println(res[1]);



    }
}
