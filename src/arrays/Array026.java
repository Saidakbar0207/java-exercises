package arrays;

import java.util.Scanner;

public class Array026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        } System.out.println("Array elements :");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int index=0;
        for (int i = 1; i < n; i++) {
            if((arr[i]%2==arr[i-1]%2)){
                index=i+1;
                break;
            }
            }
        System.out.println(index);
        }
    }
