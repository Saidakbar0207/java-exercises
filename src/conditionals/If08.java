package conditionals;

import java.util.Scanner;

public class If8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int a= sc.nextInt();
        System.out.print("Enter b number :");
        int b= sc.nextInt();
        if (a>b){
            System.out.println("Larger number is : "+a);
            System.out.println("Smaller number is : "+b);
        } else {
            System.out.println("Larger number is : "+b);
            System.out.println("Smaller number is : "+a);
        }
    }
}
