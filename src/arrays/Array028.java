package arrays;

import java.util.Random;
import java.util.Scanner;

public class Array028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(1,100);
        } System.out.println("Array elements :");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        } System.out.println("");
        int temp = arr[0];
        for (int i = 0; i < n; i+=2) {
            if(arr[i]>temp){
                temp = arr[i];
            }
        }
        System.out.println("Array element of even max number = " + temp);
    }
}
