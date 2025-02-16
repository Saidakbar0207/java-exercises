package serieses;

import java.util.Scanner;

public class Series02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ten reals number :");
        double sum=1;
        for(int i=1;i<=10;i++){
            sum*=sc.nextDouble();
        }
        System.out.println("sum = "+sum);
    }
}
