package Conditionals;

import java.util.Scanner;

public class If19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Enter a number: ");
        int b = sc.nextInt();
        System.out.print("Enter a number: ");
        int c = sc.nextInt();
        System.out.print("Enter a number: ");
        int d = sc.nextInt();
        if(a==b && b==c){
            System.out.println("order number = "+4);
        } else if(a==b && b==d){
            System.out.println("order number = "+3);
        } else if(a==c && c==d){
            System.out.println("order number = "+2);
        } else if(b==c && c==d){
            System.out.println("order number = "+1);
        }
    }
}
