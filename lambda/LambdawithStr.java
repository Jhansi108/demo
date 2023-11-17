package Lambda;
interface Interface {  
    String myMethod(String s1, String s2);  
}  
public class LambdawithStr {

	public static void main(String[] args) {
		  Interface myInterface = (s1, s2) -> {  
	            return s1 + " " + s2; // Concatenate the two strings  
	        };  
	        String result = myInterface.myMethod("Hello", "World!");  
	        System.out.println(result);
		

	}

}
