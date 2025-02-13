package Integers;

import java.util.Scanner;

public class Integer18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = sc.nextInt();
        if(n>999){
            int  m=(n%10000)/1000;
            System.out.println("a thousands->"+m);
        } else {
            System.out.println("Error");
        }
    }
}
