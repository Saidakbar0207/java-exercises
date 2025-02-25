package matrices;

import java.util.Random;
import java.util.Scanner;

public class Matrix017 {
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
        System.out.print("Enter row k of matrix :");
        int k = sc.nextInt();
        int sum=0;
        int product=1;
        for (int i =k; i<k+1; i++) {
            for (int j = 0; j < m; j++) {
                sum+=matrix[i][j];
                product*=matrix[i][j];
                System.out.print(" \t"+matrix[k][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The sum of the matrix is : "+sum);
        System.out.println("The product of the matrix is : "+product);
    }
}
