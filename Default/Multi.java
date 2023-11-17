package Java;
class Programs{  
void eat(){System.out.println("eating...");}  
}  
class Cat extends Programs{  
void bark(){System.out.println("barking...");}  
}  
class BabyDog extends Cat{  
void weep(){System.out.println("weeping...");}  
}  
public class Multi {

	public static void main(String[] args) {
		BabyDog d=new BabyDog();  
		d.weep();  
		d.bark();  
		d.eat();
		

	}

}
