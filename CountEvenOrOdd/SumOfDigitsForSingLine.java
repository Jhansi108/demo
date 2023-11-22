package CountEvenorOdd;

public class SumOfDigitsForSingLine {
	static int findSum(int number)
	{
		int sum;
		for(sum=0;number>0;sum =sum + number % 10,number=number/10); 
			return sum;
		}
	

	public static void main(String[] args) {
		int number=567890;
		System.out.println("Sum of the digits:" + findSum(number));
		

	}

}
