package LogicalCoding;

import java.util.Arrays;

public class SortArray0and1 {

	public static void main(String[] args) {
		int[] arr = {0, 1, 0, 1, 1, 0, 1, 0, 0, 1};

        System.out.println("Original Array: " + Arrays.toString(arr));

        sortZerosOnes(arr);

        System.out.println("Array after sorting 0's and 1's: " + Arrays.toString(arr));
    }
	 static void sortZerosOnes(int[] arr) {
	        int countZeros = 0;

	      
	        for (int num : arr) {
	            if (num == 0) {
	                countZeros++;
	            }
	        }

	        
	        for (int i = 0; i < countZeros; i++) {
	            arr[i] = 0;
	        }

	        for (int i = countZeros; i < arr.length; i++) {
	            arr[i] = 1;
	        }

   
               

	}

}
