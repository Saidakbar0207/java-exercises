package arrays;

import java.util.Scanner;

public class Array004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = sc.nextInt();
        System.out.print("Enter first number :");
        int a=sc.nextInt();
        System.out.print("Enter difference :");
        int d=sc.nextInt();
        int[] arr = new int[n];
        arr[0]=a;
        for(int i=1;i<n;i++){
            arr[i]=arr[i-1]*d;
        }
        for(int num: arr){
            System.out.print(num +" ");
        }
    }
}
