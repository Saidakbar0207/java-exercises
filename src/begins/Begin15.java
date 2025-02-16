package begins;

import java.util.Scanner;

public class Begin15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter: S : ");
        Double  s = sc.nextDouble();
        double  diametr =Math.sqrt(4*s/Math.PI);
        System.out.println("Diametr = "+diametr);
        double length =Math.PI*diametr;
        System.out.println("Length = "+length);
    }
}
