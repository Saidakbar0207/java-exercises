package procs;

import java.util.Scanner;

public class Proc29 {
    public static int DigitCount(int n){
        int count=0;
    while(n>0){
        n/=10;
        count++;
    }
    return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = sc.nextInt();
        System.out.println(DigitCount(n));

    }
}
