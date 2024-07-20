package App;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import myPolynomail.*;

public class Run {

    public static void main(String[] args) {
        
        Scanner cin = new Scanner(System.in);
        String input1, input2 = "";
        int oprationNum;
        OperationType OPT = OperationType.Evaluate;
        
        while(true){
        
        while (true) {
            cin = new Scanner(System.in);
            System.out.print("Please Enter your Polynomial:");
            input1 = cin.nextLine();
            if(validatePolynomial(input1)){break;}
        }
        
        while(true){
            cin = new Scanner(System.in);
            System.out.println("chose the Operation (1, 2, 3 , 4 ,5):");
            System.out.println("1. Evaluate");
            System.out.println("2. Sum");
            System.out.println("3. Subtract");
            System.out.println("4. Multiply");
            System.out.println("5. Divide");
            
            try{
                oprationNum = cin.nextInt();
                cin.nextLine();
                if(oprationNum < 6 && oprationNum > 0)
                    break;
                else
                    System.out.println("invalid input");
            }catch(Exception e){
                System.err.println(e.getMessage());
                System.out.println("invalid input");
            }
        }
        
        if(oprationNum > 1){
            while (true) {
                cin = new Scanner(System.in);
                System.out.print("Please Enter your 2nd Polynomial:");
                input2 = cin.nextLine();
                if(validatePolynomial(input1)){break;}
            }
        }
        
        switch(oprationNum){
            case 1:
                OPT = OperationType.Evaluate;
                break;
            case 2:
                OPT = OperationType.Sum;
                break;
            case 3:
                OPT = OperationType.Subtract;
                break;
            case 4:
                OPT = OperationType.Multiply;
                break;
            case 5:
                OPT = OperationType.Divide;
                break;
        }
        
        Opration(input1, input2, OPT);
        
        System.out.println("do you wanna continu? (Yes/no)");
        if(cin.nextLine().toLowerCase().charAt(0) == 'n'){
            System.out.println("have a nice day.");
            System.out.println("developed it www.sadrajabbarisani.com");
            break;
        }
        
        }
    }
    
    public static void Opration(String input1, String input2, OperationType OPT){
        Scanner cin = cin = new Scanner(System.in);
        int x = 0;
        Polynomial poly1, poly2, poly, pResult;
        
        switch (OPT) {
            case Evaluate:
                while (true) {
                    cin = new Scanner(System.in);
                    try{
                        System.out.println("Plese Enter x amount:");
                        x = cin.nextInt();
                        break;
                    }catch(Exception e){
                        System.err.println("MisMath!!!!");
                    }
                }
                
                poly = new Polynomial(input1);
                int result = poly.evaluate(x);
                System.out.println(poly.toString() + " by x = " + x + " is: " + result);
                break;
                
            case Sum:
                poly1 = new Polynomial(input1);
                poly2 = new Polynomial(input2);
                pResult = poly1.sum(poly2);
                System.out.println("poly1 + poly2 = " + pResult.toString());
                break;
                
            case Subtract:
                poly1 = new Polynomial(input1);
                poly2 = new Polynomial(input2);
                pResult = poly1.subtract(poly2);
                System.out.println("poly1 - poly2 = " + pResult.toString());
                break;
                
            case Multiply:
                poly1 = new Polynomial(input1);
                poly2 = new Polynomial(input2);
                pResult = poly1.multiply(poly2);
                System.out.println("poly1 * poly2 = " + pResult.toString());
                break;
                
            case Divide:
                poly1 = new Polynomial(input1);
                poly2 = new Polynomial(input2);
                pResult = poly1.divide(poly2);
                System.out.println("poly1 / poly2 = " + pResult.toString());
                break;
        }
    }
    
    public static final Pattern VALID_POLYNOMIAL_REGEX
            = Pattern.compile("[[+-]^[0-9]+X^[0-9]]", Pattern.CASE_INSENSITIVE);

    public static boolean validatePolynomial(String emailStr) {
        Matcher matcher = VALID_POLYNOMIAL_REGEX.matcher(emailStr);
        return matcher.find();
    }
}