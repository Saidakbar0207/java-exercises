package forloop;

import java.util.Scanner;

public class For15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        double a=sc.nextDouble();
        System.out.print("Enter power of a :");
        int n = sc.nextInt();
        double sum = 1;
        for(int i=1;i<=n;i++){
            sum*=a;
        }
        System.out.println(a+" to the "+n+" power = "+sum);
    }
}
