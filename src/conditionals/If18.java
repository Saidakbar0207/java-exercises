package conditionals;

import java.util.Scanner;

public class If18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Enter a number: ");
        int b = sc.nextInt();
        System.out.print("Enter a number: ");
        int c = sc.nextInt();
        if(a==b){
            System.out.println("order number = "+3);
        } else if(a==c){
            System.out.println("order number = "+2);
        } else if(b==c){
            System.out.println("order number = "+1);
        }
    }
}
