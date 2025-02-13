package Conditionals;

import java.util.Scanner;

public class If28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter anumber of years: ");
        int x = sc.nextInt();
        if(x%100==0 && x%400==0){
            System.out.println("This is years have 366");
        } else {
            System.out.println("This is years have 365");
        }
    }
}
