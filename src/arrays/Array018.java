package arrays;

import java.util.Random;
import java.util.Scanner;

public class Array018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(1,100);
        } System.out.print("Array elements in the array :");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if(arr[n-1]<arr[i]){
                System.out.println(+arr[i]);
                flag = true;
                break;
            }
        } if(!flag) {
            System.out.println(0);
        }
    }
}
