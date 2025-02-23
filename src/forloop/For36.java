package forloop;

import java.util.Scanner;

public class For36 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = in.nextInt();
        System.out.print("Enter  power of integer: ");
        int k = in.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=Math.pow(i,k);
        }
        System.out.println("Sum = "+sum);
    }
}
