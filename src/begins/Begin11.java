package begins;

import java.util.Scanner;

public class Begin11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a :");
        int a = sc.nextInt();
        System.out.print("Enter b :");
        int b = sc.nextInt();
        double c=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        double perimetr=a+b+c;
        System.out.println("perimetr is : "+perimetr);
        System.out.println("c = "+c);
    }
}
