package GetterAndSetter;
class Parent {
	Parent(){
		System.out.println("Parent Class");
	}
	
}

public class SuperMethodPro extends Parent {
	 SuperMethodPro()
	    {
	        super();
	        System.out.println("Child Class");
	                        
	    }

	public static void main(String[] args) {
		new SuperMethodPro();
		System.out.println("Program");
		

	}

}
