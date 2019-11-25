package achievers;

import java.util.*;
import java.util.stream.Collectors;
public class prefix_to_postfix {

		public static String convertPreToPostStack(char[] exp) {		 
			  Stack<String> s = new Stack<>();
			  int length = exp.length;
			  for (int i = length - 1; i >= 0; i--) {
				  if (isOp(exp[i])) {
					  String op1 = s.pop();
					  String op2 = s.pop();
					  String temp = op1 + op2 + exp[i];
					  s.push(temp);
				  } else {			
					  s.push( Character.toString(exp[i]));
				  }
			  }
			  return s.peek();
		}  
		
		private static boolean isOp(char Op) {
			if (Op == '+' || Op == '-' || Op == '*' || Op  == '/') {
				return true;
			} else {
				return false;
			}
		}
		
		
	    public static ArrayList<String> convertPreToPostRec(ArrayList<String> exp) {
	        String op = exp.remove(0);        	
	        List<String> op1 = isOp(exp.get(0).charAt(0)) ? convertPreToPostRec(exp) : Arrays.asList(exp.remove(0));
	        List<String> op2 = isOp(exp.get(0).charAt(0)) ? convertPreToPostRec(exp) : Arrays.asList(exp.remove(0));
	        ArrayList<String> res = new ArrayList<>(exp.size());
	        res.addAll(op1);
	        res.addAll(op2);
	        res.add(op);
	        return res;
	    }
	       
	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	    	String s=sc.next();
	    	System.out.println("prefix: " + s);
	    	System.out.println("postfix(stack): " + convertPreToPostStack(s.toCharArray()));	      
			      
	    	System.out.print("postfix(recursion): ");
	    	ArrayList<String> input = new ArrayList<>(Arrays.asList(s.split("")));
			ArrayList<String> output = convertPreToPostRec(input);
			System.out.println(output+ ", "+ output.stream().collect(Collectors.joining("")));	     		
	    }
	    
	}