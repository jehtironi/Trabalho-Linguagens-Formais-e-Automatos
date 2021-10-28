package Gals;

import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException{
        
        try
        {
           
           //Lexico lexico = new Lexico("A = 100; B = 10; B = 111 + A * B; show(B);");
           //Lexico lexico = new Lexico("A = 100; B = 10; B = 111 + A / B; show(B);");
           //Lexico lexico = new Lexico("A = 1000; B = 110; B = 111111 + A * B; show(B);");
           Lexico lexico = new Lexico("A = (10+(10^10)/10)+(10*10-10); B = 10; show(A);");
           
           Sintatico sintatico = new Sintatico();
           Semantico semantico = new Semantico();

           sintatico.parse(lexico, semantico);
       }
           catch ( LexicalError | SyntaticError | SemanticError e )
           {
               System.out.println("Comando não identificado.");
           }
    }
}
