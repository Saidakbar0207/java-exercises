package whiles;

import java.util.Scanner;

public class While08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int k=0;
        while(k*k<=num){
            k++;
        }
        System.out.println(k-1);
    }
}
