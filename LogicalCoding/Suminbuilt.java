package LogicalCoding;

import java.util.Arrays;

public class Suminbuilt {

	public static void main(String[] args) {
		int[] num = {2,3,4,5,6};
		int sum=Arrays.stream(num).sum();
		System.out.println("The sum is : " + sum);
		

	}

}
