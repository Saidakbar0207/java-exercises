package strings;

import java.util.Scanner;

public class String19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string :");
        String s = sc.nextLine();
        try{
            double num=Double.parseDouble(s);
            if(s.contains(".")){
                System.out.println("2");
            } else {
                System.out.println("1");
            }
        } catch (NumberFormatException e){
            System.out.println("0");
        }
        }

    }

