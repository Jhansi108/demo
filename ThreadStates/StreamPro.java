package ThreadStates;

import java.util.Arrays;
import java.util.List;

public class StreamPro {

	public static void main(String[] args) {
		 List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

	         int sum = 0;
	        for (int num : numbers) {
	            if (num % 2 == 0) {
	                int square = num * num;
	                sum += square;
	            }
	        }
	        System.out.println("Sum of square of even numbers (traditional way): " + sum);

	        
	        int streamSum = numbers.stream()
	                .filter(num -> num % 2 == 0)
	                .mapToInt(num -> num * num)
	                .sum();
	        System.out.println("Sum of square of even numbers (using Stream API): " + streamSum);

	}

}
