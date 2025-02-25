package strings;

import java.util.Scanner;

public class String17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string :");
        String s = sc.nextLine();
        for(char c : s.toCharArray()){
            if(Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
            }
            System.out.print(c);
        }
    }
}
