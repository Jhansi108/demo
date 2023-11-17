package Strings;
class Jhansi{  
    int rollno;  
    String name;  
    static String college = "ABC";  
    
    static void change(){  
    college = "ABC";  
    }  
    
    Jhansi(int r, String n){  
    rollno = r;  
    name = n;  
    }  
     
    void display()
    {System.out.println(rollno+" "+name+" "+college);}  
}  

public class StaticMethod {

	public static void main(String[] args) {
		  Jhansi.change();
		     
		    Jhansi s1 = new Jhansi(111,"Karan");  
		    Jhansi s2 = new Jhansi(222,"Aryan");  
		    Jhansi s3 = new Jhansi(333,"Sonoo");  
		    
		    s1.display();  
		    s2.display();  
		    s3.display();  
		
	}

}
