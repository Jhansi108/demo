package CountEvenorOdd;

import java.util.Random;

public class RandomNu {

	public static void main(String[] args) {
		 Random random = new Random();

	        int minRange = 1;
	        int maxRange = 100;
	        int randomNumberInRange = random.nextInt(maxRange - minRange + 1) + minRange;

	        System.out.println("Random Number in Range: " + randomNumberInRange);

	}

}
