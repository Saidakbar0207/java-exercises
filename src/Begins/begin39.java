package Begins;
import java.util.Scanner;
public class begin39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A :");
        int a = sc.nextInt();
        System.out.print("Enter B :");
        int b = sc.nextInt();
        System.out.print("Enter C :");
        int c = sc.nextInt();
        double Discriminant=b*b-4*a*c;
        if (Discriminant>=0){
            System.out.println("Discriminan is "+Discriminant);
            double x_1=(-b-Math.sqrt(Discriminant)) /(2*a);
            double x_2=(-b+Math.sqrt(Discriminant)) /(2*a);
            System.out.println("x_1 = "+x_1);
            System.out.println("x_2 = "+x_2);
        } else {
            System.out.println("0");
        }
    }
}
