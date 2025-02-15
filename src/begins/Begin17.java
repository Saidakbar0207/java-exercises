package begins;

import java.util.Scanner;

public class Begin17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A :");
        int a = sc.nextInt();
        System.out.print("Enter B :");
        int b = sc.nextInt();
        System.out.print("Enter C :");
        int c = sc.nextInt();
        int ac=c-a;
        int ab=b-a;
        int bc=c-b;
        int sum=ac+ab+bc;
        System.out.println("The sum is : "+sum);
        System.out.println("AC ="+ac);
        System.out.println("AB ="+ab);
        System.out.println("BC ="+bc);
    }
}
