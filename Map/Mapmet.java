package Map;

import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

public class Mapmet {

	public static void main(String[] args) {
		 List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

	        // Using map to square each element
	        List<Integer> squaredNumbers = numbers.stream()
	                .map(x -> x * x)
	                .collect(Collectors.toList());

	        // Display the result
	        System.out.println("Original numbers: " + numbers);
	        System.out.println("Squared numbers: " + squaredNumbers);

	}

}
