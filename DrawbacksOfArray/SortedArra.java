package DrawbacksofArray;

import java.util.Arrays;

public class SortedArra {

	public static void main(String[] args) {
		int [] arr= {9,8,7,6,5};
		System.out.println("the orginal array is :" +arr);
		for(int num :arr) {
			System.out.println(num +" ");
			
		}
		Arrays.sort(arr);
		System.out.println("/n the sorted Array is :");
		

	}

}
