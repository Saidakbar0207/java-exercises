package forloop;

import java.util.Scanner;

public class For10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = sc.nextInt();
        double sum=0;
        for(int i=1;i<=n;i++){
            sum+=1.0/i;
        }
        System.out.println("The sum of the numbers is : "+sum);
    }
}
