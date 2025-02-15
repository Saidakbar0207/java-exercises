package begins;

import java.util.Scanner;

public class Begin16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x_1 :");
        int x_1 = sc.nextInt();
        System.out.print("Enter x_2 :");
        int x_2 = sc.nextInt();
        int distance =Math.absExact(x_2-x_1);
        System.out.println("The distance between x_1 and x_2 is : "+distance);
    }
}
