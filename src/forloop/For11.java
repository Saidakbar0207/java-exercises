package forloop;

import java.util.Scanner;

public class For11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int n = sc.nextInt();
        int temp=n;
        int sum=0;
        for(int i=n;i<=2*temp;i++){
            sum+=n*n;
            n++;
        }
        System.out.println("Sum = " +sum);
    }

}
