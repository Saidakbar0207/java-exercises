package arrays;

import java.util.Random;
import java.util.Scanner;

public class Array020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(1,100);
        } System.out.println("Array elements :");
        for (int i = 0; i <n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Enter index array :");
        int k = sc.nextInt();
        System.out.print("Enter index array (k<l):");
        int l = sc.nextInt();
        int sum=0;
        for (int i =k; i <=l; i++) {
            sum+=arr[i];
        }
        System.out.println("Sum of elements is : "+sum);
    }
}
