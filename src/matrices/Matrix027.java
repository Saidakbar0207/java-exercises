package matrices;

import java.util.Random;
import java.util.Scanner;

public class Matrix027 {
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
                matrix[i][j] = r.nextInt(1,10);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(" \t"+matrix[i][j] + " ");
            }
            System.out.println();
        }
        int minsum=Integer.MAX_VALUE;
        int maxsum=Integer.MIN_VALUE;
        int i1=-1;
        for (int i =0; i<n; i++) {
            int sum = 0;
            for (int j = 0; j < m; j++) {
                sum += matrix[i][j];
            }
            if (sum < minsum) {
                minsum = sum;
                i1++;
            }
        } for (int i =0; i<n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i1][j]>maxsum) {
                    maxsum = matrix[i1][j];
                }
            }
        }

        System.out.println(i1+"th row maximal value is "+maxsum);
    }
}
