package forloop;

import java.util.Scanner;

public class For12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer :");
        int n = in.nextInt();
        double sum=1;
        for(int i=1;i<=n;i++){
        sum*=(1+(i/10.0));
        }
        System.out.println("Sum = "+sum);
    }
}
