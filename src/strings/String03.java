package strings;

import java.util.Scanner;

public class String03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character :");
        char ch = sc.next().charAt(0);
        char prev=(char)(ch-1);
        char next=(char)(ch+1);
        System.out.println("Previous :" + prev);
        System.out.println("Next :" +next);


    }
}
