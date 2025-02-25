package strings;

import java.util.Scanner;

public class String12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string :");
        String s = sc.nextLine();
        System.out.print("The an integer :");
        int n = sc.nextInt();
        for (int i = 0; i <s.length(); i++) {
            System.out.print(s.charAt(i));
            if(i<s.length()-1){
                for(int j=0;j<n;j++) {
                    System.out.print("*");
                }
            }
        }
    }
}
