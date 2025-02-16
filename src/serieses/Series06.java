package serieses;

import java.util.Scanner;

public class Series06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int n = sc.nextInt();
        double sum=0;
        double product=1;
        System.out.print("Enter the real numbers :");
        for(int i=1;i<=n;i++){
            double num=sc.nextDouble();
            sum+=num-(int)num;
            product*=num-(int)num;
        }
        System.out.println("sum = "+sum);
        System.out.println("product = "+product);
    }
}
