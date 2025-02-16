package begins;

import java.util.Scanner;

public class Begin17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a :");
        int a = sc.nextInt();
        System.out.print("Enter b :");
        int b = sc.nextInt();
        System.out.print("Enter c :");
        int c = sc.nextInt();
        int ac=c-a;
        int ab=b-a;
        int bc=c-b;
        int sum=ac+ab+bc;
        System.out.println("the sum is : "+sum);
        System.out.println("ac ="+ac);
        System.out.println("ab ="+ab);
        System.out.println("bc ="+bc);
    }
}
