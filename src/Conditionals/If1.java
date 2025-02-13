package Conditionals;

import java.util.Scanner;

public class If1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a :");
        int a = sc.nextInt();
        if(a>0){
            a-=8;
            System.out.println("a = "+a);
        } else {
            System.out.println("a =" +a);
        }
    }
}
