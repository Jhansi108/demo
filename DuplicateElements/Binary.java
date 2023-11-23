package DupicateValues;

import java.util.Arrays;

public class Binary {

	public static void main(String[] args) {
		int arr[] = {10,20,40,60,70};
		int key=60;
		int result=Arrays.binarySearch(arr, key);
		if(result<0) {
			System.out.println("Element not found");
		}else {
			System.out.println("Elements is found at index : " + result);
		}
		

	}

}
