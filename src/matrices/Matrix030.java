package matrices;

import java.util.Random;
import java.util.Scanner;

public class Matrix030 {
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
            double average=0.0;
            double count=0.0;
            for (int j = 0; j < m; j++) {
                System.out.print(j + "th greater than the average of row is ");
                average = 0.0;
                count = 0.0;
                for (int i = 0; i < n; i++) {
                    average += matrix[i][j];
                    count++;
                } for (int i = 0; i <n; i++) {
                    if (matrix[i][j] > (average / count)) {
                        System.out.print(matrix[i][j] + " ");
                    }
                }
                System.out.println();
            }
            }
        }


