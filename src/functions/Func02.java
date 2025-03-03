package functions;

import java.util.Scanner;

public class Func02 {
    public static int RootCount(int a, int b, int c) {
        int d= (int) (Math.pow(b,2)-4*a*c);
        if(d>0) return 2;
        else if(d==0) return 1;
        else return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (a!=0):");
        int a = sc.nextInt();
        System.out.print("Enter b number :");
        int b = sc.nextInt();
        System.out.print("Enter c number :");
        int c = sc.nextInt();
        System.out.println("Root count = " + RootCount(a,b,c));


    }
}
