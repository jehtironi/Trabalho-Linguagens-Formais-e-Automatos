package Gals;

import java.util.Map;
import java.util.Stack;
import java.util.HashMap;

	public class Semantico implements Constants
	{
	    Stack<Integer> stack = new Stack();
	    Map<String, Integer> vars = new HashMap<String, Integer>();
	    String variavelAtual;
	    public void executeAction(int action, Token token)	throws SemanticError
	    {
	        Integer a, b;
	         
	            if(action == 1) { //Números
	              stack.push(Integer.parseInt(token.getLexeme(), 2));
	            }
	            else if(action == 2){//Soma
	              b = stack.pop();
	              a = stack.pop();
	              stack.push(a.intValue() + b.intValue());
	            }
	            else if(action == 3){//Multiplicação
	              b = stack.pop();
	              a = stack.pop();
	              stack.push(a.intValue() * b.intValue());
	            }
	            else if(action == 4){ //Variaveis
	              stack.push(vars.get(token.getLexeme()));
	            }
	            else if(action == 5){//Subtração
	              b = stack.pop();
	              a = stack.pop();
	              stack.push(a.intValue() - b.intValue());
	            }           
	            else if(action == 6){//Divisão
	              b = stack.pop();
	              a = stack.pop();
	              stack.push(a.intValue() / b.intValue());
	            }
	            else if(action == 7){ //Exponenciação
	              b = stack.pop();
	              a = stack.pop();
	              Double A = Math.pow(a, b);
	              stack.push(A.intValue());
	            }
	            else if(action == 8){ //Show
	              System.out.print("Resultado: "+Integer.toBinaryString(vars.get(variavelAtual))+"\n");
	            }           
	            else if(action == 9){ //Salva
	              vars.put(variavelAtual, stack.pop());
	              }
	            else if(action == 10){    //variavel atual
	              variavelAtual = token.getLexeme();
	              }               
	        }
	    }
	