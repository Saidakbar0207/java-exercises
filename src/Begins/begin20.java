package Begins;
import java.util.Scanner;
public class begin20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x_1 :");
        int x_1 = sc.nextInt();
        System.out.print("Enter x_2 :");
        int x_2 = sc.nextInt();
        System.out.print("Enter y_1 :");
        int y_1 = sc.nextInt();
        System.out.print("Enter y_2 :");
        int y_2 = sc.nextInt();
        double distance =Math.sqrt(Math.pow((x_2-x_1),2)+Math.pow((y_2-y_1),2));
        System.out.println("The distance  = "+distance);
    }
}
