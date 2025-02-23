package arrays;

import java.util.Random;
import java.util.Scanner;

public class Array023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(1,10);
        } int sum1=0;
        System.out.println("Array elements :");
        for (int i = 0; i <n; i++) {
            sum1+=arr[i];
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
        double average=(sum1-sum)/(n-l+k-1);
        System.out.println("Average of elements is : "+average);
    }
}
