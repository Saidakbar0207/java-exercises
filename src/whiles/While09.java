package whiles;

import java.util.Scanner;

public class While09 { public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    int k=3;
    int sum=0;
    while(k<num){
        k*=3;
        sum++;


    }
    System.out.println(sum+1);
}
}
