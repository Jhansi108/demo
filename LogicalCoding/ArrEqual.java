package LogicalCoding;

import java.util.Arrays;

public class ArrEqual {

	public static void main(String[] args) {
		String[]arr1=new String[] {"Apple","Mango","Orange"};
		
		String[]arr2=new String[] {"Apple","Mango","Orange"};
		if(Arrays.deepEquals(arr1, arr2)) {
			System.out.println("Arrays are equal");
			
		}else {
			System.out.println("Arrays are not equal");
		}

	}

}
