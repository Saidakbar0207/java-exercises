package serieses;

import java.util.Scanner;

public class Series10 {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number :");
    int n = sc.nextInt();
    boolean hasPositive= false;
    System.out.print("Enter numbers:");
    for (int i = 1; i <= n; i++) {
        int num = sc.nextInt();
        if(num>0){
            hasPositive = true;
        }
    }
System.out.println(hasPositive ? "True" : "False");
}
}
