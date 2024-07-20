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
            System.out.println(s);                                  //for Test
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
    
    public String toString(){
        String outPut = "Poly is: ";
        for(Term t: term){
            outPut += t.toString();
        }
        return outPut;
    }
}
