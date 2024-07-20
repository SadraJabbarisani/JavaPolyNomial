import java.util.Scanner;
import myPolynomail.*;

public class Run {
    public static void main(String[] args) {
        Polynomial poly1 = new Polynomial("4X^3-5X^2+3X^1+11X^0");
        Polynomial poly2 = new Polynomial("3X^2+5X^1-16X^0");
        
        System.out.println("poly1 :" + poly1.toString());
        System.out.println("poly2 :" + poly2.toString());
        System.out.println("");
        
//        System.out.print("poly1 + poly2: ");System.out.println(poly1.sum(poly2)     .toString());
//        System.out.print("poly1 * poly2: ");System.out.println(poly1.multiply(poly2).toString());
        System.out.print("poly1 / poly2: ");System.out.println(poly1.divide(poly2)  .toString());
//        System.out.print("poly1 - poly2: ");System.out.println(poly1.subtract(poly2).toString());
        System.out.println("");
        
        System.out.println("poly1 :" + poly1.toString());
        System.out.println("poly2 :" + poly2.toString());
    }
}
