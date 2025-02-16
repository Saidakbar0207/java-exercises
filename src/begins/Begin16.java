package begins;

import java.util.Scanner;

public class Begin16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1 :");
        int x1 = sc.nextInt();
        System.out.print("Enter x2 :");
        int x2 = sc.nextInt();
        int distance =Math.absExact(x2-x1);
        System.out.println("the distance between x_1 and x_2 is : "+distance);
    }
}
