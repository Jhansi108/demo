package AccessModifiers;
class Animal {
    
    protected String name;

       protected void eat() {
        System.out.println("The animal is eating.");
    }
}

class Dog extends Animal {
    
    @Override
    protected void eat() {
        System.out.println("The dog is eating.");
    }

        void bark() {
        System.out.println("Woof! Woof!");
    }
}


public class ProtectedAccess {

	public static void main(String[] args) {
		 Dog myDog = new Dog();

	      	        myDog.name = "Buddy";

	       	        myDog.eat();

	       	        myDog.bark();
		

	}

}
