package stack;

import java.util.Stack;

public class ValidParentheses {
	  public static boolean isValid(String s) {
	        Stack<Character> st = new Stack<>();
		        for(char c: s.toCharArray()){
		            if(st.isEmpty()){
		                st.push(c);
		            } 
		            else if(st.peek()=='(' && c==')' ||
		                    st.peek()=='{' && c=='}' ||
		                    st.peek()=='[' && c==']')
		            {
		                st.pop();
		            }
		            else{
		                st.push(c);
		            }
		        }
		        
	        if(st.size()==0){
	            return true;
	        }
	        return false;
	     
	    }
	  
//--------------------------------------------------------------------------------
	  
public static void main(String[] args) {
		if(isValid("{}{{(]")) {
			System.out.println("1valid");
		}
		
		if(isValid("{[()]}")) {
			System.out.println("2valid");
		}
	}
}
