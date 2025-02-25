package strings;

import java.util.Scanner;

public class String09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an even integer :");
        int n = sc.nextInt();
        System.out.print("Enter c1 character :");
        char c1 = sc.next().charAt(0);
        System.out.print("Enter c2 character :");
        char c2 = sc.next().charAt(0);
    if(n%2==0){
        for(int i=1;i<=n;i++){
            System.out.print(c1+""+c2);
        }
    }
    else{
        System.out.println("Not even");
    }
    }
}
