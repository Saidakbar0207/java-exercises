package Integers;
import java.util.Scanner;
public class Integer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A bytes :");
        int b = sc.nextInt();
        int K=b/1024;
        System.out.println(b+" bytes = "+K+" K");
    }
}
