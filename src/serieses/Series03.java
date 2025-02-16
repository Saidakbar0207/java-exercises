package serieses;

import java.util.Scanner;

public class Series03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ten real numbers :");
        double sum=0;
        for(int i=1;i<=10;i++){
            sum+=sc.nextDouble();
        }
        System.out.println("sum = "+(sum/10));
    }
}
