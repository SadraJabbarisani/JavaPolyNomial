package myPolynomail;

import java.util.Arrays;

public class Polynomial {
    Term[] term;

    public Polynomial() {
        term = new Term[0];
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
                    term = Arrays.copyOf(term, term.length+1);
                    term[term.length-1] = new Term(t[0]);
                }else{
                    term = Arrays.copyOf(term, term.length+1);
                    String hhh = "-" + t[i];
                    term[term.length-1] = new Term(hhh);
                }
            }
        }
        
    }
    
    public void addTerm(Term newTerm){
        term = Arrays.copyOf(term, term.length+1);
        term[term.length-1] = newTerm;
    }
    
    public String toString(){
        String outPut = "Poly is: ";
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
        for(Term rTerm: right.term){
            for(Term tTerm: this.term){
                if(rTerm.pow == tTerm.pow)
                    tTerm.coeff += rTerm.coeff;
            }
        }
        return this;
    }
    
    public Polynomial multiply (Polynomial right){
        Polynomial[] polys = new Polynomial[term.length];
        
        return this;
    }
}
