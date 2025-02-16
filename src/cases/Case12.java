package cases;

import java.util.Scanner;

public class Case12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of the element(1-r,2-d,3-l,4-a):");
        int order = sc.nextInt();
        System.out.print("Enter value :");
        double value = sc.nextDouble();
        double r=0,d=0,l=0,a=0;
        switch (order){
            case 1:
                r=value;
                d=2*r;
                l=2*Math.PI*r;
                a=Math.PI*r*r;
                break;
                case 2:
                    d=value;
                    r=d/2;
                    l=2*Math.PI*r;
                    a=Math.PI*r*r;
                    break;
                    case 3:
                        l=value;
                        r=l/(2*Math.PI);
                        a=Math.PI*r*r;
                        d=2*r;
                        break;
                        case 4:
                            a=value;
                            r=Math.sqrt(a/(Math.PI));
                            d=2*r;
                            l=2*Math.PI*r;
                            break;
                            default:
                                System.out.println("Invalid order");
                                return;
        }
        System.out.println("radius = "+r);
        System.out.println("diametr = "+d);
        System.out.println("length = "+l);
        System.out.println("area = "+a);

    }
}
