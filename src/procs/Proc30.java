package procs;

import java.util.Scanner;

public class Proc30 {
    public static int DigitN(int n,int k){
        int count=0;
        int temp=k;
        while(temp>0){
            temp/=10;
            count++;
        }
        if(count<n) return -1;
        temp=k;
        int[] arr = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            arr[i] = temp % 10;
            temp /= 10;
        }
        return arr[n-1];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int k = sc.nextInt();
        System.out.print("Enter number of th :");
        int n=sc.nextInt();
        System.out.print(DigitN(n,k));


    }
}
