package ReversePolishNotation;

import java.util.Stack;

public class ReversePolishNotation {

	public int reversePolishNotation(String[] tokens) {

		int returnValue = 0;

		String operators = "+-*/";

		Stack<String> stack = new Stack<String>();

		for(String t : tokens){
			if(!operators.contains(t)){
				stack.push(t);
			}else{
				int a = Integer.valueOf(stack.pop());
				int b = Integer.valueOf(stack.pop());
				int index = operators.indexOf(t);
				switch(index){
				case 0:
					stack.push(String.valueOf(a+b));
					break;
				case 1:
					stack.push(String.valueOf(b-a));
					break;
				case 2:
					stack.push(String.valueOf(a*b));
					break;
				case 3:
					stack.push(String.valueOf(b/a));
					break;
				}
			}
		}

		returnValue = Integer.valueOf(stack.pop());

		return returnValue;

	}



public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	ReversePolishNotation reverse = new ReversePolishNotation();
	String [] input = {"4", "13", "5", "/", "+"};
	int ans = reverse.reversePolishNotation(input);
	System.out.println(ans);

}

}