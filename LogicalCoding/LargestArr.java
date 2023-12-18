package LogicalCoding;

import java.util.Arrays;

public class LargestArr {

	public static void main(String[] args) {
		int []arr= {20,40,38,44,67,89,98,339,789};
		Arrays.sort(arr);
		System.out.println("The largest number in the array : " +arr[arr.length-1]);

	}

}
