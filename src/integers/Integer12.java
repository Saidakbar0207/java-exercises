package integers;

import java.util.Scanner;

public class Integer12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a three-digit :");
        int a = sc.nextInt();
        if(a>99 && a<1000){
            int b=a/100;
            int c=(a%100)/10;
            int d=a%10;
            System.out.println("reading it from rigt to left->"+d+c+b);
        } else {
            System.out.println("invalid digit");
        }
    }
}
