package Program;

public class ReverseTheNumbers {

	public static void main(String[] args) {
		int num = 12345,reverse=0;
		while(num!=0)
		{
			int remainder=num%10;
			reverse = reverse *10 + remainder;
			num = num/10;
			
		}
		
		System.out.println("The reverse of the given num :" + reverse);

	}

}
