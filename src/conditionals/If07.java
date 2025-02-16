package conditionals;

import java.util.Scanner;

public class If07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int a= sc.nextInt();
        System.out.print("Enter b number :");
        int b= sc.nextInt();
        if (a>b){
            System.out.println("ordinal number of a small number : "+1);
        } else {
            System.out.println("ordinal number of a small number : "+2);
        }
    }

}
