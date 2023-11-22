package CountEvenorOdd;

public class SumOfDigitsFunct {
	static int findsum(int num)
	{
		int sum=0;
		while(num!=0) {
			sum=sum + num %10;
			num=num/10;
		}
		return sum;
	}

	public static void main(String[] args) {
		int num=23456;
		System.out.println("Sum of the digits: " + findsum(num));
		

	}

}
