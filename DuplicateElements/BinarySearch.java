package DupicateValues;

public class BinarySearch {

	public static void main(String[] args) {
		 int[] array = {2, 5, 8, 12, 16, 23, 38, 45, 50};
	        int targetElement = 16;

	        int index = binarySearch(array, targetElement);

	        if (index != -1) {
	            System.out.println("Element " + targetElement + " found at index " + index);
	        } else {
	            System.out.println("Element " + targetElement + " not found in the array");
	        }
	    }

	    static int binarySearch(int[] array, int target) {
	        int low = 0;
	        int high = array.length - 1;

	        while (low <= high) {
	            int mid = (low + high) / 2;

	            if (array[mid] == target) {
	                return mid; 
	            } else if (array[mid] < target) {
	                low = mid + 1; 
	            } else {
	                high = mid - 1; 
	            }
	        }

	        return -1; 

	}

}
