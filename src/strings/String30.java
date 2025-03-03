package strings;

import java.util.Scanner;

public class String30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string :");
        String s0 = sc.nextLine();
        System.out.print("Enter a string :");
        String s1 = sc.nextLine();
        System.out.print("Enter a character :");
        char c= sc.next().charAt(0);
        String s2="";
        for(char ch : s0.toCharArray()){
            if(ch==c){
                String s3=String.valueOf(c);
                s2+=s3+s1;
            } else {
                s2+=ch;
            }
        }
        System.out.println(s2);
    }
}
