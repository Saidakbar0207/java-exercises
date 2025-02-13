import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //if1
        /*System.out.print("Enter a :");
        int a = sc.nextInt();
        if(a>0){
            a-=8;
            System.out.println("a = "+a);
        } else {
            System.out.println("a =" +a);
        }*/
        //if2
        /*System.out.print("Enter a number :");
        int a = sc.nextInt();
        if(a>0){
            a-=8;
            System.out.println("a = "+a);
        } else {
            a+=6;
            System.out.println("a = "+a);
        }*/
        //if3
        /*System.out.print("Enter a number :");
        int a = sc.nextInt();
        if(a>0){
            a-=8;
            System.out.println("a = "+a);
        } else if(a==0) {
            a=10;
            System.out.println("a = "+a);
        } else {
            a+=6;
            System.out.println("a = "+a);
        }*/
        //if4
        /*System.out.print("Enter a number :");
        int a = sc.nextInt();
        System.out.print("Enter b number :");
        int b = sc.nextInt();
        System.out.print("Enter c number :");
        int c = sc.nextInt();
        int sum=0;
        if(a>0){
            sum++;
        } if(b>0){
            sum++;
        }  if(c>0){
            sum++;
        } System.out.println("Sum is positive : "+sum);*/
        //if5
        /*System.out.print("Enter a number :");
        int a = sc.nextInt();
        System.out.print("Enter b number :");
        int b = sc.nextInt();
        System.out.print("Enter c number :");
        int c = sc.nextInt();
        int sum=0;
        int sum1=0;
        if(a>0) {
            sum++;
        } else {
                sum1++;
            }
         if(b>0){
            sum++;
        } else {
             sum1++;
         }if(c>0){
            sum++;
        } else {
             sum1++;
        }
         System.out.println("Sum is positive : "+sum);
         System.out.println("Sum is negative : "+sum1);*/
        //if6
        /* System.out.print("Enter a number :");
        int a= sc.nextInt();
        System.out.print("Enter b number :");
        int b= sc.nextInt();
        if (a>b){
            System.out.println("Larger number is : "+a);
        } else {
            System.out.println("Larger number is : "+b);
        }*/
        //if7
        /* System.out.print("Enter a number :");
        int a= sc.nextInt();
        System.out.print("Enter b number :");
        int b= sc.nextInt();
        if (a>b){
            System.out.println("ordinal number of a small nuber : "+1);
        } else {
            System.out.println("ordinal number of a small nuber : "+2);
        }*/
        //if8
        /*System.out.print("Enter a number :");
        int a= sc.nextInt();
        System.out.print("Enter b number :");
        int b= sc.nextInt();
        if (a>b){
            System.out.println("Larger number is : "+a);
            System.out.println("Smaller number is : "+b);
        } else {
            System.out.println("Larger number is : "+b);
            System.out.println("Smaller number is : "+a);
        }*/
        //if9
        /*System.out.print("Enter a number :");
        int a= sc.nextInt();
        System.out.print("Enter b number :");
        int b= sc.nextInt();
        if (a>b){
            System.out.println("a = "+b);
            System.out.println("b = "+a);
        } else {
            System.out.println("a = "+a);
            System.out.println("b = "+b);

        }*/
        //if10
        /* System.out.print("Enter a number :");
        int a= sc.nextInt();
        System.out.print("Enter b number :");
        int b= sc.nextInt();
        if (a==b){
            System.out.println("a = "+0);
            System.out.println("b = "+0);
        } else {
            System.out.println("a= "+(a+b));
            System.out.println("b= "+(b+a));
        }*/
        //if11
        /*System.out.print("Enter a number :");
        int a= sc.nextInt();
        System.out.print("Enter b number :");
        int b= sc.nextInt();
        if (a==b){
            System.out.println("a = "+0);
            System.out.println("b = "+0);
        } else {
            if(a>b) {
                System.out.println("a= " + a);
                System.out.println("b= " + a);
            } else {
                System.out.println("a= " + b);
                System.out.println("b= " + b);
            }
        }*/
        //if12
        /* System.out.print("Enter a number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter a number: ");
        int number2 = sc.nextInt();
        System.out.print("Enter a number: ");
        int number3 = sc.nextInt();
        if(number1 <number2 && number1 <number3){
            System.out.println("minimal number is "+number1);
        } else if(number2 <number1 && number2 <number3){
            System.out.println("minimal number is "+number2);
        } else if(number3 <number1 && number3 <number2){
            System.out.println("minimal number is "+number3);
        }*/
        //if13
        /* System.out.print("Enter a number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter a number: ");
        int number2 = sc.nextInt();
        System.out.print("Enter a number: ");
        int number3 = sc.nextInt();
        if((number1 <number2 && number1 >number3) || number1 >number2 && number1 <number3){
            System.out.println("middle number is "+number1);
        } else if((number2 <number1 && number2 >number3) || number2 >number1 && number2 <number3){
            System.out.println("middle number is "+number2);
        } else if((number3 <number1 && number3 >number2)|| number3 >number1 && number3 <number2){
            System.out.println("middle number is "+number3);
        }*/
        //if14
        /* System.out.print("Enter a number: ");
        int number1 = sc.nextInt();
        System.out.print("Enter a number: ");
        int number2 = sc.nextInt();
        System.out.print("Enter a number: ");
        int number3 = sc.nextInt();
        int max = Math.max(Math.max(number1, number2), number3);
        int min = Math.min(Math.min(number1, number2), number3);
        System.out.println("The maximum number is " + max);
        System.out.println("The minimum number is " + min);*/
        //if15
        /* System.out.print("Enter a number: ");
        int a= sc.nextInt();
        System.out.print("Enter a number: ");
        int b= sc.nextInt();
        System.out.print("Enter a number: ");
        int c= sc.nextInt();
        if(a>c && b>c){
            System.out.println("Sumo of two largest value = "+(a+b));
        } else if(a>b && c>b){
            System.out.println("Sumo of two largest value = "+(a+c));
        } else if(b>a && c>a){
            System.out.println("Sumo of two largest value = "+(b+c));
        }*/
        //if16
        /*System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Enter b number: ");
        int b = sc.nextInt();
        System.out.print("Enter c number: ");
        int c = sc.nextInt();
        if(a<b && b<c){
            System.out.println("a = "+(2*a));
            System.out.println("b = "+(2*b));
            System.out.println("c = "+(2*c));
        } else {
            System.out.println("a = "+(-a));
            System.out.println("b = "+(-b));
            System.out.println("c = "+(-c));
        }*/
        //if17
        /*System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Enter b number: ");
        int b = sc.nextInt();
        System.out.print("Enter c number: ");
        int c = sc.nextInt();
        if((a<b && b<c) || (a>b && b>c)){
            System.out.println("a = "+(2*a));
            System.out.println("b = "+(2*b));
            System.out.println("c = "+(2*c));
        } else {
            System.out.println("a = "+(-a));
            System.out.println("b = "+(-b));
            System.out.println("c = "+(-c));
        }*/
        //if18
        /*System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Enter a number: ");
        int b = sc.nextInt();
        System.out.print("Enter a number: ");
        int c = sc.nextInt();
        if(a==b){
            System.out.println("order number = "+3);
        } else if(a==c){
            System.out.println("order number = "+2);
        } else if(b==c){
            System.out.println("order number = "+1);
        }*/
        //if19
        /*System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Enter a number: ");
        int b = sc.nextInt();
        System.out.print("Enter a number: ");
        int c = sc.nextInt();
        System.out.print("Enter a number: ");
        int d = sc.nextInt();
        if(a==b && b==c){
            System.out.println("order number = "+4);
        } else if(a==b && b==d){
            System.out.println("order number = "+3);
        } else if(a==c && c==d){
            System.out.println("order number = "+2);
        } else if(b==c && c==d){
            System.out.println("order number = "+1);
        }*/
        //if20
        /*System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Enter a number: ");
        int b = sc.nextInt();
        System.out.print("Enter a number: ");
        int c = sc.nextInt();
        if(Math.absExact(a-b) < Math.absExact(a - c)){
            System.out.println("nearest point  = "+b);
            System.out.println(" distance  = "+(a-b));
        }else {
            System.out.println("nearest point  = "+c);
            System.out.println(" distance  = "+(a-c));
        }*/
        //if21
        /*System.out.print("Enter x coordinate :");
        int x = sc.nextInt();
        System.out.print("Enter y coordinate :");
        int y = sc.nextInt();
        if (x==0 && y==0) {
            System.out.println(0);
        } else if(y==0){
            System.out.println(1);
        } else if(x==0){
            System.out.println(2);
        }*/
        //if22
        /*
        System.out.print("Enter x coordinate: ");
        int x = sc.nextInt();
        System.out.print("Enter y coordinate: ");
        int y = sc.nextInt();
        if (x>0 && y>0) {
            System.out.println("1 quarter");
        } else if(x<0 && y>0 ){
            System.out.println("2 quarter");
        } else if(x<0 && y<0){
            System.out.println("3 quarter");
        } else if(x>0 && y<0){
            System.out.println("4 quarter");
        }
*/
        //if23
//        System.out.println("Enter x coordinate :");
//        double x = sc.nextDouble();
//        System.out.println("Enter y coordinate :");
//        double y = sc.nextDouble();
//        System.out.println("Enter x1 coordinate :");
//        double x1 = sc.nextDouble();
//        System.out.println("Enter y1 coordinate :");
//        double y1 = sc.nextDouble();
//        System.out.println("Enter x2 coordinate :");
//        double x2 = sc.nextDouble();
//        System.out.println("Enter y2 coordinate :");
//        double y2 = sc.nextDouble();
        //if24
        /*System.out.print("Enter a number: ");
        int x = sc.nextInt();
        if (x>0){
            System.out.println("f(x)="+(2*Math.sin(x)));
        } else {
            System.out.println("(6-x)="+(6-x));
        }*/
        //if25
        /* System.out.print("Enter a number:");
        int x= sc.nextInt();
        if(x<-2 || x>2){
            System.out.println("f(x)=2*x->"+(2*x));
        } else {
            System.out.println("f(x)=-3*x->"+(-3*x));
        }*/
        //if26
        /*System.out.print("Enter a number:");
        int x= sc.nextInt();
        if(x<=0){
            System.out.println(" -x->"+(-x));
        } else if(0>x && x<2){
            System.out.println("f(x)=x*x->"+(x*x));
        } else {
            System.out.print(4);
        }*/
        //if27

        //if28
        /*System.out.print("Enter anumber of years: ");
        int x = sc.nextInt();
        if(x%100==0 && x%400==0){
            System.out.println("This is years have 366");
        } else {
            System.out.println("This is years have 365");
        }*/
        //if29
        /*System.out.print("Enter a number:");
        int a = sc.nextInt();
        if(a>0 && a%2==0){
            System.out.println("positive even number");
        } else if(a>0 && a%2!=0){
            System.out.println("positive odd number");
        } else if(a==0){
            System.out.println("zero number");
        } else if(a<0 && a%2!=0){
            System.out.println("negative odd number");
        } else if(a<0 && a%2==0){
            System.out.println("negative even number");
        }*/
        //if30
        /*System.out.print("Enter a number :");
        int a = sc.nextInt();
        if(a>=1 && a<10 && a%2==0){
            System.out.println("ones-digits even number");
        } else if(a>=1 && a<10 && a%2!=0){
            System.out.println("ones-digits odd number");
        } else if(a>=10 && a<100 && a%2!=0){
            System.out.println("twos-digits odd number");
        } else if(a>=10 && a<100 && a%2==0){
            System.out.println("twos-digits even number");
        } else if(a>=100 && a<1000 && a%2==0) {
            System.out.println("three-digits even number");
        }  else if(a>=100 && a<1000 && a%2!=0){
            System.out.println("three-digits odd number");
        }*/
































































































    }
}
