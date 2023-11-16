package AccessModifiers;
class Keys{  
void eat(){System.out.println("eating...");}  
}  
class Lock extends Keys{  
void bark(){System.out.println("barking...");}  
}  

public class Sing {

	public static void main(String[] args) {
		Lock d=new Lock();  
		d.bark();  
		d.eat();  
	}

}
