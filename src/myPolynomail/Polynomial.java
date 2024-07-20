package myPolynomail;

import java.util.Arrays;

public class Polynomial {
    Term[] term;
    String[] termString;

    public Polynomial() {
    }
    
    public Polynomial(String input) {
        termString = input.split("[-+]");
        term = new Term[0];
        for(String t : termString){
            term = Arrays.copyOf(term, term.length+1);
            term[term.length-1] = new Term(t);
        }
    }
    
    public String toString(){
        String outPut = "";
        for(Term t: term){
            outPut += t.toString();
        }
        return outPut;
    }
}
