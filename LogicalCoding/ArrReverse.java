package LogicalCoding;

import java.util.Arrays;
import java.util.Collections;

public class ArrReverse {
	  static void reverse(Integer a[]) 
	    { 
	        Collections.reverse(Arrays.asList(a)); 
	        System.out.println(Arrays.asList(a)); 
	    } 
	 

	public static void main(String[] args) {
		 Integer [] arr = {50,40,30,20,10}; 
	        reverse(arr); 
		

	}

}
