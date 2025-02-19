package arrays;

import java.util.Scanner;

public class Array006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n (n>2):");
        int n = sc.nextInt();
        System.out.print("Enter array[0] :");
        int a=sc.nextInt();
        System.out.print("Enter array[1] :");
        int b=sc.nextInt();
        int[] arr = new int[n];
        arr[0]=a;
        arr[1]=b;
        for(int i = 2; i < n; i++){
            int sum=0;
            for(int j = 0; j < i; j++){
                sum+=arr[j];
            }
            arr[i]=sum;
        }
        System.out.println("Sum of numbers :");
        for(int num :arr){
            System.out.print(num+" ");
        }
    }
}
