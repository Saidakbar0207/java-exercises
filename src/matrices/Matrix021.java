package matrices;

import java.util.Random;
import java.util.Scanner;

public class Matrix021 {
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
        double sum=0;
        double count=0;
        for (int i =0; i<n; i++) {
            System.out.print("Matrix of row "+i+"->");
            sum=0;
            count=0;
            for (int j =1; j < m; j+=2) {
                sum+=matrix[i][j];
                count++;
                System.out.print(matrix[i][j]+" ");
            }System.out.println("\nThe average of the matrix is : "+sum/count);

            System.out.println();
        }
    }
}
