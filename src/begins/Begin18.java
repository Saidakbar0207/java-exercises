package begins;

import java.util.Scanner;

public class Begin18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a :");
        int a = sc.nextInt();
        System.out.print("Enter c :");
        int c = sc.nextInt();
        System.out.print("Enter b :");
        int b = sc.nextInt();
        int ac=c-a;
        int bc=b-c;
        int product= ac*bc;
        System.out.println("product is "+product);
    }

}
