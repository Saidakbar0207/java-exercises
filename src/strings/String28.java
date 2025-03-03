package strings;

import java.util.Scanner;

public class String28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string :");
        String s = sc.nextLine();
        System.out.print("Enter character :");
        char c = sc.next().charAt(0);
        String ans = "";
        for(char cc : s.toCharArray()) {
            if(cc==c){
              String c1= String.valueOf((char)cc);
                ans+=c1+c1;
            } else {
                ans+=cc;
            }
        }
        System.out.println(ans);

    }
}
