package strings;

import java.util.Scanner;

public class String21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer :");
        int n = sc.nextInt();
        String s=String.valueOf(n);
        for(int i=s.length()-1;i>=0; i--){
            System.out.println(s.charAt(i)+" ");
        }

    }
}
