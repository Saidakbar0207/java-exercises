package Conditionals;

import java.util.Scanner;

public class If2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int a = sc.nextInt();
        if(a>0){
            a-=8;
            System.out.println("a = "+a);
        } else {
            a+=6;
            System.out.println("a = "+a);
        }
    }
}
