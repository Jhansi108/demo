package Map;

import java.util.Arrays;
import java.util.List;

class PerS {
    private String name;
    private int age;

    public void Person(String name, int age) {
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


public class StreamNeed {

	public static void main(String[] args) {
		 List<Person> people = Arrays.asList(
	                new Person("John", 30),
	                new Person("Alice", 25),
	                new Person("Bob", 35),
	                new Person("Charlie", 28)
	        );

	        // Use a stream to filter and print people older than 30
	        System.out.println("People older than 30:");
	        people.stream()
	                .filter(person -> person.getAge() > 30)
	                .forEach(System.out::println);

	        // Use a stream to calculate the average age
	        double averageAge = people.stream()
	                .mapToDouble(Person::getAge)
	                .average()
	                .orElse(0.0); // Default value if the stream is empty

	        System.out.println("\nAverage age: " + averageAge);
		

	}

}
