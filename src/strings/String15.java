package strings;

import java.util.Scanner;

public class String15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string :");
        String s = sc.nextLine();
        int count=0;
        for(char c : s.toCharArray()){
            if(Character.isLetter(c)){
                count++;
            }
        }
        System.out.println("The number of Latin capital letters->"+count);
    }
}
