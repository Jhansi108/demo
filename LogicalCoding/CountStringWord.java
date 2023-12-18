package LogicalCoding;

public class CountStringWord {

	public static void main(String[] args) {
		 String msg = "Java is a object oriented language";
	      System.out.println("The given String is: " + msg);
	          int total = 1;
	      
	      for (int i = 0; i < msg.length(); i++) {
	        
	         if ((msg.charAt(i) == ' ') && (msg.charAt(i + 1) != ' ')) {
	            total++; 
	         }
	      }
	      
	      System.out.println("Number of words in the given string: " +  total);

	}

}
