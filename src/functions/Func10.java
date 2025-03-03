package functions;

import java.util.Scanner;

public class Func10 {
    public static boolean IsSquare(int k){
        for(int i=1;i<=k/2;i++){
            if(k==i*i) return true;
        } return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int k = sc.nextInt();
        System.out.println(IsSquare(k));
    }
}
