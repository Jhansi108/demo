package Anonymous;
interface Printa{  
void print();  
}  
interface Showab{  
void show();  
}  

public class InheritanceInter implements Printa,Showab {
	public void print(){System.out.println("Hello");}  
	public void show(){System.out.println("Welcome");}  
	  

	public static void main(String[] args) {
		InheritanceInter obj=new InheritanceInter();
		obj.print();
		obj.show();
		

	}

}
