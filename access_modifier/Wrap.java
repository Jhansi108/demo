package AccessModifiers;

public class Wrap {

	public static void main(String[] args) {
		 int primitiveInt = 42;

	        	        Integer integerObject = Integer.valueOf(primitiveInt);

	        	        int intValue = integerObject.intValue();

	        System.out.println("Primitive int: " + primitiveInt);
	        System.out.println("Integer object: " + integerObject);
	        System.out.println("Converted back to primitive int: " + intValue);
	        System.out.println();

	        	        double primitiveDouble = 3.14;

	       	        Double doubleObject = Double.valueOf(primitiveDouble);

	        	        double doubleValue = doubleObject.doubleValue();

	        System.out.println("Primitive double: " + primitiveDouble);
	        System.out.println("Double object: " + doubleObject);
	        System.out.println("Converted back to primitive double: " + doubleValue);
	        System.out.println();

	     	        Boolean booleanObject = true; 
	        boolean primitiveBoolean = booleanObject; 

	        System.out.println("Primitive boolean: " + primitiveBoolean);
	        System.out.println("Boolean object: " + booleanObject);

	}

}
