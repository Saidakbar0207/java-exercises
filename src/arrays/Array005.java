package arrays;

import java.util.Scanner;

public class Array005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n (n>2):");
        int n = sc.nextInt();
        int[] arr = new int[n];
        arr[0]=1;
        arr[1]=1;
        for(int i = 2; i < n; i++){
            arr[i]=arr[i-1]+arr[i-2];
        } System.out.println("Fibonacci numbers :");
        for(int num :arr){
            System.out.print(num+" ");
        }
    }
}
