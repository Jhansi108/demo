package DupicateValues;

import java.util.HashMap;
import java.util.Map;

public class DuplicateValues {

	public static void main(String[] args) {
		 int[] array = {1, 2, 3, 4, 2, 7, 8, 8, 3};

	        System.out.println("Duplicate elements in the array are: ");
	        findDuplicates(array);
	    }

	    static void findDuplicates(int[] array) {
	        Map<Integer, Integer> elementCountMap = new HashMap<>();

	        
	        for (int num : array) {
	            if (elementCountMap.containsKey(num)) {
	                elementCountMap.put(num, elementCountMap.get(num) + 1);
	            } else {
	                elementCountMap.put(num, 1);

	}

	        }
	        for (Map.Entry<Integer, Integer> entry : elementCountMap.entrySet()) {
	            if (entry.getValue() > 1) {
	                System.out.println(entry.getKey());
	    }
}
	    }
}
