package forloop;

import java.util.Scanner;

public class For13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer :");
        int n = in.nextInt();
        double  sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum+=(1+(i/10.0));
            } else {
                sum-=(1+(i/10.0));
            }
        }
        System.out.println("Sum = "+sum);

    }
}
