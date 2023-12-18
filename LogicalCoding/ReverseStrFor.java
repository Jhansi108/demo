package LogicalCoding;

public class ReverseStrFor {

	public static void main(String[] args) {
		  String input = "Mouse";  
	        StringBuilder reversed = new StringBuilder(); 
	               for (int i = input.length() - 1; i >= 0; i--) {  
	            reversed.append(input.charAt(i));   
	        }  
	          
	        System.out.println("Original String: " + input); 
	        System.out.println("Reversed String: " + reversed.toString());  

	}

}
