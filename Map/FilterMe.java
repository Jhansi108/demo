package Map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterMe {

	public static void main(String[] args) {
		 List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

	        // Using filter to get even numbers
	        List<Integer> evenNumbers = numbers.stream()
	                .filter(x -> x % 2 == 0)
	                .collect(Collectors.toList());

	        // Display the result
	        System.out.println("Original numbers: " + numbers);
	        System.out.println("Even numbers: " + evenNumbers);
	}

}
