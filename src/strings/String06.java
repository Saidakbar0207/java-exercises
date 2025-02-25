package strings;

import java.util.Scanner;

public class String06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character :");
        char ch = sc.next().charAt(0);
        if(Character.isUpperCase(ch)) {
            System.out.println("This is capital letter!!!");
        } else  if(Character.isDigit(ch)){
            System.out.println("This is digit!!!");
        } else {
            System.out.println("This is small letter!!!");
        }
    }

}
