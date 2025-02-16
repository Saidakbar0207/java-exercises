package cases;

import java.util.Scanner;

public class Case16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number (20<=n<=69):");
        int n = sc.nextInt();
        int a=n/10;
        int b=n%10;
        switch(a) {
            case 2 -> {
                switch (b) {
                    case 0 -> System.out.println("twenty years");
                    case 1 -> System.out.println("twenty-one years");
                    case 2 -> System.out.println("twenty-two years");
                    case 3 -> System.out.println("twenty-three years");
                    case 4 -> System.out.println("twenty-four years");
                    case 5 -> System.out.println("twenty-five years");
                    case 6 -> System.out.println("twenty-six years");
                    case 7 -> System.out.println("twenty-seven years");
                    case 8 -> System.out.println("twenty-eight years");
                    case 9 -> System.out.println("twenty-nine years");
                    default -> System.out.println("invalid year");
                }
            }
            case 3 -> {
                switch (b) {
                    case 0 -> System.out.println("thirty years");
                    case 1 -> System.out.println("thirty-one years");
                    case 2 -> System.out.println("thirty-two years");
                    case 3 -> System.out.println("thirty-three years");
                    case 4 -> System.out.println("thirty-four years");
                    case 5 -> System.out.println("thirty-five years");
                    case 6 -> System.out.println("thirty-six years");
                    case 7 -> System.out.println("thirty-seven years");
                    case 8 -> System.out.println("thirty-eight years");
                    case 9 -> System.out.println("thirty-nine years");
                    default -> System.out.println("invalid year");
                }
            }
            case 4 -> {
                switch (b) {
                    case 0 -> System.out.println("forty years");
                    case 1 -> System.out.println("forty-one years");
                    case 2 -> System.out.println("forty-two years");
                    case 3 -> System.out.println("forty-three years");
                    case 4 -> System.out.println("forty-four years");
                    case 5 -> System.out.println("forty-five years");
                    case 6 -> System.out.println("forty-six years");
                    case 7 -> System.out.println("forty-seven years");
                    case 8 -> System.out.println("forty-eight years");
                    case 9 -> System.out.println("forty-nine years");
                    default -> System.out.println("invalid year");
                }
            }
            case 5 -> {
                switch (b) {
                    case 0 -> System.out.println("fifty years");
                    case 1 -> System.out.println("fifty-one years");
                    case 2 -> System.out.println("fifty-two years");
                    case 3 -> System.out.println("fifty-three years");
                    case 4 -> System.out.println("fifty-four years");
                    case 5 -> System.out.println("fifty-five years");
                    case 6 -> System.out.println("fifty-six years");
                    case 7 -> System.out.println("fifty-seven years");
                    case 8 -> System.out.println("fifty-eight years");
                    case 9 -> System.out.println("fifty-nine years");
                    default -> System.out.println("invalid year");
                }
            }
            case 6 -> {
                switch (b) {
                    case 0 -> System.out.println("sixty years");
                    case 1 -> System.out.println("sixty-one years");
                    case 2 -> System.out.println("sixty-two years");
                    case 3 -> System.out.println("sixty-three years");
                    case 4 -> System.out.println("sixty-four years");
                    case 5 -> System.out.println("sixty-five years");
                    case 6 -> System.out.println("sixty-six years");
                    case 7 -> System.out.println("sixty-seven years");
                    case 8 -> System.out.println("sixty-eight years");
                    case 9 -> System.out.println("sixty-nine years");
                    default -> System.out.println("invalid year");
                }
            }default -> System.out.println("invalid year");
        }
      }
    }
