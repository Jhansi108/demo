package Anonymous;
interface Printable{  
void print();  
}  
interface Showable{  
void show();  
}  

public class MultiInter implements Printable,Showable {
	public void print()
	{System.out.println("Hello");
	}  
	public void show()
	{System.out.println("Welcome");
	}  

	public static void main(String[] args) {
		MultiInter obj=new MultiInter();
		obj.print();
		obj.show();
		

	}

}
