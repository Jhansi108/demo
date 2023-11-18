package Map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }
}


public class ComparatorPro {

	public static void main(String[] args) {
		 List<Person> people = new ArrayList<>();
	        people.add(new Person("John", 30));
	        people.add(new Person("Alice", 25));
	        people.add(new Person("Bob", 35));

	        System.out.println("Before sorting:");
	        for (Person person : people) {
	            System.out.println(person);
	        }

	        // Using a Comparator to sort the list based on age
	       

	        System.out.println("\nAfter sorting by age:");
	        for (Person person : people) {
	            System.out.println(person);
	        }
		
	}

}
