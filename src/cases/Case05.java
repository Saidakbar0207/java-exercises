package cases;

import java.util.Scanner;

public class Case05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a :");
        int a = sc.nextInt();
        System.out.print("Enter b :");
        int b = sc.nextInt();
        System.out.print("Enter arifmetric operation :");
        int op = sc.nextInt();
        switch(op) {
            case 1 ->System.out.println("a+b="+(a+b));
            case 2 ->System.out.println("a-b="+(a-b));
            case 3 ->System.out.println("a*b="+(a*b));
            case 4 ->System.out.println("a/b="+(a/b));
        }
    }
}
