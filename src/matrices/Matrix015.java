package matrices;

import java.util.Random;
import java.util.Scanner;

public class Matrix015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns :");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = rand.nextInt(10,100);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
            System.out.println();
        for (int i = 0; i <(n+1)/2; i++) {
            for (int j = i; j <n-i; j++) {
                System.out.print(arr[i][j] + " ");
            }
            for (int j = i+1; j <n-i; j++) {
                System.out.print(arr[j][n-i-1] + " ");
            }
            for (int j = n-i-2; j >= i; j--) {
                System.out.print(arr[n-i-1][j] + " ");
            }
            for (int j = n-i-2; j >i; j--) {
                System.out.print(arr[j][i] + " ");
            }
        }
    }
}
