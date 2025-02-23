package arrays;

import java.util.Scanner;

public class Array011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array number :");
        int k=sc.nextInt();
        for(int i=0; i <n; i++) {
            arr[0]=k;
            arr[i] = (i+1)*k;
        } for(int i=0; i <n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
