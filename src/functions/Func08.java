package functions;

import java.util.Scanner;

public class Func08 {
    public static int Quarter(int x,int y){
        if(x>0 && y>0) return 1;
        else if(x<0 && y>0) return 2;
        else if(x<0 && y<0) return 3;
        else if(x>0 && y<0) return 4;
        else{
        }
        return x;
    }
    public static void main(String[] args) {
        System.out.println(Quarter(2,5));
        System.out.println(Quarter(-1,5));
        System.out.println(Quarter(2,-5));
        System.out.println(Quarter(-2,-5));
    }
}
