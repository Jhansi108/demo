package DrawbacksofArray;

import java.util.Arrays;
import java.util.HashMap;

public class CountDuplicateArray {

	public static void main(String[] args) {
		  int[][] arrays = {
		            {1, 2, 3},
		            {4, 5, 6},
		            {1, 2, 3},
		            {7, 8, 9},
		            {1, 2, 3}
		        };

		        HashMap<String, Integer> arrayCount = new HashMap<>();

		        for (int[] array : arrays) {
		            // Convert the array to a string for easy comparison
		            String arrayString = Arrays.toString(array);

		            // Update the count in the map
		            arrayCount.put(arrayString, arrayCount.getOrDefault(arrayString, 0) + 1);
		        }

		        // Print the duplicate arrays and their counts
		        for (String arrayString : arrayCount.keySet()) {
		            int count = arrayCount.get(arrayString);
		            if (count > 1) {
		                System.out.println("Array: " + arrayString + ", Count: " + count);
		            }
		        }

	}

}
