package Integers;
import java.util.Scanner;
public class Integer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter M kg :");
        int m = sc.nextInt();
        int t=m/1000;
        System.out.println(m+" kg = "+t+" t");
    }
}

