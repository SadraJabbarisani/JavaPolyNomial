package myPolynomail;

public class Term {
    int coeff, pow;

    public Term(int coeff, int pow) {
        this.coeff = coeff;
        this.pow = pow;
    }
    
    public Term(String input){
        String [] Component = input.split("[X^]");
        coeff = Integer.parseInt(Component[0]);
        pow = Integer.parseInt(Component[2]);
    }

    public int getCoeff() {
        return coeff;
    }

    public void setCoeff(int coeff) {
        this.coeff = coeff;
    }

    public int getPow() {
        return pow;
    }

    public void setPow(int pow) {
        this.pow = pow;
    }
    
    public boolean isPosetive(){
        if (coeff > 0)
            return true;
        else{
            return false;
        }
    }
    
    public String toString(){
        
        if(isPosetive())
            return "+" + Math.abs(coeff) + "X^" + pow;
        else{
            return "-" + Math.abs(coeff) + "X^" + pow;
        }
    }
    
    public int evaluate(int x){
        return (int)Math.pow(x, pow) * coeff;
    }
}
