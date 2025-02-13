package Conditionals;

import java.util.Scanner;

public class If15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a= sc.nextInt();
        System.out.print("Enter a number: ");
        int b= sc.nextInt();
        System.out.print("Enter a number: ");
        int c= sc.nextInt();
        if(a>c && b>c){
            System.out.println("Sumo of two largest value = "+(a+b));
        } else if(a>b && c>b){
            System.out.println("Sumo of two largest value = "+(a+c));
        } else if(b>a && c>a){
            System.out.println("Sumo of two largest value = "+(b+c));
        }
    }
}
