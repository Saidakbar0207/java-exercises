package Integers;

import java.util.Scanner;

public class Integer17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = sc.nextInt();
        if(n>999){
            int  m=(n%1000)/100;
            System.out.println("a hundeds->"+m);
        } else {
            System.out.println("Error");
        }
    }
}
