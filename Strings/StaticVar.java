package Strings;
class Student{  
	   int rollno; 
	   String name;  
	   static String college ="ABC"; 
	   //constructor  
	   Student(int r, String n){  
	   rollno = r;  
	   name = n;  
	   }  
	   //method to display the values  
	   void display (){System.out.println(rollno+" "+name+" "+college);}  
	}  

public class StaticVar {

	public static void main(String[] args) {
		Student s1 = new Student(111,"Karan");  
		 Student s2 = new Student(222,"Aryan");  
		  
		 s1.display();  
		 s2.display();  
		

	}

}
