import java.util.Scanner;
import myPolynomail.*;

public class Run {
    public static void main(String[] args) {
        Polynomial polyNomial;
        Scanner cin = new Scanner(System.in);
//        System.out.print("Enter Your polynomial :");
//        String[] sArr = cin.nextLine().split("[+-]");
//        for (String s : sArr){
//            System.out.println(s);
//        }
        
//        System.out.print("Enter Your Term :");
//        String[] sNumArr = cin.nextLine().split("[X^]");
//        System.out.println(sNumArr[0]);
//        System.out.println(sNumArr[2]);
// 
        System.out.print("Enter Your polynomial :");
        polyNomial = new Polynomial(cin.nextLine());
        
        System.out.println(polyNomial.toString());
        System.out.println(polyNomial.evaluate(2));
        
        polyNomial.sum(new Polynomial("-5X^3-2X^2+8X^1"));
        System.out.println(polyNomial.toString());

        
//        String polynomial = "3x^2 + 5x - 7";
//        
//        // Split the polynomial string using regular expression pattern
//        String[] terms = polynomial.split("\\s*[+\\-]\\s*");
//        
//        // Display each term
//        for (String term : terms) {
//            System.out.println(term.trim());
//        }
    

    }
}
