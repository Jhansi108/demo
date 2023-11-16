package AccessModifiers;

public class Obj {

	public static void main(String[] args) {
		 String str1 = "Hello";
	        String str2 = "Hello";
	        String str3 = new String("Hello");

	        // Using equals method
	        System.out.println("Using equals method:");
	        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true
	        System.out.println("str1.equals(str3): " + str1.equals(str3)); // true

	        // Using hashCode method
	        System.out.println("\nUsing hashCode method:");
	        System.out.println("str1.hashCode(): " + str1.hashCode());
	        System.out.println("str2.hashCode(): " + str2.hashCode());
	        System.out.println("str3.hashCode(): " + str3.hashCode());

	}

}
