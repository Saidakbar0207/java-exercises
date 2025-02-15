package begins;

import java.util.Scanner;

public class Begin18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A :");
        int a = sc.nextInt();
        System.out.print("Enter C :");
        int c = sc.nextInt();
        System.out.print("Enter B :");
        int b = sc.nextInt();
        int ac=c-a;
        int bc=b-c;
        int product= ac*bc;
        System.out.println("Product is "+product);
    }

}
