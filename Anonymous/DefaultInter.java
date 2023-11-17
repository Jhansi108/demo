package Anonymous;
interface Program{  
void draw();  
default void msg(){System.out.println("default method");}  
}  
class Rectangular implements Program{  
public void draw(){System.out.println("drawing rectangle");}  
}  

public class DefaultInter {

	public static void main(String[] args) {
		Program d=new Rectangular();
		
		d.draw();  
		d.msg();
		

	}

}
