package forloop;

import java.util.Scanner;

public class For38 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = in.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=Math.pow(i,i-1);
        }
        System.out.println("Sum = "+sum);
    }
}
