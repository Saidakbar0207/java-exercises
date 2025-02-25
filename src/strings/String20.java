package strings;

import java.util.Scanner;

public class String20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer :");
        int n = sc.nextInt();
        String s=String.valueOf(n);
        for(int i=0;i<s.length();i++){
            System.out.println(s.charAt(i)+" ");
        }

    }
}
