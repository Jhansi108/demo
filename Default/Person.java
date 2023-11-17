package Java;
class Member { 
    String name; 
    int age; 
  
    Member(String name, int age) 
    { 
        this.name = name; 
        this.age = age; 
    } 
  
    void display() 
    { 
        System.out.println("Name: " + name 
                           + ", Age: " + age); 
    } 
} 

public class Person {

	public static void main(String[] args) {
		 new Member("Jhansi", 21).display(); 
		

	}

}
