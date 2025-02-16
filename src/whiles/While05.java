package whiles;

import java.util.Scanner;

public class While05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = sc.nextInt();
        int sum=0;
        while(n>=2 && n%2==0){
            n/=2;
            sum++;
        }
        System.out.println("K of the power is "+sum);
    }
}
