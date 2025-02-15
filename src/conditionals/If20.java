package conditionals;

import java.util.Scanner;

public class If20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Enter a number: ");
        int b = sc.nextInt();
        System.out.print("Enter a number: ");
        int c = sc.nextInt();
        if(Math.absExact(a-b) < Math.absExact(a - c)){
            System.out.println("nearest point  = "+b);
            System.out.println(" distance  = "+(a-b));
        }else {
            System.out.println("nearest point  = "+c);
            System.out.println(" distance  = "+(a-c));
        }
    }
}
