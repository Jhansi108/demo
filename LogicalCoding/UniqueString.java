package LogicalCoding;

public class UniqueString {

	public static void main(String[] args) {
		 String inputStr ="Java is a programming language";
	        boolean flag = true;

	        for(char i :inputStr.toCharArray())
	        {
	            
	            if (inputStr.indexOf(i) == inputStr.lastIndexOf(i))
	            {
	                System.out.println("The unique character of string is : "+ i);
	                flag = false;
	                break;
	            }
	        }

	        if(flag)
	            System.out.println("There is no non repeating character in input string");
	        int x=0-2;
	        		
	}

}
