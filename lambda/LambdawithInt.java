package Lambda;
interface MyInterface {  
    int myMethod(int x);  
}  
public class LambdawithInt {

	public static void main(String[] args) {
		 MyInterface myInterface = (x) -> {  
	            return x * x;   
	        };  
	        int result = myInterface.myMethod(5);  
	        System.out.println("The square of 5 is " + result); 
		

	}

}
