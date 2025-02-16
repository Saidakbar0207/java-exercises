package forloop;

import java.util.Scanner;

public class For09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a :");
        int a = in.nextInt();
        System.out.print("Enter b(a<b):");
        int b = in.nextInt();
        int sum=0;
        for(int i=a;i<=b;i++){
            sum+=i*i;
        }
        System.out.println(sum);
    }
}
