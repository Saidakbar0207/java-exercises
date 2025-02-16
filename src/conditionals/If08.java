package conditionals;

import java.util.Scanner;

public class If08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int a= sc.nextInt();
        System.out.print("Enter b number :");
        int b= sc.nextInt();
        if (a>b){
            System.out.println("larger number is : "+a);
            System.out.println("smaller number is : "+b);
        } else {
            System.out.println("larger number is : "+b);
            System.out.println("smaller number is : "+a);
        }
    }
}
