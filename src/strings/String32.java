package strings;

import java.util.Scanner;

public class String32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string :");
        String s0 = sc.nextLine();
        System.out.print("Enter a string :");
        String s1 = sc.nextLine();
        int count=0;
        int n=s0.indexOf(s1);
        while(n!=-1){
                count++;
                n=s0.indexOf(s1,n+1);
        }
        System.out.println(count);
    }
}
