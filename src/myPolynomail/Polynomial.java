package myPolynomail;

import java.util.ArrayList;

public class Polynomial {
    ArrayList<Term> term;
    
    public static Polynomial negOne = new Polynomial("-1X^0");

    public Polynomial() {
        term = new ArrayList();
    }
    
    public Polynomial(String input) {
        this();
        String[] subPolys = input.split("[+]");
        for(String s: subPolys){
            //System.out.println(s);                                  //for Test
            String[] t= s.split("-");
            for(int i = 0; i< t.length; i++){
                if(i == 0 && t[0] == ""){
                    
                }else if (i == 0){
                    term.add(new Term(t[0]));
                }else{
                    String hhh = "-" + t[i];
                    term.add(new Term(hhh));
                }
            }
        }
    }
    
    public void addTerm(Term term){
        for(Term t : this.term){
            if(term.pow == t.pow){
                t.coeff += term.coeff;
                return;
            }
        }
        this.term.add(term);
    }
    
    public String toString(){
        String outPut = "";
        for(Term t: term){
            outPut += t.toString();
        }
        return outPut;
    }
    
    public int evaluate(int x){
        int result = 0;
        for(Term t: term){
            result += t.evaluate(x);
        }
        return result;
    }
    
    public Polynomial sum(Polynomial right){

        Polynomial result = this;
        for(Term rTerm : right.term){
            result.addTerm(rTerm);
        }
        return result;
    }
    
    public Polynomial multiply (Polynomial right){
        Polynomial[] poly = new Polynomial[term.size()];
        int i = 0;
        
        for(Term tTerm : this.term){
            poly[i] = new Polynomial();
            for(Term rTerm : right.term){
                Term newT = new Term(tTerm.coeff*rTerm.coeff,tTerm.pow + rTerm.pow);
                poly[i].addTerm(newT);
            }
            i++;
        }
        
        Polynomial result = new Polynomial();
        for(Polynomial p : poly){
            result = result.sum(p);
        }
        return result;
    }
    
    public Polynomial subtract(Polynomial right){
        Polynomial negright = right.multiply(negOne);
        return sum(negright);
    }
    
    public Polynomial divide(Polynomial right){
        Polynomial[] poly = new Polynomial[term.size()];
        int i = 0;
        
        for(Term tTerm : this.term){
            poly[i] = new Polynomial();
            for(Term rTerm : right.term){
                Term newT = new Term(tTerm.coeff/rTerm.coeff,tTerm.pow - rTerm.pow);
                poly[i].addTerm(newT);
            }
            i++;
        }
        
        Polynomial result = new Polynomial();
        for(Polynomial p : poly){
            result = result.sum(p);
        }
        return result;
    }
}
