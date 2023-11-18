package Map;

import java.util.Arrays;
import java.util.List;

public class ReduceMe {

	public static void main(String[] args) {
		 List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

	        // Using reduce to find the sum of numbers
	        int sum = numbers.stream()
	                .reduce(0, (x, y) -> x + y);

	        // Display the result
	        System.out.println("Original numbers: " + numbers);
	        System.out.println("Sum of numbers: " + sum);

	}

}
