package matrices;

import java.util.Random;
import java.util.Scanner;

public class Matrix026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows :");
        int n = sc.nextInt();
        System.out.print("Enter the number of columns :");
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = r.nextInt(1, 10);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(" \t" + matrix[i][j] + " ");
            }
            System.out.println();
        }
        int minprod= Integer.MAX_VALUE;
        int count =-1;
        for (int j = 0; j < m; j++) {
            int product = 1;
            for (int i = 0; i < n; i++) {
                product*=matrix[i][j];
            }
            if (product <minprod) {
                minprod = product;
                count++;
            }
        }
        System.out.println(count + "th column product is " + minprod);
    }
}