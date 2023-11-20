package Program;

public class SwapSingleStmt {

	public static void main(String[] args) {
		int a=30;
		int b=50;
		System.out.println("Before Swaping : a = " +a + " and b = "+b);
		b=a+b-(a=b);
		System.out.println("After Swaping : a = " +a + " and b = "+b);
		

	}

}
