package begins;

import java.util.Scanner;

public class Begin30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radian (0<a<2_pi):");
        double radian = sc.nextDouble();
        double degrees = Math.toDegrees(radian);
        System.out.println("the degrees is " + degrees);
    }
}
