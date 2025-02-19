package arrays;

import java.util.Scanner;

public class Array002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter power of 2 :");
        int n= sc.nextInt();
        if(n<0){
            System.out.println("Negative number");
            return;
        }
        int[] arr = new int[n];
         arr[0]=2;
        for(int i=1; i<n; i++){
            arr[i]=arr[i-1]*2;
        }
         System.out.print("Enter power of 2 :");
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
