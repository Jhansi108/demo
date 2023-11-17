package Anonymous;
class Animal{  
void eatSomething(){
	System.out.println("eating something");
	}  
}  
  
class Dog extends Animal{  
@Override  
void eatsomething(){
	System.out.println("eating foods");
	}
}  

public class OverAnno {

	public static void main(String[] args) {
		Animal a=new Dog();  
		a.eatSomething();  
		

	}

}
