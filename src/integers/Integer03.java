package integers;

import java.util.Scanner;

public class Integer03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A bytes :");
        int b = sc.nextInt();
        int k=b/1024;
        System.out.println(b+" bytes = "+k+" K");
    }
}
