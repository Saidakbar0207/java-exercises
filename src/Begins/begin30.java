package Begins;
import java.util.Scanner;
public class begin30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radian (0<a<2_pi):");
        double radian = sc.nextDouble();
        double degrees = Math.toDegrees(radian);
        System.out.println("The degrees is " + degrees);
    }
}
