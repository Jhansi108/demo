package Strings;

public class MutableS {
	  
		public static void main(String[] args) {
			StringBuilder mutableString = new StringBuilder("Hello, ");

	       	        System.out.println("After appending: " + mutableString);

	      	        mutableString.insert(7, "mutable ");

	        System.out.println("After inserting: " + mutableString);

	        	        mutableString.delete(0, 7);

	        System.out.println("After deleting: " + mutableString);

	       	        mutableString.reverse();

	        System.out.println("After reversing: " + mutableString);
		 

	}

	
	}


