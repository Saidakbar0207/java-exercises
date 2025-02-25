package strings;

import java.util.Scanner;

public class String02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a integer (32-126): ");
        int n = sc.nextInt();
        if(n>=32 &&  n<=126){
            char character = (char)n;
            System.out.println("Character :"+character);
        }
        else {
            System.out.println("Invalid input");
        }
    }
}
