package begins;

import java.util.Scanner;

public class Begin23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A :");
        int a = sc.nextInt();
        System.out.print("Enter B :");
        int b = sc.nextInt();
        System.out.print("Enter C :");
        int c = sc.nextInt();
        int d=a+b+c;
        b=d-b-c;
        c=d-a-c;
        a=d-a-c;
        System.out.println("New A = "+a);
        System.out.println("New B = "+b);
        System.out.println("New C = "+c);
    }
}
