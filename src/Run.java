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
    }
}
