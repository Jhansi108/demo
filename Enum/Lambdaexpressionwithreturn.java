package Enum;

public class Lambdaexpressionwithreturn {
	interface Addition {
	      int add(int a, int b);
	   }
	   public static Addition getAddition() {
	      return (a, b) -> a + b; 
	   }

	public static void main(String[] args) {
		 System.out.println("The addition of a and b is: " + getAddition().add(10, 40));
		

	}

}
