package Cases;
import java.util.Scanner;
public class Case7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter a number: ");
        int b = sc.nextInt();
        switch(b) {
            case 1 ->System.out.println(a+" kilogram = "+(a)+" kg");
            case 2 ->System.out.println(a+" milligram = "+(a/10000)+" kg");
            case 3 ->System.out.println(a+" gram = "+(a/1000)+" kg");
            case 4 ->System.out.println(a+" ton = "+(a*1000)+" kg");
            case 5 ->System.out.println(a+" centner = "+(a/100)+" kg");
        }
    }
}
