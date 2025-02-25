package strings;

import java.util.Scanner;

public class String04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer (1<=n<=26):");
        int n = sc.nextInt();
        if(n>=1 && n<=26) {
            for(int i=1;i<=n;i++) {
                char ch = (char)(i+64);
                System.out.print(ch+" ");
            }
        } else {
            System.out.println("Invalid input");
        }
    }
}
