package DupicateValues;

public class Linear {

	public static void main(String[] args) {
		 int[] array = {2, 5, 8, 12, 16, 23, 38, 45, 50};
	        int targetElement = 16;

	        int index = linearSearch(array, targetElement);

	        if (index != -1) {
	            System.out.println("Element " + targetElement + " found at index " + index);
	        } else {
	            System.out.println("Element " + targetElement + " not found in the array");
	        }
	    }

	    static int linearSearch(int[] array, int target) {
	        for (int i = 0; i < array.length; i++) {
	            if (array[i] == target) {
	                return i; 
	            }
	        }
	        return -1; 

	}

}
