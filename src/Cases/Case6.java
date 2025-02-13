package Cases;

import java.util.Scanner;

public class Case6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter a number: ");
        int b = sc.nextInt();
        switch(b) {
            case 1 ->System.out.println(a+"decimetr = "+(a/10)+" meter");
            case 2 ->System.out.println(a+"kilometr = "+(a*1000)+" meter");
            case 3 ->System.out.println(a+"meter = "+(a)+" meter");
            case 4 ->System.out.println(a+"millimeter = "+(a/1000)+" meter");
            case 5 ->System.out.println(a+"centimeter = "+(a/100)+" meter");
        }
    }
}
