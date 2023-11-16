package AccessModifiers;
 
class Parents {   
  String name;   
  
    void showMessage()   
  {   
      System.out.println("Parent method is called");   
  }   
}   
  
   
class Childs extends Parents {   
  int age;   
  
 
  @Override  
  void showMessage()   
  {   
      System.out.println("Child method is called");   
  }   
}   

public class Downcast {

	public static void main(String[] args) {
		Parents p = new Childs();  
        p.name = "Shubham";  
          
       
        Childs c = (Childs)p;   
    
        c.age = 18;   
        System.out.println(c.name);   
        System.out.println(c.age);   
        c.showMessage();   
		

	}

}
