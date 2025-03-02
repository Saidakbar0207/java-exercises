package procs;

import java.util.Scanner;

public class Proc28 {
    public static String EvenK(int k){
        if(k%2==1 && k>0)return "true";
        else if(k%2==0 && k>0)return "false";
        return "Invalid number";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int k = sc.nextInt();
        System.out.print(EvenK(k));

    }
}
