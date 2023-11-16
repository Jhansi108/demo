package AccessModifiers;
final class FinalClass {
        private String message;

    public FinalClass(String message) {
        this.message = message;
    }

   
    public void displayMessage() {
        System.out.println("Message from FinalClass: " + message);
    }
}


public class FinalClassPro {

	public static void main(String[] args) {
		 FinalClass finalObject = new FinalClass("Hello, this is a final class");
	       
	        finalObject.displayMessage();
		

	}

}
