package strings;

import java.util.Scanner;

public class String26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer :");
        String s = sc.next();
        System.out.print("Enter a string :");
        int n = sc.nextInt();
        if(s.length() >n){
          System.out.println(s.substring(s.length()-n));
      } else {
          System.out.println(".".repeat(n-s.length())+s);
      }
    }
}
