package arrays;

import java.util.Scanner;

public class Array001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        if(n<=0){
            System.out.println("Invalid Input");
            return;
        }
        int[] oddNumbers= new int[n];
        for (int i = 0; i <n; i++) {
            oddNumbers[i] =i;
        }
        System.out.print("First " + " odd numbers : ");
        for(int num: oddNumbers){
            if(num%2!=0){
                System.out.print(num+" ");
            }
        }
    }
}
