package DrawbacksofArray;

public class EncapsulationPro {
	 private String name;
	    private int age;

	       public String getName() {
	        return name;
	    }

	    public void setName(String newName) {
	       
	        name = newName;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int newAge) {
	      	        if (newAge >= 0) {
	            age = newAge;
	        } else {
	            System.out.println("Invalid age. Age must be a non-negative value.");
	        }
	    }


	public static void main(String[] args) {
		 EncapsulationPro person = new EncapsulationPro();

	             person.setName("John Doe");
	        person.setAge(25);

	        System.out.println("Name: " + person.getName());
	        System.out.println("Age: " + person.getAge());
		

	}

}
