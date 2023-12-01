package DrawbacksofArray;

public class MutablePro {
	 private String s;  
	    MutablePro(String s) {  
	    this.s = s;  
	    }  
	    public String getName() {  
	    return s;  
	    }  
	    public void setName(String coursename) {  
	    this.s = coursename;  
	    }  

	public static void main(String[] args) {
		  MutablePro obj = new MutablePro("Java");  
		    System.out.println(obj.getName());  
		 obj.setName("Program");  
		    System.out.println(obj.getName()); 
		

	}

}
