package AccessModifiers;
//Outer class
class OuterClass {
 private int outerField = 10;

 // Member inner class
 class InnerClass {
     void display() {
         System.out.println("Value of outerField from InnerClass: " + outerField);
     }
 }

 // Method in the outer class that uses the inner class
 void useInnerClass() {
     InnerClass innerObject = new InnerClass();
     innerObject.display();
 }
}


public class InnerCla {

	public static void main(String[] args) {
		 OuterClass outerObject = new OuterClass();

	        // Using the outer class method to access the inner class
	        outerObject.useInnerClass();
		

	}

}
