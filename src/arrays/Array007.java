package arrays;

import java.util.Random;
import java.util.Scanner;

public class Array007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            arr[i]=rand.nextInt(100)+1;
        }
        for(int num: arr){
            System.out.print(num+" ");
        } System.out.println("\ninverse order :");
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+" ");

        }
    }
}
