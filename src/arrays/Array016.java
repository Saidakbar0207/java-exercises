package arrays;

import java.util.Random;
import java.util.Scanner;

public class Array016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :");
        int n = sc.nextInt();
        int[] a = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(1, 100);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
    }