package AccessModifiers;
class Laptop {
   
    void makeSound() {
        System.out.println("Generic animal sound");
    }

    
    final void sleep() {
        System.out.println("Animal is sleeping");
    }
}


class Draw extends Laptop{
  
}

public class FinalMethod {

	public static void main(String[] args) {
		  Laptop genericAnimal = new Laptop();
	        Draw myDog = new Draw();

	        genericAnimal.makeSound();
	        genericAnimal.sleep();

	        myDog.makeSound();
	        myDog.sleep();  
		

	}

}
