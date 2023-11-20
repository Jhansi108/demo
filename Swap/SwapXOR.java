package Program;

public class SwapXOR {

	public static void main(String[] args) {
		int a=20;
		int b=30;
		System.out.println("Before Swapping : a = " +a + " and b = "+ b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After Swapping : a = " +a + " and b = "+ b);
		

	}

}
