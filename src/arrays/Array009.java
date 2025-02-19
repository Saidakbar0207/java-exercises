package arrays;

import java.util.Scanner;

public class Array009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :");
        int n = sc.nextInt();
        System.out.print("Enter the elements of the array :");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        } int sum=0;
        System.out.println( "The elements of odd  number of array :");
        for (int i =n-1; i>=0; i++) {
            if(arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
                sum++;
            }
        } System.out.println("\nnumber of odd = "+sum);
    }
}
