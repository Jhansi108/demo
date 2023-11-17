package Strings;

public class Immuta {
	 private final String s;  
     Immuta(final String s) {  
     this.s = s;  
     }  
     public final String getName() {  
     return s;  
     }  

	public static void main(String[] args) {
		   Immuta obj = new Immuta("Core Java Training");  
	        System.out.println(obj.getName());  
		

	}

}
