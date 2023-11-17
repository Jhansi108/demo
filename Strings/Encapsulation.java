package Strings;

public class Encapsulation {
	private int age;
	private String name;
	

	public Encapsulation(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	public void displayDetails(){
		System.out.println("Name:" + name);
		System.out.println("Age:"+ age);
		
	}


	public static void main(String[] args) {
		Encapsulation person=new Encapsulation(20, "Jhansi");

	        // Accessing private variables using public methods
	        System.out.println("Original Details:");
	        person.displayDetails();

	        // Modifying data using public setter methods
	        person.setName("Jane");
	        person.setAge(30);

	        System.out.println("\nModified Details:");
	        person.displayDetails();
		

	}

}
