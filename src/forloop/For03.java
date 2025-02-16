package forloop;

import java.util.Scanner;

public class For03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a :");
        int a = sc.nextInt();
        System.out.print("Enter b(a<b):");
        int b = sc.nextInt();
        for(int i=a+1;i<b;i++){
            System.out.print(i+" ");
        }

    }
}
