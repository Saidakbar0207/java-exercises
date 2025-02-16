package begins;

import java.util.Scanner;

public class Begin05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = sc.nextInt();
        int  v=a*a*a;
        int s=6*a*a;
        System.out.println("v = "+v);
        System.out.println("s = "+s);
    }
}
