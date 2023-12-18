package LogicalCoding;

public class Balanceparenthesis {

	public static void main(String[] args) {
		 String expression1 = "{[()]}";
	        String expression2 = "{[(])}";
	        String expression3 = "{[}";

	        System.out.println("Expression 1 is balanced: " + isBalanced(expression1));
	        System.out.println("Expression 2 is balanced: " + isBalanced(expression2));
	        System.out.println("Expression 3 is balanced: " + isBalanced(expression3));
	    }

	    static boolean isBalanced(String expression) {
	        int openCount = 0;
	        int closeCount = 0;

	        for (int i = 0; i < expression.length(); i++) {
	            char currentChar = expression.charAt(i);

	            if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
	                openCount++;
	            } else if (currentChar == ')' || currentChar == '}' || currentChar == ']') {
	                closeCount++;

	               
	                if (closeCount > openCount) {
	                    return false;
	                }
	            }
	        }

	        
	        return openCount == closeCount;

	}

}
