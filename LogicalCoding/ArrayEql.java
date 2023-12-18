package LogicalCoding;

import java.util.Arrays;

public class ArrayEql {

	public static void main(String[] args) {
		int [] arr1=new int[] {1,2,3,4,5};
		int [] arr2=new int[] {1,2,3,4,5};
		if(Arrays.equals(arr1, arr2)) {
		System.out.println("Arrays are equal");
		}else {
			System.out.println("Arrays are not equal");
		}

	}

}
