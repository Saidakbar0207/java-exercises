package arrays;

import java.util.Scanner;

public class Array013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :");
        int n= sc.nextInt();
        double[] arr = new double[n];
        for (int i =0; i <n; i++) {
            arr[i]=(Math.round(Math.random()*100));
        } System.out.println("Array full elements :");
        for (int i =0; i <n; i++) {
            System.out.print(arr[i]+" ");
        }  System.out.println("\nArray odd index of element is : ");
        for (int i =n-1; i>=0; i-=2) {
            System.out.print(arr[i]+" ");
        }

    }
}
