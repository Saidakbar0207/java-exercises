package whiles;

import java.util.Scanner;

public class While07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int k=1;
        while(k*k<num){
            k++;
        }
        System.out.println(k);
    }
}
