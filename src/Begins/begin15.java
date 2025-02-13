package Begins;
import java.util.Scanner;
public class begin15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter: S : ");
        Double  S = sc.nextDouble();
        double  Diametr =Math.sqrt(4*S/Math.PI);
        System.out.println("Diametr = "+Diametr);
        double Length =Math.PI*Diametr;
        System.out.println("Length = "+Length);
    }
}
