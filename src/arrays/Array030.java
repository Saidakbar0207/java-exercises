package arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array030  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        int count=0;
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(1,100);
        } System.out.println("Elements array :");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 1; i < n; i++) {
            if(arr[i]<arr[i-1]){
                arr2[count]=i;
                count++;
            }
        } System.out.println();
        for (int i = 0; i <count; i++) {
            System.out.print(arr2[i] + " ");
        }

    }
}
