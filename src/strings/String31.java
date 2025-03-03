package strings;

import java.util.Scanner;

public class String31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string :");
        String s0 = sc.nextLine();
        System.out.print("Enter a string :");
        String s1 = sc.nextLine();
        if(s0.contains(s1)) {
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
