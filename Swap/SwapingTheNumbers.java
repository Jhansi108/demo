package Program;

public class SwapingTheNumbers {

	public static void main(String[] args) {
		int x=20;
		int y=40;
		System.out.println("Before Swapping :");
		System.out.println("x = " +x);
		System.out.println("y = " +y);
		int t=x; //t=20;
		x=y;     //20=40;
		y=t;     //40=t=x;
		System.out.println("After Swapping :");
		System.out.println("x = " +x);
		System.out.println("y = " +y);

	}

}
